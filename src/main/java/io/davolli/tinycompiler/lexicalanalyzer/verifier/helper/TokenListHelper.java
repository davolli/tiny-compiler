package io.davolli.tinycompiler.lexicalanalyzer.verifier.helper;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;

import java.util.List;
import java.util.Objects;

public class TokenListHelper {
    private TokenListHelper() {}

    public static Token getPreviousToken(List<Token> tokenList) {
        if (tokenList.isEmpty()) {
            return null;
        }
        return tokenList.get(tokenList.size()-1);
    }

    public static List<Token> joinTokensIfLastIsEqualsOrAdd(List<Token> tokenList, Token actualToken) {
        var lastToken = getPreviousToken(tokenList);
        if (Objects.nonNull(lastToken) && lastToken.getTokenType().equals(actualToken.getTokenType())) {
            lastToken.setValue(lastToken.getValue() + actualToken.getValue());
        } else {
            tokenList.add(actualToken);
        }
        return tokenList;
    }
}
