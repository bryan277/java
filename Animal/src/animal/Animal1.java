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
public class Animal1 {
    int age;
    String gender;
    int weightInLbs;
    
    public Animal1(int age, String gender, int weightInLbs){
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }
    
    public void speak(){
        System.out.println("My age is " + age);
    }
    
    public void eat(){
        System.out.println("Eating...");
    }
    
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
