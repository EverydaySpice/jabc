package org.jabc.musicnotation;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

/**
 * Created by Willi on 30.10.2016.
 */
public class Tune
{
    private int m_identifier;
    private final ArrayList<String> m_titles;
    private String m_composer;
    private String m_key;
    private Fraction m_timeSignature;
    private Fraction m_standardNoteLength;
    private int m_Tempo;

    private final ArrayList<Voice> voices;

    public Tune()
    {
        m_titles = new ArrayList<String>();
        voices = new ArrayList<Voice>();
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

    public String getTitle(int index)
    {
        return m_titles.get(index);
    }

    public ArrayList<Voice> getVoices()
    {
        return voices;
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
        this.m_identifier = m_identifier;
    }

    public String getComposer()
    {
        return m_composer;
    }

    public void setComposer(String composer)
    {
        this.m_composer = m_composer;
    }

    public int getTempo()
    {
        return m_Tempo;
    }

    public void setTempo(int m_Tempo)
    {
        this.m_Tempo = m_Tempo;
    }
}
