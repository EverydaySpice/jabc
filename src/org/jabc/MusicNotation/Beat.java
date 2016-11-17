package org.jabc.musicnotation;

import java.util.ArrayList;

/**
 * Created by Willi on 30.10.2016.
 */
public class Beat
{
    private ArrayList<Note> m_notes;
    private Fraction m_duration;

    public Beat(Fraction duration)
    {
        m_notes = new ArrayList<>();
        m_duration = duration;
    }

    public void addNote(Note note)
    {
        m_notes.add(note);
    }

    public ArrayList<Note> getNotes()
    {
        return m_notes;
    }

    public Fraction getDuration()
    {
        return m_duration;
    }

    public void setDuration(Fraction m_duration)
    {
        this.m_duration = m_duration;
    }

}
