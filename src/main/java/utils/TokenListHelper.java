package utils;

import java.util.List;

public class TokenListHelper {
    private TokenListHelper() {}

    public static Token getPreviousToken(List<Token> tokenList) {
        if (tokenList.isEmpty() || tokenList.size() == 1) {
            return new Token();
        }
    }

    public static List<Token> joinTokensIfLastIsEqualsOrAdd(List<Token> tokenList, Token actualToken) {
        var lastToken = getPreviousToken(tokenList);
        if (lastToken.getTokenType().equals(actualToken.getTokenType())) {
            lastToken.setValue(lastToken.getValue() + actualToken.getValue());
        }
        return tokenList;
    }
}
