/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurancemanagementsystem;

import java.io.Console;

/**
 *
 * @author dynam
 */
// client database class to add client object
public class ClientDb {
    
  
   
     private final int CAPACITY = 20; 
    private int count = 0;  //How many strings are in array
    private Client[] clientList = new Client[CAPACITY]; //How many at the most can be added
   
    
    
    // method to get no of counts in array
    
    public int getCount(){
        return this.count;
    }
    
    public int getCapacity(){
        return CAPACITY;
    }
    
    
    
    // method to add car quote to the array
    
     public boolean addClient(Client client){
        boolean added = false;
        if (this.count < this.CAPACITY){
            this.clientList[count++] = client;
            added = true;
        }
        return added;
    }
    
   
     // method to delete client
     
    public boolean deleteClient(Client client){
        int loc = this.findClient(client);
        boolean deleted = false;
        if (loc >= 0 ){
            for(int i=loc + 1; i <count; i++)
                this.clientList[i-1] = this.clientList[i];
            count--;
            deleted = true;
        }
        return deleted;
    }
    
  
    // method to find client
    
    public int findClient (Client client){
        int loc = -1;
        for (int i=0; i<count; i++){
            if (clientList[i].equals(client)){
                loc = i;
                break;
            }
        }
        return loc;
    }
    
    // method to display all client
   
  
    public void displayAllClient(){
        for (int i=0; i<count; i++){
            clientList[i].display();
        }
    }
    
    // method to display specific client
    
   
    public void displayClient(int position){
        clientList[position].display();
    }
    
    //method get client from array
    
    
    public Client getClient(int loc){
        Client temp = null;
        if (loc < count)
            temp = clientList[loc];
        return temp;
    }
    
     
    
    
    
}
