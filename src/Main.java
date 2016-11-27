

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jabc.musicnotation.Tune;
import org.jabc.parser.AbcParser;
import org.jabc.parser.grammar.AbcNotationLexer;
import org.jabc.parser.grammar.AbcNotationParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
//            ANTLRInputStream input = new ANTLRInputStream(is);
//            AbcNotationLexer lexer = new AbcNotationLexer(input);
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//            AbcNotationParser parser = new AbcNotationParser(tokens);
//            ParseTree tree = parser.tune(); // parse; start at prog <label id="code.tour.main.6"/>
            //AbcParser abcParser = new AbcParser();
            //abcParser.visit(tree);

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
//
//        File abcFile = new File (inputFile);
//        TuneBook book = null;
//        try
//        {
//            book = new TuneBook(abcFile);
//        } catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        int tunesNb = book.size();
//        System.out.println("Nb of tunes in tutorial.abc : " + tunesNb);
//        // now retrieve the tune with reference number "10"
//        Tune aTune = book.getTune(1);
//        String title = aTune.getTitles()[0];
//        System.out.println(title);
//        aTune.getNotes();
//        Tune.Music music = aTune.getMusic();
//        MusicElement musicElement = music.getElementAt(0);
//        System.out.println(musicElement);
        // display its title
        //System.out.print("Title n°10 is " + aTune.getTitles[0]);
        // and the name of its composer.
        //System.out.println(" and has been composed by " + aTune.getComposer());


    }
}
