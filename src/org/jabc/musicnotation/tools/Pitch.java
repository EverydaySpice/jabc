package org.jabc.musicnotation.tools;

public enum Pitch
{
    C(1), D(3), E(5), F(6), G(8), A(10), B(12);

    private final int PITCH;

    Pitch(int pitch)
    {
        this.PITCH = pitch;
    }
    public int getPitch()
    {
        return PITCH;
    }
}
