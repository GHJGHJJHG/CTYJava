import java.applet.Applet;
import java.awt.*;

public class CTYGraphics extends Applet {
	
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
		setBackground(Color.YELLOW);
		page.setColor(Color.BLACK);
		page.setStroke(new BasicStroke(10));
		page.drawLine(0, 0, getSize().width, getSize().height);
		page.drawLine(getSize().width/2, getSize().height/2, getSize().width, 0);
		page.drawLine(getSize().width/2, getSize().height/2, getSize().width, getSize().height/2);
		page.drawLine(0, 0, getSize().width, getSize().height);
		page.setFont(new Font("Courier New", 10, 15));
		page.drawString("CTY is great!", 350, 250);
		page.setColor(Color.RED);
		
//		page.fillRect(getSize().width/2, getSize().height/2, getSize().width, getSize().height);
		
		page.setColor(Color.WHITE);
	}
	
}
