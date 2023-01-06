package wracs;


/**
 * First draft of a class to store information about a plain paper printer
 * including its departmental id, maximum number of copies, and cost per 
 * copy per side (currently 3p if double-sided, otherwise 4p) 
 * Current fields: 
 *	private String id; 
 *	private Availability state; 
 *	private int maxCopies;
 *	private String make; 
 *	private String contact = ""; 
 * NOT the final version 
 */

public class Plain 
{
    private String id;
    private Availability state;
    private int maxCopies;
    private String make; 
    private String contact = ""; 
    
    /** Constructor which requires the departmental id, the maximum 
     * total number of sides in one job allowed for this printer and the make. 
     * @param depId is the departmental id
     * @param mCopies is the maximum number of copies allowed in one job
     * @param mk is the printer make
     * @param con is the nme of the contact person
     */    
    public Plain(String depId, int mCopies, String mk, String con)
    {
        maxCopies = mCopies;
        make = mk;
        // some code missing
    }
    
    /**
     * Returns true if the number of copies required is less than
     * the maximum allowed and if neither high quality nor colour
     * is required 
     * @param copies number of copies required
     * @param quality true if high quality is required, else false
     * @param colour true if colour printing is required, else false
     * @param dsided true if double-sided printing is required, else false
     * @return true if the number of copies required is less than
     * the maximum allowed and if neither high quality nor colour
     * is required, else false
     */
    public boolean acceptSelection(int copies, boolean quality, 
                                        boolean colour, boolean dsided)
    {
         return copies < maxCopies && !quality && !colour; 
    }
    
    /**
     * change contact details for repair technician from parameter values 
     * @param contact details of the repair technician
     */
    public void changeContact(String details)
    {
    }
    
    /** 
     * Returns contact details for repair technician
     * @return contact details for repair technician
     */
    public String getContact()
    {
        return "";
    }
    
    
    /**
     * Returns cost per copy per side : 3p if double-sided, otherwise 4p
     * @param dsided true if double-sided printing is required, else false
     * @return cost per copy per side : 3p if double-sided, otherwise 4p
     */
    public int getCostPerSide(boolean dsided)
    {
        return 0;
    }
    /**
     * Returns the printer's departmental id 
     * @return the printer's departmental id 
     */
    public String getId()
    {
        return "";
    }
    
    /**
     * Returns printer's make
     * @return printer's make
     */
    public String getMake()
    {
        return "";
    }
    
    /**
     * Returns the maximum number of copies allowed in one job
     * @return the maximum number of copies allowed in one job
     */
    public int getMaxCopies()
    {
        return 0;
    }
    
    /**
     * returns a String representation of the printer 
     * @return a String representation of the printer 
     */ 
    public String toString()
    {
        return "";
    }
}
