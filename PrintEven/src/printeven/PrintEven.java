/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printeven;

/**
 *
 * @author hansvos
 */
public class PrintEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String toPrint = "";
        
        for (int i = 0; i <= 20; i +=2)
        {
            toPrint += i + " ";
        }
        System.out.println(toPrint);
    }
    
}
