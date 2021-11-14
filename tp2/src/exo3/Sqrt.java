package exo3;

/**
 * 
 * @author alexy
 *
 */
public class Sqrt implements Expr {
	private Expr expr;
	/**
	 * Constructor
	 * @param expr Expr
	 */
	public Sqrt(Expr expr) {
		this.expr = expr;
	}
	
	/**
	 * square root of expr
	 */
	public double eval() {
		return Math.sqrt(expr.eval());
	}
	
	@Override
	public String toString() {
		return '\u221a' + "(" +  expr.toString() + ")";
	}

}
