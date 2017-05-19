

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jabc.musicnotation.structure.Tune;
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

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
