/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonumberformat;

//we need to import the NumberFormat class from java.text
import java.text.NumberFormat;

public class DemoNumberFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double winningPercentage = .675;
        double price = 78.9;
        
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        
        System.out.print("The winning percentage is " );
        System.out.println(percentFormat.format(winningPercentage));
        
        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
        
        System.out.println("\nThe price is " + priceFormat.format(price));
        
//        The winning percentage is 68%

//        The price is $78.90
    }
    
}
