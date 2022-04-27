package io.davolli.tinycompiler.syntaxanalyzer.expression;

public class GoalExpression extends Expression {

    @Override
    public void expandTree() {
        this.addNode(new Expr());
        this.getNodes().get(0).expandTree();
    }
}
