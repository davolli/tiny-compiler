package io.davolli.tinycompiler.syntaxanalyzer.expression;

public class Expr extends Expression {

    @Override
    public void expandTree() {
        this.addNodeExpandAndDelete(new Term());
        this.addNodeExpandAndDelete(new ExprLine());
    }
}
