import java.awt.Dimension;
import javax.swing.JFrame;
import model.*;
import view.*;
import controller.*;

/**
 * @author alexy
 *
 */
public class Main {
	/**
	 * @param args String[]
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avanc ́e - Graphic Display");
		
		Circle circle = new Circle(new Point(50, 200), 100);
		CircleView circleView = new CircleView(circle);
		
		MouseController mouseController = new MouseController(frame, circle);
		
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.addMouseMotionListener(mouseController);
		
		frame.add(circleView);
	}
}
