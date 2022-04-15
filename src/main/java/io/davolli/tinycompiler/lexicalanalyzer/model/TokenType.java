package io.davolli.tinycompiler.lexicalanalyzer.model;

public enum TokenType {
    SPACE,
    LEFT_PAREN,
    RIGHT_PAREN,
    DIVISION_SIGN,
    TIMES_SIGN,
    INLINE_COMMENT,
    NUMBER,
    PLUS_SIGN,
    MINUS_SIGN,
    UNKNOWN,
    EOF;
}
