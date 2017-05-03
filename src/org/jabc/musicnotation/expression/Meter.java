package org.jabc.musicnotation.expression;

import org.jabc.musicnotation.tools.Fraction;

public class Meter implements MusicalExpression
{
    public Fraction beat;
    public Meter(Fraction beat)
    {
        this.beat = beat;
    }

    @Override
    public ExpressionType getType()
    {
        return ExpressionType.METER;
    }
}