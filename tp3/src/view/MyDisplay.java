package view;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author alexy
 *
 */
public class MyDisplay extends JPanel {
	/**
	 * 
	 */
	public MyDisplay() {
		
	}
	
	/**
	 *
	 */
	@Override
	protected void paintComponent(Graphics g) {
        g.drawLine(50, 100, 400, 100);
    }
	
}
