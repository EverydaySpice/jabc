package org.jabc.musicnotation.structure;

import org.jabc.musicnotation.tools.Fraction;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Willi on 30.10.2016.
 */
public class Bar
{
    private ArrayList<Beat> m_beats;

    private HashMap<Fraction, Beat> m_beatMap;

    public Bar()
    {
        m_beats = new ArrayList<>();
    }

    public void addBeat(Beat beat)
    {
        m_beats.add(beat);
    }

    public void addBeat(Fraction position, Beat beat)
    {
        m_beatMap.put(position,beat);
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
