/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validateinputdo;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class ValidateInputDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter a number between 1 and 10 > " );
            number = scan.nextInt();
        } while (number < 1 || number > 10);
        
        System.out.println("Thank you");
    }
    
}
