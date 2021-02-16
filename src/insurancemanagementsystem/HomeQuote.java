/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurancemanagementsystem;

import java.util.Scanner;

/**
 *
 * @author dynam
 */

// subclasse Home Quote extends Super class Client

public class HomeQuote extends  Client{
    
    // declare variables
    private String homeId;
    private String typeOfPolicy;
    private String currentResidenceYear;
    private String yearOfBuildHome;
    private int noOfSmokeDetectors;

    
    
     // Home Quote constructor 
    
    public HomeQuote() {

        this("", "", "", "", "", "", "", "", 0);
    }
    
       // Home quote constructor passing the superclass parameters

    public HomeQuote(String client_Id) {
        this(client_Id, "", "", "", "", "", "", "", 0);
    }
    
    // Home quote constructor passing the superclass parameters

    public HomeQuote(String client_Id, String clientName) {
        this(client_Id, clientName, "", "", "", "", "", "", 0);
    }
    
    // Home quote constructor passing the superclass parameters

    public HomeQuote(String client_id, String clientName, String clientAddress) {
        this(client_id, clientName, clientAddress, "", "", "", "", "", 0);
    }

    
    // Home quote constructor passing the superclass parameters
    public HomeQuote(String client_id, String clientName, String clientAddress, String clientEmail) {
        this(client_id, clientName, clientAddress, clientEmail, "", "", "", "", 0);
    }

    //constructor for the home quote class with superclass parameters
    public HomeQuote(String client_id, String clientName, String clientAddress, String clientEmail, String homeId, String typeOfPolicy, String currentResidenceYear, String yearOfBuildHome,
            int noOfSmokeDetectors) {
        super(client_id, clientName, clientAddress, clientEmail);
        this.homeId = homeId;
        this.typeOfPolicy = typeOfPolicy;
        this.currentResidenceYear = currentResidenceYear;
        this.yearOfBuildHome = yearOfBuildHome;
        this.noOfSmokeDetectors = noOfSmokeDetectors;
    }

    // getter and setter methods to get and set the values after getting inputes from the user
    public String getHomeId() {
        return homeId;
    }

    public String setHomeId(String homeId) {
        return this.homeId = homeId;
    }

    public String getTypeOfPolicy() {
        return typeOfPolicy;
    }

    public String setTypeOfPolicy(String typeOfPolicy) {
        return this.typeOfPolicy = typeOfPolicy;
    }

    public String getCurrentResidenceYear() {
        return currentResidenceYear;
    }

    public String setCurrentResidenceYear(String currentResidenceYear) {
        return this.currentResidenceYear = currentResidenceYear;
    }

    public String getYearOfBuildHome() {
        return yearOfBuildHome;
    }

    public String setYearOfBuildHome(String yearOfBuildHome) {
        return this.yearOfBuildHome = yearOfBuildHome;
    }

    public int getNoOfSmokeDetectors() {
        return noOfSmokeDetectors;
    }

    public int setNoOfSmokeDetectors(int noOfSmokeDetectors) {
        return this.noOfSmokeDetectors = noOfSmokeDetectors;
    }

    // To String method to display data in string format
    @Override
    public String toString() {
        return super.toString() + "HomeQuote [homeId=" + homeId + ", typeOfPolicy=" + typeOfPolicy + ", currentResidenceYear="
                + currentResidenceYear + ", yearOfBuildHome=" + yearOfBuildHome + ", noOfSmokeDetectors="
                + noOfSmokeDetectors + "]";
    }

    // display method to display data after adding to the array of object with superclass client information
    @Override
    public void display() {

        System.out.println(Utils.ANSI_BLACK_BACKGROUND + Utils.RED_BOLD + "Home Quote Information of "  + Utils.BLUE_BOLD + super.getClientName());
       
        System.out.println(Utils.ANSI_BLACK_BACKGROUND + Utils.RED_BOLD + "Client Address is "  + Utils.BLUE_BOLD + super.getClientAddress());
        System.out.println("Home Quote ID     : " + this.getHomeId());
        System.out.println("Type Of Policy: " + this.getTypeOfPolicy());
        System.out.println("Years of Build Home: " + this.getYearOfBuildHome());
        System.out.println("Current Residence Year: " + this.getCurrentResidenceYear());
        System.out.println("-------------------------------------");
    }

    // method to compare and get Home quote id
    public boolean equals(Object object) {
        HomeQuote temp = null;
        boolean result = false;

        if (object instanceof HomeQuote) {
            temp = (HomeQuote) object;
            if (this.getHomeId().equals(temp.getHomeId())) {
                result = true;
            }

        }
        return result;
    }
    
     // method to compare and get Home quote by address
    
    public boolean equalsByClientAddress(Object object) {
        HomeQuote temp = null;
        boolean result = false;

        if (object instanceof HomeQuote) {
            temp = (HomeQuote) object;
            if (super.getClientAddress().equals(temp.getClientAddress())) {
                result = true;
            }

        }
        return result;
    }

    // method to get inputs and create Home quotes
    public static HomeQuote createHomeQuote() {

       
        

        Scanner input = new Scanner(System.in);
        
         Client client = new Client();
         
         // get superclass client list

        ClientListMgr.displayAllClient();

        System.out.println("Enter Client Name for whom you want to create Home Quote");
        client.setClientName(input.next());
        System.out.println("Enter The Client New Address ");
        client.setClientAddress(input.next());
        
       
        String homeId;
        String typeOfPolicy, yearsOfBuildHome, currentResidenceYear;
        int noOfSmokeDetectors;
        
        
        System.out.print("Enter the Home Quote Id:");
        homeId = input.next();
        System.out.print("Enter the type of policy :");
        typeOfPolicy = input.next();
        System.out.println("Enter the year in which home is build");
        yearsOfBuildHome = input.next();
        System.out.println("Enter current Residence year");
        currentResidenceYear = input.next();
        System.out.println("Enter no of smoke detectors installed in your home");
        noOfSmokeDetectors = input.nextInt();
        
        
        
                  // return Home quote with superclass Client variables
        

        return new HomeQuote(client.getClient_id(),client.getClientName(), client.getClientAddress(), client.getClientEmail(), homeId, typeOfPolicy, currentResidenceYear, yearsOfBuildHome, noOfSmokeDetectors);
        
       

    }
    
    
    // search menu of Home quote
    
      public void searchMenuHome(){
        
        Scanner input = new Scanner(System.in);
        
        
        int option = 3;
        do {
        
          System.out.println("Select Your Choice \n1.Search Home Quote By id \t2. Search Home Quote By Client Name \t3. Exit From Home Quote Search Menu");
                        
                          option = Integer.parseInt(input.next());
                        
                     
                        
                        
                        switch(option){
                            
                               // Case 1 for Search Home quote by entering ID
                            
                            case 1:
                        
                    
                             
                               System.out.print("Enter Home Quote ID to be Search : ");
                        String id = input.next();
                        int position = HomeQuoteListMgr.findHomeQuote(new HomeQuote("","","","",id, "", "", "", 0));
                        if (position >= 0) {
                            HomeQuoteListMgr.displayHomeQuote(position);
                        } else {
                            System.out.println("The requested Home quote is not in the list");
                        } 
                        
                        break;
                        
                           // Search Home quote by entering Client Address
                             
                            case 2:
                                
                                
                           
                           System.out.print("Enter Client Address : ");
                        String address = input.next();
                        int pos = HomeQuoteListMgr.findHomeQuoteByClientAddress (new HomeQuote("","",address,"","", "", "", "", 0));
                        if (pos >= 0) {
                            HomeQuoteListMgr.displayHomeQuote(pos);
                        } else {
                            System.out.println("The requested Home quote is not in the list");
                        } 
                         
                        
                        break;
                        
                        default:
                            
                            System.out.println("Invalid Choice");
                            break;
                      
                         }
                       
        
                     
        }while(option != 3);
        
}
    

   
    
    
}
