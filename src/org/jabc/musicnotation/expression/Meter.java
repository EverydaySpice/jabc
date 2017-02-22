package org.jabc.musicnotation.expression;

import org.jabc.musicnotation.tools.Fraction;

/**
 * Created by Willi on 22.02.2017.
 */
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