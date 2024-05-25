package org.example;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) throws IOException {
        //demo
        var list = List.of(
                "tabela1findAll",
                "tabela1findkolumna1",
                "tabela1findkolumna1kolumna2",
                "tabela1findkolumna1kolumna2Countkolumna1",
                "tabela1findMaxkolumna1kolumna2Maxkolumna1",
                "tabela1findAllWherekolumna1LessThan",
                "tabela1findkolumna1Avgkolumna2WhereLLkolumna1LessThanRR",
                "tabela1findkolumna1Avgkolumna2Wherekolumna1LessThan",
                "tabela1findkolumna1Avgkolumna2WhereNotLLkolumna1LessThanRR",
                "tabela1findkolumna1Avgkolumna2WhereNotLLkolumna1LessThankolumna1RR",
                "tabela1findkolumna1Avgkolumna2Wherekolumna1LessThanOrLessThanOrLessThanAndLLLessThanAndLessThanRR",
                "tabela1findkolumna1Avgkolumna2Wherekolumna1LessThanOrLessThanOrLessThanAndLLLessThanAndLessThanRRAndkolumna1LessThankolumna2Andkolumna2Equals",
                "tabela1findkolumna1Wherekolumna1LessThanOrEqualsOrderBykolumna2GroupBykolumna1",
                "tabela1findAllOrderBykolumna2",
                "tabela1findAllWherekolumna1EqualsOrderBykolumna2kolumna1Desc",
                "tabela1findAllGroupBykolumna1OrderBykolumna2",
                "tabela1findAllWherekolumna1EqualsGroupBykolumna1OrderBykolumna2",
                "tabela1findAllGroupBykolumna1kolumna2OrderBykolumna2",
                "tabela1findAllGroupBykolumna1OrderBykolumna2",
                "tabela1findkolumna1CountAllkolumna1Maxkolumna2kolumna1Sumkolumna2kolumna1Avgkolumna2kolumna1Minkolumna2kolumna1Maxkolumna2kolumna1",
                "tabela1findkolumna1Avgkolumna2Wherekolumna1LessThanOrLessThanOrLessThanAndLLLessThanAndLessThanRRAndkolumna1LessThankolumna2Andkolumna2EqualsGroupBykolumna2OrderBykolumna1",
                "tabela1findAllWherekolumna1LessThan"
        );

//        list.forEach(input -> {
//            CharStream charStream = CharStreams.fromString(input);
//
//            var out = compile(charStream);
//
//            log.info("Input={}", input);
//            log.info("Output={}\n\n", out);
//        });

        Files.createDirectories(Paths.get("example/input"));
        Files.createDirectories(Paths.get("example/output"));
        Files.createDirectories(Paths.get("example/inputoutput"));

        for (int i = 0; i < list.size(); i++) {
            String input = list.get(i);
            CharStream charStream = CharStreams.fromString(input);

            var out = compile(charStream);

            log.info("Input={}", input);
            log.info("Output={}\n\n", out);

            try {
                Files.writeString(Paths.get("example/input/input_" + i), input);
                Files.writeString(Paths.get("example/output/output_" + i), out);
                Files.writeString(Paths.get("example/inputoutput/inputoutput_" + i), (input + "\n" + out));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static String compile(CharStream input) {
        MySqlGeneratorLexer lexer = new MySqlGeneratorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MySqlGeneratorParser parser = new MySqlGeneratorParser(tokens);
        ParseTree tree = parser.query();

        return new AntlrParser().visit(tree);
    }
}