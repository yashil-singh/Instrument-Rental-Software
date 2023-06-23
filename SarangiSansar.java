/**
   GUI part of the system which stores records
   of instruments.
   @author (Yashil Lal Singh)
   @version (30 July 2022)
 */

//Importing java packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SarangiSansar implements ActionListener
{
    //Declaring global variables
    private JFrame myJf;
    
    private JPanel myJp1, myJp2;
    
    private JLabel header1, header2, header3, insNameRentLb, insNameSellLb, 
    priceLb, chargeLb, cusNameRentLb, cusNameSellLb, cusPhoneRentLb, 
    cusPhoneSellLb, PanSellLb, PanRentLb, discountLb, noOfDaysLb, sellDate,
    rentDate, returnDate,insNameReturnLb;
    
    private JTextField insNameRent, insNameSell,insPrice, charge, cusNameRent, 
    cusNameSell, cusPhoneRent, cusPhoneSell, cusPanRent, cusPanSell,
    discountP, noOfDays,insNameReturn;
    
    private JButton addRent, addSell, rentIns, sellIns, returnIns, 
    rentDisplay, rentClear, saleDisplay, saleClear;
    
    private JComboBox rentDay, rentMonth, rentYear, sellDay, sellMonth, 
    sellYear, returnDay, returnMonth, returnYear;
    
    //Creating array list
    ArrayList <Instrument> instrumentList = new ArrayList<Instrument>();
    /**Constructor of the class*/
    public SarangiSansar()
    {
        //Creating a frame
        myJf = new JFrame("Sarangi Sansar");
        myJf.getContentPane().setBackground(new Color(211, 211, 211));
        
        myJp1 = new JPanel();
        myJp1.setBackground(new Color(245,245,244));
        myJp2 = new JPanel();
        myJp2.setBackground(new Color(245,245,244));
        
        //Creating Components 
        //Creating Labels
        header1        = new JLabel("Sarangi Sansar");
        insNameRentLb  = new JLabel("Instrument Name:");
        insNameSellLb  = new JLabel("Instrument Name:");
        priceLb        = new JLabel("Price:");
        chargeLb       = new JLabel("Charge Per Day:");
        cusNameRentLb  = new JLabel("Customer Name:");
        cusNameSellLb  = new JLabel("Customer Name:");
        cusPhoneRentLb = new JLabel("Customer Phone:");
        cusPhoneSellLb = new JLabel("Customer Phone:");
        PanRentLb      = new JLabel("Customer PAN no.:");
        PanSellLb      = new JLabel("Customer PAN no.:");
        discountLb     = new JLabel("Discount Percentage:");
        noOfDaysLb     = new JLabel("No. of Days:");
        sellDate       = new JLabel("Selling Date:");
        rentDate       = new JLabel("Renting Date:");
        returnDate     = new JLabel("Return Date:");
        header2        = new JLabel("Rentals");
        header3        = new JLabel("Sales");
        insNameReturnLb  = new JLabel("Instrument Name:");
        
        //Creating TextFields
        insNameRent   = new JTextField();
        insNameSell   = new JTextField();
        insPrice      = new JTextField();
        charge        = new JTextField();
        cusNameRent   = new JTextField();
        cusNameSell   = new JTextField();
        cusPhoneRent  = new JTextField();
        cusPhoneSell  = new JTextField();
        cusPanRent    = new JTextField();
        cusPanSell    = new JTextField();
        discountP     = new JTextField();
        noOfDays      = new JTextField();
        insNameReturn = new JTextField();
        
        //Creating Buttons
        addRent     = new JButton("Add");
        addSell     = new JButton("Add");
        rentIns     = new JButton("Rent");
        sellIns     = new JButton("Sell");
        returnIns   = new JButton("Return");
        rentDisplay = new JButton("Display");
        rentClear   = new JButton("Clear");
        saleDisplay = new JButton("Display");
        saleClear   = new JButton("Clear");
        
        //Creating array to store days, months and years
        String days[]   = {"","1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11","12","13","14","15","16","17","18","19","20"}; 
        String months[] = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String years[]  = {"", "2017", "2018", "2019", "2020", "2021", "2022"};
        
        //Creating ComboBox
        rentDay     = new JComboBox<String>(days);
        rentMonth   = new JComboBox<String>(months);
        rentYear    = new JComboBox<String>(years);
        sellDay     = new JComboBox<String>(days);
        sellMonth   = new JComboBox<String>(months);
        sellYear    = new JComboBox<String>(years);
        returnDay   = new JComboBox<String>(days);
        returnMonth = new JComboBox<String>(months);
        returnYear  = new JComboBox<String>(years);
        
        //Adding Components to myJp1 panel
        myJp1.add(header2);
        myJp1.add(insNameRentLb);
        myJp1.add(insNameRent);
        myJp1.add(chargeLb);
        myJp1.add(charge);
        myJp1.add(addRent);
        myJp1.add(cusNameRentLb);
        myJp1.add(cusNameRent);
        myJp1.add(cusPhoneRentLb);
        myJp1.add(cusPhoneRent);
        myJp1.add(PanRentLb);
        myJp1.add(cusPanRent);
        myJp1.add(noOfDaysLb);
        myJp1.add(noOfDays);
        myJp1.add(rentDate);
        myJp1.add(rentDay);
        myJp1.add(rentMonth);
        myJp1.add(rentYear);
        myJp1.add(insNameReturnLb);
        myJp1.add(insNameReturn);
        myJp1.add(returnDate);
        myJp1.add(returnDay);
        myJp1.add(returnMonth);
        myJp1.add(returnYear);
        myJp1.add(rentIns);
        myJp1.add(returnIns);
        myJp1.add(rentDisplay);
        myJp1.add(rentClear);
        
        //Adding Components to myJp2 panel
        myJp2.add(header3);
        myJp2.add(insNameSellLb);
        myJp2.add(insNameSell);
        myJp2.add(priceLb);
        myJp2.add(insPrice);
        myJp2.add(addSell);
        myJp2.add(sellDate);
        myJp2.add(sellDay);
        myJp2.add(sellMonth);
        myJp2.add(sellYear);
        myJp2.add(cusNameSellLb);
        myJp2.add(cusNameSell);
        myJp2.add(cusPhoneSellLb);
        myJp2.add(cusPhoneSell);
        myJp2.add(PanSellLb);
        myJp2.add(cusPanSell);
        myJp2.add(discountLb);
        myJp2.add(discountP);
        myJp2.add(sellIns);
        myJp2.add(saleDisplay);
        myJp2.add(saleClear);
        
        //Adding the two pannels in myJf frame
        myJf.add(header1);
        myJf.add(myJp1);
        myJf.add(myJp2);
    
        //Registering components with the action listener
        rentDisplay.addActionListener(this);
        rentClear.addActionListener(this);
        saleDisplay.addActionListener(this);
        saleClear.addActionListener(this);
        addRent.addActionListener(this);
        addSell.addActionListener(this);
        rentIns.addActionListener(this);
        sellIns.addActionListener(this);
        returnIns.addActionListener(this);

        
        header1.setBounds(340,5,500,67);
        header1.setFont(new Font("Helvetica",Font.BOLD,55));
        
        //Setting bounds For Rental Panel
        header2.setBounds(30,21,187,67);
        header2.setFont(new Font("Helvetica",Font.BOLD,48)); 
        
        insNameRentLb.setBounds(30,98,245,28);
        insNameRentLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        insNameRent.setBounds(274,98,236,34);
        
        chargeLb.setBounds(30,153,245,28);
        chargeLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        charge.setBounds(274,152,236,34);
        
        addRent.setBounds(422,200,88,34);
        addRent.setBackground(new Color(181,228,229));
        
        cusNameRentLb.setBounds(30,256,245,28);
        cusNameRentLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        cusNameRent.setBounds(274,256,236,34);
        
        cusPhoneRentLb.setBounds(30,310,245,28);
        cusPhoneRentLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        cusPhoneRent.setBounds(274,310,236,34);
        
        PanRentLb.setBounds(30,365,245,28);
        PanRentLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        cusPanRent.setBounds(274,365,236,34);
        
        noOfDaysLb.setBounds(30,422,245,28);
        noOfDaysLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        noOfDays.setBounds(274,422,236,34);
        
        rentDate.setBounds(30,480,245,28);
        rentDate.setFont(new Font("Helvetica",Font.PLAIN,18));
        
        rentDay.setBounds(256,483,66,26);
        rentDay.setBackground(Color.WHITE);
        rentMonth.setBounds(334,483,88,26);
        rentMonth.setBackground(Color.WHITE);
        rentYear.setBounds(434,483,76,26);
        rentYear.setBackground(Color.WHITE);
        
        rentIns.setBounds(422,575,88,34);
        rentIns.setBackground(new Color(181,228,229));
        
        insNameReturnLb.setBounds(30,629,245,28);
        insNameReturnLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        insNameReturn.setBounds(274,629,236,34);

        returnDate.setBounds(26,525,245,28);
        returnDate.setFont(new Font("Helvetica",Font.PLAIN,18));
        
        returnDay.setBounds(256,525,66,26);
        returnDay.setBackground(Color.WHITE);
        returnMonth.setBounds(335,525,88,26);
        returnMonth.setBackground(Color.WHITE);
        returnYear.setBounds(434,525,76,26);
        returnYear.setBackground(Color.WHITE);
        
        returnIns.setBounds(422,685,88,34);
        returnIns.setBackground(new Color(115,185,208));
        
        rentDisplay.setBounds(30,685,88,34);
        rentDisplay.setBackground(new Color(200,200,200));
        
        rentClear.setBounds(139,685,88,34);
        rentClear.setBackground(new Color(200,200,200));
        
        //Setting bounds for Sales Panel
        header3.setBounds(30,31,187,67);
        header3.setFont(new Font("Helvetica",Font.BOLD,48));
        
        insNameSellLb.setBounds(30,118,245,28);
        insNameSellLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        insNameSell.setBounds(274,118,236,34);
        
        priceLb.setBounds(30,173,245,28);
        priceLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        insPrice.setBounds(274,172,236,34);
        
        addSell.setBounds(422,226,88,34);
        addSell.setBackground(new Color(160,217,239));
        
        cusNameSellLb.setBounds(30,291,245,28);
        cusNameSellLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        cusNameSell.setBounds(274,290,236,34);
        
        cusPhoneSellLb.setBounds(30,345,245,28);
        cusPhoneSellLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        cusPhoneSell.setBounds(274,344,236,34);
        
        PanSellLb.setBounds(30,399,245,28);
        PanSellLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        cusPanSell.setBounds(274,398,236,34);
        
        discountLb.setBounds(30,457,245,28);
        discountLb.setFont(new Font("Helvetica",Font.PLAIN,18));
        discountP.setBounds(274,456,236,34);
        
        sellDate.setBounds(30,515,245,28);
        sellDate.setFont(new Font("Helvetica",Font.PLAIN,18));
        sellDay.setBounds(256,513,66,26);
        sellDay.setBackground(Color.WHITE);
        sellMonth.setBounds(334,513,88,26);
        sellMonth.setBackground(Color.WHITE);
        sellYear.setBounds(434,513,76,26);
        sellYear.setBackground(Color.WHITE);
        
        sellIns.setBounds(422,570,88,34);
        sellIns.setBackground(new Color(160,217,239));
        
        saleDisplay.setBounds(40,685,88,34);
        saleDisplay.setBackground(new Color(200,200,200));
        saleClear.setBounds(149,685,88,34);
        saleClear.setBackground(new Color(200,200,200));
        
        myJp1.setBounds(0,80,534,800);
        myJp2.setBounds(540,80,534,800);
         
        myJf.setLayout(null);
        myJp1.setLayout(null);
        myJp2.setLayout(null);
        myJf.setVisible(true);
        myJf.setSize(1090,850);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        //To add instrument to rent
        if(e.getSource() == addRent){  
            //To check if the instrument name is numeric or not
            boolean validName     = false;
            //To check if the instrument is already added or not
            boolean isDuplicate = false;
            //To check if the text fields are empty or not
            if(insNameRent.getText().isEmpty() || charge.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(myJf,"Some fields are empty.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                //Execption handling for invalid input
                try{
                    //Declaring variables to store the instrument name and charge per day
                    String instrumentname   = insNameRent.getText();
                    float chargePerDay      = Float.parseFloat(charge.getText());
                    
                    //To check if the instrument name is numeric or not
                    try {
                        Double check1 = Double.parseDouble(instrumentname);
                    } 
                    catch (NumberFormatException f) {
                        validName = true;
                    }
                    if(validName == false){
                        JOptionPane.showMessageDialog(myJf,"Instrument name cannot be numeric.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        /*To check if the arraylist is empty or not
                          if it is empty, object of instrument class is made
                          and method to add instrument to rent is called.*/
                        if(instrumentList.isEmpty()){
                            InstrumentToRent insRent = new InstrumentToRent(instrumentname,chargePerDay);
                            //Calling method to add instrument to arraylist
                            instrumentList.add(insRent);
                            JOptionPane.showMessageDialog(myJf,"Added to Rent."+"\n"+"Instrument Name: "+instrumentname+"\n"+"Charge per day: "+chargePerDay);
                        }
                        else{
                            for(Instrument i: instrumentList){
                                if(i instanceof InstrumentToRent){
                                    //Checking if instrument is added to rent or not
                                    if(i.getinstrumentname().equals(instrumentname)){
                                        isDuplicate = true;
                                        break;
                                    }
                                }
                            }
                            if(isDuplicate == false){
                                //Creating object of InstrumentToRent
                                InstrumentToRent insRent = new InstrumentToRent(instrumentname,chargePerDay);
                                //Adding object to Array List Instrument
                                instrumentList.add(insRent);
                                JOptionPane.showMessageDialog(myJf,"Added to Rent."+"\n"+"Instrument Name: "+instrumentname+"\n"+"Charge per day: "+chargePerDay);
                            } 
                            else{
                                JOptionPane.showMessageDialog(myJf,"Already added to Rent."+"\n"+"Instrument Name: "+instrumentname+"\n"+"Charge per day: "+chargePerDay);
                            }
                        }
                    }
                }
                catch(NumberFormatException g){
                    JOptionPane.showMessageDialog(myJf,"Invalid Input.Please fill the fields correctly.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //To add instrument to sell
        else if(e.getSource() == addSell){  
            //To check if the instrument is added or not
            boolean isDuplicate = false;
            //To check if the instrument name is numeric or not
            boolean validName     = false;
            //To check if the text fields are empty or not
            if(insNameSell.getText().isEmpty() || insPrice.getText().isEmpty()){
                JOptionPane.showMessageDialog(myJf,"Some fields are empty.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                //Exception handling for invalid input
                try{
                    //Declaring variables to store the instrument name and charge per day
                    String instrumentname = insNameSell.getText();
                    float price = Float.parseFloat(insPrice.getText());
                     //Checking if the instrument name is numeric or not
                    try {
                        Double check1 = Double.parseDouble(instrumentname);
                    } 
                    catch (NumberFormatException f) {
                        validName = true;
                    }
                    
                    if(validName == false){
                        JOptionPane.showMessageDialog(myJf,"Instrument name cannot be numeric.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        /*To check if the arraylist is empty or not
                          if it is empty, object of instrument class is made
                          and method to add instrument to rent is called.*/
                        if(instrumentList.isEmpty()){
                            InstrumentToSell insSell = new InstrumentToSell(instrumentname,price);
                            instrumentList.add(insSell);
                            JOptionPane.showMessageDialog(myJf,"Added to Sell.\n"+"Instrument Name: "+instrumentname+"\n"+"Price: "+price);
                        }
                        else{
                            for(Instrument i: instrumentList){
                                if(i instanceof InstrumentToSell){
                                    //Checking if instrument is added to sell or not
                                    if(i.getinstrumentname().equals(insNameSell.getText())){
                                        isDuplicate = true;
                                        break;
                                    }
                                }
                            }
                            if(isDuplicate == false){
                                //Creating object of InstrumentToSell
                                InstrumentToSell insSell = new InstrumentToSell(instrumentname,price);
                                //Adding object to Array List Instrument
                                instrumentList.add(insSell);
                                JOptionPane.showMessageDialog(myJf,"Added to Sell.\n"+"Instrument Name: "+instrumentname+"\n"+"Price: "+price);
                            } 
                            else{
                                JOptionPane.showMessageDialog(myJf,"Already added to Sell.\n"+"Instrument Name: "+instrumentname+"\n"+"Price: "+price);
                            }
                        }
                    }
                }
                catch(NumberFormatException g){
                    JOptionPane.showMessageDialog(myJf,"Invalid Input.Please fill the fields correctly.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //To rent the instrument
        else if(e.getSource() == rentIns){
            //To check if the textfields are empty or not
            if(insNameRent.getText().isEmpty() || charge.getText().isEmpty() || cusNameRent.getText().isEmpty() || cusPhoneRent.getText().isEmpty() || cusPanRent.getText().isEmpty() 
            || noOfDays.getText().isEmpty() || rentDay.getSelectedItem() == "" || rentMonth.getSelectedItem() == ""
            || rentYear.getSelectedItem() == "" || returnDay.getSelectedItem() == "" || returnMonth.getSelectedItem() == "" 
            || returnYear.getSelectedItem() == ""){
                JOptionPane.showMessageDialog(myJf,"Some fields are empty.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                //Exception handling for invalid input
                try{
                    /*Declaring variables to get the text fields of 
                       customer name, phone, PAN, date of rent, 
                       date of return and no of days of the rent pannel*/
                    String instrumentName   = insNameRent.getText();
                    Float chargePerDay      = Float.parseFloat(charge.getText());
                    String customerName     = cusNameRent.getText();
                    String customerPhone    = cusPhoneRent.getText();
                    int customerPan         = Integer.parseInt(cusPanRent.getText());
                    String dateOfRent       = rentDay.getSelectedItem() + " " + rentMonth.getSelectedItem() + " " + rentYear.getSelectedItem();
                    String dateOfReturn     = returnDay.getSelectedItem() + " " + returnMonth.getSelectedItem() + " " + returnYear.getSelectedItem();
                    int noOfDay             = Integer.parseInt(noOfDays.getText());
                    boolean gotRented       = false;
                    boolean validName       = false;
                    boolean validPhone      = true;
                    
                    //Checking if the instrument name or customer name  are numeric or not
                    try {
                        Double check1 = Double.parseDouble(instrumentName);
                        Double check2 = Double.parseDouble(customerName);
                    } 
                    catch (NumberFormatException f) {
                        validName = true;
                    }
                    //Checking if the customer phone is alphanumeric or not 
                    try{
                        Double check3 = Double.parseDouble(customerPhone);
                    }
                    catch(NumberFormatException f){
                        validPhone = false;
                    }
                    if(validName == false || validPhone == false){
                        JOptionPane.showMessageDialog(myJf,"Invalid Input. Please fill the fields correctly.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        //Checking if the arraylist is empty or not
                        if(instrumentList.isEmpty()){
                            JOptionPane.showMessageDialog(myJf,"There are no instruments added for rent.");
                        }
                        else{
                            //Iterating through the arraylist
                            for(Instrument i: instrumentList){
                                if(i instanceof InstrumentToRent){
                                    //Object of Instrument is cast as InstrumentToRent
                                    InstrumentToRent insRObj = (InstrumentToRent) i; 
                                    //To check if instrument is added or not
                                    if(insRObj.getinstrumentname().equals(instrumentName)){
                                        if (insRObj.getisRented() == false){
                                            JOptionPane.showMessageDialog(myJf,"The Instrument is rented.\n"+"Instrument Name: "+insRObj.getinstrumentname()+"\n"+"Charge per day: "+insRObj.getchargePerDay());
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(myJf,"The Instrument is already rented.\n"+"Instrument Name: "+insRObj.getinstrumentname()+"\n"+"Charge per day: "+insRObj.getchargePerDay());
                                        }
                                        //Calling rentout method of InstrumentToRent class through object of Instrument class
                                        insRObj.rentout(customerName, customerPhone, customerPan, dateOfRent, dateOfReturn, noOfDay); 
                                        System.out.println("");
                                        gotRented = true;
                                        break;
                                    }
                                }
                            } 
                            if(gotRented == false){
                                    JOptionPane.showMessageDialog(myJf,instrumentName+" is not available for rent.");
                            }
                        }
                    }
                }
                catch(NumberFormatException g){
                    JOptionPane.showMessageDialog(myJf,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //To sell the instrument
        else if(e.getSource() == sellIns){
            //To check if the textfields are empty or not
            if(insNameSell.getText().isEmpty() || insPrice.getText().isEmpty() || cusNameSell.getText().isEmpty() || cusPhoneSell.getText().isEmpty() || cusPanSell.getText().isEmpty() 
            || insPrice.getText().isEmpty() || discountP.getText().isEmpty() || sellDay.getSelectedItem() == "" 
            || sellMonth.getSelectedItem() == "" || sellYear.getSelectedItem() == ""){
                JOptionPane.showMessageDialog(myJf,"Some fields are empty.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                //Exception handling for invalid input
                try{
                    /*Declaring variables to get the text fields of 
                       customer name, phone, PAN, date of rent, 
                       date of return and no of days of the rent pannel*/
                    String instrumentName = insNameSell.getText();
                    float price           = Float.parseFloat(insPrice.getText());
                    String customerName   = cusNameSell.getText();
                    String customerPhone  = cusPhoneSell.getText();
                    int customerPan       = Integer.parseInt(cusPanSell.getText());
                    String dateOfSell     = sellDay.getSelectedItem() + " " + sellMonth.getSelectedItem() + " " + sellYear.getSelectedItem();
                    float discount        = Float.parseFloat(discountP.getText());
                    boolean gotSold       = false;
                    boolean validName     = false;
                    boolean validPhone    = true;
                    
                    //Checking if the instrument name or customer name are numeric or not
                    try {
                        Double check1 = Double.parseDouble(instrumentName);
                        Double check2 = Double.parseDouble(customerName);
                    } 
                    catch (NumberFormatException f) {
                        validName = true;
                    }
                    //Checking if the customer phone is alphanumeric or not 
                    try{
                        Double check3 = Double.parseDouble(customerPhone);
                    }
                    catch(NumberFormatException f){
                        validPhone = false;
                    }
                    if(validName == false || validPhone == false){
                        JOptionPane.showMessageDialog(myJf,"Invalid Input. Please fill the fields correctly.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        //Checking if the arraylist is empty or not
                        if(instrumentList.isEmpty()){
                            JOptionPane.showMessageDialog(myJf,"There are no Instruments added for sell.");
                        }
                        else{
                            //Iterating through the arraylist
                            for(Instrument i: instrumentList){
                                if(i instanceof InstrumentToSell){
                                    //Object of Instrument is cast as InstrumentToSell
                                    InstrumentToSell insSObj = (InstrumentToSell) i; 
                                    //To check if instrument is added or not
                                    if(insSObj.getinstrumentname().equals(instrumentName)){
                                        if (insSObj.getisSold() == false){
                                            JOptionPane.showMessageDialog(myJf,"The Instrument is sold.\n"+"Instrument Name: "+insSObj.getinstrumentname()+"\n"+"Price: "+insSObj.getprice());
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(myJf,"The Instrument is already sold.\n"+"Instrument Name: "+insSObj.getinstrumentname()+"\n"+"Price: "+insSObj.getprice());
                                        }
                                        //Calling sellInstrument method of InstrumentToSell class through object of Instrument class
                                        insSObj.sellInstrument(customerName, customerPhone, customerPan, dateOfSell, discount); 
                                        System.out.println("");
                                        gotSold = true;
                                        break;
                                    }
                                }
                            }
                            if(gotSold == false){
                                JOptionPane.showMessageDialog(myJf,instrumentName+" is not avaiable for sell.");
                            }
                        }
                    }
                }
                catch(NumberFormatException g){
                    JOptionPane.showMessageDialog(myJf,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //To return the instrument
        else if(e.getSource() == returnIns){
            boolean gotReturned = false;
            boolean validName     = false;
            //To check if the textfields are empty or not
            if(insNameReturn.getText().isEmpty()){
                JOptionPane.showMessageDialog(myJf,"Some fields are empty.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String instrumentName = insNameReturn.getText();
                //Checking if the instrument name is numeric or not
                try{
                    Double check1 = Double.parseDouble(instrumentName);
                }
                catch(NumberFormatException g){
                    validName = true;
                } 
                if(validName == false){
                    JOptionPane.showMessageDialog(myJf,"Instrument name cannot be numeric.","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(instrumentList.isEmpty()){
                        JOptionPane.showMessageDialog(myJf,"There are no instruments rented currently.");
                    }
                    else{
                        //Iterating through the arraylist
                        for(Instrument i: instrumentList){
                            if(i instanceof InstrumentToRent){
                                //Object of Instrument is cast as InstrumentToRent
                                InstrumentToRent insRObj = (InstrumentToRent) i; 
                                //To check if instrument is added or not
                                if(insRObj.getinstrumentname().equals(instrumentName)){
                                    gotReturned = true;
                                    if(insRObj.getisRented() == false){
                                        JOptionPane.showMessageDialog(myJf,"The Instrument is already returned.\n"+"Instrument Name: "+instrumentName+"\n"+"Charge per day: "+insRObj.getchargePerDay());
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(myJf,"The Instrument is returned.\n"+"Instrument Name: "+instrumentName+"\n"+"Charge per day: "+insRObj.getchargePerDay());
                                    }
                                    //Calling return_instrument method of InstrumentToRent class through object of Instrument class
                                    insRObj.return_instrument();
                                    break;
                                }
                            }
                        }  
                        //Checking if the instrument got returned or not
                        if(gotReturned == false){  
                                JOptionPane.showMessageDialog(myJf,instrumentName+" was not added to rent."); 
                        }
                    }
                }
            }
        }
        
        //To display the details
        else if(e.getSource() == rentDisplay){
            //To check if the arraylist is empty or not
            if(instrumentList.isEmpty()){
                JOptionPane.showMessageDialog(myJf,"Sorry, there are no instruments to display.","Message",JOptionPane.INFORMATION_MESSAGE);
            } 
            else{
                for(Instrument i:instrumentList){
                    if(i instanceof InstrumentToRent){
                        //Object of Instrument class is cast as InstrumentToRent
                        InstrumentToRent insR = (InstrumentToRent) i;
                        //Calling display method from InstrumentToRent class through object of Instrument class
                        insR.display();
                    }
                }
            }
        }
        else if(e.getSource() == saleDisplay){
            //To check if the arraylist is empty or not
            if(instrumentList.isEmpty()){
                JOptionPane.showMessageDialog(myJf,"Sorry, there are no instruments to display.","Message",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                for(Instrument i:instrumentList){
                    if(i instanceof InstrumentToSell){
                        //Object of Instrument class is cast as InstrumentToRent
                        InstrumentToSell insR = (InstrumentToSell) i;
                        //Calling display method from InstrumentToSell class through object of Instrument class
                        insR.display();
                    }
                }
            }
        }
        
        /*The textfields in the GUI
          are set to empty string
         */
        else if(e.getSource() == rentClear){
            insNameRent.setText(""); 
            insNameReturn.setText("");
            charge.setText("");
            cusNameRent.setText("");
            cusPhoneRent.setText("");
            cusPanRent.setText("");
            noOfDays.setText("");
            rentDay.setSelectedItem("");
            rentMonth.setSelectedItem("");
            rentYear.setSelectedItem("");
            returnDay.setSelectedItem("");
            returnMonth.setSelectedItem("");
            returnYear.setSelectedItem("");
        }
        /*The textfields in the GUI
          are set to empty string
          */
        else if(e.getSource() == saleClear){
            insNameSell.setText(""); 
            insPrice.setText("");
            cusNameSell.setText("");
            cusPhoneSell.setText("");
            cusPanSell.setText("");
            discountP.setText("");
            sellDay.setSelectedItem("");
            sellMonth.setSelectedItem("");
            sellYear.setSelectedItem("");
        }
        else{
            
        }
    }
    
    /**Main method of the class*/
    public static void main(String[] args)
    {
        new SarangiSansar();
    }
}