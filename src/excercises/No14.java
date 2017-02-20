package excercises;
// Question 2-14

import java.awt.*;
import javax.swing.*;

public class No14 extends JApplet
{

	private static final long serialVersionUID = 1L;

	public void init()
	{
		Container c = getContentPane();
	    c.setBackground(Color.WHITE);
	}
	
	  public void paint(Graphics g)
	  {
		  super.paint(g);    // Call JApplet's paint method
		                       //  to paint the background
		  g.setColor(Color.BLUE);
		  g.fillRect(25, 40, 150, 45);  // draw a rectangle 150 by 45
		  g.setColor(Color.WHITE);
		  g.drawString("Hello, Applet!", 60, 65);
	  }
}
