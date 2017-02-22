package test;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jabc.musicnotation.structure.Bar;
import org.jabc.musicnotation.tools.Fraction;
import org.jabc.musicnotation.expression.Note;
import org.jabc.musicnotation.structure.Tune;
import org.jabc.parser.grammar.AbcNotationLexer;
import org.jabc.parser.grammar.AbcNotationParser;
import org.jabc.parser.grammar.AbcNotationVisitor;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by Willi on 25.11.2016.
 */
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
    }

    @Test
    public void testFirstBarRightHand() {
        Bar bar = tune.getVoices().get(0).getBars().get(0);
        Note note1 = (Note) bar.getBeats().get(0).getNotes().get(0); // should be C duration: whole Note
        Note note2 = (Note) bar.getBeats().get(0).getNotes().get(1); // should be E

        Fraction duration = note1.getDuration();
        Fraction duration2 = note2.getDuration();
        float ratio = (float) duration.getNumerator() / duration.getDenominator();
        float ratio2 = (float) duration2.getNumerator() / duration2.getDenominator();
        assertEquals(ratio, 1.0f, 0.0f);
        assertEquals(ratio2, 1.0f, 0.0f);

        assertEquals(note1.getInterval(), 1);
        assertEquals(note1.getOctave(), 4);
        assertEquals(note2.getInterval(), 3);
        assertEquals(note2.getOctave(), 4);
    }

    // [B,3E3][B,D]- [B,4D4]
    @Test
    public void testThirdBarRightHand() {
        Bar bar = tune.getVoices().get(0).getBars().get(2);
        Note note1 = (Note) bar.getBeats().get(0).getNotes().get(0); // should be B duration: 3/8
        Note note2 = (Note) bar.getBeats().get(0).getNotes().get(1); // should be E

        Note note3 = (Note) bar.getBeats().get(1).getNotes().get(0); // should be B duration: 1/8
        Note note4 = (Note) bar.getBeats().get(1).getNotes().get(1); // should be D

        Note note5 = (Note) bar.getBeats().get(2).getNotes().get(0); // should be B duration: 4/8
        Note note6 = (Note) bar.getBeats().get(2).getNotes().get(1); // should be D

        Fraction duration = note1.getDuration();
        Fraction duration2 = note2.getDuration();
        float ratio = (float) duration.getNumerator() / duration.getDenominator();
        float ratio2 = (float) duration2.getNumerator() / duration2.getDenominator();
        assertEquals(ratio, 3.f / 8.f, 0.0f);
        assertEquals(ratio2,  3.f / 8.f, 0.0f);

        Fraction duration3 = note3.getDuration();
        Fraction duration4 = note4.getDuration();
        float ratio3 = (float) duration3.getNumerator() / duration3.getDenominator();
        float ratio4 = (float) duration4.getNumerator() / duration4.getDenominator();
        assertEquals(ratio3, 1.f / 8.f, 0.0f);
        assertEquals(ratio4,  1.f / 8.f, 0.0f);

        Fraction duration5 = note5.getDuration();
        Fraction duration6 = note6.getDuration();
        float ratio5 = (float) duration3.getNumerator() / duration3.getDenominator();
        float ratio6 = (float) duration4.getNumerator() / duration4.getDenominator();
        assertEquals(ratio3, 4.f / 8.f, 0.0f);
        assertEquals(ratio4,  4.f / 8.f, 0.0f);

        assertEquals(note1.getInterval(), 7);
        assertEquals(note1.getOctave(), 3);
        assertEquals(note2.getInterval(), 2);
        assertEquals(note2.getOctave(), 4);

        assertEquals(note3.getInterval(), 7);
        assertEquals(note3.getOctave(), 3);
        assertEquals(note4.getInterval(), 3);
        assertEquals(note4.getOctave(), 4);

        assertEquals(note5.getInterval(), 7);
        assertEquals(note5.getOctave(), 3);
        assertEquals(note6.getInterval(), 3);
        assertEquals(note6.getOctave(), 4);

    }


}
