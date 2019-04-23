/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typesafereadinteger;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class TypeSafeReadInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        String garbage;
        
        System.out.print("Enter your age as an integer > " );
        while(! scan.hasNextInt())
        {
            garbage = scan.nextLine();
            System.out.print("\nPlease enter an integer > " );
        }
        int age = scan.nextInt();
        System.out.println("Your age is " + age);
    }
    
}
