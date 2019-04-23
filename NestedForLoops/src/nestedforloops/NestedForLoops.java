/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedforloops;

/**
 *
 * @author hansvos
 */
public class NestedForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int line = 1; line <= 5; line++)
        {
            for(int number = 1; number <= line; number++)
            {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    
}
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5
