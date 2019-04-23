/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoreven;

/**
 *
 * @author hansvos
 */

import java.util.Scanner;

public class OddOrEven {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an integet > " );
        int number = scan.nextInt();
        
        String outcome = (number % 2 == 0 ? "even." : "odd.");
        
        System.out.println(number + " is " + outcome);
    }
    
}
