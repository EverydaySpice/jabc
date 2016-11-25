// Generated from AbcNotationLexer.g4 by ANTLR 4.5.3
package org.jabc.parser.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcNotationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, NEWLINE=2, WS=3, FRACTION=4, Delimiter=5, IdentifierSymbol=6, TitleSymbol=7, 
		MeasureSymbol=8, LengthSymbol=9, KeySymbol=10, CommentSymbol=11, MULTIPLIER=12, 
		OCTAVE_UP=13, OCTAVE_DOWN=14, Annotation=15, SingleNote=16, BeamNote=17, 
		BARLINE=18, NOTE=19, EXIT_NEWLINE=20, STRING=21, ID=22;
	public static final int STRING_MODE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "NEWLINE", "WS", "FRACTION", "Delimiter", "IdentifierSymbol", "TitleSymbol", 
		"MeasureSymbol", "LengthSymbol", "KeySymbol", "CommentSymbol", "MULTIPLIER", 
		"OCTAVE_UP", "OCTAVE_DOWN", "Annotation", "SingleNote", "BeamNote", "BARLINE", 
		"NOTE", "EXIT_NEWLINE", "STRING", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'X:'", "'T:'", "'M:'", "'L:'", "'K:'", 
		"'N:'", null, "'''", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "NEWLINE", "WS", "FRACTION", "Delimiter", "IdentifierSymbol", 
		"TitleSymbol", "MeasureSymbol", "LengthSymbol", "KeySymbol", "CommentSymbol", 
		"MULTIPLIER", "OCTAVE_UP", "OCTAVE_DOWN", "Annotation", "SingleNote", 
		"BeamNote", "BARLINE", "NOTE", "EXIT_NEWLINE", "STRING", "ID"
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


	public AbcNotationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AbcNotationLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0092\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\5\3\67\n\3\3\3\3\3\3\4\6\4<\n\4\r\4\16\4=\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20k\n\20\3\21\6\21n\n\21\r\21"+
		"\16\21o\3\21\3\21\3\22\3\22\3\23\7\23w\n\23\f\23\16\23z\13\23\3\23\3\23"+
		"\3\23\5\23\177\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\6\26"+
		"\u008a\n\26\r\26\16\26\u008b\3\27\6\27\u008f\n\27\r\27\16\27\u0090\2\2"+
		"\30\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36"+
		"\20 \21\"\22$\23&\24(\25*\26,\27.\30\4\2\3\6\3\2\62;\4\2\13\13\"\"\4\2"+
		"CIci\4\2C\\c|\u009d\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2"+
		"\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3"+
		"\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2"+
		"\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3"+
		".\3\2\2\2\4\61\3\2\2\2\6\66\3\2\2\2\b;\3\2\2\2\n?\3\2\2\2\fC\3\2\2\2\16"+
		"F\3\2\2\2\20I\3\2\2\2\22N\3\2\2\2\24S\3\2\2\2\26V\3\2\2\2\30[\3\2\2\2"+
		"\32`\3\2\2\2\34b\3\2\2\2\36d\3\2\2\2 j\3\2\2\2\"m\3\2\2\2$s\3\2\2\2&x"+
		"\3\2\2\2(\u0080\3\2\2\2*\u0082\3\2\2\2,\u0089\3\2\2\2.\u008e\3\2\2\2\60"+
		"\62\t\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\5\3\2\2\2\65\67\7\17\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7"+
		"\f\2\29\7\3\2\2\2:<\t\3\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\t"+
		"\3\2\2\2?@\5\4\2\2@A\7\61\2\2AB\5\4\2\2B\13\3\2\2\2CD\7\61\2\2DE\5\4\2"+
		"\2E\r\3\2\2\2FG\7Z\2\2GH\7<\2\2H\17\3\2\2\2IJ\7V\2\2JK\7<\2\2KL\3\2\2"+
		"\2LM\b\b\2\2M\21\3\2\2\2NO\7O\2\2OP\7<\2\2PQ\3\2\2\2QR\b\t\2\2R\23\3\2"+
		"\2\2ST\7N\2\2TU\7<\2\2U\25\3\2\2\2VW\7M\2\2WX\7<\2\2XY\3\2\2\2YZ\b\13"+
		"\2\2Z\27\3\2\2\2[\\\7P\2\2\\]\7<\2\2]^\3\2\2\2^_\b\f\2\2_\31\3\2\2\2`"+
		"a\5\4\2\2a\33\3\2\2\2bc\7)\2\2c\35\3\2\2\2de\7.\2\2e\37\3\2\2\2fk\5\f"+
		"\6\2gk\5\32\r\2hk\5\36\17\2ik\5\34\16\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2"+
		"ji\3\2\2\2k!\3\2\2\2ln\5\b\4\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"pq\3\2\2\2qr\5(\24\2r#\3\2\2\2st\5(\24\2t%\3\2\2\2uw\7\"\2\2vu\3\2\2\2"+
		"wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y~\3\2\2\2zx\3\2\2\2{\177\7~\2\2|}\7~\2"+
		"\2}\177\7_\2\2~{\3\2\2\2~|\3\2\2\2\177\'\3\2\2\2\u0080\u0081\t\4\2\2\u0081"+
		")\3\2\2\2\u0082\u0083\5\6\3\2\u0083\u0084\3\2\2\2\u0084\u0085\b\25\3\2"+
		"\u0085+\3\2\2\2\u0086\u008a\5.\27\2\u0087\u008a\5\4\2\2\u0088\u008a\5"+
		"\b\4\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c-\3\2\2\2"+
		"\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091/\3\2\2\2\16\2\3\63\66=jox~\u0089\u008b"+
		"\u0090\4\4\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}