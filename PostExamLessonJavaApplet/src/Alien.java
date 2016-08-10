// Alien Class -
//
// *** creates a head of an alien
//     head is drawn in relation to xLeft and yTop

import java.awt.*;

public class Alien
{
	// *** Constants for Alien face
	private final int HEADDIAMETER = 52;
	private final int EYEWIDTH = 8;
	private final int EYEHEIGHT = 4;
	private final int ANTENNADIAMETER = 4;
	
	private boolean isForward = true;
	private boolean isDown    = false;
	// *** instance variables
	private int xLeft;			// face start
	private int yTop;
	private Color alienColor;

	// Constructor - only one - must give start x and y for alien face
	//    for now all aliens will be the same color - a yellowish
	public Alien(int startX, int startY)
	{
		xLeft = startX;
		yTop = startY;
		alienColor = new Color(248, 253, 147);
	}

	public void draw(Graphics g)	// draw the face on the graphics object
	{
		g.setColor(alienColor);
		g.fillOval(xLeft, yTop, HEADDIAMETER, HEADDIAMETER);

		// eyes and rest will be black
		g.setColor(Color.black);
		// color circle around filled in Oval
		g.drawOval(xLeft, yTop, HEADDIAMETER, HEADDIAMETER);

		// eyes
		g.fillOval(xLeft + 16, yTop + 16, EYEWIDTH, EYEHEIGHT);
		g.fillOval(xLeft + 36, yTop + 16, EYEWIDTH, EYEHEIGHT);

		// antenna tops
		g.fillOval(xLeft, yTop - 16, ANTENNADIAMETER, ANTENNADIAMETER);
		g.fillOval(xLeft + 50, yTop - 16, ANTENNADIAMETER, ANTENNADIAMETER);

		// antenna
		g.drawLine(xLeft + 12, yTop + 4, xLeft + 2, yTop - 16);
		g.drawLine(xLeft + 40, yTop + 4, xLeft + 52, yTop - 16);

		// smile
		g.drawArc(xLeft + 20, yTop + 16, 20, 20, 235, 60);
	}

	
}

