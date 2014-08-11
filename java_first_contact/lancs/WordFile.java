
package java_first_contact.lancs ;

/**
 * extension of BasicFileIo for Exercise 18.4
 * @author Roger Garside
 * @version Last Rewritten: 24/Sept/97
 */

import java.io.* ;
import java.util.* ;
import java_first_contact.lancs.* ;

public class WordFile extends BasicFileIo
    {
    StringTokenizer currentLine = null ;

    /**
     * Constructor for WordFile
     * Initialises the filetype to "unknown".
     */
    public WordFile()
        {
	super() ;
        } // end of constructor method

    /**
     * Constructor for WordFile
     * @param t    The filetype - either INPUT or OUPUT
     * @param name The filename as a string
     * @throws IOException If there is a problem opening the file
     */
    public WordFile(int t, String name) throws IOException
        {
	super(t, name) ;
        } // end of constructor method

    /**
     * reads the next word from the file
     * @return the next word (whitespace-separated) from the file, or null
     */
    public String readWord() throws IOException
        {
        while ((currentLine == null) ||
	       (!currentLine.hasMoreTokens()))
            {
	    String s = readString() ;
            if (s == null)
	        return null ;
            currentLine = new StringTokenizer(s, " \t\n\r") ;
	    }
        return currentLine.nextToken() ;
        } // end of method readWord
    } // end of class WordFile
