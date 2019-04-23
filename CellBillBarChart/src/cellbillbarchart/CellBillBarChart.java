/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellbillbarchart;

/**
 *
 * @author hansvos
 */
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class CellBillBarChart extends JFrame{

    final int LEFT_MARGIN = 35; //starting x coordinate
    final int BASE_Y_BAR = 150; //bottom of the bars
    final int BASE_Y_VALUE = 175; //bottom of the values
    final int BAR_WIDTH = 30; //width of each bar
    final int SPACE_BETWEEN_BARS = 10; //pixels between bars
    
    private double [ ] cellBills = { 45.24, 54.67, 42.55, 44.61, 65.29, 49.75};
    
    public void paint (Graphics g)
    {
        super.paint(g);
        
        g.setColor(Color.BLUE);
        int xStart = LEFT_MARGIN;
        
        for (int i = 0; i < cellBills.length; i++)
        {
            g.fillRect(xStart, BASE_Y_BAR - (int)(cellBills[i]), BAR_WIDTH, (int)(cellBills[i]));
            g.drawString(Double.toString(cellBills[i]), xStart, BASE_Y_VALUE);
            
            //move to starting x value for next bar
            xStart += BAR_WIDTH + SPACE_BETWEEN_BARS;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        CellBillBarChart app = new CellBillBarChart();
        app.setSize(300, 200);
        app.setVisible(true);
    }
    
}
