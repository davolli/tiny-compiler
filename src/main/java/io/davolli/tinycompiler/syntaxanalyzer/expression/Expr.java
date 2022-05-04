package io.davolli.tinycompiler.syntaxanalyzer.expression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Expr extends Expression {

    private static Logger LOGGER = LoggerFactory.getLogger(Expr.class);
    @Override
    public void expandTree() {
        LOGGER.info("ExpandExpr: Expr | ActualTokenType: {}", getCurrentTokenType());
        this.addNodeExpandAndDelete(new Term());
        this.addNodeExpandAndDelete(new ExprLine());
    }
}
