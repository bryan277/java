/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author hansvos
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String season;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("What is the temperature? " );
        int temperature = scan.nextInt();
        
        if (temperature >= 90)
            season = " ,it is probably summer";
        
        else if (temperature >= 70 && temperature <= 90)
            season = " ,it is probably spring";
        
        else if (temperature >= 50 && temperature <= 70)
            season = " ,it is probably fall";
        
        else 
            season = " ,it is probably winter";
        
        System.out.println("The temperature of " + temperature + season);
                
        
        
    }
    
}
