/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclient3;

/**
 *
 * @author hansvos
 */
public class Autoclient3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto3 sporty = new Auto3("Spyder", 0, 0.0);
        System.out.println(sporty.toString());
        
        Auto3 compact = new Auto3("Accent", 0, 0.0);
        System.out.println();
        System.out.println(compact);
        
        if (compact.equals(sporty))
            System.out.println("\nSporty and compact are equal");
        else
            System.out.println("\nSporty and compact are not equal");
    }
    
}
