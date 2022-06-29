package io.davolli.tinycompiler.syntaxanalyzer.expression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Term -> Factor Term'
 */
public class Term extends Expression {

    private static Logger LOGGER = LoggerFactory.getLogger(Term.class);
    @Override
    public void expandTree() {
        LOGGER.info("ExpandExpr: Term | ActualTokenType: {}", getCurrentTokenType());
        this.addNodeExpandAndDelete(new Factor());
        this.addNodeExpandAndDelete(new TermLine());
    }
}
