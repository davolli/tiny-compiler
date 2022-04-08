package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static io.davolli.tinycompiler.lexicalanalyzer.verifier.helper.TokenListHelper.joinTokensIfLastIsEqualsOrAdd;

public class NewLineVerifier extends Verifier {

    private static Logger LOGGER = LoggerFactory.getLogger(NewLineVerifier.class);

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        return item == '\n';
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        var newToken = new Token(TokenType.NEW_LINE, "\\n");
        LOGGER.info("Type: {} | Value: {}", newToken.getTokenType(), newToken.getValue());
        return joinTokensIfLastIsEqualsOrAdd(tokenList,newToken);
    }
}
