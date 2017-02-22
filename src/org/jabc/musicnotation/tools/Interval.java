package org.jabc.musicnotation.tools;

/**
 * Created by Willi on 22.02.2017.
 */
public enum Interval
{
    C(1), D(3), E(5), F(6), G(8), A(10), B(12);

    private int interval;

    Interval(int interval)
    {
        this.interval = interval;
    }
    public int getInterval()
    {
        return interval;
    }
}