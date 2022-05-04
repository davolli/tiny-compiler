package io.davolli.tinycompiler.syntaxanalyzer.expression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Goal extends Expression {

    private static Logger LOGGER = LoggerFactory.getLogger(Goal.class);

    @Override
    public void expandTree() {
        LOGGER.info("ExpandExpr: GOAL | ActualTokenType: {}", getCurrentTokenType());
        this.addNodeExpandAndDelete(new Expr());
        verifyFinish();
    }

}
