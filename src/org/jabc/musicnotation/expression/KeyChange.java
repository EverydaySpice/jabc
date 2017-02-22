package org.jabc.musicnotation.expression;

import org.jabc.musicnotation.tools.Key;


public class KeyChange implements MusicalExpression
{
    public Key key;

    public KeyChange(Key key)
    {
        this.key = key;
    }

    @Override
    public ExpressionType getType()
    {
        return ExpressionType.KEY;
    }
}
