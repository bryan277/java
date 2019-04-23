/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6exercise1;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class Chapter6Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
         
         int i = 0; 
         while (i != -1)
         {
             System.out.println("Hello");
             System.out.print("Enter an int > " );
             i = scan.nextInt();
         }
         System.out.println("You are done");
    }
    
}
