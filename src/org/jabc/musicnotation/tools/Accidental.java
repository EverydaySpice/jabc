package org.jabc.musicnotation.tools;

/**
 * Indicates if a tone is raised or lowered. The name of the accidental is linked
 * to the number of half-tone-steps that it raises or lowers a tone.
 */
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
