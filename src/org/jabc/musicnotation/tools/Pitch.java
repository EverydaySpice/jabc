package org.jabc.musicnotation.tools;

/**
 * The pitch is one of the seven musical tones. The name of the tone is linked to
 * the number of half-tone-steps.
 */
public enum Pitch
{
    C(1), D(3), E(5), F(6), G(8), A(10), B(12);

    private final int PITCH;

    Pitch(int pitch)
    {
        this.PITCH = pitch;
    }
    
    /**Returns the number of half tone steps. Whereby the prime-interval (C) is 1 . */
    public int getPitch()
    {
        return PITCH;
    }
}
