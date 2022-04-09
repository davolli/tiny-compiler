package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import io.davolli.tinycompiler.lexicalanalyzer.verifier.helper.TokenListHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static io.davolli.tinycompiler.lexicalanalyzer.verifier.helper.TokenListHelper.joinTokensIfLastIsEqualsOrAdd;

public class SpaceVerifier extends Verifier {

    private static Logger LOGGER = LoggerFactory.getLogger(SpaceVerifier.class);

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        var lastToken = TokenListHelper.getPreviousToken(tokenList);
        if (isNotSpaceChar(item) && lastToken.getTokenType() == TokenType.SPACE) {
            LOGGER.info("Removing last SPACE token");
            tokenList.remove(tokenList.size()-1);
        }
        return Character.isSpaceChar(item);
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        var newToken = new Token().setTokenType(TokenType.SPACE).setValue(String.valueOf(item));
        LOGGER.info("Type: {} | Value: {}", newToken.getTokenType(), newToken.getValue());
        return joinTokensIfLastIsEqualsOrAdd(tokenList, newToken);
    }

    private boolean isNotSpaceChar(char item) {
        return !Character.isSpaceChar(item);
    }
}
