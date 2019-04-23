/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettergrade;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class LetterGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        char letterGrade;
        
        System.out.println("Enter your test grade: ");
        int grade = scan.nextInt();
        
        if (grade >= 90)
            letterGrade = 'A';
        
        else if (grade >= 80)
            letterGrade = 'B';
        
        else if (grade >= 70)
            letterGrade = 'C';
        
        else if (grade >= 60)
            letterGrade = 'D';
        
        else
            letterGrade = 'F';
        
        System.out.println("Your test grade of " + grade + " is a letter grade of " + letterGrade);
//        Enter your test grade: 
//        90
//        Your test grade of 90 is a letter grade of A
    }
    
}
