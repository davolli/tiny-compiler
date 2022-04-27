package io.davolli.tinycompiler.syntaxanalyzer.expression;

import io.davolli.tinycompiler.syntaxanalyzer.SyntaxAnalyzer;

public class GoalExpression extends Expression {

    @Override
    public void expandTree() {
        SyntaxAnalyzer.getInstance().nextToken();
    }
}
