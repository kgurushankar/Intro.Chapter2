package daytwo;

//Question 2-13-a

import java.awt.*;
import javax.swing.*;

/**
*  This program displays a red cross on a white
*  background.
*/

public class HelloGraphics2 extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public static String WindowName = "Window";
	public static String Words ="Hello";

	public void paintComponent(Graphics g)
	{
		 super.paintComponent(g);  // Call JPanel's paintComponent method
		                           //   to paint the background
		 int xCenter = getWidth() / 2;
		 int yCenter = getHeight() / 2;
		 g.setColor(Color.RED);
		 int width = (int) (Words.length()*7.5+50);
		 g.fillRect((xCenter-25), (yCenter-25), width, 50);
		 
		 g.setColor(Color.WHITE);
		 g.drawString(Words, xCenter, yCenter);
	}
	
	public static void main(String[] args)
	{
		 JFrame window = new JFrame(WindowName);
		 window.setBounds(300, 300, 200, 200);
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 HelloGraphics2 panel = new HelloGraphics2();
		 panel.setBackground(Color.WHITE);
		 Container c = window.getContentPane();
		 c.add(panel);
		 window.setVisible(true);
	}
}
