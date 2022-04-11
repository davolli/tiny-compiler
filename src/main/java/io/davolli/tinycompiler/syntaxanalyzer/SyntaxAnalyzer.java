package io.davolli.tinycompiler.syntaxanalyzer;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.syntaxanalyzer.model.AbstractSyntaxTree;

import java.util.List;

public class SyntaxAnalyzer {

    public static AbstractSyntaxTree execute(List<Token> tokenList) {
        var ast = new AbstractSyntaxTree();
        return ast;
    }
}
