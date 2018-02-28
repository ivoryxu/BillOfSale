/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billofsale;

/**
 *
 * @author user
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double price,tax,total,payment,change;
        
        price=12.49;
        tax=price*0.13;
        tax=(int)(tax*100);
        tax=tax/100;
        total=price+tax;
        payment=20;
        change=payment-total;
        change=(int)(change*100);
        change=change/100;
        
        
        
        System.out.println("Price:      "+price);
        System.out.println("HST:        "+tax);
        System.out.println("Total Cost: "+total);
        System.out.println("Payment:    "+payment);
        System.out.println("Change:     "+change);
    }
    
}
