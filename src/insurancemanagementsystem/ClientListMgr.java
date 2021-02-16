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

// class to manage all the methods from the Client db class
public class ClientListMgr {
    
     // call the clientdb class to acess all the methods
     
     private static ClientDb clientDb = new ClientDb();
     
     
      // calling the add client method from the car quote db class
     
     public static boolean addClient(Client client){
        return clientDb.addClient(client);
    }
    
      // calling  the delete method from the client db 
     
    public static boolean deleteClient(Client client){
        return clientDb.deleteClient(client);
    }
    
     // calling the method to find the Client from the client db class
   
    
    public static int findClient(Client client){
        return clientDb.findClient(client);
    }
    
    
    // calling the method to get Client position from array
    
    public static Client getClient(int position){
        return clientDb.getClient(position);
    }
    
     // calling the method to display all the clients saved in the array
   
    public static void displayAllClient(){
        clientDb.displayAllClient();
    }
    
    // method to call the single client based on id
    
    public static void displayClient(int position){
        clientDb.displayClient(position);
    }
    
    
   // calling method to get number of clients
    
    public static int numberOfClient(){
        return clientDb.getCount();
    }
    
  
      // calling the method to specify the array capacity
    
    public static int getCapacity(){
        return clientDb.getCapacity();
    }
    
}
