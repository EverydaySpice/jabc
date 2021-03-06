package org.jabc.musicnotation.expression;

import org.jabc.musicnotation.tools.Fraction;
/**
 * Represents a rest. Just like a note, a rest can have a duration.
 */
public class Rest implements MusicalExpression, DurationExpression
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
