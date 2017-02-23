package test;
import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jabc.musicnotation.tools.Fraction;
import org.jabc.musicnotation.expression.Tempo;
import org.jabc.musicnotation.structure.Tune;
import org.jabc.parser.grammar.AbcNotationLexer;
import org.jabc.parser.grammar.AbcNotationParser;
import org.jabc.parser.grammar.AbcNotationVisitor;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class AbcNotationHeaderTest
{

    private Tune tune;
    public AbcNotationHeaderTest()
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
    public void TestTitle() {
        String title1 = tune.getHeader().getTitle(0);
        String title2 = tune.getHeader().getTitle(1);
        assertEquals(title1, "Song for a guy");
        assertEquals(title2, "Sample tune - abcm2ps (voices.abc)");
    }

    @Test
    public void TestVoiceNames() {
        String name1 = tune.getVoices().get(0).getName();
        String name2 = tune.getVoices().get(1).getName();
        assertEquals("RH", name1);
        assertEquals("LH", name2);
    }

    @Test
    public void TestKey() {
        String key = tune.getHeader().getKey();
        assertEquals("C", key);
    }
    @Test
    public void TestStandardNoteLength() {
        Fraction fraction = new Fraction(1,8);
        Fraction tuneFraction = tune.getHeader().getStandardNoteLength();
        assertEquals(fraction, tuneFraction);
    }
    @Test
    public void TestIdentifier() {
        int identifier = tune.getHeader().getIdentifier();
        assertEquals(1, identifier);
    }
    @Test
    public void TestComposer() {
        String composer = tune.getHeader().getComposer();
        assertEquals(composer, "Elton John");
    }
    @Test
    public void TestMeasure() {
        Fraction measure = new Fraction(4,4);
        Fraction tuneMeasure = tune.getHeader().getTimeSignature().beat;
        assertEquals(tuneMeasure, measure);
    }
    @Test
    public void TestTempo()
    {
        Tempo t = tune.getHeader().getTempo();
        String annotation = t.getAnnotation();
        assertEquals("langsam", annotation);

        ArrayList<Fraction> beatList = t.getBeat();
        Fraction f = beatList.get(0);
        assertEquals(new Fraction(1,4), f);
        Fraction f2 = beatList.get(1);
        assertEquals(new Fraction(3,8), f2);
        Fraction f3 = beatList.get(2);
        assertEquals(new Fraction(1,4), f3);

        assertEquals(128, t.getTempo());

    }


}
