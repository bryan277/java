/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttestscores;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CountTestScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int countPassed = 0;
        int countScores = 0;
        int score;
        final int SENTINEL = -1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program counts " + "the number of passing text scores.");
        System.out.println("Enter a -1 to stop.");
        
        System.out.print("Enter the first socre > " );
        score = scan.nextInt();
        
        while (score != SENTINEL)
        {
            if(score >= 60) 
            {
                countPassed++;
            }
            countScores++;
            
            System.out.print("Enter the next score > ");
            score = scan.nextInt();
        }
        
        System.out.println("You entered " + countScores + " scores" );
        System.out.println("The number of passing test scores " + countPassed);
        
        if (countScores != 0 )
        {
            DecimalFormat percent = new DecimalFormat("0.0%");
            System.out.println(percent.format((double)(countPassed)/countScores) +" of the class passed the test.");
        }
    }
    
}
