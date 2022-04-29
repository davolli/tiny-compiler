package io.davolli.tinycompiler.syntaxanalyzer.expression;

public class Goal extends Expression {

    @Override
    public void expandTree() {
        this.addNode(new Expr());
        this.getNodes().get(0).expandTree();
        verifyFinish();
    }

}
