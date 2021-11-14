package model;

/**
 * @author alexy
 *
 */
public class Point {
	private int x;
	private int y;

	/**
	 * @param dx int
	 * @param dy int
	 */
	public Point(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}
	
	/**
	 * @param p2 Point
	 */
	public Point(Point p2) {
		this.x = p2.x;
		this.y = p2.y;
	}
	
	/**
	 * 
	 */
	public static void printNewPoint() {
		Point p = new Point(1, 2);
		System.out.println(p.x + " " + p.y);
	}
	
	/**
	 * @return x
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * @return y
	 */
	public int getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")"; 
	}
	
	/**
	 * @param p Point
	 * @return true if p is the same as this
	 */
	public boolean isSameAs(Point p) {
		return (this.x == p.x && this.y == p.y);
	}

	/**
	 * @param dx int
	 * @param dy int
	 */
	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
}
