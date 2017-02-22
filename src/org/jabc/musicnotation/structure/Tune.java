package org.jabc.musicnotation.structure;

import java.util.ArrayList;

public class Tune
{
    private final ArrayList<Voice> voices;
    private TuneHeader header;

    public Tune()
    {
        voices = new ArrayList<Voice>();
        header = new TuneHeader();
    }

    public void setHeader(TuneHeader header)
    {
        this.header = header;
    }

    public TuneHeader getHeader()
    {
        return header;
    }

    public ArrayList<Voice> getVoices()
    {
        return voices;
    }
}
