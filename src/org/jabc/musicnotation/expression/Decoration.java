package org.jabc.musicnotation.expression;

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
