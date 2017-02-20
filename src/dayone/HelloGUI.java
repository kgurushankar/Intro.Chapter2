package dayone;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *  This program displays a message in a window.
 */


public class HelloGUI extends JFrame
{
	/**constructor of class HelloGUI
	 * constructor in java is a special type of method that is used to initialize
	 * the object. Java constructor is invoked at the time of object creation.
	 * It constructs the values and provides data for the object
	 */
	private static final long serialVersionUID = 1L;

	public HelloGUI()   // Constructor
	  {
	    super("GUI Demo");		// super() is used to invoke immediate parent class construction
	    						// Set the title bar
	    Container c = getContentPane();
	    c.setBackground(Color.CYAN);
	    c.setLayout(new FlowLayout());
	    c.add(new JTextField(" Hello, GUI!", 10)); 	/**Parameters: 
												     * text - the text to be displayed, or null 
												     * columns - the number of columns to use to calculate the preferred width
												     *			 if columns is set to zero, the preferred width will be whatever naturally results from the component implementation
												     */
	    
	    
	    }

  public static void main(String[] args)
  {
    HelloGUI window = new HelloGUI();

    /**
     * Set this window's location and size:
     *  upper-left corner at 300, 300; width 200, height 100
     */
    window.setBounds(300, 300, 200, 100);

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}


