package excercises;

//Question 2-13-a
// now cross scales to window resize


import java.awt.*;
import javax.swing.*;

/**
*  This program displays a red cross on a white
*  background.
*/

public class No13aV2 extends JPanel
{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		 super.paintComponent(g);  // Call JPanel's paintComponent method
		                           //   to paint the background
		 int xCenter = getWidth() / 2;
		 int yCenter = getHeight() / 2;
		 int x1 = getHeight() / 20;
		 int y1 =getHeight() / 4;
		 int x2 = getWidth() / 4;
		 int y2 =getHeight() / 20;
		 
		 g.setColor(Color.RED);	
		 g.fillRect((xCenter-(x1/2)), (yCenter-(y1/2)), x1, y1); //horizontal
		 g.fillRect((xCenter-(x2/2)), (yCenter-(y2/2)), x2, y2); //vertical
	}
	
	public static void main(String[] args)
	{
		 JFrame window = new JFrame("Red Cross");
		 window.setBounds(300, 300, 200, 200);
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 No13aV2 panel = new No13aV2();
		 panel.setBackground(Color.WHITE);
		 Container c = window.getContentPane();
		 c.add(panel);
		 window.setVisible(true);
	}
}
