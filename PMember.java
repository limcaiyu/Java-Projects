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
public class PMember extends Member { 
   
    private double fee = 10.00;
      
    /**
     * constructor
     * @param memberId 
     * @param memberName
     * @param fee
     */
    public PMember(int memberId, String memberName, double fee) {
        super(memberId,memberName);        
        //this.paymentMethod = paymentMethod;
        this.fee = 0.0;
        }

    /**
     * Getter
     * @return Fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * Setter
     * @param fee
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

  

}