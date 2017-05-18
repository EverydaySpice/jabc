package org.jabc.musicnotation.tools;

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

    private final String NAME;
    private final int[] INTERVAL_LIST;

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
        return NAME;
    }

    Key(String name, int C, int D, int E, int F, int G, int A, int B)
    {
        this.NAME = name;
        INTERVAL_LIST = new int[]{C, D, E, F, G, A, B};
    }
    public int getIntervalFor(int pitch)
    {
        return INTERVAL_LIST[pitch];
    }

}
