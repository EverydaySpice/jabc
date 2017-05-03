package org.jabc.musicnotation.expression;

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
