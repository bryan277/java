/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echouserinput;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class EchoUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int SENTINEL = -1;
        int number;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter an integer, or -1 to stop > ");
        number = scan.nextInt();
        
        while(number != SENTINEL)
        {
            //processing
            System.out.println(number);
           
            System.out.print("Enter an integer, or -1 to stop > " );
            number = scan.nextInt(); 
        }
       System.out.println("Sentinel value detected"); 
           
    }
    
    
}
