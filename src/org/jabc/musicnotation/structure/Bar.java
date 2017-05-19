package org.jabc.musicnotation.structure;

import org.jabc.musicnotation.tools.Fraction;

import java.util.ArrayList;
import java.util.HashMap;


public class Bar
{
    private final ArrayList<Beat> m_beats;

    public Bar()
    {
        m_beats = new ArrayList<>();
    }

    public void addBeat(Beat beat)
    {
        m_beats.add(beat);
    }

    public ArrayList<Beat> getBeats()
    {
        return m_beats;
    }

    public int getBeatSize()
    {
        return m_beats.size();
    }
}
