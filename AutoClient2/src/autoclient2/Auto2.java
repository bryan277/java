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
public class Auto2 {
    private String model;           //model of auto
    private int milesDriven;        //number of miles driven
    private double gallonsOfGas;    //number of gallons of gas
    
    //Default contsructor:
    //initializes model to "unknown";
    //milesDriven is autoinitialized to 0 and gallonsOfGas to 0.0
    
    public Auto2()
    {
        model = "unknown";
    }
    
    public Auto2(String startModel, int startMilesDriven, double startGallonsOfGas)
    {
        model = startModel;
        setMilesDriven(startMilesDriven);
        setGallonsOfGas(startGallonsOfGas);
    }
    
    public String getModel()
    {
        return model;
    }
    
    public int getMilesDriven()
    {
        return milesDriven;
    }
    
    public double getGallonsOfGas()
    {
        return gallonsOfGas;
    }
    
    public void setModel(String newModel)
    {
        model = newModel;
    }
    
    public void setMilesDriven(int newMilesDriven)
    {
        if(newMilesDriven >= 0)
            milesDriven = newMilesDriven;
        else
        {
            System.err.println("Miles driven cannot be negative." );
            System.err.println("Value not changed.");
        }
    }
    
    public void setGallonsOfGas(double newGallonsOfGas)
    {
        if (newGallonsOfGas >= 0.0)
            gallonsOfGas = newGallonsOfGas;
        else
        {
            System.err.println("Gallons of gas cannot be negative.");
            System.err.println("Value not changed.");
        }
    }
}
