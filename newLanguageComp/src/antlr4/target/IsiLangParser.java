// Generated from target\IsiLang.g4 by ANTLR 4.7.1
package antlr4.target;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, AP=8, AC=9, FC=10, 
		FP=11, SC=12, OP=13, ATTR=14, VG=15, P=16, PP=17, ID=18, Num=19, WS=20, 
		TEXTO=21, Op_rel=22;
	public static final int
		RULE_prog = 0, RULE_bloco = 1, RULE_cmd = 2, RULE_cmddeclare = 3, RULE_cmdleitura = 4, 
		RULE_cmdescrita = 5, RULE_cmdattrib = 6, RULE_expr = 7, RULE_termo = 8, 
		RULE_cmdIf = 9;
	public static final String[] ruleNames = {
		"prog", "bloco", "cmd", "cmddeclare", "cmdleitura", "cmdescrita", "cmdattrib", 
		"expr", "termo", "cmdIf"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog;'", "'declare'", "'leia'", "'escreva'", 
		"'if'", "'else'", "'('", "'{'", "'}'", "')'", "';'", null, "'='", "','", 
		"'.'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "AP", "AC", "FC", "FP", 
		"SC", "OP", "ATTR", "VG", "P", "PP", "ID", "Num", "WS", "TEXTO", "Op_rel"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);


	private int _tipo;
		private String _varName;
		private String _varValue;
		private IsiSymbolTable symbolTable = new IsiSymbolTable();
		private IsiSymbol symbol;
		private IsiProgram program = new IsiProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		private String _readID;
		private String _writeID;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
	    private String _exprRepetition;
	    private ArrayList<String> VariaveisSemUso;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;


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
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			bloco();
			setState(22);
			match(T__1);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				cmd();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ID))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmddeclareContext cmddeclare() {
			return getRuleContext(CmddeclareContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				cmdleitura();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				cmdattrib();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				cmdIf();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				cmddeclare();
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

	public static class CmddeclareContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public List<TerminalNode> VG() { return getTokens(IsiLangParser.VG); }
		public TerminalNode VG(int i) {
			return getToken(IsiLangParser.VG, i);
		}
		public CmddeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmddeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmddeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmddeclare(this);
		}
	}

	public final CmddeclareContext cmddeclare() throws RecognitionException {
		CmddeclareContext _localctx = new CmddeclareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmddeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__2);
			setState(37);
			match(ID);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VG) {
				{
				{
				setState(38);
				match(VG);
				setState(39);
				match(ID);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(SC);
			System.out.println("reconheci um comando declare");
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

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__3);
			setState(49);
			match(AP);
			setState(50);
			match(ID);
			setState(51);
			match(FP);
			setState(52);
			match(SC);
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

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__4);
			setState(55);
			match(AP);
			setState(56);
			match(ID);
			setState(57);
			match(FP);
			setState(58);
			match(SC);
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

	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(61);
			match(ATTR);
			setState(62);
			expr();
			setState(63);
			match(SC);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(IsiLangParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(IsiLangParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			termo();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(66);
				match(OP);
				setState(67);
				termo();
				}
				}
				setState(72);
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode Num() { return getToken(IsiLangParser.Num, 0); }
		public TerminalNode TEXTO() { return getToken(IsiLangParser.TEXTO, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << Num) | (1L << TEXTO))) != 0)) ) {
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

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public TerminalNode Op_rel() { return getToken(IsiLangParser.Op_rel, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(IsiLangParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(IsiLangParser.AC, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(IsiLangParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(IsiLangParser.FC, i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
			setState(76);
			match(AP);
			setState(77);
			termo();
			setState(78);
			match(Op_rel);
			setState(79);
			termo();
			setState(80);
			match(FP);
			setState(81);
			match(AC);
			setState(82);
			bloco();
			setState(83);
			match(FC);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(84);
				match(T__6);
				setState(85);
				match(AC);
				setState(86);
				bloco();
				setState(87);
				match(FC);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\3\6\3\34\n\3\r\3\16\3\35\3\4\3\4\3\4\3\4\3\4\5\4%\n\4"+
		"\3\5\3\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tG\n"+
		"\t\f\t\16\tJ\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\\\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\3\4\2\24\25\27\27\2[\2\26\3\2\2\2\4\33\3\2\2\2\6$\3\2\2\2\b&\3\2"+
		"\2\2\n\62\3\2\2\2\f8\3\2\2\2\16>\3\2\2\2\20C\3\2\2\2\22K\3\2\2\2\24M\3"+
		"\2\2\2\26\27\7\3\2\2\27\30\5\4\3\2\30\31\7\4\2\2\31\3\3\2\2\2\32\34\5"+
		"\6\4\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\5\3"+
		"\2\2\2\37%\5\n\6\2 %\5\f\7\2!%\5\16\b\2\"%\5\24\13\2#%\5\b\5\2$\37\3\2"+
		"\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\7\3\2\2\2&\'\7\5\2\2\'"+
		",\7\24\2\2()\7\21\2\2)+\7\24\2\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2"+
		"\2-/\3\2\2\2.,\3\2\2\2/\60\7\16\2\2\60\61\b\5\1\2\61\t\3\2\2\2\62\63\7"+
		"\6\2\2\63\64\7\n\2\2\64\65\7\24\2\2\65\66\7\r\2\2\66\67\7\16\2\2\67\13"+
		"\3\2\2\289\7\7\2\29:\7\n\2\2:;\7\24\2\2;<\7\r\2\2<=\7\16\2\2=\r\3\2\2"+
		"\2>?\7\24\2\2?@\7\20\2\2@A\5\20\t\2AB\7\16\2\2B\17\3\2\2\2CH\5\22\n\2"+
		"DE\7\17\2\2EG\5\22\n\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\21\3\2"+
		"\2\2JH\3\2\2\2KL\t\2\2\2L\23\3\2\2\2MN\7\b\2\2NO\7\n\2\2OP\5\22\n\2PQ"+
		"\7\30\2\2QR\5\22\n\2RS\7\r\2\2ST\7\13\2\2TU\5\4\3\2U[\7\f\2\2VW\7\t\2"+
		"\2WX\7\13\2\2XY\5\4\3\2YZ\7\f\2\2Z\\\3\2\2\2[V\3\2\2\2[\\\3\2\2\2\\\25"+
		"\3\2\2\2\7\35$,H[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public void verificaID(String id){
		if (!symbolTable.exists(id)){
			throw new IsiSemanticException("Simbolo "+id+" não declarado");
		}
	}
	
	public void exibeComandos(){
		for (AbstractCommand c: program.getComandos()){
			System.out.println(c);
		}
	}

	
	public StringBuilder exibeVariaveisSemUsoWNG() {
    StringBuilder varWNG = new StringBuilder();

    varWNG.append("As seguintes variáveis foram declaradas e não foram utilizadas no programa: ");
    ArrayList<String> var = program.getVarSemUso();

    if(var.isEmpty())return null;

    int size = var.size();
    if(size ==1)varWNG.append(var.get(0));

    else if(size>1){
        int i=0;
        for(;i<=size-2;i++){
            String w = var.get(i);
            varWNG.append(w);
            varWNG.append(",");
        }
        varWNG.append(var.get(size-1));
    }

    return varWNG;
	}

	public void Warnings() {
        StringBuilder warn = new StringBuilder();
        StringBuilder var = exibeVariaveisSemUsoWNG();
        if(var==null)return;
        warn.append("WARNINGS: \n");
        warn.append(exibeVariaveisSemUsoWNG());
        System.out.println(warn);
	}
	
	public void generateCode(){
		program.generateTarget();
	}
}