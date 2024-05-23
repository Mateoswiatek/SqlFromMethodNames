// Generated from D:/Programming/IdeaProjects/SqlGeneratorAntlr/MySqlGenerator.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySqlGeneratorParser}.
 */
public interface MySqlGeneratorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#top}.
	 * @param ctx the parse tree
	 */
	void enterTop(MySqlGeneratorParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#top}.
	 * @param ctx the parse tree
	 */
	void exitTop(MySqlGeneratorParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(MySqlGeneratorParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(MySqlGeneratorParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MySqlGeneratorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MySqlGeneratorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#findStatement}.
	 * @param ctx the parse tree
	 */
	void enterFindStatement(MySqlGeneratorParser.FindStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#findStatement}.
	 * @param ctx the parse tree
	 */
	void exitFindStatement(MySqlGeneratorParser.FindStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(MySqlGeneratorParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(MySqlGeneratorParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#aggregateOrColumnOrSubQuery}.
	 * @param ctx the parse tree
	 */
	void enterAggregateOrColumnOrSubQuery(MySqlGeneratorParser.AggregateOrColumnOrSubQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#aggregateOrColumnOrSubQuery}.
	 * @param ctx the parse tree
	 */
	void exitAggregateOrColumnOrSubQuery(MySqlGeneratorParser.AggregateOrColumnOrSubQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunction(MySqlGeneratorParser.AggregateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunction(MySqlGeneratorParser.AggregateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(MySqlGeneratorParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(MySqlGeneratorParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MySqlGeneratorParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MySqlGeneratorParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(MySqlGeneratorParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(MySqlGeneratorParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MySqlGeneratorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MySqlGeneratorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(MySqlGeneratorParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(MySqlGeneratorParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(MySqlGeneratorParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(MySqlGeneratorParser.ComparisonOperatorContext ctx);
}