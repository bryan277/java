/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaloperators;

/**
 *
 * @author hansvos
 */
public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 75;
        boolean test;
        
        test = (age > 18 && age < 65);
        System.out.println(age + " > 18 && " + age + " < 65 is " + test);
        
        test = ( age < 65 && age > 18);
        System.out.println(age + " < 65 && " + age + " > 18 is " + test);
        
        test = (age > 65 || age < 18);
        System.out.println(test);
        
        test = (age > 65 || age < 18 && false);
        System.out.println(test);
    }
    
}
