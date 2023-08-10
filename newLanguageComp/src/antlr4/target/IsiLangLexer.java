// Generated from target\IsiLang.g4 by ANTLR 4.7.1
package antlr4.target;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, AP=8, AC=9, FC=10, 
		FP=11, SC=12, OP=13, ATTR=14, VG=15, P=16, PP=17, ID=18, Num=19, WS=20, 
		TEXTO=21, Op_rel=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "AP", "AC", "FC", 
		"FP", "SC", "OP", "ATTR", "VG", "P", "PP", "ID", "Num", "WS", "TEXTO", 
		"Op_rel"
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


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23"+
		"u\n\23\f\23\16\23x\13\23\3\24\6\24{\n\24\r\24\16\24|\3\24\3\24\6\24\u0081"+
		"\n\24\r\24\16\24\u0082\5\24\u0085\n\24\3\25\3\25\3\25\3\25\3\26\6\26\u008c"+
		"\n\26\r\26\16\26\u008d\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u0099\n\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\b\5\2,-//"+
		"\61\61\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\4\2>>@@\2\u00a2\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2"+
		"\58\3\2\2\2\7A\3\2\2\2\tI\3\2\2\2\13N\3\2\2\2\rV\3\2\2\2\17Y\3\2\2\2\21"+
		"^\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2"+
		"\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'z\3\2\2\2)\u0086"+
		"\3\2\2\2+\u008b\3\2\2\2-\u0098\3\2\2\2/\60\7r\2\2\60\61\7t\2\2\61\62\7"+
		"q\2\2\62\63\7i\2\2\63\64\7t\2\2\64\65\7c\2\2\65\66\7o\2\2\66\67\7c\2\2"+
		"\67\4\3\2\2\289\7h\2\29:\7k\2\2:;\7o\2\2;<\7r\2\2<=\7t\2\2=>\7q\2\2>?"+
		"\7i\2\2?@\7=\2\2@\6\3\2\2\2AB\7f\2\2BC\7g\2\2CD\7e\2\2DE\7n\2\2EF\7c\2"+
		"\2FG\7t\2\2GH\7g\2\2H\b\3\2\2\2IJ\7n\2\2JK\7g\2\2KL\7k\2\2LM\7c\2\2M\n"+
		"\3\2\2\2NO\7g\2\2OP\7u\2\2PQ\7e\2\2QR\7t\2\2RS\7g\2\2ST\7x\2\2TU\7c\2"+
		"\2U\f\3\2\2\2VW\7k\2\2WX\7h\2\2X\16\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2"+
		"\2\\]\7g\2\2]\20\3\2\2\2^_\7*\2\2_\22\3\2\2\2`a\7}\2\2a\24\3\2\2\2bc\7"+
		"\177\2\2c\26\3\2\2\2de\7+\2\2e\30\3\2\2\2fg\7=\2\2g\32\3\2\2\2hi\t\2\2"+
		"\2i\34\3\2\2\2jk\7?\2\2k\36\3\2\2\2lm\7.\2\2m \3\2\2\2no\7\60\2\2o\"\3"+
		"\2\2\2pq\7<\2\2q$\3\2\2\2rv\t\3\2\2su\t\4\2\2ts\3\2\2\2ux\3\2\2\2vt\3"+
		"\2\2\2vw\3\2\2\2w&\3\2\2\2xv\3\2\2\2y{\t\5\2\2zy\3\2\2\2{|\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}\u0084\3\2\2\2~\u0080\7\60\2\2\177\u0081\t\5\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084~\3\2\2\2\u0084\u0085\3\2\2\2\u0085(\3\2\2"+
		"\2\u0086\u0087\t\6\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\25\2\2\u0089"+
		"*\3\2\2\2\u008a\u008c\t\4\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e,\3\2\2\2\u008f\u0099\t"+
		"\7\2\2\u0090\u0091\7?\2\2\u0091\u0099\7?\2\2\u0092\u0093\7>\2\2\u0093"+
		"\u0099\7?\2\2\u0094\u0095\7@\2\2\u0095\u0099\7?\2\2\u0096\u0097\7#\2\2"+
		"\u0097\u0099\7?\2\2\u0098\u008f\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0092"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0096\3\2\2\2\u0099.\3\2\2\2\13\2t"+
		"v|\u0082\u0084\u008b\u008d\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}