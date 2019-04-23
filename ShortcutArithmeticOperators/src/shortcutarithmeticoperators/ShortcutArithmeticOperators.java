/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortcutarithmeticoperators;

/**
 *
 * @author hansvos
 */
public class ShortcutArithmeticOperators {
//Exercise for chapter 2
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 6;
        System.out.println(a);
        //6
        
        float b = 13f;
        System.out.println(b);
        //13.0
        
        int c = 13 % 5;
        System.out.println(c);
        //3
        
        int d  = (int) 12.0 / 5;
        System.out.println(d);
        //2
        
        double f = (double) (12) / 5;
        System.out.println(f);
        //2.4
        
        double e = (double) (15 / 5);
        System.out.println(e);
        //2.0
        
        int pharah = 5;
        pharah++;
        System.out.println(pharah);
        //6
        
        int five = 5;
        System.out.println(five--);
        //5
        
        double wrong = 3.3;
        
        int month = getMonth();
        System.out.println(month);
        
    }
    
    
}
