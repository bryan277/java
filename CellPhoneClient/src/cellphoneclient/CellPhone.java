/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphoneclient;

/**
 *
 * @author hansvos
 */

import java.text.DecimalFormat;

public class CellPhone 
{
    public final int MONTHS = 6; //default number of months
    private String phoneNumber;
    private double [ ] cellBills;
    
    public CellPhone()
    {
        phoneNumber = "";
        cellBills = new double [MONTHS];
    }
    
    //Constructor
    public CellPhone(String number, double [] bills)
    {
        phoneNumber = number;
        
    //instantiate array with same length as parameter
        cellBills = new double [bills.length];
        
    //copy parameter array to cellBills array
        for (int i = 0; i < cellBills.length; i++)
        {
            cellBills[i] = bills[i];
        }
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public double [ ] getCellBills() 
    {
        double [ ] temp = new double [cellBills.length];
        for (int i = 0; i < cellBills.length; i ++ )
        {
            temp[i] = cellBills[i];
        }
        return temp;
    }
    
    public double calcTotalBills()
    {
        double total = 0.0;
        
        for (int i = 0; i < cellBills.length; i++)
        {
            total += cellBills[i];
        }
        return total;
        
        
    }
    
    public double findMaximumBill()
    {
        double max = cellBills[0];
        
        for (int i = 1; i < cellBills.length; i++ )
        {
            if(cellBills[i] > max)
                max = cellBills[i];
        }
        return max;
    }
    
    public String toString()
    {
        String returnValue = phoneNumber + "\n";
        DecimalFormat money = new DecimalFormat("$##0.00");
        for (int i = 0; i < cellBills.length; i++)
        {
            returnValue += money.format(cellBills[i]) + "\t";
        }
        returnValue += "\n";
        
        return returnValue;
    }
}
