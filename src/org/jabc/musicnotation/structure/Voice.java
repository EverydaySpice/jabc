package org.jabc.musicnotation.structure;

import org.jabc.musicnotation.expression.Note;
import org.jabc.musicnotation.structure.Bar;

import java.util.ArrayList;


public class Voice
{
    private String name;
    private final ArrayList<Bar> m_bars;

    public Voice(String voiceName, ArrayList<Bar> bars)
    {
        this.name = voiceName;
        this.m_bars = bars;
    }

    public void addBar(Bar bar)
    {
        m_bars.add(bar);
    }

    public ArrayList<Bar> getBars()
    {
        return m_bars;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
