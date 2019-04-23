/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author hansvos
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDate independenceDay = new SimpleDate(7,4,1776);
        int independenceMonth = independenceDay.getMonth();
        System.out.println("Independence day is month" + independenceMonth);
    }
    
}
