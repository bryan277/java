/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmethods;

/**
 *
 * @author hansvos
 */
public class MathMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double d2 = Math.log(5);
       System.out.println("\nThe log of 5 is " + d2);
       //The log 0f 5 is 1.6094379124341003
        
       double d4 = Math.sqrt(9);
       System.out.println("\nThe square root of 9 is " + d4);
       //The square root of 9 is 3.0
        
       double fourCubed = Math.pow(4, 3);
        System.out.println("\nThe to the power 3 is " + fourCubed);
        //The to the power 3 is 64.0
        
        System.out.println("23.4 rounded is " + Math.round(23.4));
        // 23.4 rounded is 23
        
        System.out.println("23.49 rounded is " + Math.round(23.49));
        // 23.49 rounded is 23
        
        System.out.println("23.5 round is " + Math.round(23.5));
        // 23.5 round is 24
        
        int smaller = Math.min(8,2);
        System.out.println("The smaller of 8 and 2 is " + smaller);
        //The smaller of 8 and 2 is 2
        
        int bigger = Math.max( 8, 2);
        System.out.println("The bigger of 8 and 2 is " + bigger);
        
        int a = 8, b = 5, c = 12;
        int tempSmaller = Math.min(a, b);
        int smallest = Math.min(tempSmaller , c);
        System.out.println(smallest);
        //5
    }
    
}
