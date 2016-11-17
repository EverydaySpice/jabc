package com.schorrig.interactivesheet.MusicNotation;

/**
 * Created by Willi on 30.10.2016.
 */
public class Note
{
    public static int[] INTERVAL = { 1,2,3,4,5,6,7}; // -1 symbolizes a rest.
    private static final String[] tones = {"c", "d","e", "f", "g", "a", "b" };
    public enum noteName  { A, B, C, D, E, F, G};
    private boolean m_sharp = false;
    private boolean m_flat = false;
    private int m_interval;
    private int m_octave;
    private Fraction m_duration;

    public Note(int interval, int octave, Fraction duration)
    {
        m_interval= interval;
        m_octave = octave;
        m_duration = duration;
    }

    public void setInterval(int interval)
    {
        m_interval = interval;
    }
    public void setOctave(int octave)
    {
        m_octave = octave;
    }
    public int getOctave()
    {
        return m_octave;
    }
    public int getInterval()
    {
        return m_interval;
    }

    public String toString()
    {
        return tones[m_interval-1] + m_octave;
    }

    public Fraction getDuration()
    {
        return m_duration;
    }

    public void setDuration(Fraction m_duration)
    {
        this.m_duration = m_duration;
    }

    public boolean isSharp()
    {
        return m_sharp;
    }

    public boolean isFlat()
    {
        return m_flat;
    }

    public void setSharp(boolean b)
    {
         m_sharp = b;
    }

    public void setFlat(boolean b)
    {
        m_flat = b;
    }
}
