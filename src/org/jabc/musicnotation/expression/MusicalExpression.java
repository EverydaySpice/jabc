package org.jabc.musicnotation.expression;

/**
 * Created by Willi on 29.11.2016.
 */
public interface MusicalExpression
{
    enum ExpressionType {
        NOTE("NOTE"),
        REST("REST"),
        DECORATION("DECORATION"),
        KEY("KEY"),
        METER("METER"),
        TEMPO("TEMPO");

        private String type;
        ExpressionType(String type)
        {
            this.type = type;
        }
        public String toString()
        {
            return type;
        }
    };

    ExpressionType getType();

}
