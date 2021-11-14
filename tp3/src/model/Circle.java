package model;

/**
 * @author alexy
 *
 */
public class Circle {
	private Point center;
	private int radius;
	
	/**
	 * @param center Point
	 * @param radius int
	 */
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	/**
	 * @param dx int
	 * @param dy int
	 */
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	/**
	 * @return the center
	 */
	public Point getCenter() {
		/*
		return this.center;
		*/
		return new Point(this.center);
	}
	
	/**
	 * @return the radius
	 */
	public int getRadius() {
		return this.radius;
	}
	
	/**
	 * @return the area
	 */
	public double area() {
		return 3.14 * this.radius * this.radius; 
	}
	
	/**
	 * @param p Point
	 * @return true if p is in the circle
	 */
	public boolean contains(Point p) {
		return ((p.getX() - this.center.getX()) * (p.getX() - this.center.getX()) + 
				(p.getY() - this.center.getY()) * (p.getY() - this.center.getY())) 
				<= (this.radius * this.radius);
	}
	
	/**
	 * @param p Point
	 * @param circles Circle[]
	 * @return true if p is in all circles
	 */
	public boolean contains(Point p, Circle... circles) {
		for (Circle c : circles) {
			if (c.contains(p) == false) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "(center : " + this.center + ", radius : " 
				+ this.radius + ", area : "  +  this.area();
	}
}
