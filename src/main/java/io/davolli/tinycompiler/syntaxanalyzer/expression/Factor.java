package io.davolli.tinycompiler.syntaxanalyzer.expression;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import io.davolli.tinycompiler.syntaxanalyzer.SyntaxAnalyzer;
import io.davolli.tinycompiler.syntaxanalyzer.exception.SyntaxErrorException;

/**
 * Factor -> ( Expr ) | num
 */
public class Factor extends Expression {

    private final Token actualToken = SyntaxAnalyzer.getInstance().getCurrentToken();

    @Override
    public void expandTree() {
        if (isTokenNumber() || isTokenParentesis()) {
            SyntaxAnalyzer.getInstance().nextToken();
        } else {
            throw new SyntaxErrorException();
        }
    }

    private boolean isTokenParentesis() {
        return actualToken.getTokenType() == TokenType.RIGHT_PAREN;
    }

    private boolean isTokenNumber() {
       return actualToken.getTokenType() == TokenType.NUMBER;
    }
}
