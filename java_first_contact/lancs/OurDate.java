
package java_first_contact.lancs ;

/**
 * models a date (day, month, year)
 * @author John Mariani
 * @version Last Rewritten: 22nd September 1997
 */

import java.util.*;

public class OurDate
    {
    // OurDate Class Constants
    /**
     * Constant - Month January
     */
    public static final int JAN = 1 ;
    /**
     * Constant - Month February
     */
    public static final int FEB = 2 ;
    /**
     * Constant - Month March
     */
    public static final int MAR = 3 ;
    /**
     * Constant - Month April
     */
    public static final int APR = 4 ;
    /**
     * Constant - Month May
     */
    public static final int MAY = 5 ;
    /**
     * Constant - Month June
     */
    public static final int JUN = 6 ;
    /**
     * Constant - Month July
     */
    public static final int JUL = 7 ;
    /**
     * Constant - Month August
     */
    public static final int AUG = 8 ;
    /**
     * Constant - Month September
     */
    public static final int SEP = 9 ;
    /**
     * Constant - Month October
     */
    public static final int OCT = 10 ;
    /**
     * Constant - Month November
     */
    public static final int NOV = 11 ;
    /**
     * Constant - Month December
     */
    public static final int DEC = 12 ;

    // OurDate Instance Variables

    private int dayOfMonth, month, year;

    // OurDate Constructor Methods
    /**
     * Creates an instance of the OurDate class with default values
     * (day, month and year zero)
     */
    public OurDate()
	{ 
	dayOfMonth = 0;
	month = 0;
	year = 0;
	} // end of constructor method

    /**
     * Creates an instance of the OurDate class with specified attribute
     * values
     * @param y the year number
     * @param m the month number (1 to 12)
     * @param d the day number within the month (1 to 31)
     */
    public OurDate(int y, int m, int d)
	{ 
	dayOfMonth = d;
	month = m;
	year = y;
	} // end of constructor method

    // OurDate Selector Methods

    /**
     * returns the day within the month attribute of the date
     * @return the day within the month attribute of the date
     */
    public int getDayOfMonth()
	{
	return dayOfMonth ;
	} // end of method getDayOfMonth

    /**
     * returns the month attribute of the date
     * @return the month attribute of the date
     */
    public int getMonth()
	{
	return month ;
	} // end of method getMonth

    /**
     * returns the year attribute of the date
     * @return the year attribute of the date
     */
    public int getYear()
	{
	return year ;
	} // end of method getYear

    // OurDate Mutator Methods

    /**
     * set the day within the month attribute of the date
     * @param d the day within the month attribute of the date
     */
    public void setDayOfMonth(int d)
	{
	dayOfMonth = d;
	} // end of method setDayOfMonth

    /**
     * set the month attribute of the date
     * @param m the month attribute of the date
     */
    public void setMonth(int m)
	{
	month = m;
	} // end of method setMonth

    /**
     * set the year attribute of the date
     * @param y the year attribute of the date
     */
    public void setYear(int y)
	{
	year = y;
	} // end of method setYear

    // Other OurDate Methods

    /**
     * find the number of days between two dates
     * @param low the earlier date
     * @param high the later date
     * @return the number of days difference
     */
    public static int subtract(OurDate low, OurDate high)
	{
	/*
	given two "OurDates" (where 'low' < 'high') this subtracts (high - low)
	and returns the result as an integer (of days)
	*/

	int lowdoty, highdoty, lowyear, highyear, i, days, daysleft ;

	days = 0 ;
	lowdoty = low.dayOfTheYear() ;
	highdoty = high.dayOfTheYear() ;
	if (low.year == high.year)
	    {
	    days = highdoty - lowdoty ;
	    return(days) ;
	    }
        lowyear = low.year+1 ;
	highyear = high.year-1 ;
	for (i = lowyear ; i <= highyear ; i++)
	    {
	    days = days + 365 ;
	    if (leapyear(i) == true) days++ ;
	    }
	daysleft = 365 - lowdoty ;
	if (leapyear(low.year) == true) daysleft++ ;
	days = days + highdoty + daysleft ;
	return(days) ;
	} // end of method subtract

    /**
     * return a copy of the date
     * @return a copy of the OurDate instance
     */
    public OurDate copy()
	{
	OurDate t ;
	t = new OurDate() ;
	t.dayOfMonth = dayOfMonth ;
	t.month = month ;
	t.year = year ;
	return t ;
	} // end of method copy

    /**
     * return a string representing the date
     * @return a string representing the date "day/month/year"
     */
    public String toString()
	{
	return dayOfMonth + "/" + month + "/" + year ;
	} // end of method toString

    /**
      * calculate the day number within the year
      * @return the day number within the year
      */
    private int dayOfTheYear()
	{
	int days = 0 ;
	for (int i = 1 ; i < month ; i++)
            switch (i)
                {
                case SEP : case APR : case JUN : case NOV :
		    days += 30 ;
		    break ;
	        case FEB :
		    days += 28 ;
		    if (leapyear(year))
			days++ ;
		    break ;
	        case JAN : case MAR : case MAY : case JUL :
	        case AUG : case OCT : case DEC :
		    days += 31 ;
		    break ;
                }
	days += dayOfMonth ;
	return days ;
	} // end of method dayOfTheYear

    /**
     * find out if the year is a leapyear
     * @param y the year in question
     * @return true if it is a leapyear, false if not
     */
    private static boolean leapyear(int y)
	{
	return ((y % 400 == 0) ||
	        ((y % 4 == 0) && (y % 100 != 0))) ;
	} // end of method leapyear
    } // end of class OurDate
