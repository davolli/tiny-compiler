package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DivisionSignVerifier extends Verifier {

    private static Logger LOGGER = LoggerFactory.getLogger(DivisionSignVerifier.class);

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        return item == '/';
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        var newToken = new Token(TokenType.DIVISION_SINAL, String.valueOf(item));
        tokenList.add(newToken);
        LOGGER.info("Type: {} | Value: {}", newToken.getTokenType(), newToken.getValue());
        return tokenList;
    }
}
