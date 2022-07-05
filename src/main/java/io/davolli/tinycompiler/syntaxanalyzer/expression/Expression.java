package io.davolli.tinycompiler.syntaxanalyzer.expression;

import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import io.davolli.tinycompiler.syntaxanalyzer.SyntaxAnalyzer;

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

    protected void addNodeExpandAndDelete(Expression node) {
        this.addNode(node);
        this.getLastNode().expandTree();
        this.popNode();
    }

    protected TokenType getCurrentTokenType() {
        return SyntaxAnalyzer.getInstance().getCurrentToken().getTokenType();
    }

    protected  String getCurrentTokenValue() {
        return SyntaxAnalyzer.getInstance().getCurrentToken().getValue();
    }

    protected void goToNextToken() {
        SyntaxAnalyzer.getInstance().nextToken();
    }
}
