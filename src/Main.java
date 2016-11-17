
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jabc.musicnotation.Tune;
import org.jabc.parser.AbcParser;
import org.jabc.parser.grammar.AbcNotationLexer;
import org.jabc.parser.grammar.AbcNotationParser;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Willi on 17.11.2016.
 */
public class Main
{
    public static void main(String args[])
    {

        String inputFile = "assets/example1.demo";

        try
        {
            InputStream is = new FileInputStream(inputFile);
            //is = new FileInputStream(inputFile);
            ANTLRInputStream input = new ANTLRInputStream(is);
            AbcNotationLexer lexer = new AbcNotationLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AbcNotationParser parser = new AbcNotationParser(tokens);
            ParseTree tree = parser.tune(); // parse; start at prog <label id="code.tour.main.6"/>
            AbcParser abcParser = new AbcParser();
            abcParser.visit(tree);

            System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>

            Tune m_tune = abcParser.getTune();
            System.out.println("TUNE TITLE: " + m_tune.getTitle());
            //printScore(m_tune, 0,0);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
