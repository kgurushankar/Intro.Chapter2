package dayone;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloGraphics extends JPanel
{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		 super.paintComponent(g);  // Call JPanel's paintComponent method
		                           //   to paint the background
		 g.setColor(Color.WHITE);
		 g.drawRect(20, 40, 150, 45);
		 
		 g.setColor(Color.BLACK);
		 g.drawString("Hello, Graphics!", 55, 65); //she did 60,25
		 
	}
	
	public static void main(String[] args)
	{
		 JFrame window = new JFrame("Graphics Demo");
		 window.setBounds(300, 300, 200, 150);
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 HelloGraphics panel = new HelloGraphics();
		 panel.setBackground(Color.GREEN);	//The default color is a light gray
		 Container c = window.getContentPane();
		 c.add(panel);
		 
		 window.setVisible(true);
	}
}
