
package java_first_contact.lancs ;

/**
 * Represents a playing card
 * @author Roger Garside/John Mariani
 * @version Last Rewritten: 16th Sept 1997
 */

import java.util.* ;

public class Card
    {
    // Card Class Variables

    private static boolean initialised = false ;
    private static Random rand = new Random() ;
    private static boolean[][] dealt = new boolean[4][13] ;
    private static int noDealt ;

    // Card Instance Variables

    /*
     * the suit of the card (0 to 3)
     */
    private int suit ;
    /*
     * the value of the card (0 to 12)
     */
    private int value ;

    // Card Class Constants

    /**
    * Constant - Spades
    */
    public static final int SPADES = 0 ;
    /**
    * Constant - Hearts
    */
    public static final int HEARTS = 1 ;
    /**
    * Constant - Clubs
    */
    public static final int CLUBS = 2 ;
    /**
    * Constant - Diamonds
    */
    public static final int DIAMONDS = 3 ;

    // Card Constructor Methods

    /**
     * Creates an instance of the Card class with random values
     * (if all have been dealt, then starts again)
     */
    public Card()
	{
        if (noDealt == 52)
            {
	    System.err.println("all 52 cards dealt") ;
            initialised = false ;
            }
	if (!initialised)
	    {
	    for (int i = 0 ; i < 4 ; i++)
	        for (int j = 0 ; j < 13 ; j++)
		    dealt[i][j] = false ;
	    initialised = true ;
	    noDealt = 0 ;
	    }
	int s, v ;
	do
	    {
	    s = (int) (Math.abs(rand.nextInt()) % 4) ;
	    v = (int) (Math.abs(rand.nextInt()) % 13) ;
	    }
        while (dealt[s][v]) ;
	dealt[s][v]  = true ;
        suit = s ;
	value = v ;
        noDealt++ ;
	} // end of constructor method

    /**
     * Creates an instance of the Card class with specified values
     * (if all have been dealt, then starts again)
     * @param s suit of the card
     * @param v value of the card
     */
    public Card(int s, int v)
	{
        if (noDealt == 52)
            {
	    System.err.println("all 52 cards dealt") ;
            initialised = false ;
            }
	if (!initialised)
	    {
	    for (int i = 0 ; i < 4 ; i++)
	        for (int j = 0 ; j < 13 ; j++)
		    dealt[i][j] = false ;
	    initialised = true ;
	    noDealt = 0 ;
	    }
        if ((s < 0) || (s > 3))
            {
            System.out.println("invalid suit") ;
            System.exit(1) ;
            }
        if ((v < 0) || (v > 12))
            {
            System.out.println("invalid value") ;
            System.exit(1) ;
            }
        if (dealt[s][v])
            {
            System.out.println("card already used") ;
            System.exit(1) ;
            }
	dealt[s][v]  = true ;
        suit = s ;
	value = v ;
        noDealt++ ;
	} // end of constructor method

    // Card Instance Methods - Selectors

    /**
     * returns the suit attribute of the card
     * @return the suit attribute of the card
     */
    public int getSuit()
	{
	return suit ;
	} // end of method getSuit

    /**
     * returns the suit attribute of the card as a string
     * @return the suit attribute of the card as a string
     */
    public String getSuitString()
	{
	switch (suit)
	    {
	    case SPADES :
		return "Spades" ;
	    case HEARTS :
		return "Hearts" ;
	    case CLUBS :
		return "Clubs" ;
	    case DIAMONDS :
		return "Diamonds" ;
            default :
		return "Unknown" ;
            }
	} //end of method getSuitString

    /**
     * returns the value attribute of the card
     * @return the value attribute of the card
     */
    public int getValue()
	{
	return value ;
	} // end of class getValue

    /**
     * returns the value attribute of the card as a string
     * @return the value attribute of the card as a string
     */
    public String getValueString()
	{
	switch (value)
	    {
	    case 0 :
		return "Ace" ;
	    case 1 :
		return "two" ;
	    case 2 :
		return "three" ;
	    case 3 :
		return "four" ;
	    case 4 :
		return "five" ;
	    case 5 :
		return "six" ;
	    case 6 :
		return "seven" ;
	    case 7 :
		return "eight" ;
	    case 8 :
		return "nine" ;
	    case 9 :
		return "ten" ;
	    case 10 :
		return "Jack" ;
	    case 11 :
		return "Queen" ;
	    case 12 :
		return "King" ;
	    default :
		return "Unknown" ;
            }
	} //end of method getValueString

    // Other Card Methods

    /**
     * Resets the deck of cards to all undealt
     */
    public static void restart()
	{
	for (int i = 0 ; i < 4 ; i++)
	    for (int j = 0 ; j < 13 ; j++)
		dealt[i][j] = false ;
        noDealt = 0 ;
        } // end of method restart

    /**
     * return a string representing the card
     * @return details of the card ('value of suit')
     */
    public String toString()
        {
        return getValueString() + " of " + getSuitString() ;
        } // end of method toString

    /* public void setSuit(int s)
	{
	// s should be in the range 0 to 3
	if ((s < 0) || (s > 3)) suit = 0;
	else suit = s;
	} // end of method setSuit

    public void setValue(int v)
	{
	// value should be in the range 0 to 12
	if ((v < 0) || (v > 12)) value = 0;
	else value = v;
	} // end of method setValue */

    } // end of class card
