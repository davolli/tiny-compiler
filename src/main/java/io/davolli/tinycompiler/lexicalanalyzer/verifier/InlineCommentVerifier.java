package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import io.davolli.tinycompiler.lexicalanalyzer.verifier.helper.TokenListHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static io.davolli.tinycompiler.lexicalanalyzer.verifier.helper.TokenListHelper.joinTokensIfLastIsEqualsOrAdd;

public class InlineCommentVerifier extends Verifier {

    private static Logger LOGGER = LoggerFactory.getLogger(InlineCommentVerifier.class);

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        var previousTokenType = TokenListHelper.getPreviousToken(tokenList).getTokenType();
        return (item != '\n' && previousTokenType == TokenType.INLINE_COMMENT) ||
                (item == '/' && previousTokenType == TokenType.DIVISION_SIGN);
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        var previousToken = TokenListHelper.getPreviousToken(tokenList);
        if (previousToken.getTokenType() == TokenType.DIVISION_SIGN) {
            previousToken.setTokenType(TokenType.INLINE_COMMENT);
            LOGGER.info("Change token from {} to {}", TokenType.DIVISION_SIGN, TokenType.INLINE_COMMENT);
        }
        var newToken = new Token(TokenType.INLINE_COMMENT, String.valueOf(item));
        LOGGER.info("Type: {} | Value: {}", newToken.getTokenType(), newToken.getValue());
        return joinTokensIfLastIsEqualsOrAdd(tokenList, newToken);
    }
}
