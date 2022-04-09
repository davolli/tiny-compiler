package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.exception.UnknownTokenException;
import io.davolli.tinycompiler.lexicalanalyzer.model.Token;

import java.util.List;


public class FinalVerifier extends Verifier {

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        return true;
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        throw new UnknownTokenException(String.valueOf(item));
    }
}
