//Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PushToAddGUI {

	//Constants
	public final int WIDTH = 300;
	public final int HEIGHT = 200;
	
	//Instance variables are the frame, panel, textField, and button.
	//The frame contains the other three objects. 
	//The frame is needed to "house" the GUI
	
	int counter;
	
	JFrame pToAFrame;
	JPanel pToAPanel;
	JTextField pToAText;
	JButton pToAButton;
	
	
	// Constructor
	public PushToAddGUI() 
	{
		//Initialize all the instance variables. 
		//----------------------------------------
		
		counter = 0;
		//Initialize frame and set close operation for proper closing. 
		//frame title(String) appears as frame title. 
		
		pToAFrame = new JFrame("Push Button To Add");
		pToAFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Initialize panel and set its layout to BorderLayout
		pToAPanel = new JPanel(new BorderLayout());
		//Initialize textfield and set column width to 5.
		pToAText = new JTextField("0", 5);
		//Initialize button and its description
		pToAButton = new JButton("Push Me to Add: ");
		
		
		//Set preferred size to panel and add text and button to it. 
		pToAPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		//BorderLayout values are 4 compass positions and CENTER.
		pToAPanel.add(pToAText, BorderLayout.EAST);
		pToAPanel.add(pToAButton, BorderLayout.WEST);
		
		//Create and attach a listener to the button. 
		PToAListener listener = new PToAListener();
		
		pToAButton.addActionListener(listener);
		pToAFrame.add(pToAPanel);
		
		

	}
	
	//Inner actionListener class = to act when button is pressed. 
	// only action is to increment counter and display
	// that value in the text field. 
	
	public class PToAListener implements ActionListener
	{
		//Contracted method for ActionListener Interface.
		public void actionPerformed(ActionEvent e) {
		
			//With an inner class, we can easily access instance variables. 
			counter++;
			
			pToAText.setText("" + counter);
			
		}
	}
	
	
	// Method needed to pack and display the frame as GUI
	// after creating the frame you must "pack" it and make it visible. 
	
	public void display()
	{
		pToAFrame.pack();
		pToAFrame.setVisible(true);
	}
}
