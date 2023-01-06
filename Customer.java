package wracs;


/**
 * This class stores information about customers.
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    private String name;
    private int number;
    private boolean isStaff;
    
    /**Constructor requires the customer name, either an employee 
     * or a student number depending on whether customer is 
     * staff or not
     * @param nm name of the customer
     * @param num either an employee or a student number
     * @param stf true if customer is staff, false if a student
     */
    public Customer(String nm, int num, boolean stf)
    {
        // code omitted
    }
    
    public String toString()
    {
        return "";
    }
    
    public boolean isStaff()
    {
        return false;
    }
}
