/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donotenterclient;

/**
 *
 * @author hansvos
 */
import javax.swing.JFrame;
import java.awt.Graphics;

public class DoNotEnterClient extends JFrame {

    /**
     * @param args the command line arguments
     */
    private DoNotEnter sign;
    
    public DoNotEnterClient()
    {
        //instantiate the DoNotEnter object
        sign = new DoNotEnter(150, 100, 1.0);
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        sign.draw(g);
    }
    public static void main(String[] args) 
    {
        DoNotEnterClient app = new DoNotEnterClient();
        app.setSize(400, 300);
        app.setVisible(true);
    }
    
}
