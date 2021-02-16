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

// car quote database class to add, modify, delete, search the car quote into the array
public class CarQuoteDB {
  
    
   // declare the car quote array object
     private final int CAPACITY = 20; 
    private int count = 0;  //How many strings are in array
    private CarQuote[] carQuoteList = new CarQuote[CAPACITY]; //How many at the most can be added
   
    
    
    // method to get no of counts in array
    
    public int getCount(){
        return this.count;
    }
    
    public int getCapacity(){
        return CAPACITY;
    }
    
    
    
    // method to add car quote to the array
    
     public boolean addCarQuote(CarQuote carQuote){
        boolean added = false;
        if (this.count < this.CAPACITY){
            this.carQuoteList[count++] = carQuote;
            added = true;
        }
        return added;
    }
    
    // method to delete car quote from the database
     
    public boolean deleteCarQuote(CarQuote carQuote){
        int loc = this.findCarQuote(carQuote);
        boolean deleted = false;
        if (loc >= 0 ){
            for(int i=loc + 1; i <count; i++)
                this.carQuoteList[i-1] = this.carQuoteList[i];
            count--;
            deleted = true;
        }
        return deleted;
    }
    
    // method to find the specific car quote from tha array list by id
    
    public int findCarQuote(CarQuote carQuote){
        int loc = -1;
        for (int i=0; i<count; i++){
            if (carQuoteList[i].equals(carQuote)){
                loc = i;
                break;
            }
        }
        return loc;
    }
    
    
   
    // method to display all the car quotes added into the database
    
    public void displayAllCarQuotes(){
        for (int i=0; i<count; i++){
            carQuoteList[i].display();
        }
    }
    
    // method to display each car quote
    
    public void displayCarQuote(int position){
        carQuoteList[position].display();
    }
    
 
    // method to get car quote from the array list
    
    public CarQuote getCarQuote(int loc){
        CarQuote temp = null;
        if (loc < count)
            temp = carQuoteList[loc];
        return temp;
    }
    
     
    
    
 
}
