package org.jabc.musicnotation;

/**
 * Created by Willi on 30.10.2016.
 */
public class Note implements MusicalExpression
{
    public enum Accidental {
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

    private Interval m_interval;
    private Accidental m_accidental;
    private int m_octave;
    private Fraction m_duration;

    public Note(String note, Fraction duration)
    {
        m_accidental = Accidental.NATURAL;

        if (Character.isUpperCase(note.charAt(0)))
        {
            m_octave = 4;
        }
        else
        {
            m_octave = 5;
        }

        m_interval= Interval.valueOf(note.toUpperCase());
        m_duration = duration;
    }

    public void setInterval(Interval interval)
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
        return (m_interval.getInterval() + m_accidental.getInterval());
    }

    @Override
    public String toString()
    {
        String noteString = "";
        if (m_accidental != Accidental.NATURAL)
        {
            noteString += m_accidental.name();
        }
        noteString += m_interval.name();
        noteString += m_octave;
        return noteString;
    }

    public Fraction getDuration()
    {
        return m_duration;
    }

    public void setDuration(Fraction m_duration)
    {
        this.m_duration = m_duration;
    }

    public String getAccidental()
    {
        return m_accidental.name();
    }

    public void setAccidental(Accidental accidental)
    {
        this.m_accidental = accidental;
    }
}
