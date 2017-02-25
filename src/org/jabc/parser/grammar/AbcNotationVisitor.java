package org.jabc.parser.grammar;

import org.jabc.musicnotation.expression.*;
import org.jabc.musicnotation.structure.*;
import org.jabc.musicnotation.tools.Accidental;
import org.jabc.musicnotation.tools.DurationExpression;
import org.jabc.musicnotation.tools.Fraction;

import java.util.ArrayList;

public class AbcNotationVisitor extends AbcNotationParserBaseVisitor
{

    private Fraction m_standardNoteLength;
    private Tune m_tune;

    private void initStandardValues()
    {
        m_standardNoteLength = new Fraction(1,8);
    }
    public AbcNotationVisitor()
    {

    }

    public Tune getTune()
    {
        return m_tune;
    }

    @Override
    public String visitBeamNote(AbcNotationParser.BeamNoteContext ctx)
    {
        return ctx.noteString.getText();
    }

    @Override
    public String visitNoBeamNote(AbcNotationParser.NoBeamNoteContext ctx)
    {
        return ctx.noteString.getText();
    }

    @Override
    public Tune visitTune(AbcNotationParser.TuneContext ctx)
    {
        initStandardValues();
        m_tune = new Tune();

        //parse header:
        TuneHeader header = visitHeader(ctx.header());
        m_tune.setHeader(header);
        // parse voices:
        for(AbcNotationParser.VoiceContext c : ctx.voice())
        {
            Voice v = visitVoice(c);
            m_tune.getVoices().add(v);
        }
        return null;
    }

    @Override
    public Voice visitVoice(AbcNotationParser.VoiceContext ctx)
    {
        String voiceName="";
        if (ctx.voiceInfo() != null)
        {
            voiceName = visitVoiceInfo(ctx.voiceInfo());
        }

        ArrayList<Bar> bars = visitScore(ctx.score());

        Voice voice = new Voice(voiceName, bars);

        return voice;
    }

    @Override
    public ArrayList<Bar> visitScore(AbcNotationParser.ScoreContext ctx)
    {
        ArrayList<Bar> barList = new ArrayList<Bar>();

        for (AbcNotationParser.BarContext c : ctx.bar())
        {
            barList.add(visitBar(c));
        }

        return barList;
    }

    @Override
    public Bar visitBar(AbcNotationParser.BarContext ctx)
    {
        Bar bar = new Bar();

        Beat beat = new Beat(m_standardNoteLength);
        for (AbcNotationParser.MusicalExpressionContext c : ctx.musicalExpression())
        {
            ArrayList<MusicalExpression> musicalExpressions =  visitMusicalExpression(c);
            beat.getExpressions().addAll(musicalExpressions);

            // add all Expressions if the current (parsed) one is a NOTE or REST. Only these two
            // types have a duration. The shortest of their duration (if there are multiple notes)
            // defines the duration of the beat.
            MusicalExpression.ExpressionType t = musicalExpressions.get(0).getType();
            if (t == MusicalExpression.ExpressionType.NOTE
                | t == MusicalExpression.ExpressionType.REST    )
            {
                Fraction shortestDuration = null;
                for (MusicalExpression exp :  musicalExpressions)
                {
                    DurationExpression d = (DurationExpression) exp;
                    if (shortestDuration != null && d.getDuration().getRational() < shortestDuration.getRational())
                    {
                        shortestDuration = d.getDuration();
                    }
                }
                beat.setDuration(shortestDuration);
                bar.addBeat(beat);
                beat = new Beat(m_standardNoteLength);
            }
        }
        return bar;
    }

    @Override
    public ArrayList<MusicalExpression> visitDecoration(AbcNotationParser.DecorationContext ctx)
    {
        String decorationString = (ctx.Decoration().getText());

        Decoration decoration = new Decoration(decorationString.substring(1, decorationString.length()-1));
        ArrayList<MusicalExpression> musicalExpressions =  new ArrayList<>(1);
        musicalExpressions.add(decoration);
        return musicalExpressions;
    }

    @Override
    public ArrayList<MusicalExpression> visitMusicalExpression(AbcNotationParser.MusicalExpressionContext ctx)
    {
        return (ArrayList<MusicalExpression>) visitChildren(ctx);
    }

    @Override
    public String visitVoiceInfo(AbcNotationParser.VoiceInfoContext ctx)
    {
        return ctx.text.getText();
    }

    @Override
    public TuneHeader visitHeader(AbcNotationParser.HeaderContext ctx)
    {
        TuneHeader header = new TuneHeader();

        // parse title(s)
        for (AbcNotationParser.TitleContext c : ctx.title())
        {
            header.addTitle(visitTitle(c));
        }
        // parse identifier
        header.setIdentifier(visitIdentifier(ctx.identifier()));
        // parse key
        header.setKey(visitKey(ctx.key()));

        // parse compoesr
        if (ctx.composer() != null)
            header.setComposer(visitComposer(ctx.composer().get(0)));

        // parse length
        if (ctx.length() != null)
            header.setStandardNoteLength(visitLength(ctx.length().get(0)));

        // parse length
        if (ctx.length() != null)
            header.setStandardNoteLength(visitLength(ctx.length().get(0)));

        // parse meter
        if (ctx.meter() != null)
            header.setTimeSignature(visitMeter(ctx.meter().get(0)));

        // parse tempo
        if (ctx.tempo() != null)
            header.setTempo(visitTempo(ctx.tempo().get(0)));

        return header;
    }

    @Override
    public Tempo visitStringTempo(AbcNotationParser.StringTempoContext ctx)
    {
        String tempoAnnotation = visitStringQuotation(ctx.stringQuotation());
        ArrayList<Fraction> beatList = new ArrayList<Fraction>(1);
        beatList.add(new Fraction(1,4));
        Tempo tempo = new Tempo(beatList, 100);
        tempo.setAnnotation(tempoAnnotation);

        return tempo;
    }

    @Override
    public Tempo visitFractionTempo(AbcNotationParser.FractionTempoContext ctx)
    {
        ArrayList<Fraction> beatList = new ArrayList<Fraction>(ctx.fraction().size());
        for (AbcNotationParser.FractionContext frc : ctx.fraction())
        {
            Fraction f = visitFraction(frc);
            beatList.add(f);
        }
        int speed = Integer.valueOf(ctx.INT().getText());
        Tempo tempo = new Tempo(beatList, speed);

        String tempoAnnotation = "";
        for (AbcNotationParser.StringQuotationContext sctx : ctx.stringQuotation())
        {
            tempoAnnotation += visitStringQuotation(sctx);
        }
        tempo.setAnnotation(tempoAnnotation);

        return tempo;
    }

    @Override
    public Tempo visitIntegerTempo(AbcNotationParser.IntegerTempoContext ctx)
    {
        int speed = Integer.valueOf(ctx.INT().getText());
        ArrayList<Fraction> beatList = new ArrayList<Fraction>(1);
        beatList.add(new Fraction(1,4));
        Tempo tempo = new Tempo(beatList, speed);

        String tempoAnnotation = "";
        for (AbcNotationParser.StringQuotationContext sctx : ctx.stringQuotation())
        {
            tempoAnnotation += visitStringQuotation(sctx);
        }
        tempo.setAnnotation(tempoAnnotation);

        return tempo;
    }

    @Override
    public Tempo visitTempo(AbcNotationParser.TempoContext ctx)
    {
        if (ctx.fractionTempo() != null)
        return visitFractionTempo(ctx.fractionTempo());
        else if (ctx.integerTempo() != null)
            return visitIntegerTempo(ctx.integerTempo());
        else
            return visitStringTempo(ctx.stringTempo());
    }

    @Override
    public Meter visitMeter(AbcNotationParser.MeterContext ctx)
    {
        if (ctx.fraction() != null)
        {
            return new Meter(visitFraction(ctx.fraction()));
        }
        else
        {
            String s = ctx.NOTE().getText();
            if (s.equals("|C"))
            {
                return new Meter(new Fraction(2,2));
            }
            else
            {
                return new Meter(new Fraction(4,4));
            }
        }
    }

    @Override
    public Fraction visitLength(AbcNotationParser.LengthContext ctx)
    {
        return visitFraction(ctx.fraction());
    }

    @Override
    public String visitComposer(AbcNotationParser.ComposerContext ctx)
    {
        return visitString(ctx.string());
    }

    @Override
    public String visitKey(AbcNotationParser.KeyContext ctx)
    {
        return visitString(ctx.string());
    }

    @Override
    public Integer visitIdentifier(AbcNotationParser.IdentifierContext ctx)
    {
        return Integer.valueOf(ctx.text.getText());
    }

    @Override
    public String visitTitle(AbcNotationParser.TitleContext ctx)
    {
        return visitString(ctx.string());
    }

    @Override
    public String visitString(AbcNotationParser.StringContext ctx)
    {
        return ctx.text.getText();
    }

    @Override
    public String visitStringQuotation(AbcNotationParser.StringQuotationContext ctx)
    {
        return visitString(ctx.string());
    }

    @Override
    public String visitFlat(AbcNotationParser.FlatContext ctx)
    {
        return "FLAT";
    }
    @Override
    public String visitNatural(AbcNotationParser.NaturalContext ctx)
    {
        return "NATURAL";
    }
    @Override
    public String visitSharp(AbcNotationParser.SharpContext ctx)
    {
        return "SHARP";
    }

    @Override
    public Accidental visitAccidental(AbcNotationParser.AccidentalContext ctx)
    {
        if (ctx == null)
            return Accidental.NATURAL;

        Accidental accidental = Accidental.NATURAL;
        for (int i = 0; i < ctx.getChildCount(); i++)
        {
            String accidentalString = (String) visitChildren(ctx);
            if (accidental.toString().equals(accidentalString)
                    && !accidentalString.equals(Accidental.NATURAL.toString()))
            {
                accidentalString = "DOUBLE_" + accidentalString;
                accidental = Accidental.valueOf(accidentalString);
            }
            else
            {
                accidental = Accidental.valueOf(accidentalString);
            }
        }
        return accidental;
    }

    @Override
    public String visitNoteExpression(AbcNotationParser.NoteExpressionContext ctx)
    {
        return (String) visitChildren(ctx);
    }

    @Override
    public Fraction visitMultiplier(AbcNotationParser.MultiplierContext ctx)
    {
        int numerator = Integer.valueOf(ctx.numerator.getText());
        return new Fraction(numerator, 1);
    }

    @Override
    public Fraction visitDelimeter(AbcNotationParser.DelimeterContext ctx)
    {
        int denominator = Integer.valueOf(ctx.denominator.getText());
        return new Fraction(1, denominator);
    }

    @Override
    public Fraction visitNoteLength(AbcNotationParser.NoteLengthContext ctx)
    {
        Fraction f = (Fraction) visitChildren(ctx);
        if (f == null)
        {
            return m_standardNoteLength;
        }
        else
        {
            return f.multiply(m_standardNoteLength);
        }
    }

    @Override
    public Integer visitNoteOctave(AbcNotationParser.NoteOctaveContext ctx)
    {
        int octaveChange = 0;

        for(AbcNotationParser.OctaveDownContext c : ctx.octaveDown())
        {
            octaveChange--;
        }
        for(AbcNotationParser.OctaveUpContext c : ctx.octaveUp())
        {
            octaveChange++;
        }

        return octaveChange;
    }

    @Override
    public ArrayList<MusicalExpression> visitNote(AbcNotationParser.NoteContext ctx)
    {
        ArrayList<MusicalExpression> expressions = new ArrayList<>(1);
        // parse length of note:
        Fraction noteLength = visitNoteLength(ctx.noteLength());

        // parse note pitch:
        String noteString = visitNoteExpression(ctx.noteExpression());

        //parse octave:
        int octaveChange = visitNoteOctave(ctx.noteOctave());

        //parse Accidental:
        Accidental accidental = visitAccidental(ctx.accidental());

        // create Note and set values:
        Note note = new Note(noteString, noteLength);
        note.setAccidental(accidental);
        note.setOctave(note.getOctave() + octaveChange);

        System.out.println(note);
        expressions.add(note);
        return expressions;
    }

    @Override
    public ArrayList<MusicalExpression> visitMultipleNotes(AbcNotationParser.MultipleNotesContext ctx)
    {
        ArrayList<MusicalExpression> noteList = new ArrayList<MusicalExpression>();

        for (AbcNotationParser.NoteContext c : ctx.note())
        {
            noteList.addAll(visitNote(c));
        }
        return noteList;
    }

    @Override
    public ArrayList<MusicalExpression> visitRest(AbcNotationParser.RestContext ctx)
    {
        ArrayList<MusicalExpression> expressions = new ArrayList<>(1);
        Fraction restLength = visitNoteLength(ctx.noteLength());
        Rest rest = new Rest(restLength);
        expressions.add(rest);
        return expressions;
    }

    @Override public Fraction visitFraction(AbcNotationParser.FractionContext ctx)
    {
        int numerator = Integer.valueOf(ctx.numerator.getText());
        int denominator = Integer.valueOf(ctx.denominator.getText());
        Fraction fraction = new Fraction(numerator, denominator);
        System.out.println(fraction);
        return fraction;
    }
}
