package io.davolli.tinycompiler.syntaxanalyzer.expression;

import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * + Term Expr'  | - Term Expr' | e
 */
public class ExprLine extends Expression {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExprLine.class);

    @Override
    public void expandTree() {
        LOGGER.info("ExpandExpr: ExprLine | ActualTokenType: {}", getCurrentTokenType());

        if (isPlusSign() || isMinusSign()) {
            LOGGER.info("expression: ExprLine | ActualTokenType: {} | Found '+' Or '-'", getCurrentTokenType());
            goToNextToken();
            addNodeExpandAndDelete(new Term());
            addNodeExpandAndDelete(new ExprLine());
        }
    }

    private boolean isMinusSign() {
        return getCurrentTokenType().equals(TokenType.MINUS_SIGN);
    }

    private boolean isPlusSign() {
        return getCurrentTokenType().equals(TokenType.PLUS_SIGN);
    }
}
