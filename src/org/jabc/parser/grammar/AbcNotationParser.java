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
		ComposerSymbol=13, TempoSymbol=14, MULTIPLIER=15, OCTAVE_UP=16, OCTAVE_DOWN=17, 
		Flat=18, Sharp=19, NOTE=20, Rest=21, InvisibleRest=22, BarRest=23, BracketOpen=24, 
		BracketClosed=25, SqaureBracketOpen=26, SqaureBracketClosed=27, VerticalBar=28, 
		Colon=29, Equals=30, Minus=31, Backslash=32, EXIT_NEWLINE=33, STRING=34, 
		ID=35;
	public static final int
		RULE_fraction = 0, RULE_voice = 1, RULE_voices = 2, RULE_tune = 3, RULE_score = 4, 
		RULE_bar = 5, RULE_endOfBar = 6, RULE_barline = 7, RULE_simpleBarline = 8, 
		RULE_thinThinBarline = 9, RULE_thikThinBarline = 10, RULE_thinThikBarline = 11, 
		RULE_startOfRepeatedBarline = 12, RULE_endOfRepeatedBarline = 13, RULE_startAndEndOfRepeatedBarline = 14, 
		RULE_suppresScoreLinebreak = 15, RULE_header = 16, RULE_optionalHeaderInfo = 17, 
		RULE_identifier = 18, RULE_title = 19, RULE_measure = 20, RULE_length = 21, 
		RULE_key = 22, RULE_notes = 23, RULE_tempo = 24, RULE_composer = 25, RULE_note = 26, 
		RULE_tiedNote = 27, RULE_noteExpression = 28, RULE_rest = 29, RULE_beamNote = 30, 
		RULE_noBeamNote = 31, RULE_multipleNotes = 32, RULE_annotation = 33, RULE_noteLength = 34, 
		RULE_noteOctave = 35, RULE_accidental = 36, RULE_flat = 37, RULE_sharp = 38, 
		RULE_natural = 39, RULE_delimeter = 40, RULE_multiplier = 41, RULE_octaveUp = 42, 
		RULE_octaveDown = 43;
	public static final String[] ruleNames = {
		"fraction", "voice", "voices", "tune", "score", "bar", "endOfBar", "barline", 
		"simpleBarline", "thinThinBarline", "thikThinBarline", "thinThikBarline", 
		"startOfRepeatedBarline", "endOfRepeatedBarline", "startAndEndOfRepeatedBarline", 
		"suppresScoreLinebreak", "header", "optionalHeaderInfo", "identifier", 
		"title", "measure", "length", "key", "notes", "tempo", "composer", "note", 
		"tiedNote", "noteExpression", "rest", "beamNote", "noBeamNote", "multipleNotes", 
		"annotation", "noteLength", "noteOctave", "accidental", "flat", "sharp", 
		"natural", "delimeter", "multiplier", "octaveUp", "octaveDown"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitFraction(this);
		}
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
			setState(88);
			((FractionContext)_localctx).numerator = match(INT);
			setState(89);
			match(Slash);
			setState(90);
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

	public static class VoiceContext extends ParserRuleContext {
		public Token name;
		public TerminalNode VoiceSymbol() { return getToken(AbcNotationParser.VoiceSymbol, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public VoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterVoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitVoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitVoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoiceContext voice() throws RecognitionException {
		VoiceContext _localctx = new VoiceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(VoiceSymbol);
			setState(93);
			((VoiceContext)_localctx).name = match(STRING);
			setState(94);
			match(EXIT_NEWLINE);
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

	public static class VoicesContext extends ParserRuleContext {
		public List<VoiceContext> voice() {
			return getRuleContexts(VoiceContext.class);
		}
		public VoiceContext voice(int i) {
			return getRuleContext(VoiceContext.class,i);
		}
		public List<ScoreContext> score() {
			return getRuleContexts(ScoreContext.class);
		}
		public ScoreContext score(int i) {
			return getRuleContext(ScoreContext.class,i);
		}
		public VoicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterVoices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitVoices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitVoices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoicesContext voices() throws RecognitionException {
		VoicesContext _localctx = new VoicesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_voices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				voice();
				setState(97);
				score();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VoiceSymbol );
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
		public TerminalNode EOF() { return getToken(AbcNotationParser.EOF, 0); }
		public VoicesContext voices() {
			return getRuleContext(VoicesContext.class,0);
		}
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
		public TuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterTune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitTune(this);
		}
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
			setState(103);
			header();
			setState(106);
			switch (_input.LA(1)) {
			case VoiceSymbol:
				{
				setState(104);
				voices();
				}
				break;
			case WS:
			case Flat:
			case Sharp:
			case NOTE:
			case Rest:
			case SqaureBracketOpen:
			case Equals:
				{
				setState(105);
				score();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(108);
				match(NEWLINE);
				}
			}

			setState(111);
			match(EOF);
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
		public List<BarContext> bar() {
			return getRuleContexts(BarContext.class);
		}
		public BarContext bar(int i) {
			return getRuleContext(BarContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AbcNotationParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AbcNotationParser.NEWLINE, i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterScore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitScore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitScore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScoreContext score() throws RecognitionException {
		ScoreContext _localctx = new ScoreContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_score);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				bar();
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(114);
					match(NEWLINE);
					}
					break;
				}
				setState(118);
				_la = _input.LA(1);
				if (_la==Backslash) {
					{
					setState(117);
					suppresScoreLinebreak();
					}
				}

				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << Flat) | (1L << Sharp) | (1L << NOTE) | (1L << Rest) | (1L << SqaureBracketOpen) | (1L << Equals))) != 0) );
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
		public List<NoteExpressionContext> noteExpression() {
			return getRuleContexts(NoteExpressionContext.class);
		}
		public NoteExpressionContext noteExpression(int i) {
			return getRuleContext(NoteExpressionContext.class,i);
		}
		public BarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarContext bar() throws RecognitionException {
		BarContext _localctx = new BarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(124);
					noteExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(129);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterEndOfBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitEndOfBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitEndOfBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfBarContext endOfBar() throws RecognitionException {
		EndOfBarContext _localctx = new EndOfBarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_endOfBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(131);
				match(WS);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitBarline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarlineContext barline() throws RecognitionException {
		BarlineContext _localctx = new BarlineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_barline);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				simpleBarline();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				thinThikBarline();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				thikThinBarline();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				thinThinBarline();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				startOfRepeatedBarline();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				endOfRepeatedBarline();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterSimpleBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitSimpleBarline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitSimpleBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleBarlineContext simpleBarline() throws RecognitionException {
		SimpleBarlineContext _localctx = new SimpleBarlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterThinThinBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitThinThinBarline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitThinThinBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThinThinBarlineContext thinThinBarline() throws RecognitionException {
		ThinThinBarlineContext _localctx = new ThinThinBarlineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_thinThinBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(VerticalBar);
			setState(151);
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
		public TerminalNode SqaureBracketOpen() { return getToken(AbcNotationParser.SqaureBracketOpen, 0); }
		public TerminalNode VerticalBar() { return getToken(AbcNotationParser.VerticalBar, 0); }
		public ThikThinBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thikThinBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterThikThinBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitThikThinBarline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitThikThinBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThikThinBarlineContext thikThinBarline() throws RecognitionException {
		ThikThinBarlineContext _localctx = new ThikThinBarlineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_thikThinBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(SqaureBracketOpen);
			setState(154);
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
		public TerminalNode SqaureBracketClosed() { return getToken(AbcNotationParser.SqaureBracketClosed, 0); }
		public ThinThikBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thinThikBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterThinThikBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitThinThikBarline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitThinThikBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThinThikBarlineContext thinThikBarline() throws RecognitionException {
		ThinThikBarlineContext _localctx = new ThinThikBarlineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_thinThikBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(VerticalBar);
			setState(157);
			match(SqaureBracketClosed);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterStartOfRepeatedBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitStartOfRepeatedBarline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitStartOfRepeatedBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartOfRepeatedBarlineContext startOfRepeatedBarline() throws RecognitionException {
		StartOfRepeatedBarlineContext _localctx = new StartOfRepeatedBarlineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_startOfRepeatedBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(VerticalBar);
			setState(160);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterEndOfRepeatedBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitEndOfRepeatedBarline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitEndOfRepeatedBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndOfRepeatedBarlineContext endOfRepeatedBarline() throws RecognitionException {
		EndOfRepeatedBarlineContext _localctx = new EndOfRepeatedBarlineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_endOfRepeatedBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(Colon);
			setState(163);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterStartAndEndOfRepeatedBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitStartAndEndOfRepeatedBarline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitStartAndEndOfRepeatedBarline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartAndEndOfRepeatedBarlineContext startAndEndOfRepeatedBarline() throws RecognitionException {
		StartAndEndOfRepeatedBarlineContext _localctx = new StartAndEndOfRepeatedBarlineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_startAndEndOfRepeatedBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(Colon);
			setState(166);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterSuppresScoreLinebreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitSuppresScoreLinebreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitSuppresScoreLinebreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuppresScoreLinebreakContext suppresScoreLinebreak() throws RecognitionException {
		SuppresScoreLinebreakContext _localctx = new SuppresScoreLinebreakContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_suppresScoreLinebreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(Backslash);
			setState(169);
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
		public List<OptionalHeaderInfoContext> optionalHeaderInfo() {
			return getRuleContexts(OptionalHeaderInfoContext.class);
		}
		public OptionalHeaderInfoContext optionalHeaderInfo(int i) {
			return getRuleContext(OptionalHeaderInfoContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			identifier();
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				title();
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TitleSymbol );
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MeterSymbol) | (1L << LengthSymbol) | (1L << NotesSymbol) | (1L << ComposerSymbol) | (1L << TempoSymbol))) != 0)) {
				{
				{
				setState(177);
				optionalHeaderInfo();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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

	public static class OptionalHeaderInfoContext extends ParserRuleContext {
		public MeasureContext measure() {
			return getRuleContext(MeasureContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public ComposerContext composer() {
			return getRuleContext(ComposerContext.class,0);
		}
		public OptionalHeaderInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalHeaderInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterOptionalHeaderInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitOptionalHeaderInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitOptionalHeaderInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalHeaderInfoContext optionalHeaderInfo() throws RecognitionException {
		OptionalHeaderInfoContext _localctx = new OptionalHeaderInfoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_optionalHeaderInfo);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case MeterSymbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				measure();
				}
				break;
			case LengthSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				length();
				}
				break;
			case NotesSymbol:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				notes();
				}
				break;
			case TempoSymbol:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				tempo();
				}
				break;
			case ComposerSymbol:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				composer();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IdentifierSymbol() { return getToken(AbcNotationParser.IdentifierSymbol, 0); }
		public TerminalNode INT() { return getToken(AbcNotationParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IdentifierSymbol);
			setState(193);
			match(INT);
			setState(194);
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

	public static class TitleContext extends ParserRuleContext {
		public Token string;
		public TerminalNode TitleSymbol() { return getToken(AbcNotationParser.TitleSymbol, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(TitleSymbol);
			setState(197);
			((TitleContext)_localctx).string = match(STRING);
			setState(198);
			match(EXIT_NEWLINE);
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

	public static class MeasureContext extends ParserRuleContext {
		public Token string;
		public TerminalNode MeterSymbol() { return getToken(AbcNotationParser.MeterSymbol, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitMeasure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMeasure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_measure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(MeterSymbol);
			setState(206);
			switch (_input.LA(1)) {
			case STRING:
				{
				{
				setState(201);
				((MeasureContext)_localctx).string = match(STRING);
				setState(202);
				match(EXIT_NEWLINE);
				}
				}
				break;
			case INT:
				{
				{
				setState(203);
				fraction();
				setState(204);
				match(NEWLINE);
				}
				}
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

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode LengthSymbol() { return getToken(AbcNotationParser.LengthSymbol, 0); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LengthSymbol);
			setState(209);
			fraction();
			setState(210);
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

	public static class KeyContext extends ParserRuleContext {
		public Token string;
		public TerminalNode KeySymbol() { return getToken(AbcNotationParser.KeySymbol, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(KeySymbol);
			setState(213);
			((KeyContext)_localctx).string = match(STRING);
			setState(214);
			match(EXIT_NEWLINE);
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
		public Token string;
		public TerminalNode NotesSymbol() { return getToken(AbcNotationParser.NotesSymbol, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public NotesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterNotes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitNotes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNotes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotesContext notes() throws RecognitionException {
		NotesContext _localctx = new NotesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_notes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(NotesSymbol);
			setState(217);
			((NotesContext)_localctx).string = match(STRING);
			setState(218);
			match(EXIT_NEWLINE);
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
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode Equals() { return getToken(AbcNotationParser.Equals, 0); }
		public TerminalNode INT() { return getToken(AbcNotationParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitTempo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(TempoSymbol);
			setState(221);
			fraction();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(222);
				match(WS);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(Equals);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(229);
				match(WS);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(INT);
			setState(236);
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

	public static class ComposerContext extends ParserRuleContext {
		public Token string;
		public TerminalNode ComposerSymbol() { return getToken(AbcNotationParser.ComposerSymbol, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public ComposerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterComposer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitComposer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitComposer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComposerContext composer() throws RecognitionException {
		ComposerContext _localctx = new ComposerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ComposerSymbol);
			setState(239);
			((ComposerContext)_localctx).string = match(STRING);
			setState(240);
			match(EXIT_NEWLINE);
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
		public NoBeamNoteContext noBeamNote() {
			return getRuleContext(NoBeamNoteContext.class,0);
		}
		public BeamNoteContext beamNote() {
			return getRuleContext(BeamNoteContext.class,0);
		}
		public List<AccidentalContext> accidental() {
			return getRuleContexts(AccidentalContext.class);
		}
		public AccidentalContext accidental(int i) {
			return getRuleContext(AccidentalContext.class,i);
		}
		public List<NoteOctaveContext> noteOctave() {
			return getRuleContexts(NoteOctaveContext.class);
		}
		public NoteOctaveContext noteOctave(int i) {
			return getRuleContext(NoteOctaveContext.class,i);
		}
		public List<NoteLengthContext> noteLength() {
			return getRuleContexts(NoteLengthContext.class);
		}
		public NoteLengthContext noteLength(int i) {
			return getRuleContext(NoteLengthContext.class,i);
		}
		public TiedNoteContext tiedNote() {
			return getRuleContext(TiedNoteContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Flat) | (1L << Sharp) | (1L << Equals))) != 0)) {
				{
				{
				setState(242);
				accidental();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			switch (_input.LA(1)) {
			case WS:
				{
				setState(248);
				noBeamNote();
				}
				break;
			case NOTE:
				{
				setState(249);
				beamNote();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OCTAVE_UP || _la==OCTAVE_DOWN) {
				{
				{
				setState(252);
				noteOctave();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==Slash) {
				{
				{
				setState(258);
				noteLength();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(264);
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

	public static class TiedNoteContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(AbcNotationParser.Minus, 0); }
		public TiedNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiedNote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterTiedNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitTiedNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTiedNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiedNoteContext tiedNote() throws RecognitionException {
		TiedNoteContext _localctx = new TiedNoteContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tiedNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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

	public static class NoteExpressionContext extends ParserRuleContext {
		public MultipleNotesContext multipleNotes() {
			return getRuleContext(MultipleNotesContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public NoteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterNoteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitNoteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNoteExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteExpressionContext noteExpression() throws RecognitionException {
		NoteExpressionContext _localctx = new NoteExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_noteExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(269);
				multipleNotes();
				}
				break;
			case 2:
				{
				setState(270);
				note();
				}
				break;
			case 3:
				{
				setState(271);
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

	public static class RestContext extends ParserRuleContext {
		public TerminalNode Rest() { return getToken(AbcNotationParser.Rest, 0); }
		public NoteLengthContext noteLength() {
			return getRuleContext(NoteLengthContext.class,0);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(Rest);
			setState(276);
			_la = _input.LA(1);
			if (_la==INT || _la==Slash) {
				{
				setState(275);
				noteLength();
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

	public static class BeamNoteContext extends ParserRuleContext {
		public Token noteString;
		public TerminalNode NOTE() { return getToken(AbcNotationParser.NOTE, 0); }
		public BeamNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beamNote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterBeamNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitBeamNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitBeamNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeamNoteContext beamNote() throws RecognitionException {
		BeamNoteContext _localctx = new BeamNoteContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_beamNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterNoBeamNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitNoBeamNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNoBeamNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoBeamNoteContext noBeamNote() throws RecognitionException {
		NoBeamNoteContext _localctx = new NoBeamNoteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_noBeamNote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				match(WS);
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(285);
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

	public static class MultipleNotesContext extends ParserRuleContext {
		public TerminalNode SqaureBracketOpen() { return getToken(AbcNotationParser.SqaureBracketOpen, 0); }
		public TerminalNode SqaureBracketClosed() { return getToken(AbcNotationParser.SqaureBracketClosed, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterMultipleNotes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitMultipleNotes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMultipleNotes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleNotesContext multipleNotes() throws RecognitionException {
		MultipleNotesContext _localctx = new MultipleNotesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multipleNotes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(287);
				match(WS);
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(SqaureBracketOpen);
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				note();
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << Flat) | (1L << Sharp) | (1L << NOTE) | (1L << Equals))) != 0) );
			setState(299);
			match(SqaureBracketClosed);
			setState(301);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(300);
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

	public static class AnnotationContext extends ParserRuleContext {
		public DelimeterContext delimeter() {
			return getRuleContext(DelimeterContext.class,0);
		}
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public OctaveUpContext octaveUp() {
			return getRuleContext(OctaveUpContext.class,0);
		}
		public OctaveDownContext octaveDown() {
			return getRuleContext(OctaveDownContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_annotation);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case Slash:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				delimeter();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				multiplier();
				}
				break;
			case OCTAVE_UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				octaveUp();
				}
				break;
			case OCTAVE_DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				octaveDown();
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

	public static class NoteLengthContext extends ParserRuleContext {
		public DelimeterContext delimeter() {
			return getRuleContext(DelimeterContext.class,0);
		}
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public NoteLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterNoteLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitNoteLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNoteLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteLengthContext noteLength() throws RecognitionException {
		NoteLengthContext _localctx = new NoteLengthContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_noteLength);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case Slash:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				delimeter();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				multiplier();
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

	public static class NoteOctaveContext extends ParserRuleContext {
		public OctaveUpContext octaveUp() {
			return getRuleContext(OctaveUpContext.class,0);
		}
		public OctaveDownContext octaveDown() {
			return getRuleContext(OctaveDownContext.class,0);
		}
		public NoteOctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteOctave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterNoteOctave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitNoteOctave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNoteOctave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteOctaveContext noteOctave() throws RecognitionException {
		NoteOctaveContext _localctx = new NoteOctaveContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_noteOctave);
		try {
			setState(315);
			switch (_input.LA(1)) {
			case OCTAVE_UP:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				octaveUp();
				}
				break;
			case OCTAVE_DOWN:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				octaveDown();
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

	public static class AccidentalContext extends ParserRuleContext {
		public FlatContext flat() {
			return getRuleContext(FlatContext.class,0);
		}
		public SharpContext sharp() {
			return getRuleContext(SharpContext.class,0);
		}
		public NaturalContext natural() {
			return getRuleContext(NaturalContext.class,0);
		}
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterAccidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitAccidental(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitAccidental(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_accidental);
		try {
			setState(320);
			switch (_input.LA(1)) {
			case Flat:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				flat();
				}
				break;
			case Sharp:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				sharp();
				}
				break;
			case Equals:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				natural();
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

	public static class FlatContext extends ParserRuleContext {
		public TerminalNode Flat() { return getToken(AbcNotationParser.Flat, 0); }
		public FlatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterFlat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitFlat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitFlat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlatContext flat() throws RecognitionException {
		FlatContext _localctx = new FlatContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_flat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterSharp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitSharp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitSharp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharpContext sharp() throws RecognitionException {
		SharpContext _localctx = new SharpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sharp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterNatural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitNatural(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitNatural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturalContext natural() throws RecognitionException {
		NaturalContext _localctx = new NaturalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_natural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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

	public static class DelimeterContext extends ParserRuleContext {
		public Token denominator;
		public TerminalNode Slash() { return getToken(AbcNotationParser.Slash, 0); }
		public TerminalNode INT() { return getToken(AbcNotationParser.INT, 0); }
		public DelimeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimeter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterDelimeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitDelimeter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitDelimeter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimeterContext delimeter() throws RecognitionException {
		DelimeterContext _localctx = new DelimeterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_delimeter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Slash);
			setState(329);
			((DelimeterContext)_localctx).denominator = match(INT);
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
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode INT() { return getToken(AbcNotationParser.INT, 0); }
		public MultiplierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterMultiplier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitMultiplier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMultiplier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplierContext multiplier() throws RecognitionException {
		MultiplierContext _localctx = new MultiplierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiplier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(331);
				((MultiplierContext)_localctx).numerator = match(INT);
				}
				break;
			case 2:
				{
				setState(332);
				fraction();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterOctaveUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitOctaveUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitOctaveUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveUpContext octaveUp() throws RecognitionException {
		OctaveUpContext _localctx = new OctaveUpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_octaveUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterOctaveDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitOctaveDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitOctaveDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveDownContext octaveDown() throws RecognitionException {
		OctaveDownContext _localctx = new OctaveDownContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_octaveDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4f\n\4\r\4\16"+
		"\4g\3\5\3\5\3\5\5\5m\n\5\3\5\5\5p\n\5\3\5\3\5\3\6\3\6\5\6v\n\6\3\6\5\6"+
		"y\n\6\6\6{\n\6\r\6\16\6|\3\7\6\7\u0080\n\7\r\7\16\7\u0081\3\7\3\7\3\b"+
		"\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0095\n\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\6\22\u00b0"+
		"\n\22\r\22\16\22\u00b1\3\22\7\22\u00b5\n\22\f\22\16\22\u00b8\13\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00c1\n\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d1\n\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32"+
		"\u00e2\n\32\f\32\16\32\u00e5\13\32\3\32\3\32\7\32\u00e9\n\32\f\32\16\32"+
		"\u00ec\13\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\7\34\u00f6\n\34\f"+
		"\34\16\34\u00f9\13\34\3\34\3\34\5\34\u00fd\n\34\3\34\7\34\u0100\n\34\f"+
		"\34\16\34\u0103\13\34\3\34\7\34\u0106\n\34\f\34\16\34\u0109\13\34\3\34"+
		"\5\34\u010c\n\34\3\35\3\35\3\36\3\36\3\36\5\36\u0113\n\36\3\37\3\37\5"+
		"\37\u0117\n\37\3 \3 \3!\6!\u011c\n!\r!\16!\u011d\3!\3!\3\"\7\"\u0123\n"+
		"\"\f\"\16\"\u0126\13\"\3\"\3\"\6\"\u012a\n\"\r\"\16\"\u012b\3\"\3\"\5"+
		"\"\u0130\n\"\3#\3#\3#\3#\5#\u0136\n#\3$\3$\5$\u013a\n$\3%\3%\5%\u013e"+
		"\n%\3&\3&\3&\5&\u0143\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\5+\u0150\n"+
		"+\3,\3,\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVX\2\2\u0154\2Z\3\2\2\2\4^\3\2\2\2\6e\3\2\2"+
		"\2\bi\3\2\2\2\nz\3\2\2\2\f\177\3\2\2\2\16\u0088\3\2\2\2\20\u0094\3\2\2"+
		"\2\22\u0096\3\2\2\2\24\u0098\3\2\2\2\26\u009b\3\2\2\2\30\u009e\3\2\2\2"+
		"\32\u00a1\3\2\2\2\34\u00a4\3\2\2\2\36\u00a7\3\2\2\2 \u00aa\3\2\2\2\"\u00ad"+
		"\3\2\2\2$\u00c0\3\2\2\2&\u00c2\3\2\2\2(\u00c6\3\2\2\2*\u00ca\3\2\2\2,"+
		"\u00d2\3\2\2\2.\u00d6\3\2\2\2\60\u00da\3\2\2\2\62\u00de\3\2\2\2\64\u00f0"+
		"\3\2\2\2\66\u00f7\3\2\2\28\u010d\3\2\2\2:\u0112\3\2\2\2<\u0114\3\2\2\2"+
		">\u0118\3\2\2\2@\u011b\3\2\2\2B\u0124\3\2\2\2D\u0135\3\2\2\2F\u0139\3"+
		"\2\2\2H\u013d\3\2\2\2J\u0142\3\2\2\2L\u0144\3\2\2\2N\u0146\3\2\2\2P\u0148"+
		"\3\2\2\2R\u014a\3\2\2\2T\u014f\3\2\2\2V\u0151\3\2\2\2X\u0153\3\2\2\2Z"+
		"[\7\3\2\2[\\\7\7\2\2\\]\7\3\2\2]\3\3\2\2\2^_\7\16\2\2_`\7$\2\2`a\7#\2"+
		"\2a\5\3\2\2\2bc\5\4\3\2cd\5\n\6\2df\3\2\2\2eb\3\2\2\2fg\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2h\7\3\2\2\2il\5\"\22\2jm\5\6\4\2km\5\n\6\2lj\3\2\2\2lk\3"+
		"\2\2\2mo\3\2\2\2np\7\4\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\2\2\3r\t"+
		"\3\2\2\2su\5\f\7\2tv\7\4\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\5 \21\2x"+
		"w\3\2\2\2xy\3\2\2\2y{\3\2\2\2zs\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\13\3\2\2\2~\u0080\5:\36\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5\16\b\2"+
		"\u0084\r\3\2\2\2\u0085\u0087\7\5\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\5\20\t\2\u008c\17\3\2\2\2\u008d\u0095\5\22"+
		"\n\2\u008e\u0095\5\30\r\2\u008f\u0095\5\26\f\2\u0090\u0095\5\24\13\2\u0091"+
		"\u0095\5\32\16\2\u0092\u0095\5\34\17\2\u0093\u0095\5\36\20\2\u0094\u008d"+
		"\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\21\3\2\2"+
		"\2\u0096\u0097\7\36\2\2\u0097\23\3\2\2\2\u0098\u0099\7\36\2\2\u0099\u009a"+
		"\7\36\2\2\u009a\25\3\2\2\2\u009b\u009c\7\34\2\2\u009c\u009d\7\36\2\2\u009d"+
		"\27\3\2\2\2\u009e\u009f\7\36\2\2\u009f\u00a0\7\35\2\2\u00a0\31\3\2\2\2"+
		"\u00a1\u00a2\7\36\2\2\u00a2\u00a3\7\37\2\2\u00a3\33\3\2\2\2\u00a4\u00a5"+
		"\7\37\2\2\u00a5\u00a6\7\36\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7\37\2\2\u00a8"+
		"\u00a9\7\37\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7\4\2"+
		"\2\u00ac!\3\2\2\2\u00ad\u00af\5&\24\2\u00ae\u00b0\5(\25\2\u00af\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b6\3\2\2\2\u00b3\u00b5\5$\23\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\5.\30\2\u00ba#\3\2\2\2\u00bb\u00c1\5*\26\2"+
		"\u00bc\u00c1\5,\27\2\u00bd\u00c1\5\60\31\2\u00be\u00c1\5\62\32\2\u00bf"+
		"\u00c1\5\64\33\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1%\3\2\2\2\u00c2\u00c3"+
		"\7\b\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\7\4\2\2\u00c5\'\3\2\2\2\u00c6"+
		"\u00c7\7\t\2\2\u00c7\u00c8\7$\2\2\u00c8\u00c9\7#\2\2\u00c9)\3\2\2\2\u00ca"+
		"\u00d0\7\n\2\2\u00cb\u00cc\7$\2\2\u00cc\u00d1\7#\2\2\u00cd\u00ce\5\2\2"+
		"\2\u00ce\u00cf\7\4\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cd"+
		"\3\2\2\2\u00d1+\3\2\2\2\u00d2\u00d3\7\13\2\2\u00d3\u00d4\5\2\2\2\u00d4"+
		"\u00d5\7\4\2\2\u00d5-\3\2\2\2\u00d6\u00d7\7\f\2\2\u00d7\u00d8\7$\2\2\u00d8"+
		"\u00d9\7#\2\2\u00d9/\3\2\2\2\u00da\u00db\7\r\2\2\u00db\u00dc\7$\2\2\u00dc"+
		"\u00dd\7#\2\2\u00dd\61\3\2\2\2\u00de\u00df\7\20\2\2\u00df\u00e3\5\2\2"+
		"\2\u00e0\u00e2\7\5\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00ea\7 \2\2\u00e7\u00e9\7\5\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef\7\4\2\2\u00ef\63\3\2\2"+
		"\2\u00f0\u00f1\7\17\2\2\u00f1\u00f2\7$\2\2\u00f2\u00f3\7#\2\2\u00f3\65"+
		"\3\2\2\2\u00f4\u00f6\5J&\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fd\5@!\2\u00fb\u00fd\5> \2\u00fc\u00fa\3\2\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe\u0100\5H%\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0107\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5F$\2\u0105\u0104\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010c\58\35\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\67\3\2\2\2\u010d\u010e\7!\2\2\u010e9\3\2\2\2\u010f\u0113\5"+
		"B\"\2\u0110\u0113\5\66\34\2\u0111\u0113\5<\37\2\u0112\u010f\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113;\3\2\2\2\u0114\u0116\7\27\2\2"+
		"\u0115\u0117\5F$\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117=\3\2"+
		"\2\2\u0118\u0119\7\26\2\2\u0119?\3\2\2\2\u011a\u011c\7\5\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\7\26\2\2\u0120A\3\2\2\2\u0121\u0123\7\5\2\2"+
		"\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129\7\34\2\2"+
		"\u0128\u012a\5\66\34\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\7\35\2\2"+
		"\u012e\u0130\58\35\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130C\3"+
		"\2\2\2\u0131\u0136\5R*\2\u0132\u0136\5T+\2\u0133\u0136\5V,\2\u0134\u0136"+
		"\5X-\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0134\3\2\2\2\u0136E\3\2\2\2\u0137\u013a\5R*\2\u0138\u013a\5T+\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013aG\3\2\2\2\u013b\u013e\5V,\2\u013c"+
		"\u013e\5X-\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013eI\3\2\2\2\u013f"+
		"\u0143\5L\'\2\u0140\u0143\5N(\2\u0141\u0143\5P)\2\u0142\u013f\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143K\3\2\2\2\u0144\u0145\7"+
		"\24\2\2\u0145M\3\2\2\2\u0146\u0147\7\25\2\2\u0147O\3\2\2\2\u0148\u0149"+
		"\7 \2\2\u0149Q\3\2\2\2\u014a\u014b\7\7\2\2\u014b\u014c\7\3\2\2\u014cS"+
		"\3\2\2\2\u014d\u0150\7\3\2\2\u014e\u0150\5\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150U\3\2\2\2\u0151\u0152\7\22\2\2\u0152W\3\2\2\2\u0153"+
		"\u0154\7\23\2\2\u0154Y\3\2\2\2!gloux|\u0081\u0088\u0094\u00b1\u00b6\u00c0"+
		"\u00d0\u00e3\u00ea\u00f7\u00fc\u0101\u0107\u010b\u0112\u0116\u011d\u0124"+
		"\u012b\u012f\u0135\u0139\u013d\u0142\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}