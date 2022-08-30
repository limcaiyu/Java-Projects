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
public class Book extends Product {

    private boolean eBook ;

    /**
     * constructor
     * @param title
     * @param name
     * @param id
     * @param quantity
     * @param price
     * @param eBook
     */
    public Book (String title, String name, int id, int quantity, double price, boolean eBook) {

   super(title, name, id, quantity, price);
    this.title = title;
    this.name = name;
    this.Id = id;
    this.quantity = quantity;
    this.price = price;
    seteBook(eBook);

  }
    /**
    * Getter
    * @return true or false
    */
    public boolean iseBook() {
        return eBook;
    }

    /**
     * Setter
     * @param eBook
     */
    public void seteBook(boolean eBook) {
        this.eBook = eBook;
    }


}