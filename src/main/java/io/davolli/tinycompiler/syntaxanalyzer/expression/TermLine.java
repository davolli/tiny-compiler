package io.davolli.tinycompiler.syntaxanalyzer.expression;

import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * x Factor Term'  | / Factor Term'  | e
 */
public class TermLine extends Expression {
    private static Logger LOGGER = LoggerFactory.getLogger(TermLine.class);
    @Override
    public void expandTree() {
        LOGGER.info("ExpandExpr: TermLine | ActualTokenType: {}", getCurrentTokenType());
        if (isTimesSign() || isDivisionSign()) {
            LOGGER.info("expression: TermLine | ActualTokenType: {} | Found '*' or '/'", getCurrentTokenType());
            goToNextToken();
            addNodeExpandAndDelete(new Factor());
            addNodeExpandAndDelete(new TermLine());
        }
    }

    private boolean isDivisionSign() {
        return getCurrentTokenType().equals(TokenType.DIVISION_SIGN);
    }

    private boolean isTimesSign() {
        return getCurrentTokenType().equals(TokenType.TIMES_SIGN);
    }
}
