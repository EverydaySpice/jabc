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
		INT=1, NEWLINE=2, WS=3, FRACTION=4, Delimiter=5, IdentifierSymbol=6, TitleSymbol=7, 
		MeasureSymbol=8, LengthSymbol=9, KeySymbol=10, CommentSymbol=11, MULTIPLIER=12, 
		OCTAVE_UP=13, OCTAVE_DOWN=14, Annotation=15, SingleNote=16, BeamNote=17, 
		BARLINE=18, NOTE=19, EXIT_NEWLINE=20, STRING=21, ID=22;
	public static final int
		RULE_tune = 0, RULE_score = 1, RULE_takt = 2, RULE_header = 3, RULE_optionalHeaderInfo = 4, 
		RULE_identifier = 5, RULE_title = 6, RULE_measure = 7, RULE_length = 8, 
		RULE_key = 9, RULE_comment = 10, RULE_note = 11, RULE_singleNote = 12, 
		RULE_beamNote = 13, RULE_annotation = 14, RULE_delimeter = 15, RULE_multiplier = 16, 
		RULE_octaveUp = 17, RULE_octaveDown = 18;
	public static final String[] ruleNames = {
		"tune", "score", "takt", "header", "optionalHeaderInfo", "identifier", 
		"title", "measure", "length", "key", "comment", "note", "singleNote", 
		"beamNote", "annotation", "delimeter", "multiplier", "octaveUp", "octaveDown"
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
	public static class TuneContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTune(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuneContext tune() throws RecognitionException {
		TuneContext _localctx = new TuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			header();
			setState(39);
			score();
			setState(40);
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

	public static class ScoreContext extends ParserRuleContext {
		public List<TaktContext> takt() {
			return getRuleContexts(TaktContext.class);
		}
		public TaktContext takt(int i) {
			return getRuleContext(TaktContext.class,i);
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
		enterRule(_localctx, 2, RULE_score);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				takt();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SingleNote) | (1L << BeamNote) | (1L << BARLINE))) != 0) );
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

	public static class TaktContext extends ParserRuleContext {
		public TerminalNode BARLINE() { return getToken(AbcNotationParser.BARLINE, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public TaktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_takt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitTakt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaktContext takt() throws RecognitionException {
		TaktContext _localctx = new TaktContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_takt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SingleNote || _la==BeamNote) {
				{
				{
				setState(47);
				note();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(BARLINE);
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
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			identifier();
			setState(56);
			title();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MeasureSymbol) | (1L << LengthSymbol) | (1L << CommentSymbol))) != 0)) {
				{
				{
				setState(57);
				optionalHeaderInfo();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public OptionalHeaderInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalHeaderInfo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitOptionalHeaderInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalHeaderInfoContext optionalHeaderInfo() throws RecognitionException {
		OptionalHeaderInfoContext _localctx = new OptionalHeaderInfoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optionalHeaderInfo);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case MeasureSymbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				measure();
				}
				break;
			case LengthSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				length();
				}
				break;
			case CommentSymbol:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				comment();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IdentifierSymbol);
			setState(71);
			match(INT);
			setState(72);
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
		public TerminalNode TitleSymbol() { return getToken(AbcNotationParser.TitleSymbol, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
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
		enterRule(_localctx, 12, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(TitleSymbol);
			setState(75);
			match(STRING);
			setState(76);
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
		public TerminalNode MeasureSymbol() { return getToken(AbcNotationParser.MeasureSymbol, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
		public TerminalNode FRACTION() { return getToken(AbcNotationParser.FRACTION, 0); }
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitMeasure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_measure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(MeasureSymbol);
			setState(83);
			switch (_input.LA(1)) {
			case STRING:
				{
				{
				setState(79);
				match(STRING);
				setState(80);
				match(EXIT_NEWLINE);
				}
				}
				break;
			case FRACTION:
				{
				{
				setState(81);
				match(FRACTION);
				setState(82);
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
		public TerminalNode FRACTION() { return getToken(AbcNotationParser.FRACTION, 0); }
		public TerminalNode NEWLINE() { return getToken(AbcNotationParser.NEWLINE, 0); }
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
		enterRule(_localctx, 16, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LengthSymbol);
			setState(86);
			match(FRACTION);
			setState(87);
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
		public TerminalNode KeySymbol() { return getToken(AbcNotationParser.KeySymbol, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
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
		enterRule(_localctx, 18, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(KeySymbol);
			setState(90);
			match(STRING);
			setState(91);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode CommentSymbol() { return getToken(AbcNotationParser.CommentSymbol, 0); }
		public TerminalNode STRING() { return getToken(AbcNotationParser.STRING, 0); }
		public TerminalNode EXIT_NEWLINE() { return getToken(AbcNotationParser.EXIT_NEWLINE, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CommentSymbol);
			setState(94);
			match(STRING);
			setState(95);
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
		public SingleNoteContext singleNote() {
			return getRuleContext(SingleNoteContext.class,0);
		}
		public BeamNoteContext beamNote() {
			return getRuleContext(BeamNoteContext.class,0);
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
		enterRule(_localctx, 22, RULE_note);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case SingleNote:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				singleNote();
				}
				break;
			case BeamNote:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
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

	public static class SingleNoteContext extends ParserRuleContext {
		public TerminalNode SingleNote() { return getToken(AbcNotationParser.SingleNote, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SingleNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleNote; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitSingleNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleNoteContext singleNote() throws RecognitionException {
		SingleNoteContext _localctx = new SingleNoteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_singleNote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(SingleNote);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << Delimiter) | (1L << OCTAVE_UP) | (1L << OCTAVE_DOWN))) != 0)) {
				{
				{
				setState(102);
				annotation();
				}
				}
				setState(107);
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

	public static class BeamNoteContext extends ParserRuleContext {
		public TerminalNode BeamNote() { return getToken(AbcNotationParser.BeamNote, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
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
		enterRule(_localctx, 26, RULE_beamNote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(BeamNote);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << Delimiter) | (1L << OCTAVE_UP) | (1L << OCTAVE_DOWN))) != 0)) {
				{
				{
				setState(109);
				annotation();
				}
				}
				setState(114);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_annotation);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case Delimiter:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				delimeter();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				multiplier();
				}
				break;
			case OCTAVE_UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				octaveUp();
				}
				break;
			case OCTAVE_DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
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

	public static class DelimeterContext extends ParserRuleContext {
		public TerminalNode Delimiter() { return getToken(AbcNotationParser.Delimiter, 0); }
		public DelimeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimeter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbcNotationParserVisitor ) return ((AbcNotationParserVisitor<? extends T>)visitor).visitDelimeter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimeterContext delimeter() throws RecognitionException {
		DelimeterContext _localctx = new DelimeterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delimeter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(Delimiter);
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
		public TerminalNode INT() { return getToken(AbcNotationParser.INT, 0); }
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
		enterRule(_localctx, 32, RULE_multiplier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(INT);
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
		enterRule(_localctx, 34, RULE_octaveUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		enterRule(_localctx, 36, RULE_octaveDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\6\3.\n\3\r\3\16\3/\3\4\7\4\63"+
		"\n\4\f\4\16\4\66\13\4\3\4\3\4\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5"+
		"\3\5\3\6\3\6\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\5\tV\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\5\rf\n\r\3\16\3\16\7\16j\n\16\f\16\16\16m\13\16\3\17\3\17\7\17"+
		"q\n\17\f\17\16\17t\13\17\3\20\3\20\3\20\3\20\5\20z\n\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\2|\2(\3\2\2\2\4-\3\2\2\2\6\64\3\2\2\2\b9\3\2\2\2\nF\3\2"+
		"\2\2\fH\3\2\2\2\16L\3\2\2\2\20P\3\2\2\2\22W\3\2\2\2\24[\3\2\2\2\26_\3"+
		"\2\2\2\30e\3\2\2\2\32g\3\2\2\2\34n\3\2\2\2\36y\3\2\2\2 {\3\2\2\2\"}\3"+
		"\2\2\2$\177\3\2\2\2&\u0081\3\2\2\2()\5\b\5\2)*\5\4\3\2*+\7\4\2\2+\3\3"+
		"\2\2\2,.\5\6\4\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2"+
		"\2\61\63\5\30\r\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\24\2\28\7\3\2\2\29:\5\f\7\2:>\5"+
		"\16\b\2;=\5\n\6\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>"+
		"\3\2\2\2AB\5\24\13\2B\t\3\2\2\2CG\5\20\t\2DG\5\22\n\2EG\5\26\f\2FC\3\2"+
		"\2\2FD\3\2\2\2FE\3\2\2\2G\13\3\2\2\2HI\7\b\2\2IJ\7\3\2\2JK\7\4\2\2K\r"+
		"\3\2\2\2LM\7\t\2\2MN\7\27\2\2NO\7\26\2\2O\17\3\2\2\2PU\7\n\2\2QR\7\27"+
		"\2\2RV\7\26\2\2ST\7\6\2\2TV\7\4\2\2UQ\3\2\2\2US\3\2\2\2V\21\3\2\2\2WX"+
		"\7\13\2\2XY\7\6\2\2YZ\7\4\2\2Z\23\3\2\2\2[\\\7\f\2\2\\]\7\27\2\2]^\7\26"+
		"\2\2^\25\3\2\2\2_`\7\r\2\2`a\7\27\2\2ab\7\26\2\2b\27\3\2\2\2cf\5\32\16"+
		"\2df\5\34\17\2ec\3\2\2\2ed\3\2\2\2f\31\3\2\2\2gk\7\22\2\2hj\5\36\20\2"+
		"ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\33\3\2\2\2mk\3\2\2\2nr\7\23"+
		"\2\2oq\5\36\20\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\35\3\2\2\2t"+
		"r\3\2\2\2uz\5 \21\2vz\5\"\22\2wz\5$\23\2xz\5&\24\2yu\3\2\2\2yv\3\2\2\2"+
		"yw\3\2\2\2yx\3\2\2\2z\37\3\2\2\2{|\7\7\2\2|!\3\2\2\2}~\7\3\2\2~#\3\2\2"+
		"\2\177\u0080\7\17\2\2\u0080%\3\2\2\2\u0081\u0082\7\20\2\2\u0082\'\3\2"+
		"\2\2\13/\64>FUekry";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}