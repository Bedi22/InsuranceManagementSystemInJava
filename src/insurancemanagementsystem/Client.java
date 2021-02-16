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

// Super Class Client
public class Client {
    
    // variables declared

   private String client_id;
    private String clientName;
    private String clientAddress;
    private String clientEmail;
    
    
    // Client class constructor

    public Client(String client_id, String clientName, String clientAddress, String clientEmail) {
        this.client_id = client_id;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientEmail = clientEmail;
    }
    
    // constructor
    
    public Client(String clientName,String clientAddress,String clientEmail){
        this("",clientName,clientAddress,clientEmail);
        
    }
    
   // constructor with no parametres
    
    public Client(){
        
        this("","","","");
    }
    
    
    // getter and setters methods

    public String getClient_id() {
        return client_id;
    }

    public String setClient_id(String client_id) {
        return this.client_id = client_id;
    }

    public String getClientName() {
        return clientName;
    }

    public String setClientName(String clientName) {
       return this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    // to string method to display client information
    
    @Override
    public String toString() {
        return "Client{" + "client_id=" + client_id + ", clientName=" + clientName + ", clientAddress=" + clientAddress + ", clientEmail=" + clientEmail + '}';
    }

    // display method to display data after adding to the array of object
    public void display() {
        System.out.println("Client Information-----");
        System.out.println("Client Id     : " + this.getClient_id());
                System.out.println("Client Name     : " + this.getClientName());
        System.out.println("Client Address    : " + this.getClientAddress());


        System.out.println("Client Email     : " + this.getClientEmail());

        System.out.println("-------------------------------------");
    }

    // method to compare and get car quote id
    public boolean equals(Object object) {
        Client temp = null;
        boolean result = false;
        if (object instanceof Client) {
            temp = (Client) object;
            if (this.getClientName().equals(temp.getClientName()));
            result = true;
        }
        return result;
    }
    
    
    // create client before adding to the array

    public static Client createClient() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Client id");
        String id = input.next();
        System.out.println("Enter Client Name");
        String clientName = input.next();
        System.out.println("Enter Client Address");
        String clientAddress = input.next();
        System.out.println("Enter the client Email");
        String clientEmail = input.next();

        return new Client(id, clientName, clientAddress, clientEmail);
    }
    
    
    // client Menu
    
    public void clientMenu(){
        Scanner scanner = new Scanner(System.in);
        
        Client client = null;
        
         int choice = 0;
        do {
            System.out.println("***Client Menu***");
            System.out.println("1.Create a New Client");
            System.out.println("2. Add a new Client into the database");
            System.out.println("3. Find a Client");
            System.out.println("4. Display All Client");
            System.out.println("5. Modify Client");
            System.out.println("6. Delete Client");
            
            System.out.println("9. Exit");
            System.out.print("Enter your choice -> ");
            choice = Integer.parseInt(scanner.nextLine());
            
            // for creating client
            
            if (choice == 1) {
                 client = Client.createClient();
            } 
            
            // for adding client to array
            else if (choice == 2) {
                
                
                
                if(ClientListMgr.addClient(client)){
                    
                    System.out.println("Client is added Succefully in the database");
                
            }
                
                else{
                    
                    System.out.println("Client is not added in the database.");
                }
               
            }
            
            
            // for search client by name
            
            else if (choice == 3) {
                
               System.out.print("Enter Client Name to be Search : ");
                        String name = scanner.nextLine();
                        int position =  ClientListMgr.findClient(new Client("", name, "", ""));
                        if (position >= 0) {
                            ClientListMgr.displayClient(position);
                        } else {
                            System.out.println("Client is not found in the database");
                        }       
               
            }
            
            // display all clients
            
            else if (choice  == 4){
                
                ClientListMgr.displayAllClient();
            }
            
           // delete client by entering name
            
            else if (choice == 6){
                
                ClientListMgr.displayAllClient();
                        System.out.print("Enter Client Name to be Deleted: ");
                        String name = scanner.nextLine();
                        if (ClientListMgr.deleteClient(new Client("", name, "", ""))) {
                            System.out.println("The client is deleted");
                        } else {
                            System.out.println("Unable to delete the client");
                        }      
            }
            
            
            
            
            
        } while (choice != 9);
    }


   
   
    
    
}
