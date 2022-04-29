package io.davolli.tinycompiler.syntaxanalyzer.expression;

import io.davolli.tinycompiler.syntaxanalyzer.exception.SyntaxErrorException;

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

    public List<Expression> popNode() {
        if (this.nodes.isEmpty()) {
            return this.nodes;
        }
        this.nodes.remove(this.nodes.size() - 1);
        return this.nodes;
    }

    public Expression getLastNode() {
        if (this.nodes.isEmpty()) {
            return null;
        }
        return this.nodes.get(this.nodes.size() - 1);
    }

    public abstract void expandTree();

    protected void verifyFinish() {
        if (!this.getNodes().isEmpty()) {
            throw new SyntaxErrorException();
        }
    }
}
