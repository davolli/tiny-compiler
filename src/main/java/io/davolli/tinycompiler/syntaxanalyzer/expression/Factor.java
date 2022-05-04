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

        if (isTokenNumber() ) {
            LOGGER.info("expression: Factor | ActualTokenType: {} | Found Number", getCurrentTokenType());
            goToNextToken();
        } else if (isLeftParentesisToken()) {
            LOGGER.info("expression: Factor | ActualTokenType: {} | Found '('", getCurrentTokenType());
            goToNextToken();
            addNodeExpandAndDelete(new Expr());
            if ( isRightParentesis() ) {
                LOGGER.info("expression: Factor | ActualTokenType: {} | Found ')'", getCurrentTokenType());
                goToNextToken();
            } else {
                throw new SyntaxErrorException();
            }
        }
        else {
            throw new SyntaxErrorException();
        }
    }

    private boolean isRightParentesis() {
        return getCurrentTokenType().equals(TokenType.RIGHT_PAREN);
    }

    private boolean isLeftParentesisToken() {
        return getCurrentTokenType().equals(TokenType.LEFT_PAREN);
    }

    private boolean isTokenNumber() {
       return getCurrentTokenType().equals(TokenType.NUMBER);
    }
}
