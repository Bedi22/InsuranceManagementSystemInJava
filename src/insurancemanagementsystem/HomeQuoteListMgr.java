/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurancemanagementsystem;

/**
 *
 * @author dynam
 */


// class to manage all the methods from the Home quote db class

public class HomeQuoteListMgr {
    
    
    // call the Home quote db class to acess all the methods
    
      private static HomeQuoteDB homeQuoteDB = new HomeQuoteDB();
     
       // calling the add Home quote method from the car quote db class
     
     public static boolean addHomeQuote(HomeQuote homeQuote){
        return homeQuoteDB.addHomeQuote(homeQuote);
    }
     
       // calling  the delete method from the Home quote db 
    
    public static boolean deleteHomeQuote(HomeQuote homeQuote){
        return homeQuoteDB.deleteHomeQuote(homeQuote);
    }
    
     // calling the method to find the Home quote from the car quote db class
    
    public static int findHomeQuote(HomeQuote homeQuote){
        return homeQuoteDB.findHomeQuote(homeQuote);
    }
    
    public static int findHomeQuoteByClientAddress(HomeQuote homeQuote){
        return homeQuoteDB.findHomeQuoteByClientAddress(homeQuote);
    }
             
    
     // calling the method to get Home quote position from array
    
    public static HomeQuote getHomeQuote(int position){
        return homeQuoteDB.getHomeQuote(position);
    }
    
     // calling the method to display all the Home quotes saved in the array
    
    public static void displayAllHomeQuotes(){
        homeQuoteDB.displayAllHomeQuotes();
    }
    
      // method to call the single Home quote based on id
    
    public static void displayHomeQuote(int position){
        homeQuoteDB.displayHomeQuote(position);
    }
    
    // calling method to get number of quotes
    
    public static int numberOfHomeQuote(){
        return homeQuoteDB.getCount();
    }
    
    // calling the method to specify the array capacity
    
    public static int getCapacity(){
        return homeQuoteDB.getCapacity();
    }
    
}
