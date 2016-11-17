// Generated from AbcNotation.g4 by ANTLR 4.5.3
package org.jabc.parser.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbcNotationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbcNotationVisitor<T> extends ParseTreeVisitor<T> {
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
	 * Visit a parse tree produced by {@link AbcNotationParser#takt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTakt(AbcNotationParser.TaktContext ctx);
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
	 * Visit a parse tree produced by {@link AbcNotationParser#measure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasure(AbcNotationParser.MeasureContext ctx);
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
	 * Visit a parse tree produced by {@link AbcNotationParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AbcNotationParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#optionalHeaderInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalHeaderInfo(AbcNotationParser.OptionalHeaderInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(AbcNotationParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shortenNoteLength}
	 * labeled alternative in {@link AbcNotationParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortenNoteLength(AbcNotationParser.ShortenNoteLengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplier}
	 * labeled alternative in {@link AbcNotationParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplier(AbcNotationParser.MultiplierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code octaveDown}
	 * labeled alternative in {@link AbcNotationParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveDown(AbcNotationParser.OctaveDownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code octaveUp}
	 * labeled alternative in {@link AbcNotationParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveUp(AbcNotationParser.OctaveUpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcNotationParser#delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiter(AbcNotationParser.DelimiterContext ctx);
}