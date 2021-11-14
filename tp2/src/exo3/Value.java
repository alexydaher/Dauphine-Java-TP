package exo3;

/**
 * 
 * @author alexy
 *
 */
public class Value implements Expr {
	private double val;
	/**
	 * Constructor
	 * @param val double
	 */
	public Value(double val) {
		this.val = val;
	}
	
	/**
	 * return value
	 */
	public double eval() {
		return this.val;	
	}
	
	@Override
	public String toString() {
		return this.val + "";
	}

}
