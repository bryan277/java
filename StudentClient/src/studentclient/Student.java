/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclient;

/**
 *
 * @author hansvos
 */
class Student {

    private String name;
    private String ssn;
    private double gpa;
    
    
    
    public Student(String newName, String newSsn, double newGpa)
    {
        name = newName;
        ssn = newSsn;
        gpa = newGpa;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getSsn() 
    {
        return ssn;
    }
    
    public void setSsn(String newSsn)
    {
        ssn = newSsn;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public void setGpa(double newGpa)
    {
        if (newGpa > 0 || newGpa < 4.0)
            gpa = newGpa;
        else
        {
            System.err.println("GPA cannot be negative zero or greater than 4.0");
        }
    }
    
//   public String toString()
//    {
//       return 
//    }
}
