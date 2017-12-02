/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatecreditcard;

import java.util.Scanner;

/**
 *
 * @author bruna
 */
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Credit Card Number: ");
        String creditCardNumber = scanner.next();
        ValidateCreditCard creditCard = new ValidateCreditCard(creditCardNumber);
        
        if(creditCard.isValid())
            System.out.println("Valid number");
        else
            System.out.println("Invalid number");                
    }
}
