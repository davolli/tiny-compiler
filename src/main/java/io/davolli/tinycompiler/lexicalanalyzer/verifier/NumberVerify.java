package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static io.davolli.tinycompiler.lexicalanalyzer.verifier.helper.TokenListHelper.joinTokensIfLastIsEqualsOrAdd;

public class NumberVerify extends Verifier {

    private static Logger LOGGER = LoggerFactory.getLogger(NumberVerify.class);

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        return Character.isDigit(item);
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        var newToken = new Token(TokenType.NUMBER, String.valueOf(item));
        LOGGER.info("Type: {} | Value: {}", newToken.getTokenType(), newToken.getValue());
        return joinTokensIfLastIsEqualsOrAdd(tokenList, newToken);
    }
}
