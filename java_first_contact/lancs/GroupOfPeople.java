
package java_first_contact.lancs ;

/**
 * represents a group of people's surnames, ages and salaries
 * @author Roger Garside
 * @version Last Rewritten: 19/Sept/97
 */

public class GroupOfPeople
    {

    private static final int MAX_TABLE_SIZE = 100 ;

    private String[] surnames = new String[MAX_TABLE_SIZE] ;

    private int[] ages = new int[MAX_TABLE_SIZE] ;

    private int[] salaries = new int[MAX_TABLE_SIZE] ;

    private int count ;
   
    /**
     * constructor sets the number of people in the group to zero
     */
    public GroupOfPeople()
        {
        count = 0 ;
        } // end of constructor method

    /**
     * returns number of surnames held
     * @return the number of surnames
     */
    public int getCount()
        {
        return count ;
        } // end of method getCount

    /**
     * adds a surname to those held
     * @param s the surname to add
     * @exception Exception thrown if there are too many surnames
     */
    public void addSurname(String s) throws Exception
        {
        if (count >= MAX_TABLE_SIZE)
            throw new Exception("too many surnames") ;
        surnames[count] = s ;
        count++ ;
        } // end of method addSurname

    /**
     * inserts an age among those held
     * @param i the age number (0 <= i < number of surnames)
     * @param s the age to add
     * @exception Exception thrown if the argument is out of range
     */
    public void setAge(int i, int a) throws Exception
        {
        if ((i < 0) || (i >= count))
            throw new Exception("invalid index") ;
        ages[i] = a ;
        } // end of method setAge

    /**
     * inserts a salary among those held
     * @param i the salary number (0 <= i < number of surnames)
     * @param s the salary to add
     * @exception Exception thrown if the argument is out of range
     */
    public void setSalary(int i, int s) throws Exception
        {
        if ((i < 0) || (i >= count))
            throw new Exception("invalid index") ;
        salaries[i] = s ;
        } // end of method setSalary

    /**
     * extracts one of the surnames held
     * @param i the surname number (0 <= i < number of surnames)
     * @return the specified surname
     * @exception Exception thrown if the argument is out of range
     */
    public String getSurname(int i) throws Exception
        {
        if ((i < 0) || (i >= count))
            throw new Exception("invalid index") ;
        return surnames[i] ;
        } // end of method getSurname

    /**
     * extracts one of the ages held
     * @param i the age number (0 <= i < number of surnames)
     * @return the specified age
     * @exception Exception thrown if the argument is out of range
     */
    public int getAge(int i) throws Exception
        {
        if ((i < 0) || (i >= count))
            throw new Exception("invalid index") ;
        return ages[i] ;
        } // end of method getAge

    /**
     * extracts one of the salaries held
     * @param i the salary number (0 <= i < number of surnames)
     * @return the specified salary
     * @exception Exception thrown if the argument is out of range
     */
    public int getSalary(int i) throws Exception
        {
        if ((i < 0) || (i >= count))
            throw new Exception("invalid index") ;
        return salaries[i] ;
        } // end of method getSalary

    } // end of class GroupOfPeople

