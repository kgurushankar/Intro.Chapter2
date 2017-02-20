package excercises;

//Question 2-13-a

import java.awt.*;
import javax.swing.*;

/**
*  This program displays a red cross on a white
*  background.
*/

public class No13a extends JPanel
{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		 super.paintComponent(g);  // Call JPanel's paintComponent method
		                           //   to paint the background
		 int xCenter = getWidth() / 2;
		 int yCenter = getHeight() / 2;
		 g.setColor(Color.RED);	
		 g.fillRect((xCenter-5), (yCenter-25), 10, 50);
		 g.fillRect((xCenter-25), (yCenter-5), 50, 10);
	}
	
	public static void main(String[] args)
	{
		 JFrame window = new JFrame("Red Cross");
		 window.setBounds(300, 300, 200, 200);
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 No13a panel = new No13a();
		 panel.setBackground(Color.WHITE);
		 Container c = window.getContentPane();
		 c.add(panel);
		 window.setVisible(true);
	}
}
