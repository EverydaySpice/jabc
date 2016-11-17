package org.jabc.musicnotation;

/**
 * Created by Willi on 30.10.2016.
 */
public class Fraction
{
    private int m_numerator;
    private int m_denominator;

    public Fraction (int numerator, int denominator)
    {
        m_denominator = denominator;
        m_numerator = numerator;
    }

    public int getNnumerator()
    {
        return m_numerator;
    }

    public int getDenominator()
    {
        return m_denominator;
    }

    @Override
    public String toString()
    {
        return String.valueOf(m_numerator) + "/" + String.valueOf(m_denominator);
    }
}
