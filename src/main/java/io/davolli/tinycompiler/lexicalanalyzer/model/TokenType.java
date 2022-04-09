package io.davolli.tinycompiler.lexicalanalyzer.model;

public enum TokenType {
    IDENTIFIER,
    SPACE,
    LEFT_PAREN,
    RIGHT_PAREN,
    DIVISION_SINAL,
    TIMES_SIGN,
    COMMENT,
    INLINE_COMMENT,
    NUMBER,
    PLUS_SIGN,
    MINUS_SIGN,
    NEW_LINE,
    UNKNOWN,
    EOF;
}
