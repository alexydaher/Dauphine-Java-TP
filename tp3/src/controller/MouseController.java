package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Circle;

/**
 * @author alexy
 *
 */
public class MouseController extends JPanel implements MouseMotionListener {
	private JFrame frame;
	private Circle model;
	
	/**
	 * @param frame JFrame
	 * @param model Circle
	 */
	public MouseController(JFrame frame, Circle model) {
		addMouseMotionListener(this);
		this.model = model;
		this.frame = frame;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		model.translate(e.getX() - model.getCenter().getX() - 45, e.getY() - model.getCenter().getY() - 70);
		frame.repaint();
	}

}
