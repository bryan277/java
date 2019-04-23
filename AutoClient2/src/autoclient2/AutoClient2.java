/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclient2;

/**
 *
 * @author hansvos
 */
public class AutoClient2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto2 suv = new Auto2("Trailblazer", 7000, 437.5);
        
        System.out.println("suv: model is " + suv.getModel() + "\n miles driven is " + suv.getMilesDriven() + "\n gallons of gas is " + suv.getGallonsOfGas());
        
        suv.setModel("Sportage");
        suv.setMilesDriven(200);
        suv.setGallonsOfGas(10.5);
        
        System.out.println("\nsuv: model is " + suv.getModel() + "\n miles driven is " + suv.getMilesDriven() + "\n gallons of gas is " + suv.getGallonsOfGas());
        
        suv.setMilesDriven(-1);
        
        System.out.println("\nsuv: model is " + suv.getModel() + "\n miles driven is " + suv.getMilesDriven() + "\n gallons of gas is " + suv.getGallonsOfGas());
    }
    
}
