package lexicalanalyzer;

import lexicalanalyzer.verifier.Verifier;
import utils.CompilerPhase;
import utils.Token;

import java.util.ArrayList;
import java.util.List;

public class LexicalAnalyzer extends CompilerPhase {

    @Override
    public List<Token> execute(String code) {
        List<Token> tokenList = new ArrayList<>();
        var verifierChain = Verifier.initChainVerifier();
        for (int i = 0; i < code.length(); i++) {
            tokenList = verifierChain.check(code.charAt(i), tokenList);
        }
        return tokenList;
    }


}
