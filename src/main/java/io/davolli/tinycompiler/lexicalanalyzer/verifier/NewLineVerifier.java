package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import io.davolli.tinycompiler.lexicalanalyzer.verifier.helper.TokenListHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class NewLineVerifier extends Verifier {

    private static Logger LOGGER = LoggerFactory.getLogger(NewLineVerifier.class);

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        return item == '\n';
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        LOGGER.info("Ignoring NEW_LINE Token");
        return removeCommentsTokens(tokenList);
    }

    private List<Token> removeCommentsTokens(List<Token> tokenList) {
        var lastToken = TokenListHelper.getPreviousToken(tokenList);
        if (lastToken.getTokenType() == TokenType.INLINE_COMMENT) {
            tokenList.remove(tokenList.size() - 1);
            tokenList.add(new Token(TokenType.SPACE, " "));
            LOGGER.info("Change last INLINE_COMMENT to SPACE");
        }
        return tokenList;
    }
}
