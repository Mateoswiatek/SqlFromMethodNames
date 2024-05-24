// Generated from D:/Programming/IdeaProjects/SqlGeneratorAntlr/MySqlGenerator.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySqlGeneratorParser}.
 */
public interface MySqlGeneratorListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#findAdditionalClausules}.
	 * @param ctx the parse tree
	 */
	void enterFindAdditionalClausules(MySqlGeneratorParser.FindAdditionalClausulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#findAdditionalClausules}.
	 * @param ctx the parse tree
	 */
	void exitFindAdditionalClausules(MySqlGeneratorParser.FindAdditionalClausulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(MySqlGeneratorParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(MySqlGeneratorParser.DeleteStatementContext ctx);
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
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#aggregationType}.
	 * @param ctx the parse tree
	 */
	void enterAggregationType(MySqlGeneratorParser.AggregationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#aggregationType}.
	 * @param ctx the parse tree
	 */
	void exitAggregationType(MySqlGeneratorParser.AggregationTypeContext ctx);
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
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#variableexpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableexpression(MySqlGeneratorParser.VariableexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#variableexpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableexpression(MySqlGeneratorParser.VariableexpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(MySqlGeneratorParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(MySqlGeneratorParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#simpleoperator}.
	 * @param ctx the parse tree
	 */
	void enterSimpleoperator(MySqlGeneratorParser.SimpleoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#simpleoperator}.
	 * @param ctx the parse tree
	 */
	void exitSimpleoperator(MySqlGeneratorParser.SimpleoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(MySqlGeneratorParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(MySqlGeneratorParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#orderColumn}.
	 * @param ctx the parse tree
	 */
	void enterOrderColumn(MySqlGeneratorParser.OrderColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#orderColumn}.
	 * @param ctx the parse tree
	 */
	void exitOrderColumn(MySqlGeneratorParser.OrderColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlGeneratorParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(MySqlGeneratorParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlGeneratorParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(MySqlGeneratorParser.GroupByClauseContext ctx);
}