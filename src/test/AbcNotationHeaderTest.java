package test;
import static org.junit.Assert.assertEquals;

import org.jabc.musicnotation.Fraction;
import org.jabc.musicnotation.Tune;
import org.jabc.parser.grammar.AbcNotationParser;
import org.junit.Test;
/**
 * Created by Willi on 25.11.2016.
 */
public class AbcNotationHeaderTest
{

    private Tune tune;
    public AbcNotationHeaderTest()
    {
        tune = new Tune();
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
        Fraction tuneMeasure = tune.getHeader().getTimeSignature();
        assertEquals(measure, measure);
    }
    @Test
    public void TestTempo() {
        int tempo = 128;
        assertEquals(tempo, tune.getHeader().getTempo());
    }


}
