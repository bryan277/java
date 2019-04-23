/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passinggrade;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class PassingGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a grade > " );
        int grade = scan.nextInt();
        
        String message;
        if( grade >= 60)
            message = "You passed";
        else
            message = "You failed";
        
        System.out.println(message);
    }
    
}
