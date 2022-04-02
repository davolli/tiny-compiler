package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;

import java.util.List;

import static io.davolli.tinycompiler.lexicalanalyzer.verifier.helper.TokenListHelper.joinTokensIfLastIsEqualsOrAdd;

public class SpaceVerifier extends Verifier {

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        return Character.isSpaceChar(item);
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        var actualToken = new Token().setTokenType(TokenType.SPACE).setValue(String.valueOf(item));
        return joinTokensIfLastIsEqualsOrAdd(tokenList, actualToken);
    }
}
