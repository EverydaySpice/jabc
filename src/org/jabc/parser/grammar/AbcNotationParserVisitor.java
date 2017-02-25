// Generated from AbcNotationParser.g4 by ANTLR 4.5.3
package org.jabc.parser.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbcNotationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbcNotationParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#fraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraction(AbcNotationParser.FractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AbcNotationParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#endOfLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfLine(AbcNotationParser.EndOfLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#voiceInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoiceInfo(AbcNotationParser.VoiceInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#voice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoice(AbcNotationParser.VoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#tune}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTune(AbcNotationParser.TuneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#score}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScore(AbcNotationParser.ScoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#bar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBar(AbcNotationParser.BarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#endOfBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfBar(AbcNotationParser.EndOfBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#barline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBarline(AbcNotationParser.BarlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#simpleBarline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleBarline(AbcNotationParser.SimpleBarlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#thinThinBarline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThinThinBarline(AbcNotationParser.ThinThinBarlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#thikThinBarline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThikThinBarline(AbcNotationParser.ThikThinBarlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#thinThikBarline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThinThikBarline(AbcNotationParser.ThinThikBarlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#startOfRepeatedBarline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartOfRepeatedBarline(AbcNotationParser.StartOfRepeatedBarlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#endOfRepeatedBarline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfRepeatedBarline(AbcNotationParser.EndOfRepeatedBarlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#startAndEndOfRepeatedBarline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartAndEndOfRepeatedBarline(AbcNotationParser.StartAndEndOfRepeatedBarlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#suppresScoreLinebreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuppresScoreLinebreak(AbcNotationParser.SuppresScoreLinebreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AbcNotationParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AbcNotationParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(AbcNotationParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#meter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeter(AbcNotationParser.MeterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(AbcNotationParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(AbcNotationParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#notes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotes(AbcNotationParser.NotesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#composer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposer(AbcNotationParser.ComposerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo(AbcNotationParser.TempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#fractionTempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFractionTempo(AbcNotationParser.FractionTempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#stringTempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTempo(AbcNotationParser.StringTempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#stringQuotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringQuotation(AbcNotationParser.StringQuotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#integerTempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerTempo(AbcNotationParser.IntegerTempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#musicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMusicalExpression(AbcNotationParser.MusicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(AbcNotationParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#multipleNotes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleNotes(AbcNotationParser.MultipleNotesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest(AbcNotationParser.RestContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#noteExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteExpression(AbcNotationParser.NoteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#beamNote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeamNote(AbcNotationParser.BeamNoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#noBeamNote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoBeamNote(AbcNotationParser.NoBeamNoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#decoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoration(AbcNotationParser.DecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#noteLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteLength(AbcNotationParser.NoteLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#noteOctave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteOctave(AbcNotationParser.NoteOctaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#accidental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccidental(AbcNotationParser.AccidentalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#slurStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlurStart(AbcNotationParser.SlurStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#slurEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlurEnd(AbcNotationParser.SlurEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#inlineField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineField(AbcNotationParser.InlineFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#meterChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeterChange(AbcNotationParser.MeterChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#lengthChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthChange(AbcNotationParser.LengthChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#keyChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyChange(AbcNotationParser.KeyChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#tempoChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempoChange(AbcNotationParser.TempoChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#flat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlat(AbcNotationParser.FlatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#sharp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharp(AbcNotationParser.SharpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#natural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatural(AbcNotationParser.NaturalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#tiedNote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiedNote(AbcNotationParser.TiedNoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#delimeter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimeter(AbcNotationParser.DelimeterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#multiplier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplier(AbcNotationParser.MultiplierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#octaveUp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveUp(AbcNotationParser.OctaveUpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#octaveDown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveDown(AbcNotationParser.OctaveDownContext ctx);
}