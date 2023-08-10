// Generated from IsiLang.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, AP=6, AC=7, FC=8, FP=9, SC=10, 
		OP=11, ATTR=12, VG=13, ID=14, Num=15, WS=16, TEXTO=17, SE=18, SENAO=19, 
		Op_rel=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "AP", "AC", "FC", "FP", "SC", 
		"OP", "ATTR", "VG", "ID", "Num", "WS", "TEXTO", "SE", "SENAO", "Op_rel"
	};


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17"+
		"f\n\17\f\17\16\17i\13\17\5\17k\n\17\3\20\6\20n\n\20\r\20\16\20o\3\20\3"+
		"\20\6\20t\n\20\r\20\16\20u\5\20x\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u0089\n\22\r\22\16\22"+
		"\u008a\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u009e\n\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3"+
		"\2\13\5\2,-//\61\61\3\2c|\3\2C\\\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\""+
		"\"\t\2\62;C\\``c}\177\u0080\u00b6\u00b6\u00e9\u00e9\6\2##AA]]__\4\2>>"+
		"@@\u00b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\63\3\2\2"+
		"\2\7<\3\2\2\2\tD\3\2\2\2\13M\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2"+
		"\2\23X\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35j\3"+
		"\2\2\2\37m\3\2\2\2!y\3\2\2\2#\u0088\3\2\2\2%\u008c\3\2\2\2\'\u008f\3\2"+
		"\2\2)\u009d\3\2\2\2+,\7g\2\2,-\7u\2\2-.\7e\2\2./\7t\2\2/\60\7g\2\2\60"+
		"\61\7x\2\2\61\62\7c\2\2\62\4\3\2\2\2\63\64\7h\2\2\64\65\7k\2\2\65\66\7"+
		"o\2\2\66\67\7r\2\2\678\7t\2\289\7q\2\29:\7i\2\2:;\7=\2\2;\6\3\2\2\2<="+
		"\7f\2\2=>\7g\2\2>?\7e\2\2?@\7n\2\2@A\7c\2\2AB\7t\2\2BC\7g\2\2C\b\3\2\2"+
		"\2DE\7r\2\2EF\7t\2\2FG\7q\2\2GH\7i\2\2HI\7t\2\2IJ\7c\2\2JK\7o\2\2KL\7"+
		"c\2\2L\n\3\2\2\2MN\7n\2\2NO\7g\2\2OP\7k\2\2PQ\7c\2\2Q\f\3\2\2\2RS\7*\2"+
		"\2S\16\3\2\2\2TU\7}\2\2U\20\3\2\2\2VW\7\177\2\2W\22\3\2\2\2XY\7+\2\2Y"+
		"\24\3\2\2\2Z[\7=\2\2[\26\3\2\2\2\\]\t\2\2\2]\30\3\2\2\2^_\7?\2\2_\32\3"+
		"\2\2\2`a\7.\2\2a\34\3\2\2\2bk\t\3\2\2cg\t\4\2\2df\t\5\2\2ed\3\2\2\2fi"+
		"\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jb\3\2\2\2jc\3\2\2\2k"+
		"\36\3\2\2\2ln\t\6\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pw\3\2\2"+
		"\2qs\7\60\2\2rt\t\6\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2"+
		"\2\2wq\3\2\2\2wx\3\2\2\2x \3\2\2\2yz\t\7\2\2z{\3\2\2\2{|\b\21\2\2|\"\3"+
		"\2\2\2}\u0089\t\b\2\2~\u0089\5%\23\2\177\u0089\5\'\24\2\u0080\u0089\5"+
		")\25\2\u0081\u0089\t\t\2\2\u0082\u0089\5\r\7\2\u0083\u0089\5\23\n\2\u0084"+
		"\u0089\5\27\f\2\u0085\u0089\5\31\r\2\u0086\u0089\5\33\16\2\u0087\u0089"+
		"\5\25\13\2\u0088}\3\2\2\2\u0088~\3\2\2\2\u0088\177\3\2\2\2\u0088\u0080"+
		"\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088"+
		"\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"$\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7h\2\2\u008e&\3\2\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093"+
		"(\3\2\2\2\u0094\u009e\t\n\2\2\u0095\u0096\7?\2\2\u0096\u009e\7?\2\2\u0097"+
		"\u0098\7>\2\2\u0098\u009e\7?\2\2\u0099\u009a\7@\2\2\u009a\u009e\7?\2\2"+
		"\u009b\u009c\7#\2\2\u009c\u009e\7?\2\2\u009d\u0094\3\2\2\2\u009d\u0095"+
		"\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"*\3\2\2\2\f\2egjouw\u0088\u008a\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}