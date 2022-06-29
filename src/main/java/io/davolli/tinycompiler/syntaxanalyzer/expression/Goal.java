package io.davolli.tinycompiler.syntaxanalyzer.expression;

import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import io.davolli.tinycompiler.syntaxanalyzer.exception.SyntaxErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GOAL -> Expr
 */
public class Goal extends Expression {

    private static Logger LOGGER = LoggerFactory.getLogger(Goal.class);

    @Override
    public void expandTree() {
        LOGGER.info("ExpandExpr: GOAL | ActualTokenType: {}", getCurrentTokenType());
        this.addNodeExpandAndDelete(new Expr());
        verifyFinish();
    }

    private void verifyFinish() {
        if (!getCurrentTokenType().equals(TokenType.EOF)) {
            throw new SyntaxErrorException();
        }
    }

}
