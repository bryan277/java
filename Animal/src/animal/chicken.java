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
public class chicken extends Bird {
    public chicken(int age, String gender, int weightInLbs){
        super(age, gender, weightInLbs);
    }
    //overriding the method defined in Bird
    public void fly(){
        System.out.println("not able to fly...");
    }
}
