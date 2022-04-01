package lexicalanalyzer.verifier;

import utils.Token;

import java.util.List;

public class CommentVerifier extends Verifier {

    @Override
    protected boolean checkValidation(char item, List<Token> tokenList) {
        return false;
    }

    @Override
    protected List<Token> checkExecution(char item, List<Token> tokenList) {
        return null;
    }
}
