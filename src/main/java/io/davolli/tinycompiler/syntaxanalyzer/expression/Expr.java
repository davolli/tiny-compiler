package io.davolli.tinycompiler.syntaxanalyzer.expression;

public class Expr extends Expression {

    @Override
    public void expandTree() {
        this.addNode(new Term());
        this.getLastNode().expandTree();
        this.popNode();
        this.addNode(new ExprLine());
        this.getLastNode().expandTree();
        this.popNode();
    }
}
