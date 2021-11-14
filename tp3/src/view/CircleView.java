package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

import model.Circle;

/**
 * @author alexy
 *
 */
public class CircleView extends JPanel {
	private Circle circle;
	/**
	 * @param c2 Circle
	 */
	public CircleView(Circle c2) {
		this.circle = c2;
	}
	
	/**
	 *
	 */
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(
        		this.circle.getCenter().getX(), 
        		this.circle.getCenter().getY(), 
        		this.circle.getRadius(), 
        		this.circle.getRadius());
        g2D.fill(circle);
    }
}
