package banner;

//Original One 

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.Timer;

public class BannerToLeft extends JApplet implements ActionListener
{	private static final long serialVersionUID = 1L;
private int xPos, yPos;  // hold the coordinates of the banner

public void init()
{
	 Container c = getContentPane();
	 c.setBackground(Color.WHITE);
	 xPos = c.getWidth();
	 yPos = c.getHeight() / 2;
	 Timer clock = new Timer(30, this);  // fires every 30 milliseconds 
	 clock.start();
}

// Called automatically after a repaint request
public void paint(Graphics g)
{
	 super.paint(g);
	 //g.fillRect(xPos, yPos, 100, 50);
	 g.drawString("Hello, World!", xPos, yPos); 
}

// Called automatically when the timer fires
public void actionPerformed(ActionEvent e)
{
	 Container c = getContentPane();
	
	 // Adjust the horizontal position of the banner:
	 xPos--;
	 if (xPos < -100)
	 {
		 xPos = c.getWidth();
	 }
	
	 // Set the vertical position of the banner:
	 yPos = c.getHeight() / 2;
	
	 repaint();
}
}
