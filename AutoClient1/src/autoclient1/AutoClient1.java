/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclient1;

/**
 *
 * @author hansvos
 */
public class AutoClient1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto1 sedan = new Auto1( );
        String sedanModel = sedan.getModel();
        int sedanMiles = sedan.getMilesDriven();
        double sedanGallons = sedan.getGallonsOfGas();
        System.out.println("sedan: model is " + sedanModel + "\n miles driven is " + sedanMiles + "\n gallons of gas is " + sedanGallons );
        
        Auto1 suv = new Auto1("Trailblazer", 7000, 437.5);
        String suvModel = suv.getModel();
        int suvMiles = suv.getMilesDriven();
        double suvGallons = suv.getGallonsOfGas();
        System.out.println("suv: model is " + suvModel + "\n miles driven is " + suvMiles + "\n gallons of gas is " + suvGallons);
       
        Auto1 jeep = new Auto1("Jeep", 0, 433.5);
        System.out.println("jeep: model is " + jeep.getModel() + "\n miles driven is " + jeep.getMilesDriven() + "\n gallons of gas is " + jeep.getGallonsOfGas());
    }
    
}
