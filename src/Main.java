

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jabc.parser.grammar.AbcNotationLexer;
import org.jabc.parser.grammar.AbcNotationParser;

import java.io.*;

/**
 * Created by Willi on 17.11.2016.
 */
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
            //AbcNotationVisitor abcParser = new AbcNotationVisitor();
            //abcParser.visit(tree);
            //Tune tune = abcParser.getTune();
            //System.out.println(tune.getHeader().getComposer());


           // System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>

            //Tune m_tune = abcParser.getTune();
            //System.out.println("TUNE TITLE: " + m_tune.getTitle());

            TestRig.main(new String[]{"org.jabc.parser.grammar.AbcNotation", "tune", "-gui"
                    , inputFile});

//            TestRig.main(new String[]{"org.jabc.parser.grammar.TestGrammar", "score", "-gui"
//                    , "assets/test.test"});

            //printScore(m_tune, 0,0);
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
