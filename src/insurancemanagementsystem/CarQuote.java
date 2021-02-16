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

// CarQuote Subclass extends Client SuperClass
public class CarQuote extends  Client{
    
  
// declare variables
    
    private String carId;

    private String vinNumber;
    private String dateOfBirth;
    private String maritalStatus;
    private String licenseType; 
    private String postalCode;
    private String vehicleMakeYear;
    private int dailyCommute;
    private String parkingLocation;

    
    
    // car quote constructor 
    
      public CarQuote(){
        this("","","","","","","","","","","",0,"");
    }
    
    
   
        // car quote constructor passing the superclass parameters
      
    
    public CarQuote(String client_Id){
        this(client_Id,"","","","","","","","","","",0,"");
    }
    
      // car quote constructor passing the superclass parameters
    
    public CarQuote(String client_Id, String clientName){
        this(client_Id,clientName,"","","","","","","","","",0,"");
    }
    
      // car quote constructor passing the superclass parameters
    
     public CarQuote(String client_Id, String clientName, String clientAddress){
        this(client_Id,clientName,clientAddress,"","","","","","","","",0,"");
    }
     
     
       // car quote constructor passing the superclass parameters
      public CarQuote(String client_Id, String clientName, String clientAddress, String clientEmail){
        this(client_Id,clientName,clientAddress,clientEmail,"","","","","","","",0,"");
    }
    
    
    
    
    
    //constructor for the car quote class with superclass parameters

    public CarQuote(String client_Id,String clientName, String clientAddress, String clientEmail, String carId, String vinNumber, String dateOfBirth, String maritalStatus, String licenseType,
            String postalCode, String vehicleMakeYear, int dailyCommute, String parkingLocation) {
       super(client_Id,clientName,clientAddress,clientEmail);
        this.carId = carId;
        this.vinNumber = vinNumber;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.licenseType = licenseType;
        this.postalCode = postalCode;
        this.vehicleMakeYear = vehicleMakeYear;
        this.dailyCommute = dailyCommute;
        this.parkingLocation = parkingLocation;
    }
    
    
   
   
    
    // getter and setter methods to get and set the values after getting inputes from the user

    public String getCarId() {
        return carId;
    }

    public String setCarId(String id) {
        return this.carId = id;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String setVinNumber(String vinNumber) {
        return this.vinNumber = vinNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String setDateOfBirth(String dateOfBirth) {
        return this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String setMaritalStatus(String maritalStatus) {
       return  this.maritalStatus = maritalStatus;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public String setLicenseType(String licenseType) {
       return this.licenseType = licenseType;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String setPostalCode(String postalCode) {
        return this.postalCode = postalCode;
    }

    public String getVehicleMakeYear() {
        return vehicleMakeYear;
    }

    public String setVehicleMakeYear(String vehicleMakeYear) {
        return this.vehicleMakeYear = vehicleMakeYear;
    }

    public int getDailyCommute() {
        return dailyCommute;
    }

    public int setDailyCommute(int dailyCommute) {
       return this.dailyCommute = dailyCommute;
    }

    public String getParkingLocation() {
        return parkingLocation;
    }

    public String setParkingLocation(String parkingLocation) {
        return this.parkingLocation = parkingLocation;
    }
    
    
    
    // To String method to display data in string format
    

    @Override
    public String toString() {
        return  super.toString() + "CarQuote [id=" + carId + ", vinNumber=" + vinNumber + ", dateOfBirth=" + dateOfBirth
                + ", maritalStatus=" + maritalStatus + ", licenseType=" + licenseType + ", postalCode=" + postalCode
                + ", vehicleMakeYear=" + vehicleMakeYear + ", dailyCommute=" + dailyCommute + ", parkingLocation="
                + parkingLocation +   "]";
    }
    
    
    
    // display method to display data after adding to the array of object with SuperClass Client Information
    
    @Override
    public void display(){
       
         System.out.println( Utils.ANSI_BLACK_BACKGROUND + Utils.RED_BOLD + "Car Quote Information of Mr  " + Utils.BLUE_BOLD + super.getClientName());
       
        System.out.println( Utils.ANSI_BLACK_BACKGROUND + Utils.RED_BOLD + "Client Email is "  + Utils.BLUE_BOLD + super.getClientEmail());
        System.out.println("Car Quote ID     : " + this.carId);
        System.out.println("Vin Number: " + this.getVinNumber());
        System.out.println("Postal Code: " + this.getPostalCode());
        System.out.println("Date Of Birth: " + this.getDateOfBirth());
        System.out.println("Marital Status: " + this.getMaritalStatus());
        System.out.println("License Type: " + this.getLicenseType());
        System.out.println("Vehicle Make Year: " + this.getVehicleMakeYear());
        System.out.println("Parking Location: " + this.getParkingLocation());
        System.out.println("-------------------------------------");
       
    }
    
    // method to compare and get car quote by id
    
     public boolean equals(Object object){
        CarQuote temp = null;
        boolean result = false;
        if (object instanceof CarQuote){
            temp = (CarQuote) object;
            if (this.getCarId().equals(temp.getCarId()))
                result = true;
        }
        return result;
    }
     
     
    
    
    
     // method to get inputes and create car quotes
     
    public static CarQuote createCarQuote(){
       
        
        
          

        Scanner input = new Scanner(System.in);
        
         Client client = new Client();
         
         
         // get the superclass client information

        ClientListMgr.displayAllClient();

        System.out.println("Enter Client Name for whom you want to create Car Quote");
        client.setClientName(input.next());
        System.out.println("Enter The Client Email ");
        client.setClientEmail(input.next());
        
        String carId;
        String vinNumber,dateOfBirth, maritalStatus,licenseType,postalCode,vehicleMakeYear,parkingLocation;
        
        
        
      
                
        int dailyCommute;
        System.out.print("Enter the Car Quote Id:");
        carId = input.next();
       
        System.out.print("Enter the Vin Number of your Vehicle :");
        vinNumber = input.next();
        System.out.println("Enter Your Date of Birth \n. The Format is like (dd/mm/year)");
        dateOfBirth=input.next();
        System.out.println("Enter Your Marital Status");
        maritalStatus=input.next();
        System.out.println("Enter your license Type G1/G2/G3");
        licenseType=input.next();
        System.out.println("Enter Your Postal Code");
        postalCode=input.next();
        System.out.println("Enter Your Vehicle Make Year");
        vehicleMakeYear=input.next();
         System.out.println("Enter your daily Commute");
        dailyCommute=Integer.parseInt(input.next());
        System.out.println("Enter the parking Location at Night");
        parkingLocation=input.next();
       
                
        // return car quote with superclass Client variables
 
       return new  CarQuote(client.getClient_id(),client.getClientName(), client.getClientAddress(),client.getClientEmail(),carId, vinNumber, dateOfBirth, maritalStatus, licenseType, postalCode, vehicleMakeYear, dailyCommute , parkingLocation);
      
    
    }
    
    // search menu for Car Quote
    
    public void searchMenuCar(){
        
        Scanner input = new Scanner(System.in);
        
        
        int option = 2;
        do {
        
          System.out.println("Select Your Choice \n1.Search Car Quote By id \t2. Exit From Car Quote Search Menu");
                        
                          option = Integer.parseInt(input.next());
                        
                      
                        
                        
                        switch(option){
                            
                            
                              //  case one for Search car quote by entering ID
                            
                            case 1:
                        
                    
                             
                             System.out.print("Enter Car Quote ID to be Search : ");
                        String id = input.next();
                        int position = CarQuoteListMgr.findCarQuote(new CarQuote("","","","",id, "", "", "", "", "", "", 0, ""));
                        if (position >= 0) {
                            CarQuoteListMgr.displayCarQuote(position);
                        } else {
                            System.out.println("The requested Car quote is not in the list");
                        } 
                        
                        break;
                        
                         
                        
                        
                        
                        default:
                            
                            System.out.println("Invalid Choice");
                            break;
                      
                         }
                       
        
                     
        }while(option != 2);
        
}
    
}
                         
                    
                        
                        
                       
                    
                
                         
                         

    
    
    
 
    
    
   
  


