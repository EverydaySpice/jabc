package org.jabc.musicnotation;

/**
 * Created by Willi on 29.11.2016.
 */
public class Rest implements MusicalExpression
{
    private Fraction duration;

    public Rest(Fraction duration)
    {
        this.duration = duration;
    }

    public Fraction getDuration()
    {
        return duration;
    }
    public void setDuration(Fraction duration)
    {
        this.duration = duration;
    }
}
