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

// class to manage all the methods from the car quote db class
public class CarQuoteListMgr {
    
    // call the car quote db class to acess all the methods
    
     private static CarQuoteDB carQuoteDB = new CarQuoteDB();
     
     // calling the add car quote method from the car quote db class
     
     public static boolean addCarQuote(CarQuote carQuote){
        return carQuoteDB.addCarQuote(carQuote);
    }
    
     // calling  the delete method from the car quote db 
     
    public static boolean deleteCarQuote(CarQuote carQuote){
        return carQuoteDB.deleteCarQuote(carQuote);
    }
    
    
    // calling the method to find the car quote from the car quote db class
    
    public static int findCarQuote(CarQuote carQuote){
        return carQuoteDB.findCarQuote(carQuote);
    }
    
    
    
    
    // calling the method to get car quote position from array
    
    public static CarQuote getCarQuote(int position){
        return carQuoteDB.getCarQuote(position);
    }
    
    
    // calling the method to display all the car quotes saved in the array
    
    public static void displayAllCarQuotes(){
        carQuoteDB.displayAllCarQuotes();
    }
    
    // method to call the single car quote based on id
    
    public static void displayCarQuote(int position){
        carQuoteDB.displayCarQuote(position);
    }
    
    
   // calling method to get number of quotes
    
    public static int numberOfCarQuote(){
        return carQuoteDB.getCount();
    }
    
    // calling the method to specify the array capacity
    
    public static int getCapacity(){
        return carQuoteDB.getCapacity();
    }
    
}
