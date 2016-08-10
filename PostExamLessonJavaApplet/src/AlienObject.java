/*
 * AlienObject.java
 *
 * Uses the Alien class - creates and draws multiple
 * Alien heads on in the window
 */

import java.awt.*;
import java.applet.*;
//import java.util.*;

public class AlienObject extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3144296329807121784L;
	// window size - could be used if creating random heads
	private final int MAXWIDTH = getSize().width;
	private final int MAXHEIGHT  = getSize().height;

	public void init()
	{
		setBackground(Color.CYAN);
		setSize(MAXWIDTH, MAXHEIGHT);
	}

	public void paint(Graphics g)
	{
		// draw three aliens in different places in the window
		Alien joe = new Alien(50,50);
		Alien sue = new Alien(200,200);
		Alien sam = new Alien(400, 100);
		
//		while (true)
		sue.draw(g);
		joe.draw(g);
		sam.draw(g);
		
		
//		Tree[] givingTree = new Tree[30];
//		
//		for (int i = 0; i < 30; i++) givingTree[i] = new Tree((int)(Math.random()*getSize().width) , 300);
//
//		for (Tree i : givingTree) i.draw(g);
		// Could add code here to draw multiple random Alien heads

	}
}
