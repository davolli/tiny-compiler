package io.davolli.tinycompiler.syntaxanalyzer;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.syntaxanalyzer.expression.Expression;
import io.davolli.tinycompiler.syntaxanalyzer.expression.Goal;
import io.davolli.tinycompiler.syntaxanalyzer.model.SyntaxTreeResult;

import java.util.List;

public class SyntaxAnalyzer {

    private static final SyntaxAnalyzer uniqueInstance = new SyntaxAnalyzer();
    private Expression programAST = new Goal();
    private int currentTokenListIndex = 0;
    private List<Token> tokenList;
    private SyntaxTreeResult syntaxTreeResponse = new SyntaxTreeResult();

    public SyntaxAnalyzer() {
    }

    public static synchronized SyntaxAnalyzer getInstance() {
        return uniqueInstance;
    }

    public SyntaxTreeResult execute() {
        programAST.expandTree();
        return syntaxTreeResponse;
    }

    public Token nextToken() {
        currentTokenListIndex++;
        return tokenList.get(currentTokenListIndex);
    }

    public Token getCurrentToken() {
        return tokenList.get(currentTokenListIndex);
    }
    public Token getNextToken() {
        return tokenList.get(currentTokenListIndex+1);
    }

    public Expression getProgramAST() {
        return programAST;
    }

    public SyntaxAnalyzer setProgramAST(Expression programAST) {
        this.programAST = programAST;
        return this;
    }

    public int getCurrentTokenListIndex() {
        return currentTokenListIndex;
    }

    public SyntaxAnalyzer setCurrentTokenListIndex(int currentTokenListIndex) {
        this.currentTokenListIndex = currentTokenListIndex;
        return this;
    }

    public List<Token> getTokenList() {
        return tokenList;
    }

    public SyntaxAnalyzer setTokenList(List<Token> tokenList) {
        this.tokenList = tokenList;
        return this;
    }
}
