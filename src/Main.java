

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
    public static void main(String args[])
    {

        String inputFile = "assets/2.abc";

        try
        {
            InputStream is = new FileInputStream(inputFile);
            Reader r = new InputStreamReader(is, "utf-8");

            //is = new FileInputStream(inputFile);
            ANTLRInputStream input = new ANTLRInputStream(r);
            AbcNotationLexer lexer = new AbcNotationLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AbcNotationParser parser = new AbcNotationParser(tokens);

            ParseTree tree = parser.tune(); // parse; start at prog <label id="code.tour.main.6"/>
            AbcNotationVisitor abcParser = new AbcNotationVisitor();
            abcParser.visit(tree);
            Tune tune = abcParser.getTune();

            System.out.println(tune.getHeader().getTitle(0));

            TestRig.main(new String[]{"org.jabc.parser.grammar.AbcNotation", "tune", "-gui"
                    , inputFile});

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
