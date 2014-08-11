
package java_first_contact.lancs;

/**
 * simple methods for file input/output (Java 1.1)
 * @author Roger Garside
 * @version Last Rewritten: 16/Sept/97
 */

import java.io.* ;

public class BasicFileIo                               
    {
    /**
     * Constant - input file
     */
    public static final int INPUT = 1 ;                          
    /**
     * Constant - output file
     */
    public static final int OUTPUT = 2 ;

    private int fileType ;
    private PrintWriter pout ;
    private BufferedReader fin ;


    /**
     * Constructor for BasicFileIo.
     * Initialises the filetype to "unknown".
     */
    public BasicFileIo() 
        {
        fileType = 0 ;
        } // end of constructor method

    /**
     * Constructor for BasicFileIo.
     * @param t    The filetype - either INPUT or OUPUT
     * @param name The filename as a string
     * @throws IOException If there is a problem opening the file
     */
    public BasicFileIo(int t, String name) throws IOException
        {
        if (t == OUTPUT)
            {
            pout = new PrintWriter(new FileWriter(name)) ;
            fileType = OUTPUT ;
            }
        else if (t == INPUT)
            {
            fin = new BufferedReader(new FileReader(name)) ;
            fileType = INPUT ;
            }
        else
	    {
            System.exit(1) ;
            }
        } // end of constructor method

    /**
     * Open a file. Can be opened for reading or writing
     * @param t    The filetype - either INPUT or OUPUT
     * @param name The filename as a string
     * @throws IOException If there is a problem opening the file
     */
    public void openFile(int t, String name) throws IOException
        {
        if (fileType != 0)
            {
            System.exit(1) ;
            }

        if (t == OUTPUT)
            {
            pout = new PrintWriter(new FileWriter(name)) ;
            fileType = OUTPUT ;
            }
        else if (t == INPUT)
            {
            fin = new BufferedReader(new FileReader(name)) ;
            fileType = INPUT ;
            }
        else
            {
            System.exit(1) ;
            }
        } // end of method openFile

    /**
     * Close the current file
     */
    public void closeFile() throws IOException
        {
        if (fileType == INPUT)
 	    fin.close() ;
        else if (fileType == OUTPUT)
	    pout.close() ;
        else
            System.exit(1) ;
        fileType = 0 ;
        } // end of method close

    public void print(boolean b)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.print(b) ;
        } // end of method print
    public void print(char c)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.print(c) ;
        } // end of method print
    public void print(double d)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.print(d) ;
        } // end of method print
    public void print(float f)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.print(f) ;
        } // end of method print
    public void print(int i)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.print(i) ;
        } // end of method print
    public void print(long l)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.print(l) ;
        } // end of method print
    public void print(String s)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.print(s) ;
        } // end of method print
    public void println(boolean b)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.println(b) ;
        } // end of method println
    public void println(char c)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.println(c) ;
        } // end of method println
    public void println(double d)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.println(d) ;
        } // end of method println
    public void println(float f)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.println(f) ;
        } // end of method println
    public void println(int i)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.println(i) ;
        } // end of method println
    public void println(long l)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.println(l) ;
        } // end of method println
    public void println(String s)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.println(s) ;
        } // end of method println
    public void println()
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        pout.println() ;
        } // end of method println

    /**
     * read the next line from the file as a String
     * @return the line read from the file as a String
     * @throws IOException if an error occurs while reading the file
     */
    public String readString() throws IOException
        {
        if (fileType != INPUT)
            {
            System.err.println("not open for reading") ;
            System.exit(1) ;
            }
        return fin.readLine() ;
        } // end of method readString

    /**
     * Read a character from the file, the first on the line
     * @return the first character on the next line
     * @throws IOException If an error occurs while reading the file
     */
    public char readCharacter() throws IOException
        {
        if (fileType != INPUT)
            {
            System.err.println("not open for reading") ;
            System.exit(1) ;
            }

        String line = fin.readLine() ;
        if (line.length() == 0)
            return ' ' ;
        else
            return line.charAt(0) ;
        } // end of method readCharacter
   
    /**
     * read the next line from the file as an integer
     * @return the line read from the file as an integer
     * @throws IOException If the value read is not a valid integer
     */
    public int readInteger() throws IOException
        {
        String line ;

        if (fileType != INPUT)
            {
            System.err.println("not open for reading") ;
            System.exit(1) ;
            }

        try {
            line = fin.readLine() ;
            int i = Integer.parseInt(line.trim()) ;
            return i ;
            }
        catch (Exception e)
            {
            throw new IOException("invalid integer") ;
            }
        } // end of method readInteger

    /**
     * read a float value from the file
     * @return the float value read from the file
     * @throws IOException If value read is not a valid float value
     */
    public float readFloat() throws IOException
        {
        String line ;

        if (fileType != INPUT)
            {
            System.err.println("not open for reading") ;
            System.exit(1) ;
            }

        try {
            line = fin.readLine() ;
            float f = Float.valueOf(line.trim()).floatValue() ;
            return f ;
            }
        catch (Exception e)
            {
            throw new IOException("invalid float") ;
            }
        } // end of method readFloat  

    /**
     * read a double value from the file
     * @return the double value read from the file
     * @throws IOException If value read is not a valid double value
     */
    public double readDouble() throws IOException
        {
        String line ;

        if (fileType != INPUT)
            {
            System.err.println("not open for reading") ;
            System.exit(1) ;
            }

        try {
            line = fin.readLine() ;
            double d = Double.valueOf(line.trim()).doubleValue() ;
            return d ;
            }
        catch (Exception e)
            {
            throw new IOException("invalid double") ;
            }
        } // end of method readDouble

    /**
     * Write an integer to the file
     * @param n The integer to be written
     * @param w The width of the field to write the integer in
     */
    public void writeInteger(int n, int w)
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing") ;
            System.exit(1) ;
            }
        Integer n1 = new Integer(n) ;
        String t = n1.toString() ;

        if (t.length() > w)
            pout.print(t) ;
        else
            {
            for (int i = 0 ; i < w - t.length() ; i++)
                pout.print(' ') ;
            pout.print(t) ;
            }
        } // end of method writeInteger

    /**
     * output a float to the file in a field of a specified width
     * @param n the float to be output to the file
     * @param w the width of the field
     * @param d the number of decimal places
     */
    public void writeFloat(float n, int w, int d) throws IOException
        {
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing");
            System.exit(1);
            }
      
        Float f1 = new Float(n);
        String t = f1.toString();
      
	if (t.indexOf('e') != -1)
	    throw new IOException("out of range") ;
        if (d < 1)
	    throw new IOException("invalid 3rd argument") ;
	boolean negative = false ;
	if (t.charAt(0) == '-')
	    {
	    negative = true ;
	    t = t.substring(1) ;
	    }
	int index = t.indexOf('.') ;
	int decimals ;
	if (index == -1)
	    decimals = 0 ;
	else
	    {
	    decimals = t.length() - index - 1 ;
            if (decimals <= 0)
		throw new IOException("funny format") ;
	    }
	if (decimals < d)
	    {
	    if (decimals == 0)
		t += '.' ;
	    for (int i = 0 ; i < d - decimals ; i++)
		t += '0' ;
	    }
	else if (decimals > d)
	    {
	    int offset = t.length() - decimals + d ;
	    if (t.charAt(offset) < '5')
		t = t.substring(0, t.length() - decimals + d) ;
	    else
		{
		StringBuffer sb = new StringBuffer(t) ;
		offset-- ;
		while ((offset >= 0) &&
		       ((sb.charAt(offset) == '9') ||
		        (sb.charAt(offset) == '.')))
		    {
		    if (sb.charAt(offset) == '9')
		        sb.setCharAt(offset, '0') ;
		    offset-- ;
		    }
		if (offset >= 0)
		    {
		    sb.setCharAt(offset,
	Character.forDigit(Character.digit(sb.charAt(offset), 10) + 1, 10)) ;
	t = sb.toString().substring(0, t.length() - decimals + d) ;
		    }
		else
	t = '1' + sb.toString().substring(0, t.length() - decimals + d) ;
		}
	    }
	if (negative)
	    t = '-' + t ;

	if (t.length() > w)
	    pout.print(t) ;
	else
	    {
	    for (int i = 0 ; i < w - t.length() ; i++)
		pout.print(' ') ;
	    pout.print(t) ;
	    }
        } // end of method writeFloat

    /**
     * output a double to the file in a field of a specified width
     * @param n the double to be output to the file
     * @param w the width of the field
     * @param d the number of decimal places
     */
    public void writeDouble(double n, int w, int d) throws IOException
	{
        if (fileType != OUTPUT)
            {
            System.err.println("not open for writing");
            System.exit(1);
            }
      
	Double n1 = new Double(n) ;
	String t = n1.toString() ;
	//System.err.println("string is **" + t + "**") ;

	if (t.indexOf('e') != -1)
	    throw new IOException("out of range") ;
        if (d < 1)
	    throw new IOException("invalid 3rd argument") ;
	boolean negative = false ;
	if (t.charAt(0) == '-')
	    {
	    negative = true ;
	    t = t.substring(1) ;
	    }
	int index = t.indexOf('.') ;
	int decimals ;
	if (index == -1)
	    decimals = 0 ;
	else
	    {
	    decimals = t.length() - index - 1 ;
            if (decimals <= 0)
		throw new IOException("funny format") ;
	    }
	if (decimals < d)
	    {
	    if (decimals == 0)
		t += '.' ;
	    for (int i = 0 ; i < d - decimals ; i++)
		t += '0' ;
	    }
	else if (decimals > d)
	    {
	    int offset = t.length() - decimals + d ;
	    if (t.charAt(offset) < '5')
		t = t.substring(0, t.length() - decimals + d) ;
	    else
		{
		StringBuffer sb = new StringBuffer(t) ;
		offset-- ;
		while ((offset >= 0) &&
		       ((sb.charAt(offset) == '9') ||
		        (sb.charAt(offset) == '.')))
		    {
		    if (sb.charAt(offset) == '9')
		        sb.setCharAt(offset, '0') ;
		    offset-- ;
		    }
		if (offset >= 0)
		    {
		    sb.setCharAt(offset,
	Character.forDigit(Character.digit(sb.charAt(offset), 10) + 1, 10)) ;
	t = sb.toString().substring(0, t.length() - decimals + d) ;
		    }
		else
	t = '1' + sb.toString().substring(0, t.length() - decimals + d) ;
		}
	    }
	if (negative)
	    t = '-' + t ;

	if (t.length() > w)
	    pout.print(t) ;
	else
	    {
	    for (int i = 0 ; i < w - t.length() ; i++)
		pout.print(' ') ;
	    pout.print(t) ;
	    }
	} // end of method writeDouble

} // end of class BasicFileIo

