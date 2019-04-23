/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author hansvos
 */

//ZOO
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal1 animal1 = new Animal1(12, "M", 23);
        
        animal1.eat();
        //Eating...
        Bird nemo = new Bird(13, "M", 20);
        nemo.fly();
        //Flying...
        nemo.speak();
        //not able to fly...
        chicken chick1 = new chicken(12, "M", 20);
        chick1.fly();
        //not able to fly... 
    }
    
}
