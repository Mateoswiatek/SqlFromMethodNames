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
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#findAdditionalClausules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindAdditionalClausules(MySqlGeneratorParser.FindAdditionalClausulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(MySqlGeneratorParser.DeleteStatementContext ctx);
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
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#aggregationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationType(MySqlGeneratorParser.AggregationTypeContext ctx);
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
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#variableexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableexpression(MySqlGeneratorParser.VariableexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MySqlGeneratorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(MySqlGeneratorParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#simpleoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleoperator(MySqlGeneratorParser.SimpleoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(MySqlGeneratorParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#orderColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderColumn(MySqlGeneratorParser.OrderColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlGeneratorParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(MySqlGeneratorParser.GroupByClauseContext ctx);
}