package org.jabc.musicnotation.structure;

import org.jabc.musicnotation.expression.MusicalExpression;
import org.jabc.musicnotation.expression.Note;
import org.jabc.musicnotation.tools.Fraction;

import java.util.ArrayList;

public class Beat
{
    private final ArrayList<MusicalExpression> m_expressions;
    private Fraction m_duration;

    public Beat(Fraction duration)
    {
        m_expressions = new ArrayList<>();
        m_duration = duration;
    }

    public void addExpression(MusicalExpression m)
    {
        m_expressions.add(m);
    }

    public ArrayList<MusicalExpression> getExpressions()
    {
        return m_expressions;
    }

    public Fraction getDuration()
    {
        return m_duration;
    }

    public void setDuration(Fraction m_duration)
    {
        this.m_duration = m_duration;
    }

}
