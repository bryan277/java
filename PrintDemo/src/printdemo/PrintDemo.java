/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printdemo;

/**
 *
 * @author hansvos
 */
public class PrintDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\nCreate a variable and print its value");
        String s = new String("The grade is");
        double grade = 3.81;
        System.out.println(s + " " + grade);
        
        System.out.println();
        SimpleDate d = new SimpleDate( 4, 5, 2009);
        System.out.println("Explicitly calling toString, d is +" + d.String());
        System.out.println("Implicitly calling toString" + d);
    }
    
}
