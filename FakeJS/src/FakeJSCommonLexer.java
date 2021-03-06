// Generated from FakeJSCommonLexer.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FakeJSCommonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, EQL_EQL=5, NOT_EQL=6, AND_AND=7, OR_OR=8, 
		EQL=9, SEMICOLON=10, COMMA=11, L_BRACKET=12, R_BRACKET=13, L_CURV_BRACKET=14, 
		R_CURV_BRACKET=15, VAR=16, FUNCTION=17, RETURN=18, NEW=19, IF=20, ELSE=21, 
		WHILE=22, FOR=23, WS=24, TRUE=25, FALSE=26, INTEGER=27, STRING=28, ID=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MUL", "DIV", "ADD", "SUB", "EQL_EQL", "NOT_EQL", "AND_AND", "OR_OR", 
		"EQL", "SEMICOLON", "COMMA", "L_BRACKET", "R_BRACKET", "L_CURV_BRACKET", 
		"R_CURV_BRACKET", "VAR", "FUNCTION", "RETURN", "NEW", "IF", "ELSE", "WHILE", 
		"FOR", "WS", "TRUE", "FALSE", "INTEGER", "STRING", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'&&'", "'||'", "'='", 
		"';'", "','", "'('", "')'", "'{'", "'}'", "'var'", "'function'", "'return'", 
		"'new'", "'if'", "'else'", "'while'", "'for'", null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MUL", "DIV", "ADD", "SUB", "EQL_EQL", "NOT_EQL", "AND_AND", "OR_OR", 
		"EQL", "SEMICOLON", "COMMA", "L_BRACKET", "R_BRACKET", "L_CURV_BRACKET", 
		"R_CURV_BRACKET", "VAR", "FUNCTION", "RETURN", "NEW", "IF", "ELSE", "WHILE", 
		"FOR", "WS", "TRUE", "FALSE", "INTEGER", "STRING", "ID"
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


	public FakeJSCommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FakeJSCommonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\6\31"+
		"\u008b\n\31\r\31\16\31\u008c\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u009e\n\34\f\34\16\34\u00a1\13"+
		"\34\3\34\5\34\u00a4\n\34\3\35\3\35\7\35\u00a8\n\35\f\35\16\35\u00ab\13"+
		"\35\3\35\3\35\3\36\3\36\7\36\u00b1\n\36\f\36\16\36\u00b4\13\36\2\2\37"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"\3\2\7\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\5\2\62;C\\c|\4\2C\\c|\u00b9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rH\3\2"+
		"\2\2\17K\3\2\2\2\21N\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3"+
		"\2\2\2\33Y\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!_\3\2\2\2#c\3\2\2\2%l\3\2\2"+
		"\2\'s\3\2\2\2)w\3\2\2\2+z\3\2\2\2-\177\3\2\2\2/\u0085\3\2\2\2\61\u008a"+
		"\3\2\2\2\63\u0090\3\2\2\2\65\u0095\3\2\2\2\67\u00a3\3\2\2\29\u00a5\3\2"+
		"\2\2;\u00ae\3\2\2\2=>\7,\2\2>\4\3\2\2\2?@\7\61\2\2@\6\3\2\2\2AB\7-\2\2"+
		"B\b\3\2\2\2CD\7/\2\2D\n\3\2\2\2EF\7?\2\2FG\7?\2\2G\f\3\2\2\2HI\7#\2\2"+
		"IJ\7?\2\2J\16\3\2\2\2KL\7(\2\2LM\7(\2\2M\20\3\2\2\2NO\7~\2\2OP\7~\2\2"+
		"P\22\3\2\2\2QR\7?\2\2R\24\3\2\2\2ST\7=\2\2T\26\3\2\2\2UV\7.\2\2V\30\3"+
		"\2\2\2WX\7*\2\2X\32\3\2\2\2YZ\7+\2\2Z\34\3\2\2\2[\\\7}\2\2\\\36\3\2\2"+
		"\2]^\7\177\2\2^ \3\2\2\2_`\7x\2\2`a\7c\2\2ab\7t\2\2b\"\3\2\2\2cd\7h\2"+
		"\2de\7w\2\2ef\7p\2\2fg\7e\2\2gh\7v\2\2hi\7k\2\2ij\7q\2\2jk\7p\2\2k$\3"+
		"\2\2\2lm\7t\2\2mn\7g\2\2no\7v\2\2op\7w\2\2pq\7t\2\2qr\7p\2\2r&\3\2\2\2"+
		"st\7p\2\2tu\7g\2\2uv\7y\2\2v(\3\2\2\2wx\7k\2\2xy\7h\2\2y*\3\2\2\2z{\7"+
		"g\2\2{|\7n\2\2|}\7u\2\2}~\7g\2\2~,\3\2\2\2\177\u0080\7y\2\2\u0080\u0081"+
		"\7j\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084"+
		".\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7q\2\2\u0087\u0088\7t\2\2\u0088"+
		"\60\3\2\2\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\b\31\2\2\u008f\62\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092"+
		"\u0093\7w\2\2\u0093\u0094\7g\2\2\u0094\64\3\2\2\2\u0095\u0096\7h\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2"+
		"\u009a\66\3\2\2\2\u009b\u009f\t\3\2\2\u009c\u009e\t\4\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a4\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7\62\2\2\u00a3\u009b\3"+
		"\2\2\2\u00a3\u00a2\3\2\2\2\u00a48\3\2\2\2\u00a5\u00a9\7$\2\2\u00a6\u00a8"+
		"\t\5\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7$"+
		"\2\2\u00ad:\3\2\2\2\u00ae\u00b2\t\6\2\2\u00af\u00b1\t\5\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"<\3\2\2\2\u00b4\u00b2\3\2\2\2\b\2\u008c\u009f\u00a3\u00a9\u00b2\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}