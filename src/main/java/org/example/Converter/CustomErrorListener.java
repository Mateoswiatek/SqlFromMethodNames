package org.example.Converter;

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
        errors.add("line " + line + ":" + charPositionInLine + " " + msg);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public String getErrors() {
        return String.join("\n", errors);
    }
}