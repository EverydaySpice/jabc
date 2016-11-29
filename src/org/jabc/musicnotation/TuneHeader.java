package org.jabc.musicnotation;

import java.util.ArrayList;

public class TuneHeader
{
    private int m_identifier;
    private final ArrayList<String> m_titles;
    private String m_composer;
    private String m_key;
    private Fraction m_timeSignature;
    private Fraction m_standardNoteLength;
    private int m_Tempo;

    public TuneHeader()
    {
        m_titles = new ArrayList<>();
    }

    public Fraction getStandardNoteLength()
    {
        return m_standardNoteLength;
    }

    public void setStandardNoteLength(Fraction standardNoteLength)
    {
        this.m_standardNoteLength = standardNoteLength;
    }

    public Fraction getTimeSignature()
    {
        return m_timeSignature;
    }

    public void setTimeSignature(Fraction timeSignature)
    {
        this.m_timeSignature = timeSignature;
    }

    public String getKey()
    {
        return m_key;
    }

    public void setKey(String key)
    {
        this.m_key = key;
    }

    public String getTitle(int index)
    {
        return m_titles.get(index);
    }

    public void addTitle(String title)
    {
        m_titles.add(title);
    }

    public ArrayList<String> getTitles()
    {
        return m_titles;
    }

    public int getIdentifier()
    {
        return m_identifier;
    }

    public void setIdentifier(int identifier)
    {
        this.m_identifier = identifier;
    }

    public String getComposer()
    {
        return m_composer;
    }

    public void setComposer(String composer)
    {
        this.m_composer = composer;
    }

    public int getTempo()
    {
        return m_Tempo;
    }

    public void setTempo(int tempo)
    {
        this.m_Tempo = tempo;
    }
}
