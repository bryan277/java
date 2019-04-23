/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogboxdemo1;
import javax.swing.JOptionPane;
/**
 *
 * @author hansvos
 */
public class DialogBoxDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog(null, "Please enter your first and last names");
        JOptionPane.showMessageDialog(null, "Hello, " + name);
    }
    
}
