package model;

import java.util.LinkedList;

/**
 * @author alexy
 *
 */
public class PolyLine {
	private LinkedList<Point> points;

	/**
	 * 
	 */
	public PolyLine() {
		this.points = new LinkedList<Point>();
	}
	
	/**
	 * @param p Point
	 */
	public void add(Point p) {
		this.points.add(p);
	}
	
	/**
	 * @return number of points
	 */
	public int nbPoints() {
		return points.size();
	}

	/**
	 * @param p Point
	 * @return true if p is in polyline
	 */
	public boolean contains(Point p) {
		return this.points.contains(p);		
	}
}
