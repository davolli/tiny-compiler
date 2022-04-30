package io.davolli.tinycompiler.syntaxanalyzer.expression;

public class Term extends Expression {
    @Override
    public void expandTree() {
        this.addNode(new Factor());
        this.getLastNode().expandTree();
        this.popNode();
        this.addNode(new TermLine());
        this.getLastNode().expandTree();
    }
}
