/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellsbills;

/**
 *
 * @author hansvos
 */
public class CellsBills {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] cellBills = new double [6];
        
        //assign values to array elements
        cellBills[0] = 45.24;
        cellBills[1] = 54.67;
        cellBills[2] = 42.55;
        cellBills[3] = 65.29;
        cellBills[4] = 44.61;
        cellBills[5] = 49.75;
        
        System.out.println("The first monthly cell bill is " + cellBills[0]);
        System.out.println("The last monthly cell bil is " + cellBills[cellBills.length -1]);
//        The first monthly cell bill is 45.24
//        The last monthly cell bil is 49.75
        System.out.println("Element\tValue");
        for (int i = 0; i < cellBills.length; i++) 
        {
            System.out.println(i + "\t" + cellBills[i]);
        }
    }
    
}
