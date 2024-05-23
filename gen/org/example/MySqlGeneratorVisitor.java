// Generated from D:/Programming/IdeaProjects/SqlGeneratorAntlr/MySqlGenerator.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySqlGeneratorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySqlGeneratorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(MySqlGeneratorParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(MySqlGeneratorParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MySqlGeneratorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#findStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindStatement(MySqlGeneratorParser.FindStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItem(MySqlGeneratorParser.SelectItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#aggregateOrColumnOrSubQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateOrColumnOrSubQuery(MySqlGeneratorParser.AggregateOrColumnOrSubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#aggregateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunction(MySqlGeneratorParser.AggregateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MySqlGeneratorParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MySqlGeneratorParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(MySqlGeneratorParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MySqlGeneratorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(MySqlGeneratorParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(MySqlGeneratorParser.ComparisonOperatorContext ctx);
}