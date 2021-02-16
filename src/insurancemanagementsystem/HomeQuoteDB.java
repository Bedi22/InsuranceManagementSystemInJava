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

// Home quote database class to add, modify, delete, search the car quote into the array

public class HomeQuoteDB {
    
    
    // declare the Home quote array object
    
      private final int CAPACITY = 20; 
    private int count = 0;
    private final HomeQuote[] homeQuoteList = new HomeQuote[CAPACITY];
    
    
   // method to get no of counts in array
    
    public int getCount(){
        return this.count;
    }
    
    public int getCapacity(){
        return CAPACITY;
    }
    
     // method to add Home quote to the array
    
     public boolean addHomeQuote(HomeQuote homeQuote){
        boolean added = false;
        if (this.count < this.CAPACITY){
            this.homeQuoteList[count++] = homeQuote;
            added = true;
        }
        return added;
    }
    
     // method to delete Home quote from the database
     
    public boolean deleteHomeQuote(HomeQuote homeQuote){
        int loc = this.findHomeQuote(homeQuote);
        boolean deleted = false;
        if (loc >= 0 ){
            for(int i=loc + 1; i <count; i++)
                this.homeQuoteList[i-1] = this.homeQuoteList[i];
            count--;
            deleted = true;
        }
        return deleted;
    }
    
    // method to find the specific Home quote from tha array list
    
    public int findHomeQuote(HomeQuote homeQuote){
        int loc = -1;
        for (int i=0; i<count; i++){
            if (homeQuoteList[i].equals(homeQuote)){
                loc = i;
                break;
            }
        }
        return loc;
    }
    
    
     public int findHomeQuoteByClientAddress(HomeQuote homeQuote){
        int loc = -1;
        for (int i=0; i<count; i++){
            if (homeQuoteList[i].equalsByClientAddress(homeQuote)){
                loc = i;
                break;
            }
        }
        return loc;
    }
    
    
    
    // method to display all the Home quotes added into the database

    public void displayAllHomeQuotes(){
        for (int i=0; i<count; i++){
             
            homeQuoteList[i].display();
        }
    }
    
     // method to display each Home quote
    
    public void displayHomeQuote(int position){
        
      
        
        homeQuoteList[position].display();
    }
    
     // method to get Home quote from the array list
    
    public HomeQuote getHomeQuote(int loc){
        HomeQuote temp = null;
        if (loc < count)
            temp = homeQuoteList[loc];
        return temp;
    }
    
    
}
