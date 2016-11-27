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
		OCTAVE_UP=13, OCTAVE_DOWN=14, NOTE=15, SingleNote=16, BeamNote=17, BARLINE=18, 
		EXIT_NEWLINE=19, STRING=20, ID=21;
	public static final int STRING_MODE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "NEWLINE", "WS", "FRACTION", "Delimiter", "IdentifierSymbol", "TitleSymbol", 
		"MeasureSymbol", "LengthSymbol", "KeySymbol", "CommentSymbol", "MULTIPLIER", 
		"OCTAVE_UP", "OCTAVE_DOWN", "NOTE", "SingleNote", "BeamNote", "BARLINE", 
		"EXIT_NEWLINE", "STRING", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'X:'", "'T:'", "'M:'", "'L:'", "'K:'", 
		"'N:'", null, "'''", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "NEWLINE", "WS", "FRACTION", "Delimiter", "IdentifierSymbol", 
		"TitleSymbol", "MeasureSymbol", "LengthSymbol", "KeySymbol", "CommentSymbol", 
		"MULTIPLIER", "OCTAVE_UP", "OCTAVE_DOWN", "NOTE", "SingleNote", "BeamNote", 
		"BARLINE", "EXIT_NEWLINE", "STRING", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u008a\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2\60\n\2\r\2\16"+
		"\2\61\3\3\5\3\65\n\3\3\3\3\3\3\4\6\4:\n\4\r\4\16\4;\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\6\21h\n\21\r\21\16\21i\3\21\3\21\3\22\3\22\3\23"+
		"\7\23q\n\23\f\23\16\23t\13\23\3\23\3\23\3\23\5\23y\n\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\6\25\u0082\n\25\r\25\16\25\u0083\3\26\6\26\u0087"+
		"\n\26\r\26\16\26\u0088\2\2\27\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13"+
		"\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27\4\2\3\6\3\2"+
		"\62;\4\2\13\13\"\"\4\2CIci\4\2C\\c|\u0092\2\4\3\2\2\2\2\6\3\2\2\2\2\b"+
		"\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2"+
		"\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2"+
		"\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\3(\3\2\2\2\3"+
		"*\3\2\2\2\3,\3\2\2\2\4/\3\2\2\2\6\64\3\2\2\2\b9\3\2\2\2\n=\3\2\2\2\fA"+
		"\3\2\2\2\16D\3\2\2\2\20G\3\2\2\2\22L\3\2\2\2\24Q\3\2\2\2\26T\3\2\2\2\30"+
		"Y\3\2\2\2\32^\3\2\2\2\34`\3\2\2\2\36b\3\2\2\2 d\3\2\2\2\"g\3\2\2\2$m\3"+
		"\2\2\2&r\3\2\2\2(z\3\2\2\2*\u0081\3\2\2\2,\u0086\3\2\2\2.\60\t\2\2\2/"+
		".\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\65\7"+
		"\17\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\f\2\2\67\7\3"+
		"\2\2\28:\t\3\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\t\3\2\2\2=>"+
		"\5\4\2\2>?\7\61\2\2?@\5\4\2\2@\13\3\2\2\2AB\7\61\2\2BC\5\4\2\2C\r\3\2"+
		"\2\2DE\7Z\2\2EF\7<\2\2F\17\3\2\2\2GH\7V\2\2HI\7<\2\2IJ\3\2\2\2JK\b\b\2"+
		"\2K\21\3\2\2\2LM\7O\2\2MN\7<\2\2NO\3\2\2\2OP\b\t\2\2P\23\3\2\2\2QR\7N"+
		"\2\2RS\7<\2\2S\25\3\2\2\2TU\7M\2\2UV\7<\2\2VW\3\2\2\2WX\b\13\2\2X\27\3"+
		"\2\2\2YZ\7P\2\2Z[\7<\2\2[\\\3\2\2\2\\]\b\f\2\2]\31\3\2\2\2^_\5\4\2\2_"+
		"\33\3\2\2\2`a\7)\2\2a\35\3\2\2\2bc\7.\2\2c\37\3\2\2\2de\t\4\2\2e!\3\2"+
		"\2\2fh\5\b\4\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\5 "+
		"\20\2l#\3\2\2\2mn\5 \20\2n%\3\2\2\2oq\7\"\2\2po\3\2\2\2qt\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2sx\3\2\2\2tr\3\2\2\2uy\7~\2\2vw\7~\2\2wy\7_\2\2xu\3\2"+
		"\2\2xv\3\2\2\2y\'\3\2\2\2z{\5\6\3\2{|\3\2\2\2|}\b\24\3\2})\3\2\2\2~\u0082"+
		"\5,\26\2\177\u0082\5\4\2\2\u0080\u0082\5\b\4\2\u0081~\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084+\3\2\2\2\u0085\u0087\t\5\2\2\u0086\u0085\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089-\3"+
		"\2\2\2\r\2\3\61\64;irx\u0081\u0083\u0088\4\4\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}