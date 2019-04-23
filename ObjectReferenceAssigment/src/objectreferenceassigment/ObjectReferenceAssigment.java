/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectreferenceassigment;

/**
 *
 * @author hansvos
 */
public class ObjectReferenceAssigment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDate d1 = new SimpleDate(2,15,2015);
        System.out.println("d1 is" + d1.getMonth() + "/" + d1.getYear());
        
    }
    
}
