package fr.dauphine.javaavance.td1;

public class Circle {
	private Point center;
	private int radius;
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	public Point getCenter() {
		/*
		return this.center;
		*/
		return new Point(this.center);
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public double area() {
		return 3.14 * this.radius * this.radius; 
	}
	
	public boolean contains(Point p) {
		return ((p.getX() - this.center.getX()) * (p.getX() - this.center.getX()) + 
				(p.getY() - this.center.getY()) * (p.getY() - this.center.getY())) 
				<= (this.radius * this.radius);
	}
	
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
	
	public static void main(String[] args) {
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c.getCenter().translate(1,1);
		System.out.println(c+"\n"+c2);
		Ring r = new Ring(p, 2, 1);
		System.out.println(r);
	}
}
