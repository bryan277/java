/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingarrayelements;

/**
 *
 * @author hansvos
 */
public class CopyingArrayElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] cellBills = 
        {
            45.24, 54.67, 42.55, 44.61, 65.29, 49.75
        };
        
        double billsBackup [] = new double [cellBills.length];
        for (int i = 0; i < cellBills.length; i++) 
        {
            billsBackup[i] = cellBills[i];// copy each element
        }
        
        billsBackup[4] = 38.00;//change value in billsBackup
        cellBills[4] = 41.00;
        
        System.out.println("cellBills\nElement\tValue " );
        for(int i = 0; i < cellBills.length; i++)
        {
            System.out.println(i + "\t" + cellBills[i] );
        }
        
        System.out.println("\nbillsBackup\nElement\tValue " );
        for (int i = 0; i < billsBackup.length; i++)
        {
            System.out.println(i + "\t" + billsBackup[i]);
        }
        
        
    }
    
}
