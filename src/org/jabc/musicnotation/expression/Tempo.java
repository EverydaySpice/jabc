package org.jabc.musicnotation.expression;

import org.jabc.musicnotation.expression.MusicalExpression;
import org.jabc.musicnotation.tools.Fraction;

import java.util.ArrayList;
/**
 * Represents a tempo instruction. Can be in various styles like:
 * 1/4 = 100 "moderate"  or:
 * "fast" 1/8 = 65 or:
 * 2/8 3/8 3/8 = 100 or just:
 * 100
 */
public class Tempo implements MusicalExpression
{
    private ArrayList<Fraction> beat;
    private int tempo;
    private String annotation;
    private ExpressionType m_type;
    public Tempo(ArrayList<Fraction> beat, int tempo)
    {
        m_type = ExpressionType.TEMPO;
        this.beat = beat;
        this.tempo = tempo;
        annotation = "";
    }

    public String getAnnotation()
    {
        return annotation;
    }

    public void setAnnotation(String annotation)
    {
        this.annotation = annotation;
    }

    /**
     * @return tempo Tempo in beats per minute (BPM)
     */
    public int getTempo()
    {
        return tempo;
    }

    public void setTempo(int tempo)
    {
        this.tempo = tempo;
    }

    public ArrayList<Fraction> getBeat()
    {
        return beat;
    }

    public void setBeat(ArrayList<Fraction> beat)
    {
        this.beat = beat;
    }

    @Override
    public ExpressionType getType()
    {
        return m_type;
    }
}
