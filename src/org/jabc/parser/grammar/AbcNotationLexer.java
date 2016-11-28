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
		OCTAVE_UP=13, OCTAVE_DOWN=14, SingleNote=15, BeamNote=16, NOTE=17, SqaureBracketOpen=18, 
		SqaureBracketClosed=19, VerticalBar=20, Colon=21, EXIT_NEWLINE=22, STRING=23, 
		ID=24;
	public static final int STRING_MODE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "NEWLINE", "WS", "FRACTION", "Delimiter", "IdentifierSymbol", "TitleSymbol", 
		"MeasureSymbol", "LengthSymbol", "KeySymbol", "CommentSymbol", "MULTIPLIER", 
		"OCTAVE_UP", "OCTAVE_DOWN", "SingleNote", "BeamNote", "NOTE", "SqaureBracketOpen", 
		"SqaureBracketClosed", "VerticalBar", "Colon", "EXIT_NEWLINE", "STRING", 
		"ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'X:'", "'T:'", "'M:'", "'L:'", "'K:'", 
		"'N:'", null, "'''", "','", null, null, null, "'['", "']'", "'|'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "NEWLINE", "WS", "FRACTION", "Delimiter", "IdentifierSymbol", 
		"TitleSymbol", "MeasureSymbol", "LengthSymbol", "KeySymbol", "CommentSymbol", 
		"MULTIPLIER", "OCTAVE_UP", "OCTAVE_DOWN", "SingleNote", "BeamNote", "NOTE", 
		"SqaureBracketOpen", "SqaureBracketClosed", "VerticalBar", "Colon", "EXIT_NEWLINE", 
		"STRING", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u008d\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\3\2\6\2\66\n\2\r\2\16\2\67\3\3\5\3;\n\3\3\3\3\3\3\4\6\4@\n\4"+
		"\r\4\16\4A\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20l\n\20\r\20\16\20m\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\6\30\u0085\n\30\r\30\16\30\u0086\3\31\6"+
		"\31\u008a\n\31\r\31\16\31\u008b\2\2\32\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22"+
		"\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30"+
		"\60\31\62\32\4\2\3\6\3\2\62;\4\2\13\13\"\"\4\2CIci\4\2C\\c|\u0093\2\4"+
		"\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2"+
		"\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32"+
		"\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2"+
		"&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62"+
		"\3\2\2\2\4\65\3\2\2\2\6:\3\2\2\2\b?\3\2\2\2\nC\3\2\2\2\fG\3\2\2\2\16J"+
		"\3\2\2\2\20M\3\2\2\2\22R\3\2\2\2\24W\3\2\2\2\26Z\3\2\2\2\30_\3\2\2\2\32"+
		"d\3\2\2\2\34f\3\2\2\2\36h\3\2\2\2 k\3\2\2\2\"q\3\2\2\2$s\3\2\2\2&u\3\2"+
		"\2\2(w\3\2\2\2*y\3\2\2\2,{\3\2\2\2.}\3\2\2\2\60\u0084\3\2\2\2\62\u0089"+
		"\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3"+
		"\2\2\28\5\3\2\2\29;\7\17\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\f\2\2="+
		"\7\3\2\2\2>@\t\3\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2"+
		"\2CD\5\4\2\2DE\7\61\2\2EF\5\4\2\2F\13\3\2\2\2GH\7\61\2\2HI\5\4\2\2I\r"+
		"\3\2\2\2JK\7Z\2\2KL\7<\2\2L\17\3\2\2\2MN\7V\2\2NO\7<\2\2OP\3\2\2\2PQ\b"+
		"\b\2\2Q\21\3\2\2\2RS\7O\2\2ST\7<\2\2TU\3\2\2\2UV\b\t\2\2V\23\3\2\2\2W"+
		"X\7N\2\2XY\7<\2\2Y\25\3\2\2\2Z[\7M\2\2[\\\7<\2\2\\]\3\2\2\2]^\b\13\2\2"+
		"^\27\3\2\2\2_`\7P\2\2`a\7<\2\2ab\3\2\2\2bc\b\f\2\2c\31\3\2\2\2de\5\4\2"+
		"\2e\33\3\2\2\2fg\7)\2\2g\35\3\2\2\2hi\7.\2\2i\37\3\2\2\2jl\5\b\4\2kj\3"+
		"\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5$\22\2p!\3\2\2\2qr\5"+
		"$\22\2r#\3\2\2\2st\t\4\2\2t%\3\2\2\2uv\7]\2\2v\'\3\2\2\2wx\7_\2\2x)\3"+
		"\2\2\2yz\7~\2\2z+\3\2\2\2{|\7<\2\2|-\3\2\2\2}~\5\6\3\2~\177\3\2\2\2\177"+
		"\u0080\b\27\3\2\u0080/\3\2\2\2\u0081\u0085\5\62\31\2\u0082\u0085\5\4\2"+
		"\2\u0083\u0085\5\b\4\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\61\3\2\2\2\u0088\u008a\t\5\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2"+
		"\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\63\3\2\2\2\13\2\3\67"+
		":Am\u0084\u0086\u008b\4\4\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}