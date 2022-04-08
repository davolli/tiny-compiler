package io.davolli.tinycompiler.lexicalanalyzer.exception;

public class UnknownTokenException extends RuntimeException {

    private final String tokenValue;
    private static final String UNKNOWN_TOKEN_MESSAGE = "O token [ %s ] não faz parte da linguagem.";


    public UnknownTokenException(String tokenValue) {
        super(String.format(UNKNOWN_TOKEN_MESSAGE, tokenValue));
        this.tokenValue = tokenValue;
    }

    public String getTokenValue() {
        return tokenValue;
    }
}
