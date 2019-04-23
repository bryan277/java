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
public class Auto {
    private String model;               //model of auto
    private int milesDriven;            //number of miles driven
    private double gallonsOfGas;        //number of gallons of gas
    
    //Default constructor:
    // initialzies model to "unknown";
    // milesDriven is autoinitialized to 0 and gallonsOfGas to 0.0
    
    public Auto()
    {
        model = "unknown";
    }
    
    public Auto(String startModel, int startMilesDriven, double startGallonsOfGas)
    {
        model = startModel;
        
        //validate startMilesDriven parameter
        if (startMilesDriven >= 0)
            milesDriven = startMilesDriven;
        else
        {
            System.err.println("Miles driven is negative." );
            System.err.println("Value set to 0.");
        }
        
        // validate startGallonsOfGas parameter
        if (startGallonsOfGas >= 0.0)
            gallonsOfGas = startGallonsOfGas;
        else
        {
            System.err.println("Gallons of gas is negatvie");
            System.err.println("Value set to 0.0.");
        }
    }
}
