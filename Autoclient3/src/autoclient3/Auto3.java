package autoclient3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hansvos
 */
import java.text.DecimalFormat;

public class Auto3 {
    private String model;
    private int milesDriven;
    private double gallonsOfGas;
    
    public Auto3()
    {
        model = "unknown";
    }
    
    public Auto3(String startModel, int startMilesDriven, double startGallonsOfGas)
    {
        model = startModel;
        setMilesDriven(startMilesDriven);
        setGallonsOfGas(startGallonsOfGas);
    }
    
    //Accessor methods: 
    //returns current value of model
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
    
    //allows client to set value of milesDriven
    //prints an error message if new value is less than 0
    public void setMilesDriven (int newMilesDriven)
    {
        if (newMilesDriven >= 0)
            milesDriven = newMilesDriven;
        else 
        {
            System.err.println("Miles driven cannot be negative");
            System.err.println("Value not changed." );
        }
    }
    //allows client to set value of gallonsOfGas;
    //prints an error message if new value is less than 0.0
    public void setGallonsOfGas(double newGallonsOfGas)
    {
        if (newGallonsOfGas >= 0.0)
            gallonsOfGas = newGallonsOfGas;
        else
        {
            System.err.println("Gallons of gas cannot be negative");
            System.err.println("Value not changed.");
        }
    }
    //Calculates miles per gallon
    //If no gallons of gas have been used, returns 0.0;
    //otherwise, returns miles per gallon
    // as milesDriven/ gallonsOfGas
    
    public double calculateMilesPerGallon() 
    {
        if (gallonsOfGas != 0.0)
            return milesDriven / gallonsOfGas;
        else
            return 0.0;
    }
    //toString; return a String of instance variable values
    public String toString()
    {
        DecimalFormat gallonsFormat = new DecimalFormat("#0.0");
        return "Model: " + model + "; miles driven: " + milesDriven + ";gallons of gas: " + gallonsFormat.format(gallonsOfGas);
    }
    //equals: return true if fields of parameter object
    //      are equal to fields in this object
    public boolean equals(Object o)
    {
        if (!(o instanceof Auto3))
            return false;
        else
        {
            Auto3 objAuto = (Auto3) o;
            if (model.equals(objAuto.model) && milesDriven == objAuto.milesDriven && Math.abs(gallonsOfGas - objAuto.gallonsOfGas) < 0.0001)
                return true;
            else
                return false;
        }
    }
}
