/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatement;

/**
 *
 * @author hansvos
 */
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char penaltyKick = 'L';
        
        switch (penaltyKick) {
            case 'L': System.out.println("Messi shoots to the left and scores!");
                break;
            case 'R': System.out.println("Messi shoot to the right and misses the goal!");
                break;
            case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
                break;
            default:
                System.out.println("Messi is in position...");
                
               
        }
        //Messi shoots to the left and scores!
        
        if (2016 > 2015){
            System.out.println("Stuck in the past...");
        } else {
            System.out.println("Upgraded to the future!");
        }
        //Stuck in the past...
        
        int subwayTrain = 5;
        
        switch(subwayTrain) {
            case 1: System.out.println("This is a South Ferry bound train!");
                break;
            case 5: System.out.println("This is a Brooklyn bound train!");
                break;
            case 7: System.out.println("This is a Queens bound train!");
                break;
            default:
                System.out.println("I'm not sure where that train goes...");
        }
        //This is a Brooklyn bound train!
    }
    
}
