/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summingarrayelements;

/**
 *
 * @author hansvos
 */
import java.text.NumberFormat;

public class SummingArrayElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [ ] cellBills = new double [6];
        cellBills[0] = 45.24;
        cellBills[1] = 54.67;
        cellBills[2] = 42.55;
        cellBills[3] = 44.61;
        cellBills[4] = 65.29;
        cellBills[5] = 49.75;
        
        double totalBills = 0.0; //initialzie total
        for (int i = 0; i < cellBills.length; i++)
        {
            totalBills += cellBills[i];
        }
        
        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Total for the bills: " + priceFormat.format(totalBills));
        
    }
    
}
