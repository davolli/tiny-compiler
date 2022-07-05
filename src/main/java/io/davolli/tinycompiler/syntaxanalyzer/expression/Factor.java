package io.davolli.tinycompiler.syntaxanalyzer.expression;

import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import io.davolli.tinycompiler.syntaxanalyzer.exception.SyntaxErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factor -> ( Expr ) | num
 */
public class Factor extends Expression {

    private static Logger LOGGER = LoggerFactory.getLogger(Factor.class);

    @Override
    public void expandTree() {
        LOGGER.info("ExpandExpr: Factor | ActualTokenType: {}", getCurrentTokenType());

        if (isTokenNumber()) {
            LOGGER.info("expression: Factor | ActualTokenType: {} | Found Number {}", getCurrentTokenType(), getCurrentTokenValue());
            goToNextToken();
        } else if (isLeftParenthesesToken()) {
            LOGGER.info("expression: Factor | ActualTokenType: {} | Found '('", getCurrentTokenType());
            goToNextToken();
            addNodeExpandAndDelete(new Expr());
            validateParenthesesClosed();
            LOGGER.info("expression: Factor | ActualTokenType: {} | Found ')'", getCurrentTokenType());
            goToNextToken();
        } else {
            throw new SyntaxErrorException();
        }
    }

    private void validateParenthesesClosed() {
        if (!isRightParentheses()) {
            throw new SyntaxErrorException();
        }
    }

    private boolean isRightParentheses() {
        return getCurrentTokenType().equals(TokenType.RIGHT_PAREN);
    }

    private boolean isLeftParenthesesToken() {
        return getCurrentTokenType().equals(TokenType.LEFT_PAREN);
    }

    private boolean isTokenNumber() {
        return getCurrentTokenType().equals(TokenType.NUMBER);
    }
}
