package io.davolli.tinycompiler.syntaxanalyzer.expression;

import java.util.ArrayList;
import java.util.List;

public abstract class Expression {

    private List<Expression> nodes = new ArrayList<>();

    public List<Expression> getNodes() {
        return nodes;
    }

    public Expression addNode(Expression node) {
        this.nodes.add(node);
        return this;
    }

    public abstract void expandTree();

}
