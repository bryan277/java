/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum5numbersforloop;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class Sum5NumbersForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;  //Stores the sum of the 5 numbers
        int number;     //Stores the current input
        
        Scanner scan = new Scanner (System.in);
        
        for (int i = 1; i <= 5; i++) 
        {
            System.out.print("Enter an integer > " );
            number = scan.nextInt();
            
            total += number; //add input to total 
        }
        
        //process results by printing the total 
        System.out.println("The total is " + total);
    }
    
}
