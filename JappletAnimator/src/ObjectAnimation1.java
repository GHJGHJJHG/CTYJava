/*
 * AlienObject.java 1.0 03/10/16
 *
 * Uses the Tree class - creates and draws multiple
 * Tree heads on in the window
 */

import java.awt.*;
import java.applet.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;


public class ObjectAnimation1 extends Applet 
{
	// window size - could be used if creating random heads
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3103425983453439512L;

	private Graphics2D g2;
	
	public static int MAXWIDTH = 400;
	public static int MAXHEIGHT = 300;
	private Tree joe;

	
	public void init()
	{
		setSize(MAXWIDTH, MAXHEIGHT);
		setBackground(Color.white);
		
		class JoeTimerDelay implements ActionListener
		{
			
			public JoeTimerDelay()
			{
			}
			
			public void actionPerformed(ActionEvent event)
			{
				joe.move(g2, (int)(Math.random()*4),(int)(Math.random()*4));
				repaint();
			}
		}
		joe = new Tree(50,50);
		final int DELAY = 30;
		JoeTimerDelay joeTimerDelayListener = new JoeTimerDelay();
		Timer tb1 = new Timer(DELAY, joeTimerDelayListener);
		tb1.start();
		
		
		
	}

	public void paint(Graphics g) 
	{
		//g2.rotate(Math.toRadians(3));

		g2 = (Graphics2D)g;
		g2.setBackground(Color.blue);

		// draw three aliens in different places in the window
//		Tree sue = new Tree(200,200);
//		Tree sam = new Tree(400, 100);

//		g2.rotate(45);
		joe.draw(g2);
//		sue.draw(g);
//		sam.draw(g);
//		repaint();				// repaint with alien in new position	

	}
}

