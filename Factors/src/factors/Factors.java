/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factors;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class Factors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        final int SENTINEL = 0;
        boolean factorsFound;
        
        Scanner scan = new Scanner( System.in );
        //primining read
        
        do
        {
            System.out.print("Enter a positive integer " + "or 0 to exit > " );
            number = scan.nextInt();
        } while (number < 0);
        
        while (number != SENTINEL)
        {
            System.out.print("Factors of " + number + ": ");
            factorsFound = false; //reset flag to no factors
            
            for (int factor = 2; factor <= number / 2; factor++)
            {
                if (number % factor == 0)
                {
                    System.out.print(factor + " ");
                    factorsFound = true;
                            
                }
            }
            if (! factorsFound)
                System.out.print("none, " + number + " is prime" );
            
            System.out.println(); //print a newline
            System.out.println();
            
            //read next number
            do
            {
                System.out.print("Enter a positive integer " + "or 0 to exit > " );
                number = scan.nextInt();
            } while (number < 0);
        }// end of while loop
    }
    
}
