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
public class Product {    
    
String title;
String name;
int Id;
int quantity;
double price;
    /**
     *
     * @param title
     * @param name
     * @param id
     * @param quantity
     * @param price
     */
public Product(String title, String name, int id, int quantity, double price){
        
    this.title = title;
    this.name = name;
    this.Id = id;
    this.quantity = quantity;
    this.price = price;

}
    /**
     * Getter
     * @return title of book and CD
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter 
     * @return name of author name or singer name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * @return IDnumber of book and CD
     */
    public int getId() {
        return Id;
    }

    /**
     * Setter
     * @param id
     */
    public void setId(int id) {
        this.Id = id;
    }

    /**
     * Getter 
     * @return number of copies for books and CD
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter
     * @return price of book and CD
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
 
//toString method to print out inventory info: in format
@Override
public String toString(){
        
  return (" Title: " + this.getTitle() + " \t Name: " + getName() + "\t ID: "+ getId()+ "\t Quantity Available: " + getQuantity() + "\t\tPrice:  $" +getPrice());

}
        
}
