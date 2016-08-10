// Alien Class -
//
// *** creates a head of an alien
//     head is drawn in relation to xLeft and yTop

import java.awt.*;

public class Tree
{
//	// *** Constants for Alien face
//	private final int HEADDIAMETER = 52;
//	private final int EYEWIDTH = 8;
//	private final int EYEHEIGHT = 4;
//	private final int ANTENNADIAMETER = 4;

	// *** instance variables
	private int xLeft;			// face start
	private int yTop;
	private Color wood = new Color(176, 137, 59);

	// Constructor - only one - must give start x and y for alien face
	//    for now all aliens will be the same color - a yellowish
	public Tree(int startX, int startY)
	{
		xLeft = startX;
		yTop = startY;
//		alienColor = new Color(248, 253, 147);
	}

	public void draw(Graphics g)	// draw the face on the graphics object
	{
		//Trunk
		g.setColor(wood);
		g.fill3DRect(xLeft+50-(75/2), yTop + 50, 75, 175, true);
		g.setColor(Color.BLACK);
		
		//Green
		g.setColor(new Color((int)(Math.random()*30), (int)(Math.random()*30)+225 , (int)(Math.random()*30) ));
		g.fillOval(xLeft, yTop, 100, 100);
		g.setColor(Color.BLACK);
	}
}

