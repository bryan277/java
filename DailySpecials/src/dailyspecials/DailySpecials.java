/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyspecials;

/**
 *
 * @author hansvos
 */
import java.util.Scanner;

public class DailySpecials {

    public enum Days {Sun,Mon,Tue,Wed,Thur,Fri,Sat};
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a day\n" + "(Sun, Mon, Tue, Wed, Thur, Fri, Sat) > " );
        String inputDay = scan.next( );
        Days day = Days.valueOf(inputDay);
        
        switch (day)
        {
            case Mon:
                System.out.println("The special for " + day + " is barbeque chicken." );
                
                break;
                
            case Tue:
                System.out.println("The special for " + day + " is tacos" );
                
                break;
                
            case Wed:
                System.out.println("The special for " + day + " is chef's salad" );
                
                break;
                
            case Thur:
                System.out.println("The special for " + day + " is cheeseburger" );
                
                break;
                
            case Fri: 
                System.out.println("The special for " + day + " is fish fillet" );
                
                break;
                
            default://if day is Sat or Sun
                System.out.println("Sorry, we're closed on " + day);
        }
    }
    
}
