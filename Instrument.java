    /**
 * Contains Getter and Setter Methods.
 *
 * @author (Yashil Lal Singh)
 * @version (a version number or a date)
 */

public class Instrument {
    
    //Attributes for Instrument class
    
    private static int instrumentID; //assigned as a static variable
    private String instrumentname;
    private String customername;
    private String mobilenum;
    private int PANno;
    
    /**Constructor of the Instrument class*/
    public Instrument(String instrumentname) //prametarized with instrumentname
    {
    
        this.instrumentID++; //instrumentId is autoincremented
        this.instrumentname = instrumentname;
        this.customername = "";
        this.mobilenum = "";
        this.PANno = 0;
        
    }
    
    //getter and setter methods for instrumentID
    public int getinstrumentID() 
    {
        
        return instrumentID;
        
    }
    
    public void setinstrumentID(int instrumentID) 
    {
        
        Instrument.instrumentID = instrumentID;
        
    }
    
    //getter and setter methods for instrumentname
    public String getinstrumentname() 
    {
        
        return this.instrumentname;
        
    }
    
    public void setinstrumentname(String instrumentname) 
    {
        
        this.instrumentname = instrumentname;
        
    }
    
    //getter and setter methods for customername
    public String getcustomername() 
    {
        
        return this.customername;
        
    }
    
    public void setcustomername(String customername )
    {
        
        this.customername = customername;
        
    }
    
    //getter and setter methods for mobilenumber
    public String getmobilenum() 
    {
        
    return this.mobilenum;
        
    }
    
    public void setmobilenum(String mobilenum) 
    {
        
        this.mobilenum = mobilenum;
        
    }
    
    //getter and setter methods for PAN
    public int getPANno() 
    {
        
        return this.PANno;
        
    }
    
    public void setPANno(int PANno) 
    {

        this.PANno = PANno;
        
    }
    
    /**Display method*/
    /*
     The instrumentId and name are printed,
     also if the customername, number and PANno are not empty and zero they are also printed
    */
    public void display()
    {  
        
        System.out.println("Instrument Details");
        System.out.println("InstrumentId: " + instrumentID);
        System.out.println("Instrument Name: " + instrumentname);
        System.out.println("");
        
        if (customername != "" || mobilenum != "" || PANno != 0){
            
            System.out.println("Customer Details"); 
            System.out.println("Customer Name: " + customername);
            System.out.println("Customer Mobile no.:" + mobilenum);
            System.out.println("PAN no.: " + PANno);
            System.out.println("");
            
        }
     
    }
}