package org.jabc.musicnotation.expression;

import org.jabc.musicnotation.expression.MusicalExpression;
import org.jabc.musicnotation.tools.Fraction;

/**
 * Created by Willi on 29.11.2016.
 */
public class Rest implements MusicalExpression
{
    private Fraction duration;
    private ExpressionType m_type;
    public Rest(Fraction duration)
    {
        this.m_type = ExpressionType.REST;
        this.duration = duration;
    }

    public Fraction getDuration()
    {
        return duration;
    }
    public void setDuration(Fraction duration)
    {
        this.duration = duration;
    }

    @Override
    public ExpressionType getType()
    {
        return m_type;
    }
}
