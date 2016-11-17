package com.schorrig.interactivesheet.MusicNotation;

/**
 * Created by Willi on 31.10.2016.
 */
public class AbcParserHelper
{

    public static Note parseNote(String noteString, Note note) throws Exception
    {
        switch(noteString)
        {
            case "c":
                note.setInterval(1);
                note.setOctave(5);
                break;
            case "C":
                note.setInterval(1);
                note.setOctave(4);
                break;
            case "d":
                note.setInterval(2);
                note.setOctave(5);
                break;
            case "D":
                note.setInterval(2);
                note.setOctave(4);
                break;
            case "e":
                note.setInterval(3);
                note.setOctave(5);
                break;
            case "E":
                note.setInterval(3);
                note.setOctave(4);
                break;
            case "f":
                note.setInterval(4);
                note.setOctave(5);
                break;
            case "F":
                note.setInterval(4);
                note.setOctave(4);
                break;
            case "g":
                note.setInterval(5);
                note.setOctave(5);
                break;
            case "G":
                note.setInterval(5);
                note.setOctave(4);
                break;
            case "a":
                note.setInterval(6);
                note.setOctave(5);
                break;
            case "A":
                note.setInterval(6);
                note.setOctave(4);
                break;
            case "b":
                note.setInterval(7);
                note.setOctave(5);
                break;
            case "B":
                note.setInterval(7);
                note.setOctave(4);
                break;
            default:
                Exception e = new Exception("Could not parse note from String: " + noteString);
                throw (e);
        }
        return note;
    }


}
