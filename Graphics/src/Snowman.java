import java.applet.Applet;
import java.awt.*;

public class Snowman extends Applet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2983101762188985441L;

	//init
	public void init()
	{
		setSize(500,500);
		
	}
	
	public void paint(Graphics g){
		Graphics2D page = (Graphics2D) g;
		setBackground(Color.WHITE);
		page.setColor(Color.BLACK);
		page.setStroke(new BasicStroke(1));
		//Middle is 175
		//Body
		page.drawOval(100,200, 150, 150); 
		
		//Body Buttons
		page.setColor(Color.RED);
		page.fillOval(170, 200+30, 10, 10);
		page.fillOval(170, 200+60, 10, 10);
		page.fillOval(170, 200+90, 10, 10);
		page.setColor(Color.BLACK);
		
		//Head
		page.drawOval(125, 100, 100, 100);
		
		//Eyes
		page.setColor(Color.BLUE);
		page.fillOval(170-20, 130, 10, 10);
		page.fillOval(170+20, 130, 10, 10);
		page.setColor(Color.BLACK);
		
		//Nose
		page.setColor(Color.ORANGE);
		int[] xcoords = {175, 182, 195};
		int[] ycoords = {150, 162, 148};
		page.fillPolygon(xcoords, ycoords, 3);
		page.setColor(Color.BLACK);
		
		//Pipe
		page.drawLine(170, 175, 170+65, 175+20);
		page.fillRect(170+55, 170+12, 15, 15);
		
		//Hat
		page.fillRect(125, 20, 100, 80);
		
		//Hat brim
		page.setColor(Color.DARK_GRAY);
		page.setStroke(new BasicStroke(10));
		page.drawLine(100, 100, 250, 100);
		page.setColor(Color.BLACK);
		page.setStroke(new BasicStroke(1));
		
		//Bottom
		page.drawOval(75, 350, 200, 200);
		
		//Bottom Buttons
		page.fillOval(165, 350+50, 20, 20);
		page.fillOval(165, 350+100, 20, 20);
		page.fillOval(165, 350+150, 20, 20);
//		page.fillRect(getSize().width/2, getSize().height/2, getSize().width, getSize().height);
		
		//Name
		
		page.drawString("Indictor-Snowman", 120, 600);
		
		page.setColor(Color.WHITE);
	}
	
}
