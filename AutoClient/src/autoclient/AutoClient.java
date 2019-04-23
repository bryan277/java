/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclient;

/**
 *
 * @author hansvos
 */
public class AutoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Instantiate sedan");
        Auto sedan = new Auto();
        
        System.out.println("\nInstantiate suv");
        Auto suv = new Auto("Trailblazer", 7000, 437.5);
        
        System.out.println("\nInstantiate mini");
        //attempt to set invalid value for gallons of gas
        Auto mini = new Auto ("Mini Cooper", 200, -1.0);
        
    }
    
}
