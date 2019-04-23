/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellotranslator;

import java.util.Scanner;

public class HelloTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String hello;
       
       Scanner scan = new Scanner (System.in);
       
       System.out.println("Welcome to the Hello Translator");
       
       System.out.println("Please enter GERMAN for hello in german, or SPANISH for hello in spanish");
       
       System.out.print("Enter your selection: ");
       hello = scan.next();
       hello = hello.toUpperCase();
       
       switch(hello)
       {
           case "GERMAN":
               System.out.println("Hello in german is Hallo");
               break;
           case "SPANISH":
               System.out.println("Hello in Spanish is Hola");
               break;
           default:
               System.out.println(hello + "is not valid");
       }
               
               
               
    }
    
}
