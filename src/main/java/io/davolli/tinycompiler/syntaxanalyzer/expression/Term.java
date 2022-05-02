package io.davolli.tinycompiler.syntaxanalyzer.expression;

public class Term extends Expression {
    @Override
    public void expandTree() {
        this.addNodeExpandAndDelete(new Factor());
        this.addNodeExpandAndDelete(new TermLine());
    }
}
