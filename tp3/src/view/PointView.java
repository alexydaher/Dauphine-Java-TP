package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import model.Point;

/**
 * @author alexy
 *
 */
public class PointView extends JPanel {
	private Point point;
	
	/**
	 * @param point Point
	 */
	public PointView(Point point) {
		this.point = point;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
        g2D.drawLine(point.getX(), point.getY(), point.getX(), point.getY());;
    }
}
