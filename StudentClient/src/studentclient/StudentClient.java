/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclient;

/** Program 3
 * Vos, Hans
 *
 * 
 */
public class StudentClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Student s1 = new Student("Bryan", "445333", 3.2);
     Student s2 = new Student("Jesus", "234432", 2.9);
     
     String s1Name = s1.getName();
     String s1Ssn = s1.getSsn();
     double s1Gpa = s1.getGpa();
        System.out.println("Name:" + s1Name + "\nSocial Security Number:" + s1Ssn + "\nGPA:" + s1Gpa);
     
     String s2Name = s2.getName();
     String s2Ssn = s2.getSsn();
     double s2Gpa = s2.getGpa();
        System.out.println("Name: " + s2Name + "\nSocia Security Number:" + s2Ssn + "\nGpa:" + s2Gpa);
        
    if(s1.equals(s2)) {
        System.out.println("s1 and s2 equal");
    }   else {
        System.out.println("s1 and s2 not equal");
    } 
    
    s2.setName("Bryan");
    s2.setSsn("445333");
    s2.setGpa(3.2);
    
    if(s1.equals(s2)) {
        System.out.println("s1 and s2 equal");
    } else {
        System.out.println("s1 and s2 not equal");
    }
    }
    
}
