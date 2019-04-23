/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo;

/**
 *
 * @author hansvos
 */
public class StringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = new String("OOP in Java");
        System.out.println("s1 is:" + s1);
        //s1 is: OOP in java
        String s2 = " is not that difficult. ";
        System.out.println("s2 is:" + s2);
        //s2 is: is not that difficult
        
        String s3 = s1 + s2;
        System.out.println("s1 + s2 returns: " + s3);
        //s1 + s2 returns: OOP in Java is not that difficult. 
    }
    
}
