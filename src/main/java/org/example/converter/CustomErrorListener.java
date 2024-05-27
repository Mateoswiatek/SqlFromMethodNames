package org.example.converter;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class CustomErrorListener extends BaseErrorListener {
    private final List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String error = "Niepoprawna nazwa metody: " +
                recognizer.getInputStream() +
                "\nPsss, błąd jest związany z: " +
                msg;

        errors.add(error);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public String getErrors() {
        return String.join("\n", errors);
    }
}