// Generated from D:/Programming/IdeaProjects/SqlGeneratorAntlr/MySqlGenerator.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MySqlGeneratorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TABLENAME=2, COLUMNNAME=3, ALL=4, SUBQUERY=5, LPAREN=6, RPAREN=7, 
		DELETE=8, WHERE=9, ORDER_BY=10, GROUP_BY=11, COUNT=12, SUM=13, AVG=14, 
		MAX=15, MIN=16, AND=17, OR=18, NOT=19, IS_NULL=20, IN=21, ASC=22, DESC=23, 
		EQUALS=24, LESSTHAN=25, GREATERTHAN=26, BETWEEN=27, WS=28;
	public static final int
		RULE_query = 0, RULE_statement = 1, RULE_findStatement = 2, RULE_findAdditionalClausules = 3, 
		RULE_deleteStatement = 4, RULE_selectItem = 5, RULE_aggregateOrColumnOrSubQuery = 6, 
		RULE_aggregateFunction = 7, RULE_aggregationType = 8, RULE_whereClause = 9, 
		RULE_condition = 10, RULE_variableexpression = 11, RULE_expression = 12, 
		RULE_operator = 13, RULE_simpleoperator = 14, RULE_orderByClause = 15, 
		RULE_orderColumn = 16, RULE_groupByClause = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "statement", "findStatement", "findAdditionalClausules", "deleteStatement", 
			"selectItem", "aggregateOrColumnOrSubQuery", "aggregateFunction", "aggregationType", 
			"whereClause", "condition", "variableexpression", "expression", "operator", 
			"simpleoperator", "orderByClause", "orderColumn", "groupByClause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'find'", null, null, "'All'", "'SUB'", "'LL'", "'RR'", "'delete'", 
			"'Where'", "'OrderBy'", "'GroupBy'", "'Count'", "'Sum'", "'Avg'", "'Max'", 
			"'Min'", "'And'", "'Or'", "'Not'", "'IsNull'", "'In'", "'Asc'", "'Desc'", 
			"'Equals'", "'LessThan'", "'GreaterThan'", "'Between'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TABLENAME", "COLUMNNAME", "ALL", "SUBQUERY", "LPAREN", "RPAREN", 
			"DELETE", "WHERE", "ORDER_BY", "GROUP_BY", "COUNT", "SUM", "AVG", "MAX", 
			"MIN", "AND", "OR", "NOT", "IS_NULL", "IN", "ASC", "DESC", "EQUALS", 
			"LESSTHAN", "GREATERTHAN", "BETWEEN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MySqlGenerator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySqlGeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode TABLENAME() { return getToken(MySqlGeneratorParser.TABLENAME, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(TABLENAME);
			setState(37);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public FindStatementContext findStatement() {
			return getRuleContext(FindStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(39);
				findStatement();
				}
				break;
			case DELETE:
				{
				setState(40);
				deleteStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FindStatementContext extends ParserRuleContext {
		public SelectItemContext selectItem() {
			return getRuleContext(SelectItemContext.class,0);
		}
		public FindAdditionalClausulesContext findAdditionalClausules() {
			return getRuleContext(FindAdditionalClausulesContext.class,0);
		}
		public FindStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterFindStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitFindStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitFindStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindStatementContext findStatement() throws RecognitionException {
		FindStatementContext _localctx = new FindStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_findStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			selectItem();
			setState(45);
			findAdditionalClausules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FindAdditionalClausulesContext extends ParserRuleContext {
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public FindAdditionalClausulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findAdditionalClausules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterFindAdditionalClausules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitFindAdditionalClausules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitFindAdditionalClausules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindAdditionalClausulesContext findAdditionalClausules() throws RecognitionException {
		FindAdditionalClausulesContext _localctx = new FindAdditionalClausulesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_findAdditionalClausules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(47);
				whereClause();
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_BY) {
				{
				setState(50);
				groupByClause();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(53);
				orderByClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MySqlGeneratorParser.DELETE, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(DELETE);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(57);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectItemContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySqlGeneratorParser.ALL, 0); }
		public List<AggregateOrColumnOrSubQueryContext> aggregateOrColumnOrSubQuery() {
			return getRuleContexts(AggregateOrColumnOrSubQueryContext.class);
		}
		public AggregateOrColumnOrSubQueryContext aggregateOrColumnOrSubQuery(int i) {
			return getRuleContext(AggregateOrColumnOrSubQueryContext.class,i);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitSelectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(60);
				match(ALL);
				}
				break;
			case COLUMNNAME:
			case COUNT:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
				{
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					aggregateOrColumnOrSubQuery();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 126984L) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateOrColumnOrSubQueryContext extends ParserRuleContext {
		public TerminalNode COLUMNNAME() { return getToken(MySqlGeneratorParser.COLUMNNAME, 0); }
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public AggregateOrColumnOrSubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateOrColumnOrSubQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterAggregateOrColumnOrSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitAggregateOrColumnOrSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitAggregateOrColumnOrSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateOrColumnOrSubQueryContext aggregateOrColumnOrSubQuery() throws RecognitionException {
		AggregateOrColumnOrSubQueryContext _localctx = new AggregateOrColumnOrSubQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aggregateOrColumnOrSubQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(68);
				match(COLUMNNAME);
				}
				break;
			case 2:
				{
				setState(69);
				aggregateFunction();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateFunctionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(MySqlGeneratorParser.COUNT, 0); }
		public TerminalNode ALL() { return getToken(MySqlGeneratorParser.ALL, 0); }
		public AggregationTypeContext aggregationType() {
			return getRuleContext(AggregationTypeContext.class,0);
		}
		public TerminalNode COLUMNNAME() { return getToken(MySqlGeneratorParser.COLUMNNAME, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitAggregateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitAggregateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aggregateFunction);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(COUNT);
				setState(73);
				match(ALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				aggregationType();
				setState(75);
				match(COLUMNNAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationTypeContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(MySqlGeneratorParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(MySqlGeneratorParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(MySqlGeneratorParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(MySqlGeneratorParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(MySqlGeneratorParser.MAX, 0); }
		public AggregationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterAggregationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitAggregationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitAggregationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationTypeContext aggregationType() throws RecognitionException {
		AggregationTypeContext _localctx = new AggregationTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aggregationType);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLUMNNAME:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySqlGeneratorParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WHERE);
			setState(84);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<VariableexpressionContext> variableexpression() {
			return getRuleContexts(VariableexpressionContext.class);
		}
		public VariableexpressionContext variableexpression(int i) {
			return getRuleContext(VariableexpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MySqlGeneratorParser.AND, 0); }
		public TerminalNode OR() { return getToken(MySqlGeneratorParser.OR, 0); }
		public TerminalNode LPAREN() { return getToken(MySqlGeneratorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MySqlGeneratorParser.RPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySqlGeneratorParser.NOT, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(86);
				variableexpression();
				}
				break;
			case 2:
				{
				setState(87);
				variableexpression();
				setState(88);
				match(AND);
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(89);
					variableexpression();
					}
					break;
				case 2:
					{
					setState(90);
					condition();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(93);
				variableexpression();
				setState(94);
				match(OR);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(95);
					variableexpression();
					}
					break;
				case 2:
					{
					setState(96);
					condition();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(99);
					match(NOT);
					}
				}

				setState(102);
				match(LPAREN);
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(103);
					variableexpression();
					}
					break;
				case 2:
					{
					setState(104);
					condition();
					}
					break;
				}
				setState(107);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableexpressionContext extends ParserRuleContext {
		public TerminalNode COLUMNNAME() { return getToken(MySqlGeneratorParser.COLUMNNAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterVariableexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitVariableexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitVariableexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableexpressionContext variableexpression() throws RecognitionException {
		VariableexpressionContext _localctx = new VariableexpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(COLUMNNAME);
			setState(112);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode AND() { return getToken(MySqlGeneratorParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(MySqlGeneratorParser.OR, 0); }
		public TerminalNode LPAREN() { return getToken(MySqlGeneratorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MySqlGeneratorParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(MySqlGeneratorParser.NOT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				operator();
				setState(116);
				match(AND);
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(117);
					operator();
					}
					break;
				case 2:
					{
					setState(118);
					expression();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				operator();
				setState(122);
				match(OR);
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(123);
					operator();
					}
					break;
				case 2:
					{
					setState(124);
					expression();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(127);
					match(NOT);
					}
				}

				setState(130);
				match(LPAREN);
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(131);
					operator();
					}
					break;
				case 2:
					{
					setState(132);
					expression();
					}
					break;
				}
				setState(135);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public SimpleoperatorContext simpleoperator() {
			return getRuleContext(SimpleoperatorContext.class,0);
		}
		public List<TerminalNode> COLUMNNAME() { return getTokens(MySqlGeneratorParser.COLUMNNAME); }
		public TerminalNode COLUMNNAME(int i) {
			return getToken(MySqlGeneratorParser.COLUMNNAME, i);
		}
		public TerminalNode IS_NULL() { return getToken(MySqlGeneratorParser.IS_NULL, 0); }
		public TerminalNode BETWEEN() { return getToken(MySqlGeneratorParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySqlGeneratorParser.AND, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operator);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALS:
			case LESSTHAN:
			case GREATERTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				simpleoperator();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMNNAME) {
					{
					setState(140);
					match(COLUMNNAME);
					}
				}

				}
				break;
			case IS_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(IS_NULL);
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(144);
				match(BETWEEN);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMNNAME) {
					{
					setState(145);
					match(COLUMNNAME);
					}
				}

				setState(148);
				match(AND);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMNNAME) {
					{
					setState(149);
					match(COLUMNNAME);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleoperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MySqlGeneratorParser.EQUALS, 0); }
		public TerminalNode LESSTHAN() { return getToken(MySqlGeneratorParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(MySqlGeneratorParser.GREATERTHAN, 0); }
		public SimpleoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterSimpleoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitSimpleoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitSimpleoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleoperatorContext simpleoperator() throws RecognitionException {
		SimpleoperatorContext _localctx = new SimpleoperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simpleoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(MySqlGeneratorParser.ORDER_BY, 0); }
		public List<OrderColumnContext> orderColumn() {
			return getRuleContexts(OrderColumnContext.class);
		}
		public OrderColumnContext orderColumn(int i) {
			return getRuleContext(OrderColumnContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ORDER_BY);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				orderColumn();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMNNAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderColumnContext extends ParserRuleContext {
		public TerminalNode COLUMNNAME() { return getToken(MySqlGeneratorParser.COLUMNNAME, 0); }
		public TerminalNode ASC() { return getToken(MySqlGeneratorParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySqlGeneratorParser.DESC, 0); }
		public OrderColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterOrderColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitOrderColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitOrderColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderColumnContext orderColumn() throws RecognitionException {
		OrderColumnContext _localctx = new OrderColumnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orderColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(COLUMNNAME);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP_BY() { return getToken(MySqlGeneratorParser.GROUP_BY, 0); }
		public List<TerminalNode> COLUMNNAME() { return getTokens(MySqlGeneratorParser.COLUMNNAME); }
		public TerminalNode COLUMNNAME(int i) {
			return getToken(MySqlGeneratorParser.COLUMNNAME, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(GROUP_BY);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(COLUMNNAME);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMNNAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u00031\b"+
		"\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0003\u0003\u00037\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004;\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0004\u0005?\b\u0005\u000b\u0005\f\u0005@\u0003\u0005C\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006G\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007N\b\u0007\u0001\b\u0001\b\u0003"+
		"\bR\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\\\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nb\b\n\u0001\n"+
		"\u0003\ne\b\n\u0001\n\u0001\n\u0001\n\u0003\nj\b\n\u0001\n\u0001\n\u0003"+
		"\nn\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\fx\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f~\b\f\u0001"+
		"\f\u0003\f\u0081\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0086\b\f\u0001\f"+
		"\u0001\f\u0003\f\u008a\b\f\u0001\r\u0001\r\u0003\r\u008e\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0093\b\r\u0001\r\u0001\r\u0003\r\u0097\b\r\u0003\r"+
		"\u0099\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u009f\b\u000f\u000b\u000f\f\u000f\u00a0\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00a5\b\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u00a9\b\u0011"+
		"\u000b\u0011\f\u0011\u00aa\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"\u0000\u0003\u0001\u0000\f\u0010\u0001\u0000\u0018\u001a\u0001\u0000\u0016"+
		"\u0017\u00ba\u0000$\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000"+
		"\u0004+\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b8\u0001"+
		"\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fF\u0001\u0000\u0000\u0000"+
		"\u000eM\u0001\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012S"+
		"\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016o\u0001\u0000"+
		"\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u0098\u0001\u0000"+
		"\u0000\u0000\u001c\u009a\u0001\u0000\u0000\u0000\u001e\u009c\u0001\u0000"+
		"\u0000\u0000 \u00a2\u0001\u0000\u0000\u0000\"\u00a6\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0002\u0000\u0000%&\u0003\u0002\u0001\u0000&\u0001\u0001"+
		"\u0000\u0000\u0000\'*\u0003\u0004\u0002\u0000(*\u0003\b\u0004\u0000)\'"+
		"\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001\u0000"+
		"\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0003\n\u0005\u0000-.\u0003\u0006"+
		"\u0003\u0000.\u0005\u0001\u0000\u0000\u0000/1\u0003\u0012\t\u00000/\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u0000"+
		"24\u0003\"\u0011\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"46\u0001\u0000\u0000\u000057\u0003\u001e\u000f\u000065\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u00007\u0007\u0001\u0000\u0000\u00008:\u0005"+
		"\b\u0000\u00009;\u0003\u0012\t\u0000:9\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;\t\u0001\u0000\u0000\u0000<C\u0005\u0004\u0000\u0000"+
		"=?\u0003\f\u0006\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000"+
		"\u0000B<\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000C\u000b\u0001"+
		"\u0000\u0000\u0000DG\u0005\u0003\u0000\u0000EG\u0003\u000e\u0007\u0000"+
		"FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\r\u0001\u0000\u0000"+
		"\u0000HI\u0005\f\u0000\u0000IN\u0005\u0004\u0000\u0000JK\u0003\u0010\b"+
		"\u0000KL\u0005\u0003\u0000\u0000LN\u0001\u0000\u0000\u0000MH\u0001\u0000"+
		"\u0000\u0000MJ\u0001\u0000\u0000\u0000N\u000f\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PR\u0007\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000R\u0011\u0001\u0000\u0000\u0000ST\u0005"+
		"\t\u0000\u0000TU\u0003\u0014\n\u0000U\u0013\u0001\u0000\u0000\u0000Vn"+
		"\u0003\u0016\u000b\u0000WX\u0003\u0016\u000b\u0000X[\u0005\u0011\u0000"+
		"\u0000Y\\\u0003\u0016\u000b\u0000Z\\\u0003\u0014\n\u0000[Y\u0001\u0000"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\n\u0001\u0000\u0000\u0000]^\u0003"+
		"\u0016\u000b\u0000^a\u0005\u0012\u0000\u0000_b\u0003\u0016\u000b\u0000"+
		"`b\u0003\u0014\n\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"bn\u0001\u0000\u0000\u0000ce\u0005\u0013\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fi\u0005\u0006"+
		"\u0000\u0000gj\u0003\u0016\u000b\u0000hj\u0003\u0014\n\u0000ig\u0001\u0000"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005"+
		"\u0007\u0000\u0000ln\u0001\u0000\u0000\u0000mV\u0001\u0000\u0000\u0000"+
		"mW\u0001\u0000\u0000\u0000m]\u0001\u0000\u0000\u0000md\u0001\u0000\u0000"+
		"\u0000n\u0015\u0001\u0000\u0000\u0000op\u0005\u0003\u0000\u0000pq\u0003"+
		"\u0018\f\u0000q\u0017\u0001\u0000\u0000\u0000r\u008a\u0003\u001a\r\u0000"+
		"st\u0003\u001a\r\u0000tw\u0005\u0011\u0000\u0000ux\u0003\u001a\r\u0000"+
		"vx\u0003\u0018\f\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x\u008a\u0001\u0000\u0000\u0000yz\u0003\u001a\r\u0000z}\u0005\u0012\u0000"+
		"\u0000{~\u0003\u001a\r\u0000|~\u0003\u0018\f\u0000}{\u0001\u0000\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000~\u008a\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0005\u0013\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0005\u0006\u0000\u0000\u0083\u0086\u0003\u001a\r\u0000\u0084\u0086"+
		"\u0003\u0018\f\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\u0007\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089r\u0001\u0000"+
		"\u0000\u0000\u0089s\u0001\u0000\u0000\u0000\u0089y\u0001\u0000\u0000\u0000"+
		"\u0089\u0080\u0001\u0000\u0000\u0000\u008a\u0019\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0003\u001c\u000e\u0000\u008c\u008e\u0005\u0003\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0099\u0001\u0000\u0000\u0000\u008f\u0099\u0005\u0014\u0000\u0000"+
		"\u0090\u0092\u0005\u001b\u0000\u0000\u0091\u0093\u0005\u0003\u0000\u0000"+
		"\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0005\u0011\u0000\u0000"+
		"\u0095\u0097\u0005\u0003\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000"+
		"\u0098\u008b\u0001\u0000\u0000\u0000\u0098\u008f\u0001\u0000\u0000\u0000"+
		"\u0098\u0090\u0001\u0000\u0000\u0000\u0099\u001b\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0007\u0001\u0000\u0000\u009b\u001d\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0005\n\u0000\u0000\u009d\u009f\u0003 \u0010\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u001f\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\u0003\u0000\u0000\u00a3"+
		"\u00a5\u0007\u0002\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5!\u0001\u0000\u0000\u0000\u00a6\u00a8"+
		"\u0005\u000b\u0000\u0000\u00a7\u00a9\u0005\u0003\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab#\u0001"+
		"\u0000\u0000\u0000\u001b)036:@BFMQ[adimw}\u0080\u0085\u0089\u008d\u0092"+
		"\u0096\u0098\u00a0\u00a4\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}