/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5exercise2;

/**
 *
 * @author hansvos
 */
public class Chapter5exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Where is the error in this code sequence?
        int a = 32;
        
        if (a == 31)
            System.out.println("The value of a is 31");
        else
            System.out.println("The value of a is not 31");
        
        boolean b = false;
        if(b)
        {
            System.out.println("Inside true block" );
            System.out.println("b was true" );
            
            
        } else {
            System.out.println("Inside false block" );
        }
        System.out.println("Done" );
    }
    
}
