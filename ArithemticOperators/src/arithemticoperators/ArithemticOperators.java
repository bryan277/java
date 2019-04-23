/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithemticoperators;

/**
 *
 * @author hansvos
 */
public class ArithemticOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //calculate the cost of lunch
        double salad = 5.95;
        double water = .89;
        System.out.println("The cost of lunch is $" + (salad + water));
        //The cost of lunch is $6.84
        
        //calculate your age as of a certain year
        int targetYear = 2011;
        int birthYear = 1993;
        System.out.println("Your age in " + targetYear + " is " + (targetYear - birthYear));
    }
    
}
