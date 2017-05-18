package org.jabc.musicnotation.tools;

public enum Accidental
{
    NATURAL(0),
    FLAT(-1),
    DOUBLE_FLAT(-2),
    SHARP(1),
    DOUBLE_SHARP(2);

    private final int INTERVAL;

    Accidental(int interval)
    {
        this.INTERVAL = interval;
    }
    public int getInterval()
    {
        return INTERVAL;
    }
}
