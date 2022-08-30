/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 * @author Pa Pa Oo
 */
//major function 1: Add a new Book
    /*Ask user to input the required info: (title, name, etc). add the new book into array-list. 
      Display the updated products list.*/

//major function 2: Search Product
    /*Ask user to input the id# to search. check id# in array-list. 
      if found, display the prdouct
      if not found, display product not found*/
//major function 3: Sell Product 
    /*Ask the user to enter member id. then, ask product id# and quantity that member wants to purchase.
        then doundCalculate current balance and increment amount spent of member.Display the balance of quantity in store. 
//major function 4: Add a New Member
    /*Ask user to input the required info: (name id). add the new member into array-list. 
      Display the updated member list.*/
//major function 5: Delete a Member
    /*Ask user to input the id# to delete. check id# in array-list. 
      if found, delete and display the updated member list.
      if not found, display member not found*/

public class Start {
    public static void main(String[] args) {
                 
        Store st = new Store ();        
        Scanner in = new Scanner(System.in);
        
        int userChoice;
        boolean quit = false;
        int a = 0;
        int b = 0;
        int ch = 0;
        int r = 0;
        String n = " ";
        String title =" ";
        String aname =" ";
        int num = 0; 
        int copies = 0;
        double price = 0.0;
        Boolean ebook;
        
        do {
            //Displaying menu
            System.out.println();
            System.out.println("Welcome from UNCC MUSIC WORLD. Please enter your choice.");    
            System.out.println("\n------------ MENU -----------------");
            System.out.println("1. Display Store Inventory.");
            System.out.println("2. Add a new Book");
            System.out.println("3. Search Store Inventory.");
            System.out.println("4. Sell Store Inventory.");            
            System.out.println("5. Display Member Lists.");
            System.out.println("6. Search Member.");                      
            System.out.println("7. Add a New Member");   
            System.out.println("8. Delete a Member");
            System.out.println("9. Exit \n");
            System.out.print("Enter choice [1-9]: ");       
                 
        userChoice = in.nextInt();
        switch (userChoice) { // switch statement
                   
            case 1: //display inventory information by calling method
                st.displayShelf();                
                break;                
             
            case 2://add a new book by calling method
                st.addNewBook(title, aname, num, copies, price);
                break;
                
            case 3: //search inventory   
                    st.searchProduct();              

                break;
        
            case 4://sell inventory
                st.sellProduct();
                break; 
                
            case 5://display member information
                st.displayMember(); 
                break;          
            
            case 6:// seach member
              st.searchMember();
                              
                break;       
                    
            case 7://add a new member
                st.addNewMember(r,n); 
                break;
                   
            case 8://delete member
                st.deleteMember();
                break;
                
                        
            case 9://Exit
                System.out.println("Thank you... Goodbye!");	
                System.exit(0);
                break;   
                
        //if the users choose out of the menu option,
        //display invalid option
            default:
            	System.out.println("Ivalid Choice! Please choose again from MENU.");	
                System.out.println("");
		break;
    }
            
} while(userChoice != 9); //end of do-while loop

    }
}