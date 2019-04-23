/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shorcutoperators;

/**
 *
 * @author hansvos
 */
public class ShorcutOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 6;
        int b = 2;
        
        System.out.println("At the beginning, a is " + a);
        //At the beginning, a is 6
        System.out.println("Increment a with prefix notation: " + ++a);
        //Increment a with prefix notation: 7
        System.out.println("\nAt the beginning, b is " +b);
        //At the beginning, b is 2
        System.out.println("Increment b with postfix notation: " + b++);
        //Increment b with postfix notation: 
        System.out.println("In the end, b is " + b);
        //In the end, b is 3
        
        
    }
    
}
