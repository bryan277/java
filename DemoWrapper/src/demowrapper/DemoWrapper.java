/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demowrapper;

/**
 *
 * @author hansvos
 */
public class DemoWrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int intPrimitive = 42;
        Integer integerObject = intPrimitive;
        
        System.out.println("The int is " + intPrimitive);
        //The int is 42
        System.out.println("The Integer object is " + integerObject);
        //The Integer object is 42
        int sum = intPrimitive + integerObject;
        System.out.println("The sum is " + sum);
        //The sum is 84
        
        int i1 = Integer.parseInt("76");// convert "76" to an int
        Integer i2 = Integer.valueOf("76");// convert "76" to Integer
        System.out.println("\nThe value of i1 is " + i1);
        System.out.println("The value of i2 is " + i2);
        //The value of i1 is 76
        //The value of i2 is 76
        
        double d1 = Double.parseDouble("58.32");
        Double d2 = Double.valueOf("58.32");
        System.out.println("\nThe value of d1 is " + d1);
        System.out.println("The value of d2 is " + d2);
        //The value of d1 is 58.32
        //The value of d2 is 58.32

        

    }
    
}
