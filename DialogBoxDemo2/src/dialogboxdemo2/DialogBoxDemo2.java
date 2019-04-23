/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogboxdemo2;

import javax.swing.JOptionPane;

/**
 *
 * @author hansvos
 */
public class DialogBoxDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = JOptionPane.showInputDialog(null, "Please enter your age in years");
        int age = Integer.parseInt( input );
        
        JOptionPane.showMessageDialog(null, "Next year your age will be " + ++age);
        double average = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your grade point average between 0.0 and 4.0"));
        JOptionPane.showMessageDialog(null, "Your average is " + (4.0 - average) + " points from a 4.0");
        
    }
    
}
