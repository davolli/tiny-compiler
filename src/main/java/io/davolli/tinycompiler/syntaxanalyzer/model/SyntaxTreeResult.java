package io.davolli.tinycompiler.syntaxanalyzer.model;

import io.davolli.tinycompiler.syntaxanalyzer.expression.Expression;

import java.util.List;

public class SyntaxTreeResult {

    private List<Expression> programAST;

    public List<Expression> getAST() {
        return programAST;
    }

    public Expression getExprByIndex(int index) {
        return  programAST.get(index);
    }

    public SyntaxTreeResult addExpression(Expression expression) {
        this.programAST.add(expression);
        return this;
    }

    public SyntaxTreeResult setProgramAST(List<Expression> programAST) {
        this.programAST = programAST;
        return this;
    }
}
