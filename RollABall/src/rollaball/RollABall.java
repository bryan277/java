/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollaball;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class RollABall extends JFrame {

    
    public void paint(Graphics g) 
    {
        super.paint(g);
        
        final int MOVE = 5;             //space between balls
        final int BORDER_RIGHT = 8;     //thickness of right border
        //instantiate the ball as a Circle object
        //x is 18, y is 75, diameter is 15, color is blue
        Circle ball = new Circle(18, 75, 15, Color.BLUE);
        
        //get ball diameter
        int ballDiameter = ball.getDiameter();
        
        while (ball.getx() + ballDiameter < getWidth() - BORDER_RIGHT)
        {
            ball.draw(g);//draw the ball
            
            //set x to next drawin location
            ball.setX(ball.getX() + ballDiameter + MOVE);
        }
    }
    
    public static void main(String[] args)
    {
        RollABall roll = new RollABall();
        roll.setSize(400,300);
        roll.setVisible(true);
    }
    
}
