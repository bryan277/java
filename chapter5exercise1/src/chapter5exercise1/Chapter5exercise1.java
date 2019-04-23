/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5exercise1;

/**
 *
 * @author hansvos
 */
public class Chapter5exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    boolean a = true;
    boolean b = true;
    boolean c = false;
    
        System.out.println(!a);
        //false
        System.out.println(a && b);
        //true
        System.out.println(a && c);
        //false
        System.out.println(a || c);
        //true
        System.out.println(! (a||b));
        //false
        System.out.println(!a||b);
        //true
        System.out.println(!(!(a&&c)));
        //false
        System.out.println(a&&!(b||c));
        //false
        
        if (27 % 3 == 0)
            System.out.println("27 is divisible by 3");
        else
            System.out.println("27 is not divisible by 3" );
        System.out.println("End of sequence" );
        
        String s = "Hello";
        if (s.equals("hello"))
            System.out.println("String is hello" );
        else
            System.out.println("String is not hello" );
        System.out.println("End of sequence" );
        
        int y = 65;
        boolean x = false;
        
        if (y >= 70)
        {
            System.out.println("Hello 1" );
            if (x == true)
                System.out.println("Hello 2" );
            
        }
        else 
        {
           System.out.println("Hello 3" );
           if (x == false)
               System.out.println("Hello 4" );
        }
        System.out.println("Done");
        //Hello 4
        //Done
        
        int season = 3;
        
        switch (season)
        {
            case 1:
                System.out.println("Season is Winter" );
                break;
            case 2:
                System.out.println("Season is Spring" );
                break;
            case 3:
                System.out.println("Season is Summer" );
                break;
            case 4:
                System.out.println("Season is Fall" );
                break;
            default:
                System.out.println("Invalid season" );
        }
    }
    
}
