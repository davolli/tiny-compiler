package lexicalanalyzer.verifier;

import utils.Token;
import utils.TokenType;

import java.util.List;

import static utils.TokenListHelper.joinTokensIfLastIsEqualsOrAdd;

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
