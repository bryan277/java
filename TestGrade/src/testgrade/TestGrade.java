/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgrade;

/**
 *
 * @author hansvos
 */

import java.util.Scanner;
public class TestGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your test grade > " );
        int grade = scan.nextInt();
        
        System.out.print("Enter your extra credit > " );
        int extraCredit = scan.nextInt();
        
        if (extraCredit > 0)
            grade += extraCredit;
        
        System.out.println("Your final text grade is " + grade);
        
    }
    
}
