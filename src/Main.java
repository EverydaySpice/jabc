

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jabc.musicnotation.expression.Note;
import org.jabc.musicnotation.structure.Tune;
import org.jabc.musicnotation.tools.Fraction;
import org.jabc.parser.grammar.AbcNotationLexer;
import org.jabc.parser.grammar.AbcNotationParser;
import org.jabc.parser.grammar.AbcNotationVisitor;

import java.io.*;

public class Main
{

    // this main parses a abc file based on the generated lexer and parser classes.
    // The result is stored in the class 'tune'.
    // If you change the lexer or parser grammar (AbcNotationLexer.g4 and AbcNotationParser.g4)
    // you have to re-generate the java files via the ANTLR-library.
    // On Windows you can do that via cmd:
    // java -jar %ANTLR_LIB% -package org.jabc.parser.grammar -no-listener -visitor AbcNotationParser.g4 AbcNotationLexer.g4
    // Note that the ANTLR_LIB environment-variable must point to the ANTLR jar. 
    public static void main(String args[])
    {
        String inputFile = "assets/example1.demo";
        try
        {
            InputStream is = new FileInputStream(inputFile);
            Reader r = new InputStreamReader(is, "utf-8");

            ANTLRInputStream input = new ANTLRInputStream(r);
            AbcNotationLexer lexer = new AbcNotationLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AbcNotationParser parser = new AbcNotationParser(tokens);

            ParseTree tree = parser.tune();
            AbcNotationVisitor abcParser = new AbcNotationVisitor();
            abcParser.visit(tree);
            Tune tune = abcParser.getTune();

            System.out.println(tune.getHeader().getTitle(0));

            // start the ANTLR TestRig to draw the parser-tree of the input-file
            TestRig.main(new String[]{"org.jabc.parser.grammar.AbcNotation", "tune", "-gui"
                    , inputFile});


            Note note1 = new Note("A", new Fraction(1,4));
            Note note2 = new Note("D", new Fraction(1,4));
            Note note3 = new Note("G", new Fraction(1,4));
            Note note4 = new Note("A", new Fraction(1,4));
            boolean equals = note1.equals(note2);
            boolean equals2 = note1.equals(note3);
            boolean equals3 = note1.equals(note4);
            System.out.println(equals);
            System.out.println(equals2);
            System.out.println(equals3);

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
