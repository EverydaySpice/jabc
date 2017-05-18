package test;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jabc.musicnotation.expression.MusicalExpression;
import org.jabc.musicnotation.expression.Rest;
import org.jabc.musicnotation.structure.Bar;
import org.jabc.musicnotation.structure.Voice;
import org.jabc.musicnotation.tools.Accidental;
import org.jabc.musicnotation.tools.Fraction;
import org.jabc.musicnotation.expression.Note;
import org.jabc.musicnotation.structure.Tune;
import org.jabc.musicnotation.tools.Pitch;
import org.jabc.musicnotation.tools.Key;
import org.jabc.parser.grammar.AbcNotationLexer;
import org.jabc.parser.grammar.AbcNotationParser;
import org.jabc.parser.grammar.AbcNotationVisitor;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class AbcNotationNoteValuesTest
{
    private Tune tune;

    public AbcNotationNoteValuesTest()
    {
        String inputFile = "assets/1.abc";
        InputStream is = null;
        try
        {
            is = new FileInputStream(inputFile);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        //is = new FileInputStream(inputFile);
        ANTLRInputStream input = null;
        try
        {
            input = new ANTLRInputStream(is);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        AbcNotationLexer lexer = new AbcNotationLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AbcNotationParser parser = new AbcNotationParser(tokens);

        ParseTree tree = parser.tune(); // parse; start at prog <label id="code.tour.main.6"/>
        AbcNotationVisitor abcParser = new AbcNotationVisitor();
        abcParser.visit(tree);
        tune = abcParser.getTune();

        Pitch a = Pitch.A;
        Accidental sharp = Accidental.SHARP;
        Key key = Key.D;
        int interval = a.getPitch() + key.getIntervalFor(a.ordinal()) + sharp.getInterval();
        System.out.println(interval);
    }

    @Test
    public void testFirstBarRightHand() {
        Bar bar = tune.getVoices().get(0).getBars().get(0);
        Note note1 = (Note) bar.getBeats().get(0).getExpressions().get(0); // should be C duration: whole Note

        Fraction duration = note1.getDuration();

        float ratio = (float) duration.getNumerator() / duration.getDenominator();

        assertEquals(ratio, 1.0f, 0.0f);

        assertEquals(note1.getInterval(), Pitch.C.getPitch());
        assertEquals(note1.getOctave(), 4);
    }

    @Test
    public void testVoiceInfo()
    {
        Voice v = tune.getVoices().get(0);
        assertEquals(v.getName(), "RH");
        Voice v1 = tune.getVoices().get(1);
        assertEquals(v1.getName(), "LH");
    }

    @Test
    public void testThirdBarRightHand() {
        Bar bar = tune.getVoices().get(0).getBars().get(2);

        //zE FG- GEC2
        Rest rest = (Rest) bar.getBeats().get(0).getExpressions().get(0); // Rest with duration 1/8
        Note note1 = (Note) bar.getBeats().get(1).getExpressions().get(0); // should be E duration: 1/8
        Note note2 = (Note) bar.getBeats().get(2).getExpressions().get(0); // should be F duration: 1/8

        Note note3 = (Note) bar.getBeats().get(3).getExpressions().get(0); // should be G duration: 1/8
        Note note4 = (Note) bar.getBeats().get(4).getExpressions().get(0); // should be G duration: 1/8

        Note note5 = (Note) bar.getBeats().get(5).getExpressions().get(0); // should be E duration: 1/8
        Note note6 = (Note) bar.getBeats().get(6).getExpressions().get(0); // should be C duration: 2/8

        // Check duration
        assertEquals(rest.getDuration().getRational(),  1.f / 8.f, 0.0f);
        assertEquals(note1.getDuration().getRational(),  1.f / 8.f, 0.0f);
        assertEquals(note2.getDuration().getRational(),  1.f / 8.f, 0.0f);
        assertEquals(note3.getDuration().getRational(),  1.f / 8.f, 0.0f);
        assertEquals(note4.getDuration().getRational(),  1.f / 8.f, 0.0f);
        assertEquals(note5.getDuration().getRational(),  1.f / 8.f, 0.0f);
        assertEquals(note6.getDuration().getRational(),  2.f / 8.f, 0.0f);

        // Check pitch
        assertEquals(rest.getType(), MusicalExpression.ExpressionType.REST);

        assertEquals(note1.getInterval(), Pitch.E.getPitch());
        assertEquals(note1.getOctave(), 4);

        assertEquals(note2.getInterval(), Pitch.F.getPitch());
        assertEquals(note2.getOctave(), 4);

        assertEquals(note3.getInterval(), Pitch.G.getPitch());
        assertEquals(note3.getOctave(), 4);

        assertEquals(note4.getInterval(), Pitch.G.getPitch());
        assertEquals(note4.getOctave(), 4);

        assertEquals(note5.getInterval(), Pitch.E.getPitch());
        assertEquals(note5.getOctave(), 4);

        assertEquals(note6.getInterval(), Pitch.C.getPitch());
        assertEquals(note6.getOctave(), 4);

    }

    @Test
    public void testFirstBarLeftHand() {
        Bar bar = tune.getVoices().get(1).getBars().get(0);

        Note note1 = (Note) bar.getBeats().get(0).getExpressions().get(0); // should be C duration: 3/8
        Note note12 = (Note) bar.getBeats().get(0).getExpressions().get(1); // should be G duration: 3/8

        Note note2 = (Note) bar.getBeats().get(1).getExpressions().get(0); // should be C# duration: 1/8
        Note note22 = (Note) bar.getBeats().get(1).getExpressions().get(1); // should be Gb duration: 1/8

        Note note3 = (Note) bar.getBeats().get(2).getExpressions().get(0); // should be C duration: 4/8
        Note note32 = (Note) bar.getBeats().get(2).getExpressions().get(1); // should be Gb duration: 4/8

        // Check duration
        assertEquals(note1.getDuration().getRational(),  3.f / 8.f, 0.0f);
        assertEquals(note12.getDuration().getRational(),  3.f / 8.f, 0.0f);
        assertEquals(note2.getDuration().getRational(),  1.f / 8.f, 0.0f);
        assertEquals(note22.getDuration().getRational(),  1.f / 8.f, 0.0f);
        assertEquals(note3.getDuration().getRational(),  4.f / 8.f, 0.0f);
        assertEquals(note32.getDuration().getRational(),  4.f / 8.f, 0.0f);

        // Check pitch
        assertEquals(note1.getInterval(), Pitch.C.getPitch());
        assertEquals(note1.getOctave(), 3);

        assertEquals(note12.getInterval(), Pitch.G.getPitch());
        assertEquals(note12.getOctave(), 3);

        assertEquals(note2.getInterval(), Pitch.C.getPitch()+1);
        assertEquals(note2.getOctave(), 3);

        assertEquals(note22.getInterval(), Pitch.G.getPitch()-1);
        assertEquals(note22.getOctave(), 3);

        assertEquals(note3.getInterval(), Pitch.C.getPitch());
        assertEquals(note3.getOctave(), 3);

        assertEquals(note32.getInterval(), Pitch.G.getPitch());
        assertEquals(note32.getOctave(), 3);
    }

}
