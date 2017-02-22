package org.jabc.musicnotation.tools;

/**
 * Created by Willi on 22.02.2017.
 */
public enum Accidental
{
    NATURAL(0),
    FLAT(-1),
    DOUBLE_FLAT(-2),
    SHARP(1),
    DOUBLE_SHARP(2);

    private int interval;

    Accidental(int interval)
    {
        this.interval = interval;
    }
    public int getInterval()
    {
        return interval;
    }
}
