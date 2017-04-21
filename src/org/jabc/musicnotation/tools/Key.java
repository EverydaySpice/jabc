package org.jabc.musicnotation.tools;

/**
 * Created by Willi on 29.11.2016.
 */
public enum Key
{
    C_Sharp("C#",   1 , 1 , 1 , 1 , 1 , 1 , 1),
    F_Sharp("F#",   1 , 1 , 0 , 1 , 1 , 1 , 1),
    B("B" ,         1 , 1 , 0 , 1 , 1 , 1 , 0),
    E("E" ,         1 , 1 , 0 , 1 , 1 , 0 , 0),
    A("A" ,         1 , 0 , 0 , 1 , 1 , 0 , 0),
    D("D",          1 , 0 , 0 , 1 , 0 , 0 , 0),
    G("G",          0 , 0 , 0 , 1 , 0 , 0 , 0),
    C("C",          0 , 0 , 0 , 0 , 0 , 0 , 0),
    F("F",          0 , 0 , 0 , 0 , 0 , 0 ,-1),
    B_Flat("Bb",    0 , 0 ,-1 , 0 , 0 , 0 ,-1),
    E_Flat("Eb",    0 , 0 ,-1 , 0 , 0 ,-1 ,-1),
    A_Flat("Ab",    0 ,-1 ,-1 , 0 , 0 ,-1 ,-1),
    D_Flat("Db",    0 ,-1 ,-1 , 0 ,-1 ,-1 ,-1),
    G_Flat("Gb",   -1, -1 ,-1 , 0 ,-1 ,-1 ,-1),
    C_Flat("Cb",   -1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1);

    private String name;
    private int[] intervalList;

    public static Key getKey(String s)
    {
        for (Key k : Key.values())
        {
            if (k.getName().equals(s))
            {
                return k;
            }
        }
        return null;
    }

    public String getName()
    {
        return name;
    }

    Key(String name, int C, int D, int E, int F, int G, int A, int B)
    {
        this.name = name;
        intervalList = new int[]{C, D, E, F, G, A, B};
    }
    public int getIntervalFor(int noteInterval)
    {
        return intervalList[noteInterval];
    }

}
