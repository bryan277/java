/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coins;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Coins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nickel, dime, quarter;
        nickel = .05;
        dime = .10;
        quarter = .25;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many nickels? ");
        int ni = scan.nextInt();
        //System.out.println("you have " + in + " nickels");
        
        System.out.println("How many dimes? ");
        int di = scan.nextInt();
        
        System.out.println("How many quarters? ");
        int qu = scan.nextInt();
        
        double total = (nickel * ni) + (dime*di) + (quarter *qu);
        
        System.out.println("You have " + total + " dollars");
        
    }
    
}
