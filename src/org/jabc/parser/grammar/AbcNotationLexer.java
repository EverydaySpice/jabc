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
		INT=1, NEWLINE=2, WS=3, COMMENT=4, Slash=5, IdentifierSymbol=6, TitleSymbol=7, 
		MeterSymbol=8, LengthSymbol=9, KeySymbol=10, NotesSymbol=11, VoiceSymbol=12, 
		ComposerSymbol=13, TempoSymbol=14, MULTIPLIER=15, OCTAVE_UP=16, OCTAVE_DOWN=17, 
		Flat=18, Sharp=19, NOTE=20, Rest=21, InvisibleRest=22, BarRest=23, BracketOpen=24, 
		BracketClosed=25, SqaureBracketOpen=26, SqaureBracketClosed=27, VerticalBar=28, 
		Colon=29, Equals=30, Minus=31, Backslash=32, EXIT_NEWLINE=33, STRING=34, 
		ID=35;
	public static final int STRING_MODE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "NEWLINE", "WS", "COMMENT", "Slash", "IdentifierSymbol", "TitleSymbol", 
		"MeterSymbol", "LengthSymbol", "KeySymbol", "NotesSymbol", "VoiceSymbol", 
		"ComposerSymbol", "TempoSymbol", "MULTIPLIER", "OCTAVE_UP", "OCTAVE_DOWN", 
		"Flat", "Sharp", "NOTE", "Rest", "InvisibleRest", "BarRest", "BracketOpen", 
		"BracketClosed", "SqaureBracketOpen", "SqaureBracketClosed", "VerticalBar", 
		"Colon", "Equals", "Minus", "Backslash", "EXIT_NEWLINE", "STRING", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'/'", "'X:'", "'T:'", "'M:'", "'L:'", "'K:'", 
		"'N:'", "'V:'", "'C:'", "'Q:'", null, "'''", "','", "'_'", "'^'", null, 
		"'z'", "'x'", "'Z'", "'('", "')'", "'['", "']'", "'|'", "':'", "'='", 
		"'-'", "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "NEWLINE", "WS", "COMMENT", "Slash", "IdentifierSymbol", 
		"TitleSymbol", "MeterSymbol", "LengthSymbol", "KeySymbol", "NotesSymbol", 
		"VoiceSymbol", "ComposerSymbol", "TempoSymbol", "MULTIPLIER", "OCTAVE_UP", 
		"OCTAVE_DOWN", "Flat", "Sharp", "NOTE", "Rest", "InvisibleRest", "BarRest", 
		"BracketOpen", "BracketClosed", "SqaureBracketOpen", "SqaureBracketClosed", 
		"VerticalBar", "Colon", "Equals", "Minus", "Backslash", "EXIT_NEWLINE", 
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("lc > " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00c3\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\6\2L\n\2\r\2\16\2M\3\3\5\3Q\n\3\3\3\3"+
		"\3\3\4\6\4V\n\4\r\4\16\4W\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\6#\u00bb\n#\r#\16#\u00bc\3$\6$\u00c0"+
		"\n$\r$\16$\u00c1\3]\2%\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30"+
		"\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33"+
		"\66\348\35:\36<\37> @!B\"D#F$H%\4\2\3\7\3\2\62;\4\2\13\13\"\"\4\2CIci"+
		"\f\2#$&(*+.\61==??AAaa\u00a9\u00a9\u00c4\u00c4\4\2C\\c|\u00ca\2\4\3\2"+
		"\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20"+
		"\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2"+
		"\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3"+
		"\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3"+
		"\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3"+
		"\2\2\2\2@\3\2\2\2\2B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\4K\3\2\2"+
		"\2\6P\3\2\2\2\bU\3\2\2\2\nY\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20j\3\2\2\2"+
		"\22o\3\2\2\2\24t\3\2\2\2\26w\3\2\2\2\30|\3\2\2\2\32\u0081\3\2\2\2\34\u0086"+
		"\3\2\2\2\36\u008b\3\2\2\2 \u008e\3\2\2\2\"\u0090\3\2\2\2$\u0092\3\2\2"+
		"\2&\u0094\3\2\2\2(\u0096\3\2\2\2*\u0098\3\2\2\2,\u009a\3\2\2\2.\u009c"+
		"\3\2\2\2\60\u009e\3\2\2\2\62\u00a0\3\2\2\2\64\u00a2\3\2\2\2\66\u00a4\3"+
		"\2\2\28\u00a6\3\2\2\2:\u00a8\3\2\2\2<\u00aa\3\2\2\2>\u00ac\3\2\2\2@\u00ae"+
		"\3\2\2\2B\u00b0\3\2\2\2D\u00b2\3\2\2\2F\u00ba\3\2\2\2H\u00bf\3\2\2\2J"+
		"L\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OQ\7\17\2"+
		"\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\f\2\2S\7\3\2\2\2TV\t\3\2\2UT\3\2"+
		"\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\t\3\2\2\2Y]\7\'\2\2Z\\\13\2\2\2[Z"+
		"\3\2\2\2\\_\3\2\2\2]^\3\2\2\2][\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\b\5\2\2"+
		"ab\5\6\3\2bc\3\2\2\2cd\b\5\3\2d\13\3\2\2\2ef\7\61\2\2f\r\3\2\2\2gh\7Z"+
		"\2\2hi\7<\2\2i\17\3\2\2\2jk\7V\2\2kl\7<\2\2lm\3\2\2\2mn\b\b\4\2n\21\3"+
		"\2\2\2op\7O\2\2pq\7<\2\2qr\3\2\2\2rs\b\t\4\2s\23\3\2\2\2tu\7N\2\2uv\7"+
		"<\2\2v\25\3\2\2\2wx\7M\2\2xy\7<\2\2yz\3\2\2\2z{\b\13\4\2{\27\3\2\2\2|"+
		"}\7P\2\2}~\7<\2\2~\177\3\2\2\2\177\u0080\b\f\4\2\u0080\31\3\2\2\2\u0081"+
		"\u0082\7X\2\2\u0082\u0083\7<\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\r\4"+
		"\2\u0085\33\3\2\2\2\u0086\u0087\7E\2\2\u0087\u0088\7<\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\b\16\4\2\u008a\35\3\2\2\2\u008b\u008c\7S\2\2\u008c"+
		"\u008d\7<\2\2\u008d\37\3\2\2\2\u008e\u008f\5\4\2\2\u008f!\3\2\2\2\u0090"+
		"\u0091\7)\2\2\u0091#\3\2\2\2\u0092\u0093\7.\2\2\u0093%\3\2\2\2\u0094\u0095"+
		"\7a\2\2\u0095\'\3\2\2\2\u0096\u0097\7`\2\2\u0097)\3\2\2\2\u0098\u0099"+
		"\t\4\2\2\u0099+\3\2\2\2\u009a\u009b\7|\2\2\u009b-\3\2\2\2\u009c\u009d"+
		"\7z\2\2\u009d/\3\2\2\2\u009e\u009f\7\\\2\2\u009f\61\3\2\2\2\u00a0\u00a1"+
		"\7*\2\2\u00a1\63\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3\65\3\2\2\2\u00a4\u00a5"+
		"\7]\2\2\u00a5\67\3\2\2\2\u00a6\u00a7\7_\2\2\u00a79\3\2\2\2\u00a8\u00a9"+
		"\7~\2\2\u00a9;\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab=\3\2\2\2\u00ac\u00ad\7"+
		"?\2\2\u00ad?\3\2\2\2\u00ae\u00af\7/\2\2\u00afA\3\2\2\2\u00b0\u00b1\7^"+
		"\2\2\u00b1C\3\2\2\2\u00b2\u00b3\5\6\3\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\b\"\5\2\u00b5E\3\2\2\2\u00b6\u00bb\5H$\2\u00b7\u00bb\5\4\2\2\u00b8\u00bb"+
		"\5\b\4\2\u00b9\u00bb\t\5\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bdG\3\2\2\2\u00be\u00c0\t\6\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"I\3\2\2\2\13\2\3MPW]\u00ba\u00bc\u00c1\6\3\5\2\b\2\2\4\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}