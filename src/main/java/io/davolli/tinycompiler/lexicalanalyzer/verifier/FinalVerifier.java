package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.exception.UnknownTokenException;
import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class FinalVerifier extends Verifier {
    private static Logger LOGGER = LoggerFactory.getLogger(FinalVerifier.class);

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        return true;
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        throw new UnknownTokenException(String.valueOf(item));
    }
}
