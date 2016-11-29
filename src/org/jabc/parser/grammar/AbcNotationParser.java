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
		RULE_key = 22, RULE_notes = 23, RULE_tempo = 24, RULE_composer = 25, RULE_musicalExpression = 26, 
		RULE_note = 27, RULE_multipleNotes = 28, RULE_rest = 29, RULE_beamNote = 30, 
		RULE_noBeamNote = 31, RULE_noteLength = 32, RULE_noteOctave = 33, RULE_accidental = 34, 
		RULE_flat = 35, RULE_sharp = 36, RULE_natural = 37, RULE_tiedNote = 38, 
		RULE_delimeter = 39, RULE_multiplier = 40, RULE_octaveUp = 41, RULE_octaveDown = 42;
	public static final String[] ruleNames = {
		"fraction", "voice", "voices", "tune", "score", "bar", "endOfBar", "barline", 
		"simpleBarline", "thinThinBarline", "thikThinBarline", "thinThikBarline", 
		"startOfRepeatedBarline", "endOfRepeatedBarline", "startAndEndOfRepeatedBarline", 
		"suppresScoreLinebreak", "header", "optionalHeaderInfo", "identifier", 
		"title", "measure", "length", "key", "notes", "tempo", "composer", "musicalExpression", 
		"note", "multipleNotes", "rest", "beamNote", "noBeamNote", "noteLength", 
		"noteOctave", "accidental", "flat", "sharp", "natural", "tiedNote", "delimeter", 
		"multiplier", "octaveUp", "octaveDown"
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
			setState(86);
			((FractionContext)_localctx).numerator = match(INT);
			setState(87);
			match(Slash);
			setState(88);
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
			setState(90);
			match(VoiceSymbol);
			setState(91);
			((VoiceContext)_localctx).name = match(STRING);
			setState(92);
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
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				voice();
				setState(95);
				score();
				}
				}
				setState(99); 
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
			setState(101);
			header();
			setState(104);
			switch (_input.LA(1)) {
			case VoiceSymbol:
				{
				setState(102);
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
				setState(103);
				score();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(106);
				match(NEWLINE);
				}
			}

			setState(109);
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
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				bar();
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(112);
					match(NEWLINE);
					}
					break;
				}
				setState(116);
				_la = _input.LA(1);
				if (_la==Backslash) {
					{
					setState(115);
					suppresScoreLinebreak();
					}
				}

				}
				}
				setState(120); 
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
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					match(WS);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(129); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(128);
					musicalExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(133);
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
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(135);
				match(WS);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				simpleBarline();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				thinThikBarline();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				thikThinBarline();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				thinThinBarline();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				startOfRepeatedBarline();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				endOfRepeatedBarline();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
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
			setState(152);
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
			setState(154);
			match(VerticalBar);
			setState(155);
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
			setState(157);
			match(SqaureBracketOpen);
			setState(158);
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
			setState(160);
			match(VerticalBar);
			setState(161);
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
			setState(163);
			match(VerticalBar);
			setState(164);
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
			setState(166);
			match(Colon);
			setState(167);
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
			setState(169);
			match(Colon);
			setState(170);
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
			setState(172);
			match(Backslash);
			setState(173);
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
			setState(175);
			identifier();
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				title();
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TitleSymbol );
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MeterSymbol) | (1L << LengthSymbol) | (1L << NotesSymbol) | (1L << ComposerSymbol) | (1L << TempoSymbol))) != 0)) {
				{
				{
				setState(181);
				optionalHeaderInfo();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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
			setState(194);
			switch (_input.LA(1)) {
			case MeterSymbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				measure();
				}
				break;
			case LengthSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				length();
				}
				break;
			case NotesSymbol:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				notes();
				}
				break;
			case TempoSymbol:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				tempo();
				}
				break;
			case ComposerSymbol:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
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
			setState(196);
			match(IdentifierSymbol);
			setState(197);
			match(INT);
			setState(198);
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
			setState(200);
			match(TitleSymbol);
			setState(201);
			((TitleContext)_localctx).string = match(STRING);
			setState(202);
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
			setState(204);
			match(MeterSymbol);
			setState(210);
			switch (_input.LA(1)) {
			case STRING:
				{
				{
				setState(205);
				((MeasureContext)_localctx).string = match(STRING);
				setState(206);
				match(EXIT_NEWLINE);
				}
				}
				break;
			case INT:
				{
				{
				setState(207);
				fraction();
				setState(208);
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
		public List<TerminalNode> WS() { return getTokens(AbcNotationParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AbcNotationParser.WS, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LengthSymbol);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(213);
				match(WS);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			fraction();
			setState(220);
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
			setState(222);
			match(KeySymbol);
			setState(223);
			((KeyContext)_localctx).string = match(STRING);
			setState(224);
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
			setState(226);
			match(NotesSymbol);
			setState(227);
			((NotesContext)_localctx).string = match(STRING);
			setState(228);
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
			setState(230);
			match(TempoSymbol);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(231);
				match(WS);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			fraction();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(238);
				match(WS);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(Equals);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(245);
				match(WS);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(INT);
			setState(252);
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
			setState(254);
			match(ComposerSymbol);
			setState(255);
			((ComposerContext)_localctx).string = match(STRING);
			setState(256);
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

	public static class MusicalExpressionContext extends ParserRuleContext {
		public MultipleNotesContext multipleNotes() {
			return getRuleContext(MultipleNotesContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public MusicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).enterMusicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcNotationParserListener ) ((AbcNotationParserListener)listener).exitMusicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMusicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MusicalExpressionContext musicalExpression() throws RecognitionException {
		MusicalExpressionContext _localctx = new MusicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_musicalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(258);
				multipleNotes();
				}
				break;
			case 2:
				{
				setState(259);
				note();
				}
				break;
			case 3:
				{
				setState(260);
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
		enterRule(_localctx, 54, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Flat) | (1L << Sharp) | (1L << Equals))) != 0)) {
				{
				{
				setState(263);
				accidental();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			switch (_input.LA(1)) {
			case WS:
				{
				setState(269);
				noBeamNote();
				}
				break;
			case NOTE:
				{
				setState(270);
				beamNote();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OCTAVE_UP || _la==OCTAVE_DOWN) {
				{
				{
				setState(273);
				noteOctave();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==Slash) {
				{
				{
				setState(279);
				noteLength();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(285);
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
		enterRule(_localctx, 56, RULE_multipleNotes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(288);
				match(WS);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(SqaureBracketOpen);
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				note();
				}
				}
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << Flat) | (1L << Sharp) | (1L << NOTE) | (1L << Equals))) != 0) );
			setState(300);
			match(SqaureBracketClosed);
			setState(302);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(301);
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
			setState(304);
			match(Rest);
			setState(306);
			_la = _input.LA(1);
			if (_la==INT || _la==Slash) {
				{
				setState(305);
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
			setState(308);
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
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				match(WS);
				}
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(315);
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
		enterRule(_localctx, 64, RULE_noteLength);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case Slash:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				delimeter();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
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
		enterRule(_localctx, 66, RULE_noteOctave);
		try {
			setState(323);
			switch (_input.LA(1)) {
			case OCTAVE_UP:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				octaveUp();
				}
				break;
			case OCTAVE_DOWN:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
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
		enterRule(_localctx, 68, RULE_accidental);
		try {
			setState(328);
			switch (_input.LA(1)) {
			case Flat:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				flat();
				}
				break;
			case Sharp:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				sharp();
				}
				break;
			case Equals:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
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
		enterRule(_localctx, 70, RULE_flat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		enterRule(_localctx, 72, RULE_sharp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		enterRule(_localctx, 74, RULE_natural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 76, RULE_tiedNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
		enterRule(_localctx, 78, RULE_delimeter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(Slash);
			setState(339);
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
		enterRule(_localctx, 80, RULE_multiplier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(341);
				((MultiplierContext)_localctx).numerator = match(INT);
				}
				break;
			case 2:
				{
				setState(342);
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
		enterRule(_localctx, 82, RULE_octaveUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
		enterRule(_localctx, 84, RULE_octaveDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4d\n\4\r\4\16\4e\3"+
		"\5\3\5\3\5\5\5k\n\5\3\5\5\5n\n\5\3\5\3\5\3\6\3\6\5\6t\n\6\3\6\5\6w\n\6"+
		"\6\6y\n\6\r\6\16\6z\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\3\7\6\7\u0084\n\7"+
		"\r\7\16\7\u0085\3\7\3\7\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\6\22\u00b4\n\22\r\22\16\22\u00b5\3\22\7\22\u00b9"+
		"\n\22\f\22\16\22\u00bc\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00c5"+
		"\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00d5\n\26\3\27\3\27\7\27\u00d9\n\27\f\27\16\27\u00dc\13\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\7\32"+
		"\u00eb\n\32\f\32\16\32\u00ee\13\32\3\32\3\32\7\32\u00f2\n\32\f\32\16\32"+
		"\u00f5\13\32\3\32\3\32\7\32\u00f9\n\32\f\32\16\32\u00fc\13\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0108\n\34\3\35\7\35\u010b"+
		"\n\35\f\35\16\35\u010e\13\35\3\35\3\35\5\35\u0112\n\35\3\35\7\35\u0115"+
		"\n\35\f\35\16\35\u0118\13\35\3\35\7\35\u011b\n\35\f\35\16\35\u011e\13"+
		"\35\3\35\5\35\u0121\n\35\3\36\7\36\u0124\n\36\f\36\16\36\u0127\13\36\3"+
		"\36\3\36\6\36\u012b\n\36\r\36\16\36\u012c\3\36\3\36\5\36\u0131\n\36\3"+
		"\37\3\37\5\37\u0135\n\37\3 \3 \3!\6!\u013a\n!\r!\16!\u013b\3!\3!\3\"\3"+
		"\"\5\"\u0142\n\"\3#\3#\5#\u0146\n#\3$\3$\3$\5$\u014b\n$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3)\3*\3*\5*\u015a\n*\3+\3+\3,\3,\3,\2\2-\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\2"+
		"\u015f\2X\3\2\2\2\4\\\3\2\2\2\6c\3\2\2\2\bg\3\2\2\2\nx\3\2\2\2\f\177\3"+
		"\2\2\2\16\u008c\3\2\2\2\20\u0098\3\2\2\2\22\u009a\3\2\2\2\24\u009c\3\2"+
		"\2\2\26\u009f\3\2\2\2\30\u00a2\3\2\2\2\32\u00a5\3\2\2\2\34\u00a8\3\2\2"+
		"\2\36\u00ab\3\2\2\2 \u00ae\3\2\2\2\"\u00b1\3\2\2\2$\u00c4\3\2\2\2&\u00c6"+
		"\3\2\2\2(\u00ca\3\2\2\2*\u00ce\3\2\2\2,\u00d6\3\2\2\2.\u00e0\3\2\2\2\60"+
		"\u00e4\3\2\2\2\62\u00e8\3\2\2\2\64\u0100\3\2\2\2\66\u0107\3\2\2\28\u010c"+
		"\3\2\2\2:\u0125\3\2\2\2<\u0132\3\2\2\2>\u0136\3\2\2\2@\u0139\3\2\2\2B"+
		"\u0141\3\2\2\2D\u0145\3\2\2\2F\u014a\3\2\2\2H\u014c\3\2\2\2J\u014e\3\2"+
		"\2\2L\u0150\3\2\2\2N\u0152\3\2\2\2P\u0154\3\2\2\2R\u0159\3\2\2\2T\u015b"+
		"\3\2\2\2V\u015d\3\2\2\2XY\7\3\2\2YZ\7\7\2\2Z[\7\3\2\2[\3\3\2\2\2\\]\7"+
		"\16\2\2]^\7$\2\2^_\7#\2\2_\5\3\2\2\2`a\5\4\3\2ab\5\n\6\2bd\3\2\2\2c`\3"+
		"\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2gj\5\"\22\2hk\5\6\4\2i"+
		"k\5\n\6\2jh\3\2\2\2ji\3\2\2\2km\3\2\2\2ln\7\4\2\2ml\3\2\2\2mn\3\2\2\2"+
		"no\3\2\2\2op\7\2\2\3p\t\3\2\2\2qs\5\f\7\2rt\7\4\2\2sr\3\2\2\2st\3\2\2"+
		"\2tv\3\2\2\2uw\5 \21\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xq\3\2\2\2yz\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{\13\3\2\2\2|~\7\5\2\2}|\3\2\2\2~\u0081\3\2\2\2"+
		"\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0082\u0084\5\66\34\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\5\16\b\2"+
		"\u0088\r\3\2\2\2\u0089\u008b\7\5\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\5\20\t\2\u0090\17\3\2\2\2\u0091\u0099\5\22"+
		"\n\2\u0092\u0099\5\30\r\2\u0093\u0099\5\26\f\2\u0094\u0099\5\24\13\2\u0095"+
		"\u0099\5\32\16\2\u0096\u0099\5\34\17\2\u0097\u0099\5\36\20\2\u0098\u0091"+
		"\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098"+
		"\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\21\3\2\2"+
		"\2\u009a\u009b\7\36\2\2\u009b\23\3\2\2\2\u009c\u009d\7\36\2\2\u009d\u009e"+
		"\7\36\2\2\u009e\25\3\2\2\2\u009f\u00a0\7\34\2\2\u00a0\u00a1\7\36\2\2\u00a1"+
		"\27\3\2\2\2\u00a2\u00a3\7\36\2\2\u00a3\u00a4\7\35\2\2\u00a4\31\3\2\2\2"+
		"\u00a5\u00a6\7\36\2\2\u00a6\u00a7\7\37\2\2\u00a7\33\3\2\2\2\u00a8\u00a9"+
		"\7\37\2\2\u00a9\u00aa\7\36\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\37\2\2\u00ac"+
		"\u00ad\7\37\2\2\u00ad\37\3\2\2\2\u00ae\u00af\7\"\2\2\u00af\u00b0\7\4\2"+
		"\2\u00b0!\3\2\2\2\u00b1\u00b3\5&\24\2\u00b2\u00b4\5(\25\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00ba\3\2\2\2\u00b7\u00b9\5$\23\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\5.\30\2\u00be#\3\2\2\2\u00bf\u00c5\5*\26\2"+
		"\u00c0\u00c5\5,\27\2\u00c1\u00c5\5\60\31\2\u00c2\u00c5\5\62\32\2\u00c3"+
		"\u00c5\5\64\33\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00c7"+
		"\7\b\2\2\u00c7\u00c8\7\3\2\2\u00c8\u00c9\7\4\2\2\u00c9\'\3\2\2\2\u00ca"+
		"\u00cb\7\t\2\2\u00cb\u00cc\7$\2\2\u00cc\u00cd\7#\2\2\u00cd)\3\2\2\2\u00ce"+
		"\u00d4\7\n\2\2\u00cf\u00d0\7$\2\2\u00d0\u00d5\7#\2\2\u00d1\u00d2\5\2\2"+
		"\2\u00d2\u00d3\7\4\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d1"+
		"\3\2\2\2\u00d5+\3\2\2\2\u00d6\u00da\7\13\2\2\u00d7\u00d9\7\5\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\2\2\2\u00de"+
		"\u00df\7\4\2\2\u00df-\3\2\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2\7$\2\2\u00e2"+
		"\u00e3\7#\2\2\u00e3/\3\2\2\2\u00e4\u00e5\7\r\2\2\u00e5\u00e6\7$\2\2\u00e6"+
		"\u00e7\7#\2\2\u00e7\61\3\2\2\2\u00e8\u00ec\7\20\2\2\u00e9\u00eb\7\5\2"+
		"\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3\5\2\2\2\u00f0"+
		"\u00f2\7\5\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00fa\7 \2\2\u00f7\u00f9\7\5\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7\3\2\2\u00fe\u00ff\7\4\2\2\u00ff\63\3\2\2"+
		"\2\u0100\u0101\7\17\2\2\u0101\u0102\7$\2\2\u0102\u0103\7#\2\2\u0103\65"+
		"\3\2\2\2\u0104\u0108\5:\36\2\u0105\u0108\58\35\2\u0106\u0108\5<\37\2\u0107"+
		"\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\67\3\2\2"+
		"\2\u0109\u010b\5F$\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0111\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0112\5@!\2\u0110\u0112\5> \2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2"+
		"\u0112\u0116\3\2\2\2\u0113\u0115\5D#\2\u0114\u0113\3\2\2\2\u0115\u0118"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011c\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011b\5B\"\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0121\5N(\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2"+
		"\2\u01219\3\2\2\2\u0122\u0124\7\5\2\2\u0123\u0122\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012a\7\34\2\2\u0129\u012b\58\35\2\u012a\u0129\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0130\7\35\2\2\u012f\u0131\5N(\2\u0130\u012f\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131;\3\2\2\2\u0132\u0134\7\27\2\2\u0133\u0135"+
		"\5B\"\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135=\3\2\2\2\u0136\u0137"+
		"\7\26\2\2\u0137?\3\2\2\2\u0138\u013a\7\5\2\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013e\7\26\2\2\u013eA\3\2\2\2\u013f\u0142\5P)\2\u0140\u0142"+
		"\5R*\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142C\3\2\2\2\u0143\u0146"+
		"\5T+\2\u0144\u0146\5V,\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"E\3\2\2\2\u0147\u014b\5H%\2\u0148\u014b\5J&\2\u0149\u014b\5L\'\2\u014a"+
		"\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014bG\3\2\2\2"+
		"\u014c\u014d\7\24\2\2\u014dI\3\2\2\2\u014e\u014f\7\25\2\2\u014fK\3\2\2"+
		"\2\u0150\u0151\7 \2\2\u0151M\3\2\2\2\u0152\u0153\7!\2\2\u0153O\3\2\2\2"+
		"\u0154\u0155\7\7\2\2\u0155\u0156\7\3\2\2\u0156Q\3\2\2\2\u0157\u015a\7"+
		"\3\2\2\u0158\u015a\5\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"S\3\2\2\2\u015b\u015c\7\22\2\2\u015cU\3\2\2\2\u015d\u015e\7\23\2\2\u015e"+
		"W\3\2\2\2#ejmsvz\177\u0085\u008c\u0098\u00b5\u00ba\u00c4\u00d4\u00da\u00ec"+
		"\u00f3\u00fa\u0107\u010c\u0111\u0116\u011c\u0120\u0125\u012c\u0130\u0134"+
		"\u013b\u0141\u0145\u014a\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}