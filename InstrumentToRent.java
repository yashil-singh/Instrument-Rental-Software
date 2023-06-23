/**
 * @author (Yashil Lal Singh)
 * @version (a version number or a date)
 */

public class InstrumentToRent extends Instrument 
{
    
    //Attributes of InstrumentToRent
    private float chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    
    /**Constructor of InstrumentToRent*/
    public InstrumentToRent(String instrumentname, float chargePerDay) //parameterized with instrumentname and chargePerDay
    {
        
        super(instrumentname); //call made to superclass with instrumentname as a parameter
        this.chargePerDay = chargePerDay; //assigned with corresponding parameter's value
        this.dateOfRent = ""; 
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
        
    }
    
    //getter and setter methods for chargePerDay
    public float getchargePerDay() 
    {
        
        return this.chargePerDay;
        
    }

    public void setchargePerDay(float chargePerDay) 
    {
        
        this.chargePerDay = chargePerDay;
        
    }
    
    //getter and setter methods for dateOfRent
    public String getdateOfRent() 
    {
        
        return this.dateOfRent;
        
    }

    public void setdateOfRent(String dateOfRent) 
    {
        
        this.dateOfRent = dateOfRent;
        
    }
    
    //getter and setter methods for dateOfRetrun
    public String getdateOfReturn() 
    {
        
        return this.dateOfReturn;
        
    }
    
    public void setdateOfReturn(String dateOfReturn )
    {
        
        this.dateOfReturn = dateOfReturn;
        
    }
    
    //getter and setter methods for noOfDays
    public int getnoOfDays() 
    {
        
    return this.noOfDays;
        
    }
    
    public void setnoOfDays(int noOfDays) 
    {
        
        this.noOfDays = noOfDays;
        
    }
    
    //getter and setter methods for isRented
    public boolean getisRented() 
    {
        
        return this.isRented;
        
    }
    
    public void setisRented(boolean isRented) 
    {
        
        this.isRented = isRented;
        
    }
    
    /**Rent out method*/
    /*
     Rent method which accepts six parameters
     If instrument not available, appropriate message shown
     If instrument available, call is made to super class    
    */
    public void rentout(String customername, String mobilenum, int PANno, String dateOfRent, String dateOfReturn, int noOfDays) 
    {
        if(this.isRented == true) {
            
            System.out.println("The instrument is not currently available.");
            System.out.println("Rented  by");
            System.out.println("Customer Name: " + getcustomername());
            System.out.println("Customer Mobile no.: " + getmobilenum());
            System.out.println("Return Date: " + this.dateOfReturn);  
            
        }
        
        else{
            
            /*Call made to super with setter methods of
               customername,
               mobilenum, and 
               PANno */
            super.setcustomername(customername); 
            super.setmobilenum(mobilenum);      
            super.setPANno(PANno);
            this.dateOfRent = dateOfRent;
            this.dateOfReturn = dateOfReturn;
            this.noOfDays = noOfDays;
            setisRented(true);
            float totalCharge = noOfDays * chargePerDay;
            System.out.println("Rented  by");
            System.out.println("Customer Name:"+ this.getcustomername());
            System.out.println("Customer phone number:"+ this.getmobilenum());
            System.out.println("Customer PAN number:"+ this.getPANno());
            System.out.println("Instrument rent date:"+ this.dateOfRent);
            System.out.println("Instrument return date:"+ this.dateOfReturn);
            System.out.println("Instrument rented days:"+ this.noOfDays);
            System.out.println("Total Charge:"+totalCharge);
            System.out.println("");
            
        }
    
    }
    
    /**Return Method*/
    /*
    Retrun Method 
    If the instrument is rented, appropriate message shown
    If the instrument is not rented, call made to super class and attributes iniatialized 
    */
    public void return_instrument()
    {
        if(this.isRented == false){
            
            System.out.println("The instrument is available to rent"); 
            
        }
        else{
            
            super.setcustomername("");
            super.setmobilenum("");
            super.setPANno(0);
            this.dateOfReturn = "";
            this.dateOfRent = "";
            this.noOfDays = 0;
            this.isRented = false;

        }
    }
    
    /**Display Method*/
    /*
     Call is made to super class for display method
     if the instrument is rented, the customer details are displayed
     if the instrument is not rentedm, only the instrumentId and name are displayed
    */
    public void display()
    {
        
        super.display();
        
        if(this.isRented == true) {
            
            System.out.println("Rented by");
            System.out.println("Customer Name: " + getcustomername());
            System.out.println("Customer Mobile no.: " + getmobilenum());
            System.out.println("PANno.: " + getPANno());
            System.out.println("Return Date: " + dateOfReturn);
            System.out.println("Rent Date: " + dateOfRent);
            System.out.println("");
            
        }
        
    }
    
}
