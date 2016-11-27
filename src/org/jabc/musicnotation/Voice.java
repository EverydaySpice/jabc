package org.jabc.musicnotation;

import java.util.ArrayList;

/**
 * Created by Willi on 27.11.2016.
 */
public class Voice
{
    private String name;
    private final ArrayList<Bar> m_bars;

    public Voice(String name)
    {
        this.name = name;
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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
