package io.davolli.tinycompiler.syntaxanalyzer;

import io.davolli.tinycompiler.lexicalanalyzer.model.Token;
import io.davolli.tinycompiler.syntaxanalyzer.expression.Expression;
import io.davolli.tinycompiler.syntaxanalyzer.expression.GoalExpression;
import io.davolli.tinycompiler.syntaxanalyzer.model.SyntaxTreeResult;

import java.util.ArrayList;
import java.util.List;

public class SyntaxAnalyzer {

    private Expression programAST = new GoalExpression();
    private int currentTokenListIndex = 0;
    private List<Token> tokenList;
    private SyntaxTreeResult syntaxTree;
    private static final SyntaxAnalyzer uniqueInstance = new SyntaxAnalyzer();

    public SyntaxAnalyzer() {
        this.syntaxTree = new SyntaxTreeResult();
    }

    public SyntaxTreeResult execute() {
        programAST.expandTree();
        return syntaxTree;
    }

    public Token nextToken() {
        currentTokenListIndex++;
        return tokenList.get(currentTokenListIndex);
    }

    public Token getCurrentToken() {
        return tokenList.get(currentTokenListIndex);
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
    public static synchronized SyntaxAnalyzer getInstance() {
         return uniqueInstance;
    }
}
