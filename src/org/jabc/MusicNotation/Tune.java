package org.jabc.musicnotation;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

/**
 * Created by Willi on 30.10.2016.
 */
public class Tune
{
    private String m_title;
    private String m_key;
    private Fraction m_timeSignature;
    private Fraction m_standardNoteLength;

    private final ArrayList<Bar> m_bars;

    public Tune()
    {
        m_bars = new ArrayList<>();
    }

    public void addBar(Bar bar)
    {
        m_bars.add(bar);
    }

    public ArrayList<Bar> getBars()
    {
        return m_bars;
    }

    public Fraction getStandardNoteLength()
    {
        return m_standardNoteLength;
    }

    public void setStandardNoteLength(Fraction m_standardNoteLength)
    {
        this.m_standardNoteLength = m_standardNoteLength;
    }

    public Fraction getTimeSignature()
    {
        return m_timeSignature;
    }

    public void setTimeSignature(Fraction m_timeSignature)
    {
        this.m_timeSignature = m_timeSignature;
    }

    public String getKey()
    {
        return m_key;
    }

    public void setKey(String m_key)
    {
        this.m_key = m_key;
    }

    public String getTitle()
    {
        return m_title;
    }

    public void setTitle(String m_title)
    {
        this.m_title = m_title;
    }

    public void setStandardNoteLength(TerminalNode fraction)
    {
        int numerator = Integer.valueOf(fraction.getText().charAt(0));
        int denominator = Integer.valueOf(fraction.getText().charAt(2));
        m_standardNoteLength = new Fraction(numerator, denominator);
    }
}
