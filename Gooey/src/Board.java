import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;


public class Board extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9172896193774508764L;

	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawDonut(g);
    }

    private void drawDonut(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh
                = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        Dimension size = getSize();
        double w = size.getWidth();
        double h = size.getHeight();

        Ellipse2D e = new Ellipse2D.Double(0, 0, w, h);
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.LIGHT_GRAY);

        for (double deg = 0; deg < 360; deg += 5) {
        	

        	
            AffineTransform at
                    = AffineTransform.getTranslateInstance(w, h);
            at.rotate(Math.toRadians(deg));
            g2d.draw(at.createTransformedShape(e));
        }
    }
}