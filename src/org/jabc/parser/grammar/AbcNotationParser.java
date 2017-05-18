// Generated from AbcNotationParser.g4 by ANTLR 4.5.3
package org.jabc.parser.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcNotationParser extends Parser {
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
		VerticalBar=29, Colon=30, Equals=31, Minus=32, Backslash=33, Quotationmark=34, 
		Decoration=35, STRING_MODE_EXIT=36, STRING_MODE_COMMENT=37, STRING=38, 
		ID=39;
	public static final int
		RULE_fraction = 0, RULE_string = 1, RULE_endOfLine = 2, RULE_tune = 3, 
		RULE_voice = 4, RULE_voiceInfo = 5, RULE_score = 6, RULE_header = 7, RULE_identifier = 8, 
		RULE_title = 9, RULE_meter = 10, RULE_length = 11, RULE_key = 12, RULE_notes = 13, 
		RULE_composer = 14, RULE_tempo = 15, RULE_fractionTempo = 16, RULE_stringTempo = 17, 
		RULE_stringQuotation = 18, RULE_integerTempo = 19, RULE_bar = 20, RULE_endOfBar = 21, 
		RULE_barline = 22, RULE_simpleBarline = 23, RULE_thinThinBarline = 24, 
		RULE_thikThinBarline = 25, RULE_thinThikBarline = 26, RULE_startOfRepeatedBarline = 27, 
		RULE_endOfRepeatedBarline = 28, RULE_startAndEndOfRepeatedBarline = 29, 
		RULE_suppresScoreLinebreak = 30, RULE_musicalExpression = 31, RULE_note = 32, 
		RULE_multipleNotes = 33, RULE_rest = 34, RULE_noteExpression = 35, RULE_beamNote = 36, 
		RULE_noBeamNote = 37, RULE_decoration = 38, RULE_decorationExpression = 39, 
		RULE_noteLength = 40, RULE_noteOctave = 41, RULE_accidental = 42, RULE_slurStart = 43, 
		RULE_slurEnd = 44, RULE_inlineField = 45, RULE_meterChange = 46, RULE_lengthChange = 47, 
		RULE_keyChange = 48, RULE_tempoChange = 49, RULE_flat = 50, RULE_sharp = 51, 
		RULE_natural = 52, RULE_tiedNote = 53, RULE_delimiter = 54, RULE_multiplier = 55, 
		RULE_octaveUp = 56, RULE_octaveDown = 57;
	public static final String[] ruleNames = {
		"fraction", "string", "endOfLine", "tune", "voice", "voiceInfo", "score", 
		"header", "identifier", "title", "meter", "length", "key", "notes", "composer", 
		"tempo", "fractionTempo", "stringTempo", "stringQuotation", "integerTempo", 
		"bar", "endOfBar", "barline", "simpleBarline", "thinThinBarline", "thikThinBarline", 
		"thinThikBarline", "startOfRepeatedBarline", "endOfRepeatedBarline", "startAndEndOfRepeatedBarline", 
		"suppresScoreLinebreak", "musicalExpression", "note", "multipleNotes", 
		"rest", "noteExpression", "beamNote", "noBeamNote", "decoration", "decorationExpression", 
		"noteLength", "noteOctave", "accidental", "slurStart", "slurEnd", "inlineField", 
		"meterChange", "lengthChange", "keyChange", "tempoChange", "flat", "sharp", 
		"natural", "tiedNote", "delimiter", "multiplier", "octaveUp", "octaveDown"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'/'", "'X:'", "'T:'", "'M:'", "'L:'", "'K:'", 
		"'N:'", "'V:'", "'C:'", "'Q:'", null, null, "'''", "','", "'_'", "'^'", 
		null, "'z'", "'x'", "'Z'", "'('", "')'", "'['", "']'", "'|'", "':'", "'='", 
		"'-'", "'\\'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "NEWLINE", "WS", "COMMENT", "Slash", "IdentifierSymbol", 
		"TitleSymbol", "MeterSymbol", "LengthSymbol", "KeySymbol", "NotesSymbol", 
		"VoiceSymbol", "ComposerSymbol", "TempoSymbol", "NotSupportedSymbol", 
		"MULTIPLIER", "OCTAVE_UP", "OCTAVE_DOWN", "Flat", "Sharp", "NOTE", "Rest", 
		"InvisibleRest", "BarRest", "BracketOpen", "BracketClosed", "SquareBracketOpen", 
		"SquareBracketClosed", "VerticalBar", "Colon", "Equals", "Minus", "Backslash", 
		"Quotationmark", "Decoration", "STRING_MODE_EXIT", "STRING_MODE_COMMENT", 
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

	@Override
	public String getGrammarFileName() { return "AbcNotationParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AbcNotationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FractionContext extends ParserRuleContext {
		public Token numerator;
		public Token denominator;
		public TerminalNode Slash() { return getToken(AbcNotationParser.Slash, 0); }
		public List<TerminalNode> INT() { return getTokens(AbcNotationParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AbcNotationParser.INT, i);
		}
		public FractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fraction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((FractionContext)_localctx).numerator = match(INT);
			setState(117);
			match(Slash);
			setState(118);
			((FractionContext)_localctx).denominator = match(INT);
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

	public static class StringContext extends ParserRuleContext {
		public Token text;
		public TerminalNode STRING_MODE_EXIT() { return getToken(AbcNotationParser.STRING_MODE_EXIT, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((StringContext)_localctx).text = match(STRING);
			setState(121);
			match(STRING_MODE_EXIT);
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

	public static class EndOfLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
		public TerminalNode COMMENT() { return getToken(AbcNotationParser.COMMENT, 0); }
		public EndOfLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfLine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitEndOfLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfLineContext endOfLine() throws RecognitionException {
		EndOfLineContext _localctx = new EndOfLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endOfLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==COMMENT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TuneContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<VoiceContext> voice() {
			return getRuleContexts(VoiceContext.class);
		}
		public VoiceContext voice(int i) {
			return getRuleContext(VoiceContext.class,i);
		}
		public TuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tune; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTune(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuneContext tune() throws RecognitionException {
		TuneContext _localctx = new TuneContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tune);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			header();
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				voice();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << VoiceSymbol) | (1L << Flat) | (1L << Sharp) | (1L << NOTE) | (1L << Rest) | (1L << InvisibleRest) | (1L << BracketOpen) | (1L << BracketClosed) | (1L << SquareBracketOpen) | (1L << Equals) | (1L << Decoration))) != 0) );
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

	public static class VoiceContext extends ParserRuleContext {
		public VoiceInfoContext voiceInfo() {
			return getRuleContext(VoiceInfoContext.class,0);
		}
		public List<ScoreContext> score() {
			return getRuleContexts(ScoreContext.class);
		}
		public ScoreContext score(int i) {
			return getRuleContext(ScoreContext.class,i);
		}
		public VoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitVoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoiceContext voice() throws RecognitionException {
		VoiceContext _localctx = new VoiceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_voice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(132);
			_la = _input.LA(1);
			if (_la==VoiceSymbol) {
				{
				setState(131);
				voiceInfo();
				}
			}

			setState(135); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(134);
					score();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VoiceInfoContext extends ParserRuleContext {
		public Token text;
		public TerminalNode VoiceSymbol() { return getToken(AbcNotationParser.VoiceSymbol, 0); }
		public TerminalNode STRING_MODE_EXIT() { return getToken(AbcNotationParser.STRING_MODE_EXIT, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public VoiceInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voiceInfo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitVoiceInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoiceInfoContext voiceInfo() throws RecognitionException {
		VoiceInfoContext _localctx = new VoiceInfoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_voiceInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(VoiceSymbol);
			setState(140);
			((VoiceInfoContext)_localctx).text = match(STRING);
			setState(141);
			match(STRING_MODE_EXIT);
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

	public static class ScoreContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(AbcNotationParser.EOF, 0); }
		public List<BarContext> bar() {
			return getRuleContexts(BarContext.class);
		}
		public BarContext bar(int i) {
			return getRuleContext(BarContext.class,i);
		}
		public List<SuppresScoreLinebreakContext> suppresScoreLinebreak() {
			return getRuleContexts(SuppresScoreLinebreakContext.class);
		}
		public SuppresScoreLinebreakContext suppresScoreLinebreak(int i) {
			return getRuleContext(SuppresScoreLinebreakContext.class,i);
		}
		public ScoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitScore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScoreContext score() throws RecognitionException {
		ScoreContext _localctx = new ScoreContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_score);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				bar();
				setState(145);
				_la = _input.LA(1);
				if (_la==Backslash) {
					{
					setState(144);
					suppresScoreLinebreak();
					}
				}

				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << Flat) | (1L << Sharp) | (1L << NOTE) | (1L << Rest) | (1L << InvisibleRest) | (1L << BracketOpen) | (1L << BracketClosed) | (1L << SquareBracketOpen) | (1L << Equals) | (1L << Decoration))) != 0) );
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class HeaderContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public List<TitleContext> title() {
			return getRuleContexts(TitleContext.class);
		}
		public TitleContext title(int i) {
			return getRuleContext(TitleContext.class,i);
		}
		public List<MeterContext> meter() {
			return getRuleContexts(MeterContext.class);
		}
		public MeterContext meter(int i) {
			return getRuleContext(MeterContext.class,i);
		}
		public List<LengthContext> length() {
			return getRuleContexts(LengthContext.class);
		}
		public LengthContext length(int i) {
			return getRuleContext(LengthContext.class,i);
		}
		public List<NotesContext> notes() {
			return getRuleContexts(NotesContext.class);
		}
		public NotesContext notes(int i) {
			return getRuleContext(NotesContext.class,i);
		}
		public List<TempoContext> tempo() {
			return getRuleContexts(TempoContext.class);
		}
		public TempoContext tempo(int i) {
			return getRuleContext(TempoContext.class,i);
		}
		public List<ComposerContext> composer() {
			return getRuleContexts(ComposerContext.class);
		}
		public ComposerContext composer(int i) {
			return getRuleContext(ComposerContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			identifier();
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				title();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TitleSymbol );
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MeterSymbol) | (1L << LengthSymbol) | (1L << NotesSymbol) | (1L << ComposerSymbol) | (1L << TempoSymbol))) != 0)) {
				{
				setState(164);
				switch (_input.LA(1)) {
				case MeterSymbol:
					{
					setState(159);
					meter();
					}
					break;
				case LengthSymbol:
					{
					setState(160);
					length();
					}
					break;
				case NotesSymbol:
					{
					setState(161);
					notes();
					}
					break;
				case TempoSymbol:
					{
					setState(162);
					tempo();
					}
					break;
				case ComposerSymbol:
					{
					setState(163);
					composer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			key();
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

	public static class IdentifierContext extends ParserRuleContext {
		public Token text;
		public TerminalNode IdentifierSymbol() { return getToken(AbcNotationParser.IdentifierSymbol, 0); }
		public EndOfLineContext endOfLine() {
			return getRuleContext(EndOfLineContext.class,0);
		}
		public TerminalNode INT() { return getToken(AbcNotationParser.INT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IdentifierSymbol);
			setState(172);
			((IdentifierContext)_localctx).text = match(INT);
			setState(173);
			endOfLine();
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TitleSymbol() { return getToken(AbcNotationParser.TitleSymbol, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(TitleSymbol);
			setState(176);
			string();
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

	public static class MeterContext extends ParserRuleContext {
		public TerminalNode MeterSymbol() { return getToken(AbcNotationParser.MeterSymbol, 0); }
		public TerminalNode NOTE() { return getToken(AbcNotationParser.NOTE, 0); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public EndOfLineContext endOfLine() {
			return getRuleContext(EndOfLineContext.class,0);
		}
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMeter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_meter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(MeterSymbol);
			setState(181);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(179);
				match(NOTE);
				}
				break;
			case INT:
				{
				setState(180);
				fraction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(184);
			_la = _input.LA(1);
			if (_la==NEWLINE || _la==COMMENT) {
				{
				setState(183);
				endOfLine();
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

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode LengthSymbol() { return getToken(AbcNotationParser.LengthSymbol, 0); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public EndOfLineContext endOfLine() {
			return getRuleContext(EndOfLineContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(LengthSymbol);
			setState(188);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(187);
				match(WS);
				}
			}

			setState(190);
			fraction();
			setState(192);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(191);
				match(WS);
				}
			}

			setState(194);
			endOfLine();
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode KeySymbol() { return getToken(AbcNotationParser.KeySymbol, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(KeySymbol);
			setState(197);
			string();
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

	public static class NotesContext extends ParserRuleContext {
		public TerminalNode NotesSymbol() { return getToken(AbcNotationParser.NotesSymbol, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NotesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNotes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotesContext notes() throws RecognitionException {
		NotesContext _localctx = new NotesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_notes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(NotesSymbol);
			setState(200);
			string();
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

	public static class ComposerContext extends ParserRuleContext {
		public TerminalNode ComposerSymbol() { return getToken(AbcNotationParser.ComposerSymbol, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ComposerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitComposer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComposerContext composer() throws RecognitionException {
		ComposerContext _localctx = new ComposerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ComposerSymbol);
			setState(203);
			string();
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

	public static class TempoContext extends ParserRuleContext {
		public TerminalNode TempoSymbol() { return getToken(AbcNotationParser.TempoSymbol, 0); }
		public EndOfLineContext endOfLine() {
			return getRuleContext(EndOfLineContext.class,0);
		}
		public FractionTempoContext fractionTempo() {
			return getRuleContext(FractionTempoContext.class,0);
		}
		public StringTempoContext stringTempo() {
			return getRuleContext(StringTempoContext.class,0);
		}
		public IntegerTempoContext integerTempo() {
			return getRuleContext(IntegerTempoContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(TempoSymbol);
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(206);
				match(WS);
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(209);
				fractionTempo();
				}
				break;
			case 2:
				{
				setState(210);
				stringTempo();
				}
				break;
			case 3:
				{
				setState(211);
				integerTempo();
				}
				break;
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(214);
				match(WS);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			endOfLine();
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

	public static class FractionTempoContext extends ParserRuleContext {
		public Token speed;
		public TerminalNode Equals() { return getToken(AbcNotationParser.Equals, 0); }
		public TerminalNode INT() { return getToken(AbcNotationParser.INT, 0); }
		public List<StringQuotationContext> stringQuotation() {
			return getRuleContexts(StringQuotationContext.class);
		}
		public StringQuotationContext stringQuotation(int i) {
			return getRuleContext(StringQuotationContext.class,i);
		}
		public List<FractionContext> fraction() {
			return getRuleContexts(FractionContext.class);
		}
		public FractionContext fraction(int i) {
			return getRuleContext(FractionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
		public FractionTempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fractionTempo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitFractionTempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionTempoContext fractionTempo() throws RecognitionException {
		FractionTempoContext _localctx = new FractionTempoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fractionTempo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if (_la==Quotationmark) {
				{
				setState(222);
				stringQuotation();
				}
			}

			setState(229); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(226);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(225);
						match(WS);
						}
					}

					setState(228);
					fraction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(234);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(233);
				match(WS);
				}
			}

			setState(236);
			match(Equals);
			setState(238);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(237);
				match(WS);
				}
			}

			setState(240);
			((FractionTempoContext)_localctx).speed = match(INT);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(241);
				match(WS);
				}
				break;
			}
			setState(245);
			_la = _input.LA(1);
			if (_la==Quotationmark) {
				{
				setState(244);
				stringQuotation();
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

	public static class StringTempoContext extends ParserRuleContext {
		public StringQuotationContext stringQuotation() {
			return getRuleContext(StringQuotationContext.class,0);
		}
		public StringTempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringTempo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitStringTempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringTempoContext stringTempo() throws RecognitionException {
		StringTempoContext _localctx = new StringTempoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stringTempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			stringQuotation();
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

	public static class StringQuotationContext extends ParserRuleContext {
		public TerminalNode Quotationmark() { return getToken(AbcNotationParser.Quotationmark, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringQuotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringQuotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitStringQuotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringQuotationContext stringQuotation() throws RecognitionException {
		StringQuotationContext _localctx = new StringQuotationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringQuotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(Quotationmark);
			setState(250);
			string();
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

	public static class IntegerTempoContext extends ParserRuleContext {
		public Token speed;
		public TerminalNode INT() { return getToken(AbcNotationParser.INT, 0); }
		public List<StringQuotationContext> stringQuotation() {
			return getRuleContexts(StringQuotationContext.class);
		}
		public StringQuotationContext stringQuotation(int i) {
			return getRuleContext(StringQuotationContext.class,i);
		}
		public IntegerTempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerTempo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitIntegerTempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerTempoContext integerTempo() throws RecognitionException {
		IntegerTempoContext _localctx = new IntegerTempoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integerTempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if (_la==Quotationmark) {
				{
				setState(252);
				stringQuotation();
				}
			}

			setState(255);
			((IntegerTempoContext)_localctx).speed = match(INT);
			setState(257);
			_la = _input.LA(1);
			if (_la==Quotationmark) {
				{
				setState(256);
				stringQuotation();
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

	public static class BarContext extends ParserRuleContext {
		public EndOfBarContext endOfBar() {
			return getRuleContext(EndOfBarContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
		public List<MusicalExpressionContext> musicalExpression() {
			return getRuleContexts(MusicalExpressionContext.class);
		}
		public MusicalExpressionContext musicalExpression(int i) {
			return getRuleContext(MusicalExpressionContext.class,i);
		}
		public BarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarContext bar() throws RecognitionException {
		BarContext _localctx = new BarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(259);
					match(WS);
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(266); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(265);
					musicalExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(268); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(270);
			endOfBar();
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

	public static class EndOfBarContext extends ParserRuleContext {
		public BarlineContext barline() {
			return getRuleContext(BarlineContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
		public EndOfBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfBar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitEndOfBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfBarContext endOfBar() throws RecognitionException {
		EndOfBarContext _localctx = new EndOfBarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_endOfBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(272);
				match(WS);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			barline();
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

	public static class BarlineContext extends ParserRuleContext {
		public SimpleBarlineContext simpleBarline() {
			return getRuleContext(SimpleBarlineContext.class,0);
		}
		public ThinThikBarlineContext thinThikBarline() {
			return getRuleContext(ThinThikBarlineContext.class,0);
		}
		public ThikThinBarlineContext thikThinBarline() {
			return getRuleContext(ThikThinBarlineContext.class,0);
		}
		public ThinThinBarlineContext thinThinBarline() {
			return getRuleContext(ThinThinBarlineContext.class,0);
		}
		public StartOfRepeatedBarlineContext startOfRepeatedBarline() {
			return getRuleContext(StartOfRepeatedBarlineContext.class,0);
		}
		public EndOfRepeatedBarlineContext endOfRepeatedBarline() {
			return getRuleContext(EndOfRepeatedBarlineContext.class,0);
		}
		public StartAndEndOfRepeatedBarlineContext startAndEndOfRepeatedBarline() {
			return getRuleContext(StartAndEndOfRepeatedBarlineContext.class,0);
		}
		public BarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarlineContext barline() throws RecognitionException {
		BarlineContext _localctx = new BarlineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_barline);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				simpleBarline();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				thinThikBarline();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				thikThinBarline();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				thinThinBarline();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				startOfRepeatedBarline();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				endOfRepeatedBarline();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				startAndEndOfRepeatedBarline();
				}
				break;
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

	public static class SimpleBarlineContext extends ParserRuleContext {
		public TerminalNode VerticalBar() { return getToken(AbcNotationParser.VerticalBar, 0); }
		public SimpleBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleBarline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitSimpleBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleBarlineContext simpleBarline() throws RecognitionException {
		SimpleBarlineContext _localctx = new SimpleBarlineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_simpleBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(VerticalBar);
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

	public static class ThinThinBarlineContext extends ParserRuleContext {
		public List<TerminalNode> VerticalBar() { return getTokens(AbcNotationParser.VerticalBar); }
		public TerminalNode VerticalBar(int i) {
			return getToken(AbcNotationParser.VerticalBar, i);
		}
		public ThinThinBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thinThinBarline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitThinThinBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThinThinBarlineContext thinThinBarline() throws RecognitionException {
		ThinThinBarlineContext _localctx = new ThinThinBarlineContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_thinThinBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(VerticalBar);
			setState(292);
			match(VerticalBar);
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

	public static class ThikThinBarlineContext extends ParserRuleContext {
		public TerminalNode SquareBracketOpen() { return getToken(AbcNotationParser.SquareBracketOpen, 0); }
		public TerminalNode VerticalBar() { return getToken(AbcNotationParser.VerticalBar, 0); }
		public ThikThinBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thikThinBarline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitThikThinBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThikThinBarlineContext thikThinBarline() throws RecognitionException {
		ThikThinBarlineContext _localctx = new ThikThinBarlineContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_thikThinBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(SquareBracketOpen);
			setState(295);
			match(VerticalBar);
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

	public static class ThinThikBarlineContext extends ParserRuleContext {
		public TerminalNode VerticalBar() { return getToken(AbcNotationParser.VerticalBar, 0); }
		public TerminalNode SquareBracketClosed() { return getToken(AbcNotationParser.SquareBracketClosed, 0); }
		public ThinThikBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thinThikBarline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitThinThikBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThinThikBarlineContext thinThikBarline() throws RecognitionException {
		ThinThikBarlineContext _localctx = new ThinThikBarlineContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_thinThikBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(VerticalBar);
			setState(298);
			match(SquareBracketClosed);
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

	public static class StartOfRepeatedBarlineContext extends ParserRuleContext {
		public TerminalNode VerticalBar() { return getToken(AbcNotationParser.VerticalBar, 0); }
		public TerminalNode Colon() { return getToken(AbcNotationParser.Colon, 0); }
		public StartOfRepeatedBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startOfRepeatedBarline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitStartOfRepeatedBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartOfRepeatedBarlineContext startOfRepeatedBarline() throws RecognitionException {
		StartOfRepeatedBarlineContext _localctx = new StartOfRepeatedBarlineContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_startOfRepeatedBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(VerticalBar);
			setState(301);
			match(Colon);
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

	public static class EndOfRepeatedBarlineContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(AbcNotationParser.Colon, 0); }
		public TerminalNode VerticalBar() { return getToken(AbcNotationParser.VerticalBar, 0); }
		public EndOfRepeatedBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfRepeatedBarline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitEndOfRepeatedBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfRepeatedBarlineContext endOfRepeatedBarline() throws RecognitionException {
		EndOfRepeatedBarlineContext _localctx = new EndOfRepeatedBarlineContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_endOfRepeatedBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(Colon);
			setState(304);
			match(VerticalBar);
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

	public static class StartAndEndOfRepeatedBarlineContext extends ParserRuleContext {
		public List<TerminalNode> Colon() { return getTokens(AbcNotationParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(AbcNotationParser.Colon, i);
		}
		public StartAndEndOfRepeatedBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startAndEndOfRepeatedBarline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitStartAndEndOfRepeatedBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartAndEndOfRepeatedBarlineContext startAndEndOfRepeatedBarline() throws RecognitionException {
		StartAndEndOfRepeatedBarlineContext _localctx = new StartAndEndOfRepeatedBarlineContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_startAndEndOfRepeatedBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(Colon);
			setState(307);
			match(Colon);
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

	public static class SuppresScoreLinebreakContext extends ParserRuleContext {
		public TerminalNode Backslash() { return getToken(AbcNotationParser.Backslash, 0); }
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
		public SuppresScoreLinebreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suppresScoreLinebreak; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitSuppresScoreLinebreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuppresScoreLinebreakContext suppresScoreLinebreak() throws RecognitionException {
		SuppresScoreLinebreakContext _localctx = new SuppresScoreLinebreakContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_suppresScoreLinebreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(Backslash);
			setState(310);
			match(NEWLINE);
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

	public static class MusicalExpressionContext extends ParserRuleContext {
		public InlineFieldContext inlineField() {
			return getRuleContext(InlineFieldContext.class,0);
		}
		public SlurStartContext slurStart() {
			return getRuleContext(SlurStartContext.class,0);
		}
		public SlurEndContext slurEnd() {
			return getRuleContext(SlurEndContext.class,0);
		}
		public MultipleNotesContext multipleNotes() {
			return getRuleContext(MultipleNotesContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public TerminalNode WS() { return getToken(AbcNotationParser.WS, 0); }
		public MusicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musicalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMusicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MusicalExpressionContext musicalExpression() throws RecognitionException {
		MusicalExpressionContext _localctx = new MusicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_musicalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(312);
				match(WS);
				}
				break;
			}
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(315);
				inlineField();
				}
				break;
			case 2:
				{
				setState(316);
				slurStart();
				}
				break;
			case 3:
				{
				setState(317);
				slurEnd();
				}
				break;
			case 4:
				{
				setState(318);
				multipleNotes();
				}
				break;
			case 5:
				{
				setState(319);
				note();
				}
				break;
			case 6:
				{
				setState(320);
				rest();
				}
				break;
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

	public static class NoteContext extends ParserRuleContext {
		public NoteExpressionContext noteExpression() {
			return getRuleContext(NoteExpressionContext.class,0);
		}
		public NoteOctaveContext noteOctave() {
			return getRuleContext(NoteOctaveContext.class,0);
		}
		public NoteLengthContext noteLength() {
			return getRuleContext(NoteLengthContext.class,0);
		}
		public DecorationContext decoration() {
			return getRuleContext(DecorationContext.class,0);
		}
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
		}
		public TiedNoteContext tiedNote() {
			return getRuleContext(TiedNoteContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if (_la==Decoration) {
				{
				setState(323);
				decoration();
				}
			}

			setState(327);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Flat) | (1L << Sharp) | (1L << Equals))) != 0)) {
				{
				setState(326);
				accidental();
				}
			}

			setState(329);
			noteExpression();
			setState(330);
			noteOctave();
			setState(331);
			noteLength();
			setState(333);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(332);
				tiedNote();
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

	public static class MultipleNotesContext extends ParserRuleContext {
		public TerminalNode SquareBracketOpen() { return getToken(AbcNotationParser.SquareBracketOpen, 0); }
		public TerminalNode SquareBracketClosed() { return getToken(AbcNotationParser.SquareBracketClosed, 0); }
		public DecorationExpressionContext decorationExpression() {
			return getRuleContext(DecorationExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public TiedNoteContext tiedNote() {
			return getRuleContext(TiedNoteContext.class,0);
		}
		public MultipleNotesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleNotes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMultipleNotes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleNotesContext multipleNotes() throws RecognitionException {
		MultipleNotesContext _localctx = new MultipleNotesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multipleNotes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if (_la==Decoration) {
				{
				setState(335);
				decorationExpression();
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(338);
				match(WS);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			match(SquareBracketOpen);
			setState(346); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345);
				note();
				}
				}
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << Flat) | (1L << Sharp) | (1L << NOTE) | (1L << Equals) | (1L << Decoration))) != 0) );
			setState(350);
			match(SquareBracketClosed);
			setState(352);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(351);
				tiedNote();
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

	public static class RestContext extends ParserRuleContext {
		public NoteLengthContext noteLength() {
			return getRuleContext(NoteLengthContext.class,0);
		}
		public TerminalNode Rest() { return getToken(AbcNotationParser.Rest, 0); }
		public TerminalNode InvisibleRest() { return getToken(AbcNotationParser.InvisibleRest, 0); }
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(354);
				match(WS);
				}
			}

			setState(357);
			_la = _input.LA(1);
			if ( !(_la==Rest || _la==InvisibleRest) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(358);
			noteLength();
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(359);
				match(WS);
				}
				break;
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

	public static class NoteExpressionContext extends ParserRuleContext {
		public NoBeamNoteContext noBeamNote() {
			return getRuleContext(NoBeamNoteContext.class,0);
		}
		public BeamNoteContext beamNote() {
			return getRuleContext(BeamNoteContext.class,0);
		}
		public NoteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNoteExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteExpressionContext noteExpression() throws RecognitionException {
		NoteExpressionContext _localctx = new NoteExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_noteExpression);
		try {
			setState(364);
			switch (_input.LA(1)) {
			case WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				noBeamNote();
				}
				break;
			case NOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				beamNote();
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

	public static class BeamNoteContext extends ParserRuleContext {
		public Token noteString;
		public TerminalNode NOTE() { return getToken(AbcNotationParser.NOTE, 0); }
		public BeamNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beamNote; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitBeamNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeamNoteContext beamNote() throws RecognitionException {
		BeamNoteContext _localctx = new BeamNoteContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_beamNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((BeamNoteContext)_localctx).noteString = match(NOTE);
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

	public static class NoBeamNoteContext extends ParserRuleContext {
		public Token noteString;
		public TerminalNode NOTE() { return getToken(AbcNotationParser.NOTE, 0); }
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
		public NoBeamNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noBeamNote; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNoBeamNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoBeamNoteContext noBeamNote() throws RecognitionException {
		NoBeamNoteContext _localctx = new NoBeamNoteContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_noBeamNote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				match(WS);
				}
				}
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(373);
			((NoBeamNoteContext)_localctx).noteString = match(NOTE);
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

	public static class DecorationContext extends ParserRuleContext {
		public Token decorationName;
		public TerminalNode Decoration() { return getToken(AbcNotationParser.Decoration, 0); }
		public DecorationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitDecoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationContext decoration() throws RecognitionException {
		DecorationContext _localctx = new DecorationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_decoration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((DecorationContext)_localctx).decorationName = match(Decoration);
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

	public static class DecorationExpressionContext extends ParserRuleContext {
		public Token decorationName;
		public TerminalNode Decoration() { return getToken(AbcNotationParser.Decoration, 0); }
		public DecorationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitDecorationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationExpressionContext decorationExpression() throws RecognitionException {
		DecorationExpressionContext _localctx = new DecorationExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_decorationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			((DecorationExpressionContext)_localctx).decorationName = match(Decoration);
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

	public static class NoteLengthContext extends ParserRuleContext {
		public DelimiterContext delimiter() {
			return getRuleContext(DelimiterContext.class,0);
		}
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public NoteLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNoteLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteLengthContext noteLength() throws RecognitionException {
		NoteLengthContext _localctx = new NoteLengthContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_noteLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			switch (_input.LA(1)) {
			case Slash:
				{
				setState(379);
				delimiter();
				}
				break;
			case INT:
				{
				setState(380);
				multiplier();
				}
				break;
			case WS:
			case Flat:
			case Sharp:
			case NOTE:
			case Rest:
			case InvisibleRest:
			case BracketOpen:
			case BracketClosed:
			case SquareBracketOpen:
			case SquareBracketClosed:
			case VerticalBar:
			case Colon:
			case Equals:
			case Minus:
			case Decoration:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NoteOctaveContext extends ParserRuleContext {
		public List<OctaveUpContext> octaveUp() {
			return getRuleContexts(OctaveUpContext.class);
		}
		public OctaveUpContext octaveUp(int i) {
			return getRuleContext(OctaveUpContext.class,i);
		}
		public List<OctaveDownContext> octaveDown() {
			return getRuleContexts(OctaveDownContext.class);
		}
		public OctaveDownContext octaveDown(int i) {
			return getRuleContext(OctaveDownContext.class,i);
		}
		public NoteOctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteOctave; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNoteOctave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteOctaveContext noteOctave() throws RecognitionException {
		NoteOctaveContext _localctx = new NoteOctaveContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_noteOctave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OCTAVE_UP || _la==OCTAVE_DOWN) {
				{
				setState(385);
				switch (_input.LA(1)) {
				case OCTAVE_UP:
					{
					setState(383);
					octaveUp();
					}
					break;
				case OCTAVE_DOWN:
					{
					setState(384);
					octaveDown();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(389);
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

	public static class AccidentalContext extends ParserRuleContext {
		public List<FlatContext> flat() {
			return getRuleContexts(FlatContext.class);
		}
		public FlatContext flat(int i) {
			return getRuleContext(FlatContext.class,i);
		}
		public List<SharpContext> sharp() {
			return getRuleContexts(SharpContext.class);
		}
		public SharpContext sharp(int i) {
			return getRuleContext(SharpContext.class,i);
		}
		public List<NaturalContext> natural() {
			return getRuleContexts(NaturalContext.class);
		}
		public NaturalContext natural(int i) {
			return getRuleContext(NaturalContext.class,i);
		}
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitAccidental(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(393);
				switch (_input.LA(1)) {
				case Flat:
					{
					setState(390);
					flat();
					}
					break;
				case Sharp:
					{
					setState(391);
					sharp();
					}
					break;
				case Equals:
					{
					setState(392);
					natural();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Flat) | (1L << Sharp) | (1L << Equals))) != 0) );
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

	public static class SlurStartContext extends ParserRuleContext {
		public TerminalNode BracketOpen() { return getToken(AbcNotationParser.BracketOpen, 0); }
		public TerminalNode WS() { return getToken(AbcNotationParser.WS, 0); }
		public SlurStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slurStart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitSlurStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlurStartContext slurStart() throws RecognitionException {
		SlurStartContext _localctx = new SlurStartContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_slurStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(397);
				match(WS);
				}
			}

			setState(400);
			match(BracketOpen);
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

	public static class SlurEndContext extends ParserRuleContext {
		public TerminalNode BracketClosed() { return getToken(AbcNotationParser.BracketClosed, 0); }
		public TerminalNode WS() { return getToken(AbcNotationParser.WS, 0); }
		public SlurEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slurEnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitSlurEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlurEndContext slurEnd() throws RecognitionException {
		SlurEndContext _localctx = new SlurEndContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_slurEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(402);
				match(WS);
				}
			}

			setState(405);
			match(BracketClosed);
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

	public static class InlineFieldContext extends ParserRuleContext {
		public MeterChangeContext meterChange() {
			return getRuleContext(MeterChangeContext.class,0);
		}
		public LengthChangeContext lengthChange() {
			return getRuleContext(LengthChangeContext.class,0);
		}
		public KeyChangeContext keyChange() {
			return getRuleContext(KeyChangeContext.class,0);
		}
		public TempoChangeContext tempoChange() {
			return getRuleContext(TempoChangeContext.class,0);
		}
		public InlineFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitInlineField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineFieldContext inlineField() throws RecognitionException {
		InlineFieldContext _localctx = new InlineFieldContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inlineField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(407);
				meterChange();
				}
				break;
			case 2:
				{
				setState(408);
				lengthChange();
				}
				break;
			case 3:
				{
				setState(409);
				keyChange();
				}
				break;
			case 4:
				{
				setState(410);
				tempoChange();
				}
				break;
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

	public static class MeterChangeContext extends ParserRuleContext {
		public TerminalNode SquareBracketOpen() { return getToken(AbcNotationParser.SquareBracketOpen, 0); }
		public MeterContext meter() {
			return getRuleContext(MeterContext.class,0);
		}
		public TerminalNode SquareBracketClosed() { return getToken(AbcNotationParser.SquareBracketClosed, 0); }
		public MeterChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meterChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMeterChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeterChangeContext meterChange() throws RecognitionException {
		MeterChangeContext _localctx = new MeterChangeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_meterChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(SquareBracketOpen);
			setState(414);
			meter();
			setState(415);
			match(SquareBracketClosed);
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

	public static class LengthChangeContext extends ParserRuleContext {
		public TerminalNode SquareBracketOpen() { return getToken(AbcNotationParser.SquareBracketOpen, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode SquareBracketClosed() { return getToken(AbcNotationParser.SquareBracketClosed, 0); }
		public LengthChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitLengthChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthChangeContext lengthChange() throws RecognitionException {
		LengthChangeContext _localctx = new LengthChangeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lengthChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(SquareBracketOpen);
			setState(418);
			length();
			setState(419);
			match(SquareBracketClosed);
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

	public static class KeyChangeContext extends ParserRuleContext {
		public TerminalNode SquareBracketOpen() { return getToken(AbcNotationParser.SquareBracketOpen, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode SquareBracketClosed() { return getToken(AbcNotationParser.SquareBracketClosed, 0); }
		public KeyChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitKeyChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyChangeContext keyChange() throws RecognitionException {
		KeyChangeContext _localctx = new KeyChangeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_keyChange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(SquareBracketOpen);
			setState(422);
			key();
			setState(424);
			_la = _input.LA(1);
			if (_la==SquareBracketClosed) {
				{
				setState(423);
				match(SquareBracketClosed);
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

	public static class TempoChangeContext extends ParserRuleContext {
		public TerminalNode SquareBracketOpen() { return getToken(AbcNotationParser.SquareBracketOpen, 0); }
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public TerminalNode SquareBracketClosed() { return getToken(AbcNotationParser.SquareBracketClosed, 0); }
		public TempoChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempoChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTempoChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempoChangeContext tempoChange() throws RecognitionException {
		TempoChangeContext _localctx = new TempoChangeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tempoChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(SquareBracketOpen);
			setState(427);
			tempo();
			setState(428);
			match(SquareBracketClosed);
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

	public static class FlatContext extends ParserRuleContext {
		public TerminalNode Flat() { return getToken(AbcNotationParser.Flat, 0); }
		public FlatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitFlat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlatContext flat() throws RecognitionException {
		FlatContext _localctx = new FlatContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_flat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(Flat);
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

	public static class SharpContext extends ParserRuleContext {
		public TerminalNode Sharp() { return getToken(AbcNotationParser.Sharp, 0); }
		public SharpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitSharp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharpContext sharp() throws RecognitionException {
		SharpContext _localctx = new SharpContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sharp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(Sharp);
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

	public static class NaturalContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(AbcNotationParser.Equals, 0); }
		public NaturalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNatural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturalContext natural() throws RecognitionException {
		NaturalContext _localctx = new NaturalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_natural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(Equals);
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

	public static class TiedNoteContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(AbcNotationParser.Minus, 0); }
		public TiedNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiedNote; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTiedNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiedNoteContext tiedNote() throws RecognitionException {
		TiedNoteContext _localctx = new TiedNoteContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tiedNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(Minus);
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

	public static class DelimiterContext extends ParserRuleContext {
		public Token denominator;
		public TerminalNode Slash() { return getToken(AbcNotationParser.Slash, 0); }
		public TerminalNode INT() { return getToken(AbcNotationParser.INT, 0); }
		public DelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimiter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimiterContext delimiter() throws RecognitionException {
		DelimiterContext _localctx = new DelimiterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(Slash);
			setState(440);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(439);
				((DelimiterContext)_localctx).denominator = match(INT);
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

	public static class MultiplierContext extends ParserRuleContext {
		public Token numerator;
		public Token denominator;
		public List<TerminalNode> INT() { return getTokens(AbcNotationParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AbcNotationParser.INT, i);
		}
		public List<TerminalNode> Slash() { return getTokens(AbcNotationParser.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(AbcNotationParser.Slash, i);
		}
		public MultiplierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMultiplier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplierContext multiplier() throws RecognitionException {
		MultiplierContext _localctx = new MultiplierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_multiplier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(442);
				((MultiplierContext)_localctx).numerator = match(INT);
				}
				break;
			case 2:
				{
				setState(443);
				((MultiplierContext)_localctx).numerator = match(INT);
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(444);
					match(Slash);
					}
					}
					setState(447); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Slash );
				setState(450);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(449);
					((MultiplierContext)_localctx).denominator = match(INT);
					}
				}

				}
				break;
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

	public static class OctaveUpContext extends ParserRuleContext {
		public TerminalNode OCTAVE_UP() { return getToken(AbcNotationParser.OCTAVE_UP, 0); }
		public OctaveUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octaveUp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitOctaveUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveUpContext octaveUp() throws RecognitionException {
		OctaveUpContext _localctx = new OctaveUpContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_octaveUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(OCTAVE_UP);
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

	public static class OctaveDownContext extends ParserRuleContext {
		public TerminalNode OCTAVE_DOWN() { return getToken(AbcNotationParser.OCTAVE_DOWN, 0); }
		public OctaveDownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octaveDown; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitOctaveDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveDownContext octaveDown() throws RecognitionException {
		OctaveDownContext _localctx = new OctaveDownContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_octaveDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(OCTAVE_DOWN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u01cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\6\5\u0082\n\5\r\5\16\5\u0083\3\6\5\6"+
		"\u0087\n\6\3\6\6\6\u008a\n\6\r\6\16\6\u008b\3\7\3\7\3\7\3\7\3\b\3\b\5"+
		"\b\u0094\n\b\6\b\u0096\n\b\r\b\16\b\u0097\3\b\3\b\3\t\3\t\6\t\u009e\n"+
		"\t\r\t\16\t\u009f\3\t\3\t\3\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00b8\n\f\3"+
		"\f\5\f\u00bb\n\f\3\r\3\r\5\r\u00bf\n\r\3\r\3\r\5\r\u00c3\n\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u00d2\n\21"+
		"\3\21\3\21\3\21\5\21\u00d7\n\21\3\21\7\21\u00da\n\21\f\21\16\21\u00dd"+
		"\13\21\3\21\3\21\3\22\5\22\u00e2\n\22\3\22\5\22\u00e5\n\22\3\22\6\22\u00e8"+
		"\n\22\r\22\16\22\u00e9\3\22\5\22\u00ed\n\22\3\22\3\22\5\22\u00f1\n\22"+
		"\3\22\3\22\5\22\u00f5\n\22\3\22\5\22\u00f8\n\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\5\25\u0100\n\25\3\25\3\25\5\25\u0104\n\25\3\26\7\26\u0107\n\26"+
		"\f\26\16\26\u010a\13\26\3\26\6\26\u010d\n\26\r\26\16\26\u010e\3\26\3\26"+
		"\3\27\7\27\u0114\n\27\f\27\16\27\u0117\13\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0122\n\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\5!\u013c\n!\3!\3!\3!\3!\3!\3!\5!\u0144\n!\3\"\5\"\u0147\n\"\3"+
		"\"\5\"\u014a\n\"\3\"\3\"\3\"\3\"\5\"\u0150\n\"\3#\5#\u0153\n#\3#\7#\u0156"+
		"\n#\f#\16#\u0159\13#\3#\3#\6#\u015d\n#\r#\16#\u015e\3#\3#\5#\u0163\n#"+
		"\3$\5$\u0166\n$\3$\3$\3$\5$\u016b\n$\3%\3%\5%\u016f\n%\3&\3&\3\'\6\'\u0174"+
		"\n\'\r\'\16\'\u0175\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u0180\n*\3+\3+\7+\u0184"+
		"\n+\f+\16+\u0187\13+\3,\3,\3,\6,\u018c\n,\r,\16,\u018d\3-\5-\u0191\n-"+
		"\3-\3-\3.\5.\u0196\n.\3.\3.\3/\3/\3/\3/\5/\u019e\n/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\5\62\u01ab\n\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\58\u01bb\n8\39\39\39\6"+
		"9\u01c0\n9\r9\169\u01c1\39\59\u01c5\n9\59\u01c7\n9\3:\3:\3;\3;\3;\2\2"+
		"<\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprt\2\5\4\2\4\4\6\6\3\3\4\4\3\2\30\31\u01d9\2v\3"+
		"\2\2\2\4z\3\2\2\2\6}\3\2\2\2\b\177\3\2\2\2\n\u0086\3\2\2\2\f\u008d\3\2"+
		"\2\2\16\u0095\3\2\2\2\20\u009b\3\2\2\2\22\u00ad\3\2\2\2\24\u00b1\3\2\2"+
		"\2\26\u00b4\3\2\2\2\30\u00bc\3\2\2\2\32\u00c6\3\2\2\2\34\u00c9\3\2\2\2"+
		"\36\u00cc\3\2\2\2 \u00cf\3\2\2\2\"\u00e1\3\2\2\2$\u00f9\3\2\2\2&\u00fb"+
		"\3\2\2\2(\u00ff\3\2\2\2*\u0108\3\2\2\2,\u0115\3\2\2\2.\u0121\3\2\2\2\60"+
		"\u0123\3\2\2\2\62\u0125\3\2\2\2\64\u0128\3\2\2\2\66\u012b\3\2\2\28\u012e"+
		"\3\2\2\2:\u0131\3\2\2\2<\u0134\3\2\2\2>\u0137\3\2\2\2@\u013b\3\2\2\2B"+
		"\u0146\3\2\2\2D\u0152\3\2\2\2F\u0165\3\2\2\2H\u016e\3\2\2\2J\u0170\3\2"+
		"\2\2L\u0173\3\2\2\2N\u0179\3\2\2\2P\u017b\3\2\2\2R\u017f\3\2\2\2T\u0185"+
		"\3\2\2\2V\u018b\3\2\2\2X\u0190\3\2\2\2Z\u0195\3\2\2\2\\\u019d\3\2\2\2"+
		"^\u019f\3\2\2\2`\u01a3\3\2\2\2b\u01a7\3\2\2\2d\u01ac\3\2\2\2f\u01b0\3"+
		"\2\2\2h\u01b2\3\2\2\2j\u01b4\3\2\2\2l\u01b6\3\2\2\2n\u01b8\3\2\2\2p\u01c6"+
		"\3\2\2\2r\u01c8\3\2\2\2t\u01ca\3\2\2\2vw\7\3\2\2wx\7\7\2\2xy\7\3\2\2y"+
		"\3\3\2\2\2z{\7(\2\2{|\7&\2\2|\5\3\2\2\2}~\t\2\2\2~\7\3\2\2\2\177\u0081"+
		"\5\20\t\2\u0080\u0082\5\n\6\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\t\3\2\2\2\u0085\u0087\5"+
		"\f\7\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u008a\5\16\b\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\13\3\2\2\2\u008d\u008e\7\16\2\2\u008e"+
		"\u008f\7(\2\2\u008f\u0090\7&\2\2\u0090\r\3\2\2\2\u0091\u0093\5*\26\2\u0092"+
		"\u0094\5> \2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2"+
		"\2\u0095\u0091\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\t\3\2\2\u009a\17\3\2\2\2\u009b"+
		"\u009d\5\22\n\2\u009c\u009e\5\24\13\2\u009d\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a8\3\2\2\2\u00a1"+
		"\u00a7\5\26\f\2\u00a2\u00a7\5\30\r\2\u00a3\u00a7\5\34\17\2\u00a4\u00a7"+
		"\5 \21\2\u00a5\u00a7\5\36\20\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2"+
		"\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\5\32\16\2\u00ac\21\3\2\2\2\u00ad\u00ae\7\b"+
		"\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\5\6\4\2\u00b0\23\3\2\2\2\u00b1\u00b2"+
		"\7\t\2\2\u00b2\u00b3\5\4\3\2\u00b3\25\3\2\2\2\u00b4\u00b7\7\n\2\2\u00b5"+
		"\u00b8\7\27\2\2\u00b6\u00b8\5\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3"+
		"\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5\6\4\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00be\7\13\2\2\u00bd\u00bf\7\5\2"+
		"\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\5\2\2\2\u00c1\u00c3\7\5\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\5\6\4\2\u00c5\31\3\2\2\2\u00c6\u00c7\7\f\2"+
		"\2\u00c7\u00c8\5\4\3\2\u00c8\33\3\2\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00cb"+
		"\5\4\3\2\u00cb\35\3\2\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00ce\5\4\3\2\u00ce"+
		"\37\3\2\2\2\u00cf\u00d1\7\20\2\2\u00d0\u00d2\7\5\2\2\u00d1\u00d0\3\2\2"+
		"\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d7\5\"\22\2\u00d4"+
		"\u00d7\5$\23\2\u00d5\u00d7\5(\25\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00db\3\2\2\2\u00d8\u00da\7\5\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\5\6\4\2\u00df"+
		"!\3\2\2\2\u00e0\u00e2\5&\24\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\u00e7\3\2\2\2\u00e3\u00e5\7\5\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\5\2\2\2\u00e7\u00e4\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00ed\7\5\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\7!\2\2\u00ef\u00f1\7\5\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\7\3\2\2\u00f3"+
		"\u00f5\7\5\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f8\5&\24\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"#\3\2\2\2\u00f9\u00fa\5&\24\2\u00fa%\3\2\2\2\u00fb\u00fc\7$\2\2\u00fc"+
		"\u00fd\5\4\3\2\u00fd\'\3\2\2\2\u00fe\u0100\5&\24\2\u00ff\u00fe\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7\3\2\2\u0102\u0104"+
		"\5&\24\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104)\3\2\2\2\u0105"+
		"\u0107\7\5\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010d\5@!\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5,\27\2\u0111+"+
		"\3\2\2\2\u0112\u0114\7\5\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u0119\5.\30\2\u0119-\3\2\2\2\u011a\u0122\5\60\31\2\u011b\u0122"+
		"\5\66\34\2\u011c\u0122\5\64\33\2\u011d\u0122\5\62\32\2\u011e\u0122\58"+
		"\35\2\u011f\u0122\5:\36\2\u0120\u0122\5<\37\2\u0121\u011a\3\2\2\2\u0121"+
		"\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122/\3\2\2\2\u0123\u0124"+
		"\7\37\2\2\u0124\61\3\2\2\2\u0125\u0126\7\37\2\2\u0126\u0127\7\37\2\2\u0127"+
		"\63\3\2\2\2\u0128\u0129\7\35\2\2\u0129\u012a\7\37\2\2\u012a\65\3\2\2\2"+
		"\u012b\u012c\7\37\2\2\u012c\u012d\7\36\2\2\u012d\67\3\2\2\2\u012e\u012f"+
		"\7\37\2\2\u012f\u0130\7 \2\2\u01309\3\2\2\2\u0131\u0132\7 \2\2\u0132\u0133"+
		"\7\37\2\2\u0133;\3\2\2\2\u0134\u0135\7 \2\2\u0135\u0136\7 \2\2\u0136="+
		"\3\2\2\2\u0137\u0138\7#\2\2\u0138\u0139\7\4\2\2\u0139?\3\2\2\2\u013a\u013c"+
		"\7\5\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0143\3\2\2\2\u013d"+
		"\u0144\5\\/\2\u013e\u0144\5X-\2\u013f\u0144\5Z.\2\u0140\u0144\5D#\2\u0141"+
		"\u0144\5B\"\2\u0142\u0144\5F$\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2\2"+
		"\2\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142"+
		"\3\2\2\2\u0144A\3\2\2\2\u0145\u0147\5N(\2\u0146\u0145\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a\5V,\2\u0149\u0148\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\5H%\2\u014c\u014d\5T+\2"+
		"\u014d\u014f\5R*\2\u014e\u0150\5l\67\2\u014f\u014e\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150C\3\2\2\2\u0151\u0153\5P)\2\u0152\u0151\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0157\3\2\2\2\u0154\u0156\7\5\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015a\u015c\7\35\2\2\u015b\u015d\5B\"\2\u015c"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0162\7\36\2\2\u0161\u0163\5l\67\2\u0162"+
		"\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163E\3\2\2\2\u0164\u0166\7\5\2\2"+
		"\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\t\4\2\2\u0168\u016a\5R*\2\u0169\u016b\7\5\2\2\u016a\u0169\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016bG\3\2\2\2\u016c\u016f\5L\'\2\u016d\u016f\5J&\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016fI\3\2\2\2\u0170\u0171\7\27\2\2"+
		"\u0171K\3\2\2\2\u0172\u0174\7\5\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3"+
		"\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0178\7\27\2\2\u0178M\3\2\2\2\u0179\u017a\7%\2\2\u017aO\3\2\2\2\u017b"+
		"\u017c\7%\2\2\u017cQ\3\2\2\2\u017d\u0180\5n8\2\u017e\u0180\5p9\2\u017f"+
		"\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180S\3\2\2\2"+
		"\u0181\u0184\5r:\2\u0182\u0184\5t;\2\u0183\u0181\3\2\2\2\u0183\u0182\3"+
		"\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"U\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018c\5f\64\2\u0189\u018c\5h\65\2"+
		"\u018a\u018c\5j\66\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"W\3\2\2\2\u018f\u0191\7\5\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u0193\7\33\2\2\u0193Y\3\2\2\2\u0194\u0196\7"+
		"\5\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\7\34\2\2\u0198[\3\2\2\2\u0199\u019e\5^\60\2\u019a\u019e\5`\61\2"+
		"\u019b\u019e\5b\62\2\u019c\u019e\5d\63\2\u019d\u0199\3\2\2\2\u019d\u019a"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e]\3\2\2\2\u019f"+
		"\u01a0\7\35\2\2\u01a0\u01a1\5\26\f\2\u01a1\u01a2\7\36\2\2\u01a2_\3\2\2"+
		"\2\u01a3\u01a4\7\35\2\2\u01a4\u01a5\5\30\r\2\u01a5\u01a6\7\36\2\2\u01a6"+
		"a\3\2\2\2\u01a7\u01a8\7\35\2\2\u01a8\u01aa\5\32\16\2\u01a9\u01ab\7\36"+
		"\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abc\3\2\2\2\u01ac\u01ad"+
		"\7\35\2\2\u01ad\u01ae\5 \21\2\u01ae\u01af\7\36\2\2\u01afe\3\2\2\2\u01b0"+
		"\u01b1\7\25\2\2\u01b1g\3\2\2\2\u01b2\u01b3\7\26\2\2\u01b3i\3\2\2\2\u01b4"+
		"\u01b5\7!\2\2\u01b5k\3\2\2\2\u01b6\u01b7\7\"\2\2\u01b7m\3\2\2\2\u01b8"+
		"\u01ba\7\7\2\2\u01b9\u01bb\7\3\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bbo\3\2\2\2\u01bc\u01c7\7\3\2\2\u01bd\u01bf\7\3\2\2\u01be\u01c0"+
		"\7\7\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5\7\3\2\2\u01c4\u01c3\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01bc\3\2\2\2\u01c6"+
		"\u01bd\3\2\2\2\u01c7q\3\2\2\2\u01c8\u01c9\7\23\2\2\u01c9s\3\2\2\2\u01ca"+
		"\u01cb\7\24\2\2\u01cbu\3\2\2\28\u0083\u0086\u008b\u0093\u0097\u009f\u00a6"+
		"\u00a8\u00b7\u00ba\u00be\u00c2\u00d1\u00d6\u00db\u00e1\u00e4\u00e9\u00ec"+
		"\u00f0\u00f4\u00f7\u00ff\u0103\u0108\u010e\u0115\u0121\u013b\u0143\u0146"+
		"\u0149\u014f\u0152\u0157\u015e\u0162\u0165\u016a\u016e\u0175\u017f\u0183"+
		"\u0185\u018b\u018d\u0190\u0195\u019d\u01aa\u01ba\u01c1\u01c4\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}