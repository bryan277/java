/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donotenterclient2;

/**
 *
 * @author hansvos
 */

import javax.swing.JFrame;
import java.awt.Graphics;

public class DoNotEnterClient2 extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    private DoNotEnter sign1, sign2;
    
    public DoNotEnterClient2()
    {
       sign1 = new DoNotEnter(100, 100, 1.0);
       sign2 = new DoNotEnter(220, 150, 0.5);
    }
    
    public void paint (Graphics g)
    {
        super.paint(g);
        sign1.draw(g);// draw first sign
        sign2.draw(g);// draw second sign
    }
    public static void main(String[] args) {
        // TODO code application logic here
        DoNotEnterClient2 app = new DoNotEnterClient2();
        app.setSize(400, 300);
        app.setVisible(true);
    }
    
}
