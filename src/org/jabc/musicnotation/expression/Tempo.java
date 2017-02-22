package org.jabc.musicnotation.expression;

import org.jabc.musicnotation.expression.MusicalExpression;
import org.jabc.musicnotation.tools.Fraction;

import java.util.ArrayList;

/**
 * Created by Willi on 30.11.2016.
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