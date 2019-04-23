/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6exercise2;

/**
 *
 * @author hansvos
 */
public class Chapter6Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //What are the values of i and sum after this code sequence is excuted?
        int sum = 0;
        int i = 17;
        
        while(i % 10 != 0)
        {
            sum += i;
            i++;
        }
        //System.out.println(i);
        //20
        
        //What are the values of i and prodcut after this code sequence is executed?
        int z = 6;
        int product = 1;
        do 
        {
            product *= z;
            z++;
        } while (z < 9);
        //System.out.println(z);
        //9
        
        //What is the output of this code sequence?
        for (int y = 0; y < 3; y++)
           // System.out.println("Hello");
        //System.out.println("Done");
//        Hello
//        Hello
//        Hello
//        Done
        //What is the output of this code sequence?
        for (int x = 0; x <= 2; x++)
            //System.out.println("Hello");
        //System.out.println("Done");
//        Hello
//        Hello
//        Hello
//        Hello
//        Hello
//        Hello
//        Hello
//        Hello
//        Hello
//        Done
            
       //What is the value of i after this code sequence is executed?
        int a = 0;
        for (a = 0; a <= 2; a++)
            System.out.println("Hello");
    }
    
}
