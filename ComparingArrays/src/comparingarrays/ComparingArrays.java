/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingarrays;

/**
 *
 * @author hansvos
 */
public class ComparingArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] cellBills1 = {45.24, 54.67, 41.99, 44.61, 65.29, 49.75};
        double [] cellBills2 = {45.24, 54.67, 41.99, 44.61, 65.29, 49.75};
        
        boolean isEqual = true;
        if ( cellBills1.length != cellBills2.length)
        {
           isEqual = false; 
           System.out.println("size not the same");
        }
        else
        {
            for (int i = 0; i < cellBills1.length; i++)
            {
                if(cellBills1[i] != cellBills2[i])//(Math.abs(cellBills1[i] - cellBills2[i]) > 0.001)this also works
                {
                    isEqual = false;
                }
            }
        }
        if (isEqual)
            System.out.println("cellBills1 and cellBills2 are equal");
        else 
            System.out.println("cellBills1 and cellBills2 are not equal");
    }
    
}
