/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagetestscore;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageTestScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        int total = 0;
        final int SENTINEL = -1;
        int score;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("To calculate a class average," );
        System.out.println("enter each test score." );
        System.out.println("When you are finished, enter a -1" );
        
        System.out.print("Enter the first test score > " );
        score = scan.nextInt();
        
        while (score != SENTINEL)
        {
            total += score;// add score to total
            
            count++;// add 1 to count of the test scores
            
            System.out.print("Enter the next text score >");
            score = scan.nextInt();
        }
        
        if (count != 0)
        {
            DecimalFormat oneDecimalPlace = new DecimalFormat("0.0");
            System.out.println("\nThe class average is " + oneDecimalPlace.format((double)(total)/count));
        }
        else
            System.out.println("\nNo greade were entered" );
        
    }
    
}
