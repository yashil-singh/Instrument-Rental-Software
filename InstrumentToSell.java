/**
 * @author (Yashil Lal Singh)
 * @version (a version number or a date)
 */

public class InstrumentToSell extends Instrument 
{
    
    //Attributes of InstrumentToSell
    private float price;
    private String sellDate;
    private float discountPercent;
    private boolean isSold;
    
    /**Constructor for InstrumentToSell*/
    public InstrumentToSell(String instrumentname, float price) 
    {
        
        super(instrumentname); //call made to super class for instrumentname
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
        
    }
    
    //getter and setter for price 
    public float getprice()
    {
        
        return this.price;
        
    }
    public void setprice(float price)
    {
        /*
         if instrument is already sold appropriate message is shown
         else the new value is assigned to price
        */
        
        if (this.isSold == true){
            
            System.out.println("The instrument is already sold");
            
        }    
        else {
            
            this.price = price;
            
        }
    }
    
    //getter and setter for sellDate
    public String getsellDate()
    {
        
        return this.sellDate;
        
    }
    public void setsellDate(String sellDate)
    {
        
        this.sellDate = sellDate;
        
    }
    
    //getter and setter for discountPercent
    public float getdiscountPercent()
    {
        
        return this.discountPercent;
        
    }
    public void setdiscountPercent(float discountPercent)
    {
        
        this.discountPercent = discountPercent;
        
    }
    
    //getter and setter for isSold
    public boolean getisSold()
    {
        
        return this.isSold;
        
    }
    public void setisSold(boolean isSold)
    {
        
        this.isSold = isSold;
        
    }
    
    /**Sell Method*/
    /*
    if the instrument is sold ,appropriate message with customer name, number and PANno shown
    if instrument available, call is made to super class 
    */
    public void sellInstrument(String customername, String mobilenum, int PANno, String sellDate, float discountPercent)
    {
        
        if(this.isSold == true) {
            
            System.out.println("The instrument has already been sold out.");
            System.out.println("Bought by");
            System.out.println("Customer Name: " + getcustomername());
            System.out.println("Customer Mobile No.: " + getmobilenum());
            System.out.println("Customer PAN No.: " + getPANno());
            
        }
        else {
            
            super.setcustomername(customername);
            super.setmobilenum(mobilenum);
            super.setPANno(PANno);
            this.sellDate = sellDate;
            this.discountPercent = discountPercent;
            this.isSold = true;
            this.price = price - (discountPercent/100) * price; 
                
        }
        
    }
    
    /**Display Method*/
    /*
     Call made to super class for the display method,
     the price of instrument is printed,
     if the instrument is sold, the customer details and sold date are printed
    */
    public void display()
    {
    
        //calling display method from superclass Instrument
        super.display();
        if(this.isSold == false){
            System.out.println("Price: " + getprice());
        }
        System.out.println("");
        
        if (this.isSold == true) {
            
            System.out.println("Bought by");
            System.out.println("Customer Name: " + getcustomername());
            System.out.println("Customer Mobile No.: " + getmobilenum());
            System.out.println("Customer PAN No.: " + getPANno());
            System.out.println("Sold Date: " + sellDate);
            System.out.println("");
            
        }
          
    }
    
}