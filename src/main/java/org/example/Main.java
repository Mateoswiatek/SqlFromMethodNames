package org.example;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.FileInputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nazwaMetody = "tabela1findAll";
        CharStream in = CharStreams.fromString("cos tam");


        String[] testInputs = {
                "tabela1findAll",
                "tabela1findCountkolumna1"
        };

        for (String input : testInputs) {
            // Utwórz strumień wejściowy z testowego wejścia
            CharStream charStream = CharStreams.fromString(input);

            // Utwórz lexer
            MySqlGeneratorLexer lexer = new MySqlGeneratorLexer(charStream);

            // Utwórz strumień tokenów
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Utwórz parser
            MySqlGeneratorParser parser = new MySqlGeneratorParser(tokens);

            // Uruchom parser na regule 'top'
            ParseTree tree = parser.query();

            // Wypisz drzewo parse
            System.out.println("Parse tree for input: " + input);
            System.out.println(tree.toStringTree(parser));
        }

    }

    public static String compile(FileInputStream fis) throws IOException {
        // Create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(fis);

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