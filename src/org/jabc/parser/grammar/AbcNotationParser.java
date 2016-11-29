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
		RULE_tiedNote = 27, RULE_noteExpression = 28, RULE_beamNote = 29, RULE_noBeamNote = 30, 
		RULE_multipleNotes = 31, RULE_annotation = 32, RULE_noteLength = 33, RULE_noteOctave = 34, 
		RULE_accidental = 35, RULE_flat = 36, RULE_sharp = 37, RULE_natural = 38, 
		RULE_delimeter = 39, RULE_multiplier = 40, RULE_octaveUp = 41, RULE_octaveDown = 42;
	public static final String[] ruleNames = {
		"fraction", "voice", "voices", "tune", "score", "bar", "endOfBar", "barline", 
		"simpleBarline", "thinThinBarline", "thikThinBarline", "thinThikBarline", 
		"startOfRepeatedBarline", "endOfRepeatedBarline", "startAndEndOfRepeatedBarline", 
		"suppresScoreLinebreak", "header", "optionalHeaderInfo", "identifier", 
		"title", "measure", "length", "key", "notes", "tempo", "composer", "note", 
		"tiedNote", "noteExpression", "beamNote", "noBeamNote", "multipleNotes", 
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << Flat) | (1L << Sharp) | (1L << NOTE) | (1L << SqaureBracketOpen) | (1L << Equals))) != 0) );
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
			setState(123); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(122);
					noteExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(127);
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
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(129);
				match(WS);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				simpleBarline();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				thinThikBarline();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				thikThinBarline();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				thinThinBarline();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				startOfRepeatedBarline();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				endOfRepeatedBarline();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
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
			setState(146);
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
			setState(148);
			match(VerticalBar);
			setState(149);
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
			setState(151);
			match(SqaureBracketOpen);
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
			setState(154);
			match(VerticalBar);
			setState(155);
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
			setState(157);
			match(VerticalBar);
			setState(158);
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
			setState(160);
			match(Colon);
			setState(161);
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
			setState(163);
			match(Colon);
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
			setState(166);
			match(Backslash);
			setState(167);
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
			setState(169);
			identifier();
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				title();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TitleSymbol );
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MeterSymbol) | (1L << LengthSymbol) | (1L << NotesSymbol) | (1L << ComposerSymbol) | (1L << TempoSymbol))) != 0)) {
				{
				{
				setState(175);
				optionalHeaderInfo();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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
			setState(188);
			switch (_input.LA(1)) {
			case MeterSymbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				measure();
				}
				break;
			case LengthSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				length();
				}
				break;
			case NotesSymbol:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				notes();
				}
				break;
			case TempoSymbol:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				tempo();
				}
				break;
			case ComposerSymbol:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
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
			setState(190);
			match(IdentifierSymbol);
			setState(191);
			match(INT);
			setState(192);
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
			setState(194);
			match(TitleSymbol);
			setState(195);
			((TitleContext)_localctx).string = match(STRING);
			setState(196);
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
			setState(198);
			match(MeterSymbol);
			setState(204);
			switch (_input.LA(1)) {
			case STRING:
				{
				{
				setState(199);
				((MeasureContext)_localctx).string = match(STRING);
				setState(200);
				match(EXIT_NEWLINE);
				}
				}
				break;
			case INT:
				{
				{
				setState(201);
				fraction();
				setState(202);
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
			setState(206);
			match(LengthSymbol);
			setState(207);
			fraction();
			setState(208);
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
			setState(210);
			match(KeySymbol);
			setState(211);
			((KeyContext)_localctx).string = match(STRING);
			setState(212);
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
			setState(214);
			match(NotesSymbol);
			setState(215);
			((NotesContext)_localctx).string = match(STRING);
			setState(216);
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
			setState(218);
			match(TempoSymbol);
			setState(219);
			fraction();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(220);
				match(WS);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(Equals);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(227);
				match(WS);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(INT);
			setState(234);
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
			setState(236);
			match(ComposerSymbol);
			setState(237);
			((ComposerContext)_localctx).string = match(STRING);
			setState(238);
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
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Flat) | (1L << Sharp) | (1L << Equals))) != 0)) {
				{
				{
				setState(240);
				accidental();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			switch (_input.LA(1)) {
			case WS:
				{
				setState(246);
				noBeamNote();
				}
				break;
			case NOTE:
				{
				setState(247);
				beamNote();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OCTAVE_UP || _la==OCTAVE_DOWN) {
				{
				{
				setState(250);
				noteOctave();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==Slash) {
				{
				{
				setState(256);
				noteLength();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(262);
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
			setState(265);
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
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				multipleNotes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				note();
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
		enterRule(_localctx, 58, RULE_beamNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 60, RULE_noBeamNote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273);
				match(WS);
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(278);
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
		enterRule(_localctx, 62, RULE_multipleNotes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(280);
				match(WS);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(SqaureBracketOpen);
			setState(288); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				note();
				}
				}
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << Flat) | (1L << Sharp) | (1L << NOTE) | (1L << Equals))) != 0) );
			setState(292);
			match(SqaureBracketClosed);
			setState(294);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(293);
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
		enterRule(_localctx, 64, RULE_annotation);
		try {
			setState(300);
			switch (_input.LA(1)) {
			case Slash:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				delimeter();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				multiplier();
				}
				break;
			case OCTAVE_UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				octaveUp();
				}
				break;
			case OCTAVE_DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
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
		enterRule(_localctx, 66, RULE_noteLength);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case Slash:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				delimeter();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
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
		enterRule(_localctx, 68, RULE_noteOctave);
		try {
			setState(308);
			switch (_input.LA(1)) {
			case OCTAVE_UP:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				octaveUp();
				}
				break;
			case OCTAVE_DOWN:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
		enterRule(_localctx, 70, RULE_accidental);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case Flat:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				flat();
				}
				break;
			case Sharp:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				sharp();
				}
				break;
			case Equals:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
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
		enterRule(_localctx, 72, RULE_flat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
		enterRule(_localctx, 74, RULE_sharp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		enterRule(_localctx, 76, RULE_natural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 78, RULE_delimeter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Slash);
			setState(322);
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(324);
				((MultiplierContext)_localctx).numerator = match(INT);
				}
				break;
			case 2:
				{
				setState(325);
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
			setState(328);
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
			setState(330);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u014f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4d\n\4\r\4\16\4e\3"+
		"\5\3\5\3\5\5\5k\n\5\3\5\5\5n\n\5\3\5\3\5\3\6\3\6\5\6t\n\6\3\6\5\6w\n\6"+
		"\6\6y\n\6\r\6\16\6z\3\7\6\7~\n\7\r\7\16\7\177\3\7\3\7\3\b\7\b\u0085\n"+
		"\b\f\b\16\b\u0088\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0093\n"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\6\22\u00ae\n\22\r\22"+
		"\16\22\u00af\3\22\7\22\u00b3\n\22\f\22\16\22\u00b6\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00bf\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00cf\n\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u00e0\n\32"+
		"\f\32\16\32\u00e3\13\32\3\32\3\32\7\32\u00e7\n\32\f\32\16\32\u00ea\13"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\7\34\u00f4\n\34\f\34\16\34"+
		"\u00f7\13\34\3\34\3\34\5\34\u00fb\n\34\3\34\7\34\u00fe\n\34\f\34\16\34"+
		"\u0101\13\34\3\34\7\34\u0104\n\34\f\34\16\34\u0107\13\34\3\34\5\34\u010a"+
		"\n\34\3\35\3\35\3\36\3\36\5\36\u0110\n\36\3\37\3\37\3 \6 \u0115\n \r "+
		"\16 \u0116\3 \3 \3!\7!\u011c\n!\f!\16!\u011f\13!\3!\3!\6!\u0123\n!\r!"+
		"\16!\u0124\3!\3!\5!\u0129\n!\3\"\3\"\3\"\3\"\5\"\u012f\n\"\3#\3#\5#\u0133"+
		"\n#\3$\3$\5$\u0137\n$\3%\3%\3%\5%\u013c\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		")\3*\3*\5*\u0149\n*\3+\3+\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\2\u014c\2X\3\2\2\2\4"+
		"\\\3\2\2\2\6c\3\2\2\2\bg\3\2\2\2\nx\3\2\2\2\f}\3\2\2\2\16\u0086\3\2\2"+
		"\2\20\u0092\3\2\2\2\22\u0094\3\2\2\2\24\u0096\3\2\2\2\26\u0099\3\2\2\2"+
		"\30\u009c\3\2\2\2\32\u009f\3\2\2\2\34\u00a2\3\2\2\2\36\u00a5\3\2\2\2 "+
		"\u00a8\3\2\2\2\"\u00ab\3\2\2\2$\u00be\3\2\2\2&\u00c0\3\2\2\2(\u00c4\3"+
		"\2\2\2*\u00c8\3\2\2\2,\u00d0\3\2\2\2.\u00d4\3\2\2\2\60\u00d8\3\2\2\2\62"+
		"\u00dc\3\2\2\2\64\u00ee\3\2\2\2\66\u00f5\3\2\2\28\u010b\3\2\2\2:\u010f"+
		"\3\2\2\2<\u0111\3\2\2\2>\u0114\3\2\2\2@\u011d\3\2\2\2B\u012e\3\2\2\2D"+
		"\u0132\3\2\2\2F\u0136\3\2\2\2H\u013b\3\2\2\2J\u013d\3\2\2\2L\u013f\3\2"+
		"\2\2N\u0141\3\2\2\2P\u0143\3\2\2\2R\u0148\3\2\2\2T\u014a\3\2\2\2V\u014c"+
		"\3\2\2\2XY\7\3\2\2YZ\7\7\2\2Z[\7\3\2\2[\3\3\2\2\2\\]\7\16\2\2]^\7$\2\2"+
		"^_\7#\2\2_\5\3\2\2\2`a\5\4\3\2ab\5\n\6\2bd\3\2\2\2c`\3\2\2\2de\3\2\2\2"+
		"ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2gj\5\"\22\2hk\5\6\4\2ik\5\n\6\2jh\3\2\2"+
		"\2ji\3\2\2\2km\3\2\2\2ln\7\4\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\2\2"+
		"\3p\t\3\2\2\2qs\5\f\7\2rt\7\4\2\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\5 \21"+
		"\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xq\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{\13\3\2\2\2|~\5:\36\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5\16\b\2\u0082\r\3\2\2\2\u0083"+
		"\u0085\7\5\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\5\20\t\2\u008a\17\3\2\2\2\u008b\u0093\5\22\n\2\u008c\u0093\5\30"+
		"\r\2\u008d\u0093\5\26\f\2\u008e\u0093\5\24\13\2\u008f\u0093\5\32\16\2"+
		"\u0090\u0093\5\34\17\2\u0091\u0093\5\36\20\2\u0092\u008b\3\2\2\2\u0092"+
		"\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\21\3\2\2\2\u0094\u0095"+
		"\7\36\2\2\u0095\23\3\2\2\2\u0096\u0097\7\36\2\2\u0097\u0098\7\36\2\2\u0098"+
		"\25\3\2\2\2\u0099\u009a\7\34\2\2\u009a\u009b\7\36\2\2\u009b\27\3\2\2\2"+
		"\u009c\u009d\7\36\2\2\u009d\u009e\7\35\2\2\u009e\31\3\2\2\2\u009f\u00a0"+
		"\7\36\2\2\u00a0\u00a1\7\37\2\2\u00a1\33\3\2\2\2\u00a2\u00a3\7\37\2\2\u00a3"+
		"\u00a4\7\36\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\37\2\2\u00a6\u00a7\7\37"+
		"\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa\7\4\2\2\u00aa!\3"+
		"\2\2\2\u00ab\u00ad\5&\24\2\u00ac\u00ae\5(\25\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4\3\2"+
		"\2\2\u00b1\u00b3\5$\23\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\5.\30\2\u00b8#\3\2\2\2\u00b9\u00bf\5*\26\2\u00ba\u00bf"+
		"\5,\27\2\u00bb\u00bf\5\60\31\2\u00bc\u00bf\5\62\32\2\u00bd\u00bf\5\64"+
		"\33\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf%\3\2\2\2\u00c0\u00c1\7\b\2\2"+
		"\u00c1\u00c2\7\3\2\2\u00c2\u00c3\7\4\2\2\u00c3\'\3\2\2\2\u00c4\u00c5\7"+
		"\t\2\2\u00c5\u00c6\7$\2\2\u00c6\u00c7\7#\2\2\u00c7)\3\2\2\2\u00c8\u00ce"+
		"\7\n\2\2\u00c9\u00ca\7$\2\2\u00ca\u00cf\7#\2\2\u00cb\u00cc\5\2\2\2\u00cc"+
		"\u00cd\7\4\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00cb\3\2"+
		"\2\2\u00cf+\3\2\2\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2\5\2\2\2\u00d2\u00d3"+
		"\7\4\2\2\u00d3-\3\2\2\2\u00d4\u00d5\7\f\2\2\u00d5\u00d6\7$\2\2\u00d6\u00d7"+
		"\7#\2\2\u00d7/\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\7$\2\2\u00da\u00db"+
		"\7#\2\2\u00db\61\3\2\2\2\u00dc\u00dd\7\20\2\2\u00dd\u00e1\5\2\2\2\u00de"+
		"\u00e0\7\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e8\7 \2\2\u00e5\u00e7\7\5\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7\3\2\2\u00ec\u00ed\7\4\2\2\u00ed\63\3\2\2"+
		"\2\u00ee\u00ef\7\17\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f1\7#\2\2\u00f1\65"+
		"\3\2\2\2\u00f2\u00f4\5H%\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fb\5> \2\u00f9\u00fb\5<\37\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\5F$\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0105\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\5D#\2\u0103\u0102\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\58\35\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\67\3\2\2\2\u010b\u010c\7!\2\2\u010c9\3\2\2\2\u010d\u0110\5"+
		"@!\2\u010e\u0110\5\66\34\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		";\3\2\2\2\u0111\u0112\7\26\2\2\u0112=\3\2\2\2\u0113\u0115\7\5\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\26\2\2\u0119?\3\2\2\2\u011a\u011c"+
		"\7\5\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\7\34"+
		"\2\2\u0121\u0123\5\66\34\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\7\35"+
		"\2\2\u0127\u0129\58\35\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"A\3\2\2\2\u012a\u012f\5P)\2\u012b\u012f\5R*\2\u012c\u012f\5T+\2\u012d"+
		"\u012f\5V,\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2"+
		"\2\u012e\u012d\3\2\2\2\u012fC\3\2\2\2\u0130\u0133\5P)\2\u0131\u0133\5"+
		"R*\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133E\3\2\2\2\u0134\u0137"+
		"\5T+\2\u0135\u0137\5V,\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"G\3\2\2\2\u0138\u013c\5J&\2\u0139\u013c\5L\'\2\u013a\u013c\5N(\2\u013b"+
		"\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013cI\3\2\2\2"+
		"\u013d\u013e\7\24\2\2\u013eK\3\2\2\2\u013f\u0140\7\25\2\2\u0140M\3\2\2"+
		"\2\u0141\u0142\7 \2\2\u0142O\3\2\2\2\u0143\u0144\7\7\2\2\u0144\u0145\7"+
		"\3\2\2\u0145Q\3\2\2\2\u0146\u0149\7\3\2\2\u0147\u0149\5\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0147\3\2\2\2\u0149S\3\2\2\2\u014a\u014b\7\22\2\2\u014b"+
		"U\3\2\2\2\u014c\u014d\7\23\2\2\u014dW\3\2\2\2 ejmsvz\177\u0086\u0092\u00af"+
		"\u00b4\u00be\u00ce\u00e1\u00e8\u00f5\u00fa\u00ff\u0105\u0109\u010f\u0116"+
		"\u011d\u0124\u0128\u012e\u0132\u0136\u013b\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}