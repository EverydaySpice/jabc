package com.schorrig.interactivesheet.MusicNotation;

import java.util.ArrayList;

/**
 * Created by Willi on 30.10.2016.
 */
public class Bar
{
    private ArrayList<Beat> m_beats;

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
