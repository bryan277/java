/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class Calculator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int SENTINAL = 0;
        int number;
        int total = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the addition calculator.\n" );
        System.out.print("Enter the first number or 0 for the total > " );
        number = scan.nextInt();
        
        while (number != SENTINAL)
        {
            total += number;
            
            System.out.print("Enter the first number or 0 for the total > " );
            number = scan.nextInt();
            
        }
        
        System.out.println("The total is " + total);
    }
    
}
