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

    public int getNumerator()
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

    @Override
    public boolean equals(Object other)
    {
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof Fraction))return false;

        Fraction otherFraction = (Fraction)other;
        if (        otherFraction.getDenominator() == this.getDenominator()
                ||  otherFraction.getNumerator() == this.getNumerator())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Fraction multiply(Fraction m_standardNoteLength)
    {
        this.m_numerator*= m_standardNoteLength.getNumerator();
        this.m_denominator *= m_standardNoteLength.getDenominator();
        return this;
    }
}
