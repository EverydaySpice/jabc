package org.jabc.parser;

import org.jabc.musicnotation.*;
import org.jabc.parser.grammar.AbcNotationParserBaseVisitor;
import org.jabc.parser.grammar.AbcNotationParser;

/**
 * Created by Willi on 30.10.2016.
 */
public class AbcParser extends AbcNotationParserBaseVisitor<Tune>
{
    private Tune tune;
    private Bar currentBar;
    private Beat currentBeat;
    private Note currentNote;

    public AbcParser()
    {
        this.tune = new Tune();
    }

    public Tune getTune()
    {
        return tune;
    }


    @Override
    public Tune visitHeader(AbcNotationParser.HeaderContext ctx)
    {
        super.visitHeader(ctx);
        tune.setStandardNoteLength(new Fraction(1,4));
        tune.setTimeSignature(new Fraction(4,4));
        return null;
    }

//    @Override
//    public Tune visitLength(AbcNotationParser.LengthContext ctx)
//    {
//        super.visitLength(ctx);
//        tune.setStandardNoteLength(ctx.FRACTION());
//        return null;
//    }
//
//    @Override
//    public Tune visitMeasure(AbcNotationParser.MeasureContext ctx)
//    {
//        super.visitMeasure(ctx);
//        System.out.println("MEASURE IS NOT IMPLEMENTED YET!");
//        return null;
//    }
//
//    @Override
//    public Tune visitKey(AbcNotationParser.KeyContext ctx)
//    {
//        super.visitKey(ctx);
//        tune.setKey(ctx.keyString.getText());
//        return null;
//    }
//
//    public Tune visitIdentifier(AbcNotationParser.IdentifierContext ctx)
//    {
//        super.visitIdentifier(ctx);
//        System.out.println("IDENTIFIER IS NOT IMPLEMENTED YET!");
//        return null;
//    }
//
//    public Tune visitTitle(AbcNotationParser.TitleContext ctx)
//    {
//        super.visitTitle(ctx);
//
//        tune.setTitle(ctx.titleString.getText());
//        return null;
//    }

    @Override
    public Tune visitTune(AbcNotationParser.TuneContext ctx)
    {
        super.visitTune(ctx);

        return null;
    }

    @Override
    public Tune visitTakt(AbcNotationParser.TaktContext ctx)
    {

        Bar bar = new Bar();
        tune.addBar(bar);
        currentBar = bar;
        super.visitTakt(ctx);
        return null;
    }

//    @Override
//    public Tune visitSingleNote(AbcNotationParser.SingleNoteContext ctx)
//    {
//        Beat beat = new Beat(tune.getStandardNoteLength());
//        currentBar.addBeat(beat);
//        currentBeat = beat;
//        String noteName = ctx.noteString.getText();
//        Note note = new Note(1,1, tune.getStandardNoteLength());
//        try
//        {
//            AbcParserHelper.parseNote(noteName, note);
//            currentNote = note;
//            beat.addNote(note);
//        } catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        super.visitSingleNote(ctx);
//        return null;
//
//    }
//    @Override
//    public Tune visitBarNote(AbcNotationParser.BarNoteContext ctx)
//    {
//        Beat beat = new Beat(tune.getStandardNoteLength());
//        currentBar.addBeat(beat);
//        currentBeat = beat;
//        String noteName = ctx.noteString.getText();
//        Note note = new Note(1,1, tune.getStandardNoteLength());
//        try
//        {
//            AbcParserHelper.parseNote(noteName, note);
//            currentNote = note;
//            beat.addNote(note);
//        } catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        super.visitBarNote(ctx);
//        return null;
//    }

    @Override
    public Tune visitNote(AbcNotationParser.NoteContext ctx)
    {
        super.visitNote(ctx);
        return null;
    }

//    @Override
//    public Tune visitDelimiter(AbcNotationParser.DelimiterContext ctx)
//    {
//        int factor = Integer.valueOf(ctx.factor.getText());
//        Fraction fraction = new Fraction(currentBeat.getDuration().getNnumerator(), currentBeat.getDuration().getDenominator() * factor);
//        currentBeat.setDuration(fraction);
//        return super.visitDelimiter(ctx);
//    }
//
//    @Override
//    public Tune visitMultiplier(AbcNotationParser.MultiplierContext ctx)
//    {
//        int factor = Integer.valueOf(ctx.getText());
//        Fraction fraction = new Fraction(currentBeat.getDuration().getNnumerator() * factor, currentBeat.getDuration().getDenominator());
//        currentBeat.setDuration(fraction);
//        return super.visitMultiplier(ctx);
//    }
//
//    @Override
//    public Tune visitOctaveDown(AbcNotationParser.OctaveDownContext ctx)
//    {
//        currentNote.setOctave(currentNote.getOctave()-1);
//        return super.visitOctaveDown(ctx);
//    }
//
//    @Override
//    public Tune visitOctaveUp(AbcNotationParser.OctaveUpContext ctx)
//    {
//        currentNote.setOctave(currentNote.getOctave()+1);
//        return super.visitOctaveUp(ctx);
//    }
}
