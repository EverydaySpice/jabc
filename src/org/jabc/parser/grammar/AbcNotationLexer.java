// Generated from AbcNotation.g4 by ANTLR 4.5.3
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MULTIPLIER=7, OCTAVE_UP=8, 
		OCTAVE_DOWN=9, TAKTSTRICH=10, NOTE=11, INT=12, FRACTION=13, ID=14, NEWLINE=15, 
		WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "MULTIPLIER", "OCTAVE_UP", 
		"OCTAVE_DOWN", "TAKTSTRICH", "NOTE", "INT", "FRACTION", "ID", "NEWLINE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'X:'", "'T:'", "'M:'", "'L:'", "'K:'", "'/'", null, "'''", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "MULTIPLIER", "OCTAVE_UP", "OCTAVE_DOWN", 
		"TAKTSTRICH", "NOTE", "INT", "FRACTION", "ID", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "AbcNotation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\5\13>\n\13\3\f\3\f\3\r\6\rC\n\r\r\r\16\rD"+
		"\3\16\3\16\3\16\3\16\3\17\6\17L\n\17\r\17\16\17M\3\20\5\20Q\n\20\3\20"+
		"\3\20\3\21\6\21V\n\21\r\21\16\21W\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\6\4\2"+
		"CIci\3\2\62;\4\2C\\c|\4\2\13\13\"\"_\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5&\3\2\2\2\7)\3\2\2\2\t,\3\2\2"+
		"\2\13/\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2\238\3\2\2\2\25"+
		"=\3\2\2\2\27?\3\2\2\2\31B\3\2\2\2\33F\3\2\2\2\35K\3\2\2\2\37P\3\2\2\2"+
		"!U\3\2\2\2#$\7Z\2\2$%\7<\2\2%\4\3\2\2\2&\'\7V\2\2\'(\7<\2\2(\6\3\2\2\2"+
		")*\7O\2\2*+\7<\2\2+\b\3\2\2\2,-\7N\2\2-.\7<\2\2.\n\3\2\2\2/\60\7M\2\2"+
		"\60\61\7<\2\2\61\f\3\2\2\2\62\63\7\61\2\2\63\16\3\2\2\2\64\65\5\31\r\2"+
		"\65\20\3\2\2\2\66\67\7)\2\2\67\22\3\2\2\289\7.\2\29\24\3\2\2\2:>\7~\2"+
		"\2;<\7~\2\2<>\7_\2\2=:\3\2\2\2=;\3\2\2\2>\26\3\2\2\2?@\t\2\2\2@\30\3\2"+
		"\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\32\3\2\2\2FG\5"+
		"\31\r\2GH\7\61\2\2HI\5\31\r\2I\34\3\2\2\2JL\t\4\2\2KJ\3\2\2\2LM\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2N\36\3\2\2\2OQ\7\17\2\2PO\3\2\2\2PQ\3\2\2\2QR\3"+
		"\2\2\2RS\7\f\2\2S \3\2\2\2TV\t\5\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2XY\3\2\2\2YZ\b\21\2\2Z\"\3\2\2\2\b\2=DMPW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}