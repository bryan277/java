/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author hansvos
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human tom;
        
        tom = new Human();
        tom.age = 8;
        tom.eyeColor = "Brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zeboo";
        tom.speak();
        
        Human hans;
        
        hans = new Human();
        hans.age = 27;
        hans.eyeColor = "Blue";
        hans.heightInInches = 72;
        hans.name = "Hans Vos";
        hans.speak();
    }
    
}
