/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author hansvos
 */

public class Midterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       float    piF = 3.141592653589793f;   // value assigned has float precision
       double    piD = 3.141592653589793;   //  value assigned has double precision
       final double THRESHOLD = .0001; 
       
        if( piF == piD) 
        System.out.println( "piF and piD are equal" ); 
            else 
        System.out.println( "piF and piD are not equal" ); 
            if( Math.abs( piF – piD ) < THRESHOLD ) 
        System.out.println( "piF and piD are considered equal" ); 
            else 
        System.out.println( "piF and piD are not equal" ); 
    }
}