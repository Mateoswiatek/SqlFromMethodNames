package org.example;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.util.List;

//todo zrobić aby nazwy się generowały w zależności od

@Slf4j
public class Main {
    public static void main(String[] args) {
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

        list.forEach(input -> {
            CharStream charStream = CharStreams.fromString(input);

            var out = compile(charStream);

            // Wypisz drzewo parse
            log.info("Input={}", input);
            log.info("Output={}\n\n", out);
        });

    }


    public static String compile(CharStream input) {
        // Create a lexer that feeds off of input CharStream
        MySqlGeneratorLexer lexer = new MySqlGeneratorLexer(input);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        MySqlGeneratorParser parser = new MySqlGeneratorParser(tokens);

        // Begin parsing at rule query
        ParseTree tree = parser.query();

        return new AntlrParser().visit(tree);
    }
}