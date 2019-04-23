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
public class Auto1 {
    private String model;           //model of auto
    private int milesDriven;        //number of miles driven
    private double gallonsOfGas;    //number of gallons of gas
    
    //Default contsructor:
    //initializes model to "unknown";
    //milesDriven is autoinitialized to 0 and gallonsOfGas to 0.0
    
    public Auto1()
    {
        model = "unknown";
    }
    
    //Overloaded constructor:
    //allows client to set beginning values for 
    // model, milesDriven, and gallonsOfGas
    public Auto1(String startModel, int startMilesDriven, double startGallonsOfGas)
    {
        model = startModel;
        
        //validate startMilesDriven parameter
        if(startMilesDriven >= 0)
            milesDriven = startMilesDriven;
        else 
        {
            System.err.println("Miles driven is negative.");
            System.err.println("Value set to 0.");
        }
        
        //validate startGallonsOfGas parameter
        if (startGallonsOfGas >= 0.0)
            gallonsOfGas = startGallonsOfGas;
        else
        {
            System.err.println("Gallons of gas is negative" );
            System.err.println("Value set to 0.0." );
        }
        
    }
    //Accessor method:
    //returns curretn value of model
    public String getModel()
    {
        return model;
    }
    
    //Accessor method:
    //returns current value of milesDriven
    public int getMilesDriven()
    {
        return milesDriven;
    }
    
    //Accessor method:
    //return current value of gallonsOfGas
    public double getGallonsOfGas()
    {
        return gallonsOfGas;
    }
    
    
}
