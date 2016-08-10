import java.applet.Applet;
import java.awt.*;

public class PieChart extends Applet {

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
		
		page.drawString("Pie Chart", 150, 70);
		
		//Template
//		page.drawOval(100,100, 150, 150); 
		
		//Rent and Utilities, 35%
		page.setColor(Color.ORANGE);
		page.fillArc(100,  100, 150, 150, 0, (35*360/100));
		page.drawString("Rent and Utilities", 250, 110);
		page.setColor (Color.BLACK);

		//Miscellaneous, 10%
		page.setColor(Color.BLUE);
		page.fillArc(100,  100, 150, 150, (35*360/100), (10*360/100));
		page.drawString("Miscellaneous", 5, 130);
		page.setColor (Color.BLACK);
		
		//Transportation 15%
		page.setColor(Color.RED);
		page.fillArc(100,  100, 150, 150, (45*360/100), (15*360/100));
		page.drawString("Transportation", 5, 190);
		page.setColor (Color.BLACK);
		
		//Educational, 25%
		page.setColor(Color.PINK);
		page.fillArc(100,  100, 150, 150, (60*360/100), (25*360/100));
		page.drawString("Educational", 45, 260);
		page.setColor (Color.BLACK);
		
		//Food, 15%
		page.setColor(Color.GRAY);
		page.fillArc(100,  100, 150, 150, (85*360/100), (15*360/100));
		page.drawString("Food", 270, 195);
		page.setColor (Color.BLACK);
		
		
		
//		page.fillRect(getSize().width/2, getSize().height/2, getSize().width, getSize().height);
		
		page.setColor(Color.WHITE);
	}
	
}
