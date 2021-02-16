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

// Class to execute the menu of Insurance Management System
public class MainMenu {
    
  
    
   // method to display the menu
    
    public static void mainMenu() {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
         int choice = 0;
        // declare car quote class as null
        CarQuote carQuote = null;
        
        // declare Home Quote Class as null
        HomeQuote homeQuote = null;
        
        Client client = new Client("",  "" , "", "");
        
        // loop to continue the menu
        
        do {
            System.out.println("Welcome to Insurance Management System");

            System.out.println("-----Main Menu-----");
            System.out.println("1. Create Car Insurance Quote");
            System.out.println("2. Create Home Insurance Quote");
            System.out.println("3. Add Car Quote to the database");
            System.out.println("4. Add Home Quote to the database");
            System.out.println("5. Delete a Car Quote from database");
            System.out.println("6. Delete a Home Quote From Database");
            System.out.println("7. Search Car Quote");
            System.out.println("8. Search Home Quote");
            System.out.println("9. Display all Car Quotes");
            System.out.println("10. Display All Home Quotes");
            System.out.println("11.Manage Client");
            System.out.println("0. Terminate application");
            System.out.print("Enter your choice : ");
            
           
             
            choice = Integer.parseInt(input.nextLine());

            // switch statement to compare the choice from the user input
            
            switch (choice) {
                case 1:
                    
                    // get the car quote information and create the car quote
                    
                {
                    
                     int position = ClientListMgr.findClient(new Client("","","",""));
                        if (position >= 0) {
                           
                             carQuote = CarQuote.createCarQuote();
                    System.out.println("New  Car insurance quote is created");
                    
                        } else {
                         
                             
                            System.err.println("client is not in the list.First Create Client");
                        }       
                    break;
                }
                    
                case 2:
                    
                    // get the home quote information and create the home quote
                    
                {
                    int position = ClientListMgr.findClient(new Client("","","",""));
                    if(position >= 0){
                    
                    homeQuote = HomeQuote.createHomeQuote();
                    System.out.println("New Home Quote Insurance  is created");
                    
                    }
                    
                    else {
                        
                         System.err.println("client is not in the list.First Create Client");
                        
                    }
                    break;
                    
                    
                }
                case 3:
                    
                    
                    
                    // add created car quote to the array list
                    
                {
                    
                    if (CarQuoteListMgr.addCarQuote(carQuote)) {
                        System.out.println("The requested carquote is added to the list");
                    } else {
                        System.out.println("The requested car quote is not added, list might be full");
                    }
                    
                    
                    break;
                    
                }
                
                
                case 4:
                    
                {
                    
                    // add created home quote to the array list
                    if (HomeQuoteListMgr.addHomeQuote(homeQuote)) {
                        System.out.println("The requested Home quote is added to the list");
                    } else {
                        System.out.println("The requested Home quote is not added, list might be full");
                    }   break;
                    
                }
                case 5:
                    {
                        // display all added car quotes and delete them by entering id
                        CarQuoteListMgr.displayAllCarQuotes();
                        System.out.print("Enter Car Quote ID to be deleted: ");
                        String id = input.nextLine();
                        if (CarQuoteListMgr.deleteCarQuote(new CarQuote("","","","",id, "", "", "", "", "", "", 0, ""))) {
                            System.out.println("The requested car quote is deleted");
                        } else {
                            System.out.println("The requested car quote is not in the list");
                        }  
                        
                        break;
                    }
                case 6:
                  
                {
                    
                    // display all added Home quotes and delete them by entering id
                        HomeQuoteListMgr.displayAllHomeQuotes();
                        System.out.print("Enter Home Quote ID to be deleted: ");
                        String id = input.nextLine();
                        if (HomeQuoteListMgr.deleteHomeQuote(new HomeQuote("","","","",id, "", "", "", 0))) {
                            System.out.println("The requested car quote is deleted");
                        } else {
                            System.out.println("The requested car quote is not in the list");
                        }     
                        
                        break;
                    }
                case 7:
                    
                    {
                        // display the search mneu of the car quote

                        CarQuote carQuote1= new CarQuote();
                        carQuote1.searchMenuCar();
                        break;
                        
                        
                       
                    }
                case 8:
                    {
                        
                         // display the search mneu of the home quote
                        
                     HomeQuote homeQuote1 = new HomeQuote();
                     homeQuote1.searchMenuHome();

                        
                        
                              break;
                    }
                case 9:
                    
                     // display all Car Quotes
                   
                    CarQuoteListMgr.displayAllCarQuotes();
                    break;
                case 10:
                    // display all home quotes
                    
                    HomeQuoteListMgr.displayAllHomeQuotes();
                    break;
                case 11:
                    // display  the client Menu
                    
                 
                  client.clientMenu();
                    break;
                default:
                    break;
            }
            
            // terminate the application

        } while (choice != 0);

    }
    
}
