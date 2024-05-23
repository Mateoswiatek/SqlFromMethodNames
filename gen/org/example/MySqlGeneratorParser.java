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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TABLENAME=6, COLUMNNAME=7, ALL=8, 
		SUBQUERY=9, WS=10, FIND=11, COUNT=12, SUM=13, AVG=14, MAX=15, MIN=16, 
		AND=17, OR=18, NOT=19, WHERE=20;
	public static final int
		RULE_top = 0, RULE_query = 1, RULE_statement = 2, RULE_findStatement = 3, 
		RULE_selectItem = 4, RULE_aggregateOrColumnOrSubQuery = 5, RULE_aggregateFunction = 6, 
		RULE_whereClause = 7, RULE_condition = 8, RULE_variableExpression = 9, 
		RULE_expression = 10, RULE_logicalOperator = 11, RULE_comparisonOperator = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"top", "query", "statement", "findStatement", "selectItem", "aggregateOrColumnOrSubQuery", 
			"aggregateFunction", "whereClause", "condition", "variableExpression", 
			"expression", "logicalOperator", "comparisonOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Equals'", "'LessThan'", "'GreaterThan'", "'GreaterThanOrEquals'", 
			"'Between'", null, null, "'All'", "'SUB'", null, "'find'", "'Count'", 
			"'Sum'", "'Avg'", "'Max'", "'Min'", "'And'", "'Or'", "'Not'", "'By'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TABLENAME", "COLUMNNAME", "ALL", 
			"SUBQUERY", "WS", "FIND", "COUNT", "SUM", "AVG", "MAX", "MIN", "AND", 
			"OR", "NOT", "WHERE"
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
	public static class TopContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MySqlGeneratorParser.EOF, 0); }
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitTop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitTop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			query();
			setState(27);
			match(EOF);
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
		enterRule(_localctx, 2, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(TABLENAME);
			setState(30);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			findStatement();
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
		public TerminalNode FIND() { return getToken(MySqlGeneratorParser.FIND, 0); }
		public SelectItemContext selectItem() {
			return getRuleContext(SelectItemContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
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
		enterRule(_localctx, 6, RULE_findStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(FIND);
			setState(35);
			selectItem();
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(36);
				whereClause();
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
		enterRule(_localctx, 8, RULE_selectItem);
		try {
			int _alt;
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(ALL);
				}
				break;
			case COLUMNNAME:
			case SUBQUERY:
			case COUNT:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(40);
						aggregateOrColumnOrSubQuery();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(43); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class AggregateOrColumnOrSubQueryContext extends ParserRuleContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public TerminalNode COLUMNNAME() { return getToken(MySqlGeneratorParser.COLUMNNAME, 0); }
		public TerminalNode SUBQUERY() { return getToken(MySqlGeneratorParser.SUBQUERY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
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
		enterRule(_localctx, 10, RULE_aggregateOrColumnOrSubQuery);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				aggregateFunction();
				}
				break;
			case COLUMNNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(COLUMNNAME);
				}
				break;
			case SUBQUERY:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(49);
				match(SUBQUERY);
				setState(50);
				query();
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
	public static class AggregateFunctionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(MySqlGeneratorParser.COUNT, 0); }
		public TerminalNode ALL() { return getToken(MySqlGeneratorParser.ALL, 0); }
		public TerminalNode COLUMNNAME() { return getToken(MySqlGeneratorParser.COLUMNNAME, 0); }
		public TerminalNode SUM() { return getToken(MySqlGeneratorParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(MySqlGeneratorParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(MySqlGeneratorParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(MySqlGeneratorParser.MAX, 0); }
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
		enterRule(_localctx, 12, RULE_aggregateFunction);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(COUNT);
				setState(54);
				match(ALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
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
		enterRule(_localctx, 14, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(WHERE);
			setState(60);
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
		public List<VariableExpressionContext> variableExpression() {
			return getRuleContexts(VariableExpressionContext.class);
		}
		public VariableExpressionContext variableExpression(int i) {
			return getRuleContext(VariableExpressionContext.class,i);
		}
		public List<LogicalOperatorContext> logicalOperator() {
			return getRuleContexts(LogicalOperatorContext.class);
		}
		public LogicalOperatorContext logicalOperator(int i) {
			return getRuleContext(LogicalOperatorContext.class,i);
		}
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
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			variableExpression();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(63);
				logicalOperator();
				setState(64);
				variableExpression();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class VariableExpressionContext extends ParserRuleContext {
		public TerminalNode COLUMNNAME() { return getToken(MySqlGeneratorParser.COLUMNNAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExpressionContext variableExpression() throws RecognitionException {
		VariableExpressionContext _localctx = new VariableExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(COLUMNNAME);
			setState(72);
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
		public List<ComparisonOperatorContext> comparisonOperator() {
			return getRuleContexts(ComparisonOperatorContext.class);
		}
		public ComparisonOperatorContext comparisonOperator(int i) {
			return getRuleContext(ComparisonOperatorContext.class,i);
		}
		public List<TerminalNode> NOT() { return getTokens(MySqlGeneratorParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(MySqlGeneratorParser.NOT, i);
		}
		public List<TerminalNode> COLUMNNAME() { return getTokens(MySqlGeneratorParser.COLUMNNAME); }
		public TerminalNode COLUMNNAME(int i) {
			return getToken(MySqlGeneratorParser.COLUMNNAME, i);
		}
		public List<LogicalOperatorContext> logicalOperator() {
			return getRuleContexts(LogicalOperatorContext.class);
		}
		public LogicalOperatorContext logicalOperator(int i) {
			return getRuleContext(LogicalOperatorContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(74);
				match(NOT);
				}
			}

			setState(77);
			comparisonOperator();
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(78);
				match(COLUMNNAME);
				}
				break;
			}
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					logicalOperator();
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(82);
						match(NOT);
						}
					}

					setState(85);
					comparisonOperator();
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(86);
						match(COLUMNNAME);
						}
						break;
					}
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MySqlGeneratorParser.AND, 0); }
		public TerminalNode OR() { return getToken(MySqlGeneratorParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySqlGeneratorListener ) ((MySqlGeneratorListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlGeneratorVisitor ) return ((MySqlGeneratorVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0014c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003&\b\u0003\u0001\u0004\u0001\u0004\u0004\u0004*\b\u0004\u000b"+
		"\u0004\f\u0004+\u0003\u0004.\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u00054\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006:\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bC\b\b\n\b\f\bF\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0003\nL\b\n\u0001\n\u0001\n\u0003\nP\b\n\u0001\n\u0001"+
		"\n\u0003\nT\b\n\u0001\n\u0001\n\u0003\nX\b\n\u0005\nZ\b\n\n\n\f\n]\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0003\u0001"+
		"\u0000\f\u0010\u0001\u0000\u0011\u0012\u0001\u0000\u0001\u0005a\u0000"+
		"\u001a\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004"+
		" \u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b-\u0001\u0000"+
		"\u0000\u0000\n3\u0001\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000e"+
		";\u0001\u0000\u0000\u0000\u0010>\u0001\u0000\u0000\u0000\u0012G\u0001"+
		"\u0000\u0000\u0000\u0014K\u0001\u0000\u0000\u0000\u0016^\u0001\u0000\u0000"+
		"\u0000\u0018`\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000"+
		"\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005\u0006\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000"+
		"\u001f\u0003\u0001\u0000\u0000\u0000 !\u0003\u0006\u0003\u0000!\u0005"+
		"\u0001\u0000\u0000\u0000\"#\u0005\u000b\u0000\u0000#%\u0003\b\u0004\u0000"+
		"$&\u0003\u000e\u0007\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\u0007\u0001\u0000\u0000\u0000\'.\u0005\b\u0000\u0000(*\u0003\n"+
		"\u0005\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000"+
		"-\'\u0001\u0000\u0000\u0000-)\u0001\u0000\u0000\u0000.\t\u0001\u0000\u0000"+
		"\u0000/4\u0003\f\u0006\u000004\u0005\u0007\u0000\u000012\u0005\t\u0000"+
		"\u000024\u0003\u0002\u0001\u00003/\u0001\u0000\u0000\u000030\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u00004\u000b\u0001\u0000\u0000\u0000"+
		"56\u0005\f\u0000\u00006:\u0005\b\u0000\u000078\u0007\u0000\u0000\u0000"+
		"8:\u0005\u0007\u0000\u000095\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:\r\u0001\u0000\u0000\u0000;<\u0005\u0014\u0000\u0000<=\u0003\u0010"+
		"\b\u0000=\u000f\u0001\u0000\u0000\u0000>D\u0003\u0012\t\u0000?@\u0003"+
		"\u0016\u000b\u0000@A\u0003\u0012\t\u0000AC\u0001\u0000\u0000\u0000B?\u0001"+
		"\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000E\u0011\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000GH\u0005\u0007\u0000\u0000HI\u0003\u0014\n\u0000I\u0013\u0001"+
		"\u0000\u0000\u0000JL\u0005\u0013\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0003\u0018\f\u0000"+
		"NP\u0005\u0007\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000P[\u0001\u0000\u0000\u0000QS\u0003\u0016\u000b\u0000RT\u0005\u0013"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UW\u0003\u0018\f\u0000VX\u0005\u0007\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000"+
		"YQ\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\\u0015\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000^_\u0007\u0001\u0000\u0000_\u0017\u0001\u0000\u0000"+
		"\u0000`a\u0007\u0002\u0000\u0000a\u0019\u0001\u0000\u0000\u0000\u000b"+
		"%+-39DKOSW[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}