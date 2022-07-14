package io.davolli.tinycompiler.syntaxanalyzer.expression;

import io.davolli.tinycompiler.syntaxanalyzer.SyntaxAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Expr -> term Expr'
 */
public class Expr extends Expression {

    private static Logger LOGGER = LoggerFactory.getLogger(Expr.class);
    @Override
    public void expandTree() {
        LOGGER.info("ExpandExpr: Expr | ActualTokenType: {}", getCurrentTokenType());
        SyntaxAnalyzer.getInstance().getSyntaxTreeResponse().initNewBody("CallExpression", "No name");
        this.addNodeExpandAndDelete(new Term());
        this.addNodeExpandAndDelete(new ExprLine());
        SyntaxAnalyzer.getInstance().getSyntaxTreeResponse().finishBody();
    }
}
