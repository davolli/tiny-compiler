package io.davolli.tinycompiler.lexicalanalyzer.verifier.helper;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.lexicalanalyzer.model.TokenType;

import java.util.List;

public class TokenListHelper {

    private TokenListHelper() {
    }

    public static Token getPreviousToken(List<Token> tokenList) {
        if (tokenList.isEmpty()) {
            return new Token(TokenType.UNKNOWN, "");
        }
        return tokenList.get(tokenList.size() - 1);
    }

    public static List<Token> joinTokensIfLastIsEqualsOrAdd(List<Token> tokenList, Token actualToken) {
        var lastToken = getPreviousToken(tokenList);
        if (lastToken.getTokenType() != TokenType.UNKNOWN &&
                lastToken.getTokenType().equals(actualToken.getTokenType())) {
            lastToken.setValue(lastToken.getValue() + actualToken.getValue());
        } else {
            tokenList.add(actualToken);
        }
        return tokenList;
    }
}
