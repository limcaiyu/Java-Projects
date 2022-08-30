
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Pa Pa Oo
 */
public class Member {
    
    int memberId;
    String memberName;
    double amountSpent;
    
     /**
     *constructor
     * @param mId
     * @param mName
     */
   
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.amountSpent = 0.00;
}
    
    
    /**
     *Getter
     * @return member id
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * Getter
     * @return member name
     */
    public String getMemberName() {
        return memberName;
    }
    
     /**
     * Getter
     * @return individual amount spent 
     */
    public double getAmountSpent(){
        return amountSpent;
    }

    /**
     * Setter
     * @param memberId
     */
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    /**
     * Setter
     * @param memberName
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    /**
     * Setter
     * @param AmountSpent
     */
  
    public void setAmountSpent(double amount) {
        this.amountSpent = amount;
    }

   
    //toString method to print out member info: in format
   @Override
public String toString(){
        
  return (" Member ID: " + this.getMemberId() + " \t\t Name: " + this.getMemberName()+ "\t");

} 
}