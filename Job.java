package wracs;

import java.io.*;
import java.util.*;

/** This class stores information about a Job including the customer, 
 * the number of sides and number of copies, whether highQuality, 
 * colour or double-sided printing is required and a unique job 
 * number allocated sequentially from 100.The job's state will be 
 * either: "waiting", "printing" or "done". In addition, 
 * information about a printer will be included when a printer 
 * is allocated for printing.
 * This class is NOT COMPLETE ;  other fields, constructors and 
 * methods will need to be added.
 * Current fields include: 
 * private Customer customer; 
 * private int sides, copies; 
 * private boolean colour; 
 * private int state; 
 * public static final int PRINTING = 1;
 * public static final int WAITING = 2;
 * public static final int DONE = 3;
 * This class is NOT COMPLETE ; fields, constructors and methods may need to be added.
 */
public class Job implements Serializable
{
    private Customer customer; 
    private int sides, copies; 
    private boolean quality; 
    private boolean colour; 
    private boolean dsided;
    private int state; 
    public static final int PRINTING = 1;
    public static final int WAITING = 2;
    public static final int DONE = 3;  
    
        /**
     * Constructor for Job; fields set from parameter values. Job number set by the system 
     * sequentially from 100 and printer initialised to null 
     */
    public Job(Customer cust, int sides,int copies, boolean high, boolean col, boolean dside)
    {

    }
    
    /**
     * returns the Job number (sequential from 100) 
     */
    public int getJobNo()
    {
        return -1;
    }
    
    /**
     * Returns details of the customer
     * @return details of the customer
     */
    public String getCustomerDetails()
    {
        return "";
    }
    
     /**
     * Returns the state of the Job: 1 - waiting, 2 - printing 3- done  
     */
    public int getState()
    {
        return -1;
    }
    
    public String getStateType()
    {
        return "";
    }
    /**
     * Returns the total cost of the job.There is a setup fee of �1 
     * together with a cost per side x number of sides x number of copies.An
     * additional charge of �5 is made for colour printing. 
     */
    public double getTotalCost()
    {
        return -1;
    }    
        
    public String toString()
    {
        return "";
    }  
}
