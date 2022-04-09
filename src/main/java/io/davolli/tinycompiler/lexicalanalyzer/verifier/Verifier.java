package io.davolli.tinycompiler.lexicalanalyzer.verifier;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;

import java.util.List;
import java.util.Objects;

public abstract class Verifier {

    protected Verifier nextVerifier;

    protected abstract boolean checkValidation(char item, List<Token> tokenList);

    protected abstract List<Token> checkExecution(char item, List<Token> tokenList);

    public List<Token> check(char item, List<Token> tokenList) {
        if (checkValidation(item, tokenList)) {
            return checkExecution(item, tokenList);
        } else {
            return checkNext(item, tokenList);
        }
    }

    private List<Token> checkNext(char item, List<Token> tokenList) {
        if (Objects.nonNull(nextVerifier)) {
            tokenList = this.nextVerifier.check(item, tokenList);
        }
        return tokenList;
    }

    public Verifier linkWith(Verifier nextVerifier) {
        this.nextVerifier = nextVerifier;
        return nextVerifier;
    }

}
