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
		ComposerSymbol=13, TempoSymbol=14, NotSupportedSymbol=15, MULTIPLIER=16, 
		OCTAVE_UP=17, OCTAVE_DOWN=18, Flat=19, Sharp=20, NOTE=21, Rest=22, InvisibleRest=23, 
		BarRest=24, BracketOpen=25, BracketClosed=26, SquareBracketOpen=27, SquareBracketClosed=28, 
		VerticalBar=29, Colon=30, Equals=31, Minus=32, Backslash=33, QuotationMark=34, 
		Decoration=35, STRING_MODE_EXIT=36, STRING_MODE_COMMENT=37, STRING=38, 
		ID=39;
	public static final int STRING_MODE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "NEWLINE", "WS", "COMMENT", "Slash", "IdentifierSymbol", "TitleSymbol", 
		"MeterSymbol", "LengthSymbol", "KeySymbol", "NotesSymbol", "VoiceSymbol", 
		"ComposerSymbol", "TempoSymbol", "NotSupportedSymbol", "MULTIPLIER", "OCTAVE_UP", 
		"OCTAVE_DOWN", "Flat", "Sharp", "NOTE", "Rest", "InvisibleRest", "BarRest", 
		"BracketOpen", "BracketClosed", "SquareBracketOpen", "SquareBracketClosed", 
		"VerticalBar", "Colon", "Equals", "Minus", "Backslash", "QuotationMark", 
		"Decoration", "STRING_MODE_EXIT", "STRING_MODE_COMMENT", "STRING", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'/'", "'X:'", "'T:'", "'M:'", "'L:'", "'K:'", 
		"'N:'", "'V:'", "'C:'", "'Q:'", null, null, "'''", "','", "'_'", "'^'", 
		null, null, "'x'", "'Z'", "'('", "')'", "'['", "']'", "'|'", "':'", "'='", 
		"'-'", "'\\'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "NEWLINE", "WS", "COMMENT", "Slash", "IdentifierSymbol", 
		"TitleSymbol", "MeterSymbol", "LengthSymbol", "KeySymbol", "NotesSymbol", 
		"VoiceSymbol", "ComposerSymbol", "TempoSymbol", "NotSupportedSymbol", 
		"MULTIPLIER", "OCTAVE_UP", "OCTAVE_DOWN", "Flat", "Sharp", "NOTE", "Rest", 
		"InvisibleRest", "BarRest", "BracketOpen", "BracketClosed", "SquareBracketOpen", 
		"SquareBracketClosed", "VerticalBar", "Colon", "Equals", "Minus", "Backslash", 
		"QuotationMark", "Decoration", "STRING_MODE_EXIT", "STRING_MODE_COMMENT", 
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
		case 36:
			STRING_MODE_COMMENT_action((RuleContext)_localctx, actionIndex);
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
	private void STRING_MODE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("lc > " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00ef\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\6\2T\n\2\r\2"+
		"\16\2U\3\3\5\3Y\n\3\3\3\3\3\3\4\6\4^\n\4\r\4\16\4_\3\5\3\5\7\5d\n\5\f"+
		"\5\16\5g\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\7\20\u0098\n\20\f\20\16\20\u009b\13\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\7$\u00cb\n$\f$\16$\u00ce"+
		"\13$\3$\3$\3%\3%\5%\u00d4\n%\3%\3%\3&\3&\7&\u00da\n&\f&\16&\u00dd\13&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\6\'\u00e7\n\'\r\'\16\'\u00e8\3(\6(\u00ec"+
		"\n(\r(\16(\u00ed\3\u0099\2)\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26"+
		"\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32"+
		"\64\33\66\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P)\4\2\3\f\3\2\62;\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\r\2CDFFHKQRTUWWYY\\\\ootuyy\4\2CIci\4\2zz||\n\2"+
		"*+--\60\60\62;>>@@C\\c|\4\2$$__\16\2##&&((*+.\61==??AAaa~~\u00a9\u00a9"+
		"\u00c4\u00c4\13\2\"\"C\\c|\u00c6\u00c6\u00d8\u00d8\u00de\u00de\u00e6\u00e6"+
		"\u00f8\u00f8\u00fe\u00fe\u00fa\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n"+
		"\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2"+
		"\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2"+
		" \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3"+
		"\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2"+
		"\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D"+
		"\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2"+
		"\2\2\4S\3\2\2\2\6X\3\2\2\2\b]\3\2\2\2\na\3\2\2\2\fm\3\2\2\2\16o\3\2\2"+
		"\2\20r\3\2\2\2\22w\3\2\2\2\24z\3\2\2\2\26}\3\2\2\2\30\u0082\3\2\2\2\32"+
		"\u0087\3\2\2\2\34\u008c\3\2\2\2\36\u0091\3\2\2\2 \u0094\3\2\2\2\"\u00a0"+
		"\3\2\2\2$\u00a2\3\2\2\2&\u00a4\3\2\2\2(\u00a6\3\2\2\2*\u00a8\3\2\2\2,"+
		"\u00aa\3\2\2\2.\u00ac\3\2\2\2\60\u00ae\3\2\2\2\62\u00b0\3\2\2\2\64\u00b2"+
		"\3\2\2\2\66\u00b4\3\2\2\28\u00b6\3\2\2\2:\u00b8\3\2\2\2<\u00ba\3\2\2\2"+
		">\u00bc\3\2\2\2@\u00be\3\2\2\2B\u00c0\3\2\2\2D\u00c2\3\2\2\2F\u00c4\3"+
		"\2\2\2H\u00c8\3\2\2\2J\u00d3\3\2\2\2L\u00d7\3\2\2\2N\u00e6\3\2\2\2P\u00eb"+
		"\3\2\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\5\3\2\2\2"+
		"WY\7\17\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\f\2\2[\7\3\2\2\2\\^\t\3"+
		"\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\t\3\2\2\2ae\7\'\2\2bd\n"+
		"\4\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\b"+
		"\5\2\2ij\5\6\3\2jk\3\2\2\2kl\b\5\3\2l\13\3\2\2\2mn\7\61\2\2n\r\3\2\2\2"+
		"op\7Z\2\2pq\7<\2\2q\17\3\2\2\2rs\7V\2\2st\7<\2\2tu\3\2\2\2uv\b\b\4\2v"+
		"\21\3\2\2\2wx\7O\2\2xy\7<\2\2y\23\3\2\2\2z{\7N\2\2{|\7<\2\2|\25\3\2\2"+
		"\2}~\7M\2\2~\177\7<\2\2\177\u0080\3\2\2\2\u0080\u0081\b\13\4\2\u0081\27"+
		"\3\2\2\2\u0082\u0083\7P\2\2\u0083\u0084\7<\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\b\f\4\2\u0086\31\3\2\2\2\u0087\u0088\7X\2\2\u0088\u0089\7<\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u008b\b\r\4\2\u008b\33\3\2\2\2\u008c\u008d"+
		"\7E\2\2\u008d\u008e\7<\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\16\4\2\u0090"+
		"\35\3\2\2\2\u0091\u0092\7S\2\2\u0092\u0093\7<\2\2\u0093\37\3\2\2\2\u0094"+
		"\u0095\t\5\2\2\u0095\u0099\7<\2\2\u0096\u0098\13\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\u009b\3\2\2\2\u0099\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5\6\3\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\b\20\3\2\u009f!\3\2\2\2\u00a0\u00a1\5\4\2\2\u00a1#\3"+
		"\2\2\2\u00a2\u00a3\7)\2\2\u00a3%\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5\'\3"+
		"\2\2\2\u00a6\u00a7\7a\2\2\u00a7)\3\2\2\2\u00a8\u00a9\7`\2\2\u00a9+\3\2"+
		"\2\2\u00aa\u00ab\t\6\2\2\u00ab-\3\2\2\2\u00ac\u00ad\t\7\2\2\u00ad/\3\2"+
		"\2\2\u00ae\u00af\7z\2\2\u00af\61\3\2\2\2\u00b0\u00b1\7\\\2\2\u00b1\63"+
		"\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3\65\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5"+
		"\67\3\2\2\2\u00b6\u00b7\7]\2\2\u00b79\3\2\2\2\u00b8\u00b9\7_\2\2\u00b9"+
		";\3\2\2\2\u00ba\u00bb\7~\2\2\u00bb=\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd?"+
		"\3\2\2\2\u00be\u00bf\7?\2\2\u00bfA\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1C\3"+
		"\2\2\2\u00c2\u00c3\7^\2\2\u00c3E\3\2\2\2\u00c4\u00c5\7$\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\b#\4\2\u00c7G\3\2\2\2\u00c8\u00cc\7#\2\2\u00c9\u00cb"+
		"\t\b\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7#"+
		"\2\2\u00d0I\3\2\2\2\u00d1\u00d4\5\6\3\2\u00d2\u00d4\t\t\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b%\5\2\u00d6"+
		"K\3\2\2\2\u00d7\u00db\7\'\2\2\u00d8\u00da\n\4\2\2\u00d9\u00d8\3\2\2\2"+
		"\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\b&\6\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\b&\3\2\u00e1M\3\2\2\2\u00e2\u00e7\5P(\2\u00e3\u00e7\5\4\2\2\u00e4"+
		"\u00e7\5\b\4\2\u00e5\u00e7\t\n\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9O\3\2\2\2\u00ea\u00ec\t\13\2\2"+
		"\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00eeQ\3\2\2\2\17\2\3UX_e\u0099\u00cc\u00d3\u00db\u00e6\u00e8"+
		"\u00ed\7\3\5\2\b\2\2\4\3\2\4\2\2\3&\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}