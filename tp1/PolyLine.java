package fr.dauphine.javaavance.td1;

import java.util.LinkedList;

public class PolyLine {
//	private int index;
//	private int maxNbr;
//	private Point points[];
	private LinkedList<Point> points;

	public PolyLine(/*int max*/) {
//		this.maxNbr = max;
//		this.points = new Point[max];
//		this.index = 0;
		
		this.points = new LinkedList<Point>();

	}
	
	
//	public boolean add(Point p) {
//		if (this.index < this.maxNbr) {
//			this.points[index] = p;
//			this.index++;
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
	
	public void add(Point p) {
		this.points.add(p);
	}
	
	public int nbPoints() {
		return points.size();
	}
	
	
//	public int pointCapacity() {
//		return this.maxNbr;
//	}
//	
//	public int nbPoints() {
//		return this.index + 1;
//	}
	
	
	public boolean contains(Point p) {
//		for (Point e : this.points) {
//			if (e.equals(p)) {
//				return true;
//			}
//		}
//		return false;
		return this.points.contains(p);
		
	}
	
	public static void main(String[] args) {
		PolyLine line = new PolyLine(/* 3 */);
		line.add(new Point(1, 2));
		line.add(new Point(1, 3));
		line.add(null);
		System.out.println(line.contains(new Point(1, 6)));
	}
	
	
	
}
