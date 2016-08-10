import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;

public class MyFirstGGui {

	private JFrame myFrame;
	
	public MyFirstGGui ()
	{
		myFrame = new JFrame("My first GUI");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setPreferredSize(new Dimension(100, 100));
		
	}
	
	public void display()
	{
		myFrame.pack();
		myFrame.setVisible(true);
		
	}
}
