package io.davolli.tinycompiler.lexicalanalyzer;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.verifier.*;

import java.util.ArrayList;
import java.util.List;

public class LexicalAnalyzer {

    public static List<Token> execute(String code) {
        List<Token> tokenList = new ArrayList<>();
        var verifierChain = initChainVerifier();
        for (int i = 0; i < code.length(); i++) {
            tokenList = verifierChain.check(code.charAt(i), tokenList);
        }
        return tokenList;
    }

    private static Verifier initChainVerifier() {
        var initChain = new InlineCommentVerifier();
        initChain.linkWith(new NewLineVerifier())
                .linkWith(new SpaceVerifier())
                .linkWith(new DivisionSignVerifier())
                .linkWith(new AddictionVerifier())
                .linkWith(new SubtractionVerifier())
                .linkWith(new MultiplicationVerifier())
                .linkWith(new LeftParenthesisVerifier())
                .linkWith(new RightParenthesisVerifier())
                .linkWith(new NumberVerify())
                .linkWith(new FinalVerifier());
        return initChain;
    }

}
