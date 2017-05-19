package org.jabc.musicnotation.expression;
/**
 * Represents a musical decoration like dynamic instruction ("forte").
 * Currently there is only a string that contains the instruction in text-form.
 * Would be cool to add an enum that stores the different types of decorations.
 */
public class Decoration implements MusicalExpression
{
    private String m_decorationText;
    public Decoration(String text)
    {
        this.m_decorationText = text;
    }

    public String getDecorationText()
    {
        return m_decorationText;
    }

    public void setDecorationText(String m_decorationText)
    {
        this.m_decorationText = m_decorationText;
    }

    @Override
    public ExpressionType getType()
    {
        return ExpressionType.DECORATION;
    }
}
