/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author Pa Pa Oo
 */
public class Store {
      
  ArrayList<Product> products = new ArrayList<>(); //Array List to hold product info
  ArrayList<Member> members = new ArrayList<>();//Array List to hold member info
   Scanner in = new Scanner(System.in);   
   
 //default constructor  
public Store () {
    
    products.add(new Book ("Starting out with Java", "Randy Smith", 2101, 65, 112.32, false));
    products.add(new Book ("Java Programming III", "Randy Smith", 2211, 98, 73.25, false));
    products.add(new Book ("Software Structures", "Christopher Lee", 2313, 99, 54.00, true));
    products.add(new Book ("Cognitive Science I", "Lisa Wright", 2301, 8, 67.32, true)); 
    products.add(new Book ("Computer Graphics", "Donna Sue", 2401, 9, 135.00, false));       
    products.add(new Book ("Date Structure II", "Kimberly Ann",2501, 9, 120.00, true));
    products.add(new Book ("Cognitive Science II", "Lisa Wright", 2601, 55, 42.25, true)); 
  
    
    products.add(new CD ("Impulse Reaction", "Richard Green", 3011, 7, 11.32, 10 )); 
    products.add(new CD ("Fourth Dimension", "Betty Young", 3021, 9, 12.25, 12));
    products.add(new CD ("Fifth Dimension", "Thomas Adam", 3031, 8, 13.00, 11)); 
    products.add(new CD ("Sixth Sense Cast", "Betty Young", 3041, 89, 67.32, 8)); 
    products.add(new CD ("Crossing a bridge", "James William", 3051, 80, 135.00, 9));       
    products.add(new CD ("Cherry in Market ", "Richard Green", 3061, 97, 173.22, 11));
    products.add(new CD ("My Fellow Citizen", "Linda Martin",3071, 50, 120.00, 10));        
  
    
    members.add(new Member(144, "John Harris"));
    members.add(new Member(155, "Chris Nelson"));
    members.add(new Member(166, "Susan Baker"));
    members.add(new  PMember (211, "David Lewis", 10.00 ));
    members.add(new  PMember (222, "Paul John", 10.00 ));
    members.add(new  PMember (233, "Irvin Garcia", 10.00 ));
     
    }
//display inventory of store
public void displayShelf(){
            for(int i = 0;i<products.size();i++) {
            System.out.println(products.get(i).toString());
        }
}   
//search book or CD based on unique ID number which input by user
public void searchProduct() {
    displayShelf();
    int searchId, status = -1;
    System.out.println(" ---> Enter ID# from the above list to Search : ");
    searchId = in.nextInt();
	for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == searchId){
		status = i;
                }          
        }
                if (status != -1) {
                System.out.println("------- DETAILS --------");
                System.out.println("");
                
                System.out.println(products.get(status).toString());
                }
                else {        
                System.out.println("\t Sorry..... Item Not Found....!!!");
                System.out.println("");
                
                 }         
                
       
}
//major funtion 1
//addng a new book
public void addNewBook(String bTitle, String bName, int bId, int numCopies, double p){
    
    int choice = 0;
    String title = "";
    String name = "";
    int copies = 0;
    double price = 0;
    char input = ' ';
    
    System.out.print(" --> Enter Book Name: ");
    title = in.nextLine(); 
    System.out.print("--> Enter Author Name: ");
    name = in.nextLine(); 
    System.out.print("--> Enter number of Copies: ");
    copies = in.nextInt();    
    System.out.print("--> Enter Book Price: ");
    in.nextLine();
    price = in.nextDouble();    
    //int rand = (int)(Math.random() * 201 + 1601);
    System.out.println(" ---> Please create 4 digits unique ID# [start with  \"1\"] : " ); 
    System.out.println("Please see unique ID from the above list.");
    int num = in.nextInt();
    in.nextLine();
    
    Boolean ebook = false;
    System.out.println("Available of eBook version? [Y/N]");
    input = in.next().charAt(0);          
        if (((input == 'Y' ) || (input == 'y'))) {
           products.add(new Book (title, name, num, copies, price, ebook));
           ebook =true;
        System.out.println("Ebook version is available.");
            System.out.println("");
        }
        else if (((input == 'N' ) || (input == 'n'))) {
            ebook = false;
        products.add(new Book (title, name, num, copies, price, ebook));
        System.out.println("Ebook version is uhvailable .");
            System.out.println("");
                }
        else  {
            System.out.println("Invalid input.");
            System.out.println("");
        }
   
    System.out.println("**********  NEW BOOK DETAILS    **********");
    System.out.println();
    System.out.println("Book Name: " + products.get(products.size() - 1).getTitle());
    System.out.println("Author Name: " + products.get(products.size() - 1).getName());
    System.out.println("Book ID: " + num);
    System.out.println("Number of Copies:" + products.get(products.size() - 1).getQuantity());
    System.out.println("Price: " + products.get(products.size() - 1).getPrice());
    System.out.println("Book ID: " + products.get(products.size() - 1).getId());
    System.out.println("Available eBook version: " +  ebook);

}
//major function 3
//sell a book or a cd based on unique ID number which input by user
//major function 3
//sell a book or a cd based on unique ID number which input by user
public void sellProduct() {
    double price = 0.0;
    double sum = 0.0;
    int amountSold = 0;
    int reaminQuantity;
    int mid = 0;
    int pide = 0;    
    double totalAmount = 0.0;
    double spent;
    int temp;  
    int check = -1;    
    int status = -1;
       
        displayMember();
         
        //prompt the user to enter the member ID# 
        System.out.println(" ---> Enter the member ID# from the above-mentioned list.");
        mid = in.nextInt();
	for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberId() == mid){
		status = i;
            }
        }
            if (status!= -1) { 
                displayShelf();   
                System.out.println(" ---> Enter the unique book or CD ID# you want to sell: ");
                int pid = in.nextInt();//ask to input inventory id             
                System.out.println(" ---> Enter the number of copies you want to sell: ");
                int num = in.nextInt();//ask to input number of copies to sell
               
                for ( int i = 0; i < products.size(); i++) {   
                    if((products.get(i).getId() == pid) && (products.get(i).getQuantity() >= num))     {
                        check = i;
                    }
                }
                    if (check != -1) {                         
                        price =  products.get(check).getPrice();                        
                        sum = (price * num);        
                        System.out.println("Current Balance is: "+ sum);

                        reaminQuantity = products.get(check).getQuantity() - num;    
                        System.out.println("ID : " + pid + " \t Name: " + products.get(check).getName()+ " \t " + num + " copies is sold.");
                        System.out.println("Remaining quantity are : " + reaminQuantity);
                        System.out.println("");
                        
                        products.get(check).setQuantity(products.get(check).getQuantity() - num);   
                        members.get(status).setAmountSpent(members.get(status).getAmountSpent() + sum);
                                             
                            }
                     else {
                           System.out.println("\t Sorry..... it is either invalid ID# or quantity is less than what you entered");  
                            }
                    }           
            
         else {
                System.out.println("Invalid member ID has entered. ");
                  
                }   
     
}      

//display member information
public void displayMember(){
      for(int i = 0;i<members.size();i++) {
        System.out.println(members.get(i).toString());

        }
        
     }  
//major function 4
//look for member based on unique ID key in by users
public void searchMember() {
    displayMember();
int searchId, status = -1;
    System.out.println(" ---> Enter ID# from the above list to Search : ");
    searchId = in.nextInt();
	for (int i = 0; i < members.size(); i++) { //look for id#
            if (members.get(i).getMemberId() == searchId){ // if found store index in status
		status = i; 
                }          
        }
                if (status != -1) {
                System.out.println("------- DETAILS --------");
                System.out.println("");
                
                System.out.println(members.get(status).toString());
                }
                else {        
                System.out.println("\t Sorry..... Member Not Found....!!!");
                System.out.println("");
                
                 }         
                     
}
//adding a new member
public void addNewMember(int memberId, String memberName){
    int pMethod = 0;
    int choice = 0;
    int newId = 0;
    String name = "";
    System.out.println("We have two membership types: Premium Member and Regular Member.");    
    System.out.println("\t1. Premium \t ($10/monthly)\n\t2. Regular \t (Free)");
    System.out.print("Please choose membership type: ");
    choice = in.nextInt();
    
    //if user select to add a new Premium Member
if (choice == 1){    
    //promot the user to input the required info: for new member
    System.out.println(" --> Enter name: ");
    in.nextLine();
    name = in.nextLine();    

    System.out.println(" --> Please create 3 digits unique ID# for new premium member [start with  \"4\"] : ");
    newId = in.nextInt();
    in.nextLine();
    members.add(new PMember (newId, name, 10.00));
    System.out.println("");
         
    System.out.println("How would you like to pay your membership fees?");
    System.out.println("1.Cash" + "\n2.Credit" + "\n3.Debit");
    pMethod = in.nextInt();
  
 
    //printing a new premium member info
    System.out.println("**********  NEW MEMBER DETAILS    **********");
    System.out.println("Member Name: " + members.get(members.size() - 1).getMemberName());
    System.out.println("MemberID: " + newId);
    System.out.println("Membership Type: Premium");
    switch(pMethod) {
    case 1:            
        System.out.println("Membership fee has been paid by cash.");
       break;
    
    case 2: 
        System.out.println("Membership fee has been paid by credit card.");
    break;
    
    case 3:
        System.out.println("Membership fee has been paid by debit card.");
    break;
    
    default:
        System.out.println("Membership fee has not paid yet.Please settle your payment.");
        System.out.println("You might have entered invalid input.Please try again");
        break;
    }   
    System.out.println();    
    System.out.println("Information of premium member is updated in the list as below:");
    System.out.println("");
    displayMember(); 
}
     
//if user slect to add a new Regular Member
else if (choice == 2){
     //promot the user to input the required info: for new member    
    System.out.println(" -->Enter name: ");
    in.nextLine();
    name = in.nextLine();    
  
    System.out.println("Please create 3 digits unique ID# for new regular member [start with  \"3\"]: ");
    newId = in.nextInt();
    members.add(new Member (newId, name));
    System.out.println("");
    
    //printing new member info
    System.out.println("**********  NEW MEMBER DETAILS    **********");
    System.out.println();
    System.out.println("Member Name: " + members.get(members.size() - 1).getMemberName());
    System.out.println("MemberID: " + newId);
    System.out.println("Member Type: Regular");
    System.out.println("Member fee is free for regular member.");
    System.out.println("Information of premium mmeber is updated in the list as below:");
    System.out.println("");
    displayMember();               
    }

else {
    System.out.println("Invalid choice. Please try again.");
    }
    }

//major function 5
//deleting member
public void deleteMember(){  
        displayMember();
        int index ; 
        //prompt the user to enter the member ID# to remove
        System.out.println(" ---> Enter the member ID# that you want to delete from the above-mentiond list.");
        boolean input = false;
        int deleteId, status = -1;
        //prompt the user to enter member ID 
        System.out.println(" --> Enter ID# to delete: ");
        deleteId = in.nextInt();
	for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberId() == deleteId)
		status = i;
	}
            if (status!= -1) { 
            members.remove(status);
            System.out.println("Member ID: "+ deleteId + " has been removed.");
            System.out.println("Updated members list: ");
            System.out.println();
            displayMember(); // display updated member list
    } else {        
            System.out.println("\t Sorry..... Member Not Found...!!!");
            System.out.println("");
                }            
  
}

    
}







