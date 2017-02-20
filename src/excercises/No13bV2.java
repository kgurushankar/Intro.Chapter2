package excercises;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class No13bV2 extends JPanel {
	

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		 super.paintComponent(g);  // Call JPanel's paintComponent method
		                           //   to paint the background
		 int xCenter = getWidth() / 2;
		 int yCenter = getHeight() / 2;
		 int winwid = getWidth();
		 int winhig = getHeight();
		 
		 g.setColor(Color.RED);
		 g.fillOval((xCenter-(5*(winwid/40))), (yCenter-5*((winhig/40))), 5*(winwid/20), 5*(winhig/20));
		 g.setColor(Color.WHITE);
		 g.fillOval((xCenter-(3*(winwid/40))), (yCenter-3*((winhig/40))), 3*(winwid/20), 3*(winhig/20));
		 g.setColor(Color.RED);
		 g.fillOval((xCenter-(winwid/40)), (yCenter-(winhig/40)), winwid/20, winhig/20);
	}
	
	public static void main(String[] args)
	{
		 JFrame window = new JFrame("Red Bullseye");
		 window.setBounds(300, 300, 200, 200);
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 No13bV2 panel = new No13bV2();
		 panel.setBackground(Color.WHITE);
		 Container c = window.getContentPane();
		 c.add(panel);
		 window.setVisible(true);
	}
}
