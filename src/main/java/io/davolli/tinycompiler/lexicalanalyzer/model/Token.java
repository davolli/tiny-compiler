package io.davolli.tinycompiler.lexicalanalyzer.model;

public class Token {
    private TokenType tokenType;
    private String value;

    public TokenType getTokenType() {
        return tokenType;
    }

    public Token setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Token setValue(String value) {
        this.value = value;
        return this;
    }
}
