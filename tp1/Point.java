package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;
	private static int numberOfPoints = 0;
	
	public Point(int dx, int y) {
		this.x = dx;
		this.y = y;
		numberOfPoints++;
	}
	
	public Point(Point p2) {
		this.x = p2.x;
		this.y = p2.y;
		numberOfPoints++;
	}
	
	public static void printNewPoint() {
		Point p = new Point(1, 2);
		System.out.println(p.x + " " + p.y);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")"; 
	}
	
	public boolean isSameAs(Point p) {
		return (this.x == p.x && this.y == p.y);
	}

	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/*
	public Point translate(int dx, int dy) {
		return new Point(this.x + dx, this.y + dy);
	}
	*/
	
	
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = p1;
		Point p3 = new Point(1, 2);
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);

		System.out.println(list.indexOf(p3));
		System.out.println(list.indexOf(p2));
	}
	
}
