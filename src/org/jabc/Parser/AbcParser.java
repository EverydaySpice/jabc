package org.jabc.Parser;

/**
 * Created by Willi on 17.11.2016.
 */
public class AbcParser
{
    private String testValue;
    /**
     * Method to get the current integer value.
     * @param testValue test value string
     */
    public AbcParser(String testValue)
    {
        this.testValue = testValue;
    }

    public String getValue()
    {
        return testValue + "test";
    }
}
