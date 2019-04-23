/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodecimalformat;

//import the DecimalFormat class from the java.text package
import java.text.DecimalFormat;

/**
 *
 * @author hansvos
 */
public class DemoDecimalFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat pricePattern = new DecimalFormat ("$0.00");
        
        double price1 = 78.666666;
        double price2 = 34.5;
        double price3 = .333333;
        int price4 = 3;
        double price5 = 100.23;
        
        System.out.println("This first is: " + pricePattern.format(price1));
        //This first is: $78.67
        System.out.println("\nThe second price is: " + pricePattern.format(price2));
        //This second price is: $34.50
        System.out.println(pricePattern.format(price3));
        //$0.33
        System.out.println(pricePattern.format(price4));
        //$3.00
        System.out.println(pricePattern.format(price5));
        //$100.23
        
        //for printing time as two digits
        DecimalFormat timePattern = new DecimalFormat("00");
        
        int hours = 5, minutes = 12, seconds = 0;
        System.out.println("\nThe time is " 
                + timePattern.format( hours ) + ":" 
                + timePattern.format( minutes) + ":"
                + timePattern.format( seconds ) );
        //The time is 05:12:00

    }
    
}
