package model;

/**
 * @author alexy
 *
 */
public class Ring extends Circle {
	private int inner_radius;
	/**
	 * @param center Point
	 * @param radius int
	 * @param inner_radius int
	 */
	public Ring(Point center, int radius, int inner_radius) {
		super(center, radius);
		if (this.inner_radius > radius) {
			throw new IllegalArgumentException("inner radius must be smaller than the outer radius");
		}
		this.inner_radius = inner_radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ring) {
			Ring b = (Ring) obj;
			if (b.getCenter().equals(this.getCenter()) 
					&& b.getRadius() == this.getRadius()
					&& b.inner_radius == this.inner_radius) {
				return true;
			}
		}
		return false;
	}

	/**
	 *
	 */
	public boolean contains(Point p) {
		if (super.contains(p) == false
				|| ((p.getX() - this.getCenter().getX()) * (p.getX() - this.getCenter().getX()) + 
					(p.getY() - this.getCenter().getY()) * (p.getY() - this.getCenter().getY()))
					<= (this.inner_radius * this.inner_radius)) {
			return false;
		}
		return true;
	}
	
	/**
	 * @param p Point
	 * @param rings Ring[]
	 * @return true if p is in all rings
	 */
	public boolean contains(Point p, Ring... rings) {
		for (Ring r : rings) {
			if (r.contains(p) == false) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 *
	 */
	@Override
	public String toString() {
		return "(center : " + this.getCenter()
				+ ", outer radius : " + this.getRadius() 
				+ ", inner radius : " + this.inner_radius;
	}
}
