/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals;

/**
 *
 * @author hansvos
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && true);
//        false
//        false
//        true
        
        System.out.println(2 < 3 && 4 < 5);
        // true
        
        System.out.println(false || false);
        //false
        System.out.println(false || true);
        //true
        System.out.println(true || true);
        //true
        
        System.out.println(!false);
        //true
        System.out.println(!true);
        //false
        System.out.println(!(5>=1));
        //false
        
        //Boolean Operators: Precedence
        //! is evaluated first
        //&& is evaluated second
        // || is evaluated third
        
        System.out.println(! (false) || true && false);
        //true
        boolean riddle = !(1 < 8 && (5 > 2 || 3 < 5));
        System.out.println(riddle);
        //false
        
        if (9 > 2) {
            System.out.println("Control flow rocks!");
        } else {
            System.out.println("You are false my son");
        }
        
        int round = 6;
        
        if (round > 12) {
            System.out.println("The match is over!");
        } else if (round > 0) {
            System.out.println("The match is underway!");
        } else {
            System.out.println("The boxing match hasn't started yet.");
            
        }
        //The match is underway!
        
        int pointsScored = 21;
        
        char gameResult = (pointsScored > 20) ? 'W' : 'L';
        System.out.println(gameResult);
        //W
        
        int fuelLevel = 3;
        
        char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
        System.out.println(canDrive);
        //Y
    }
    
}
