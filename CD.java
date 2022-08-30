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
public class CD extends Product {
    private int numTrack ; 

    /**
     * constructor
     * @param title
     * @param name
     * @param id
     * @param quantity
     * @param price
     * @param numTrack
     */
    public CD (String title, String name, int id, int quantity, double price, int numTrack){
    super(title, name, id, quantity, price);   
        this.title = title;
        this.name = name;
        this.Id = id;
        this.quantity = quantity;
        this.price = price;
        this.numTrack = numTrack;
    }
    /**
     * Getter
     * @return number of track in CD
     */
    public int getNumTrack() {
        return numTrack;
    }

    /**
     * Setter
     * @param numTrack
     */
    public void setNumTrack(int numTrack) {
        this.numTrack = numTrack;
    }
}
