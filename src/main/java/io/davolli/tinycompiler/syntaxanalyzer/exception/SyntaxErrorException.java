package io.davolli.tinycompiler.syntaxanalyzer.exception;

public class SyntaxErrorException extends RuntimeException {

    private static final String SYNTAX_ERROR_MESSAGE = "Este código não contempla a sintaxe da gramática";

    public SyntaxErrorException() {
        super(SYNTAX_ERROR_MESSAGE);
    }

}
