package exo3;

/**
 * 
 * @author alexy
 *
 */
public class Add implements Expr {
	private Expr expr1;
	private Expr expr2;
	/**
	 * Constructor
	 * @param expr1 Expr
	 * @param expr2 Expr
	 */
	public Add(Expr expr1, Expr expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	/**
	 * evaluate expr1 + expr2
	 */
	public double eval() {
		return this.expr1.eval() + this.expr2.eval();
	}
	
	@Override
	public String toString() {
		return expr1.toString() + " + " + expr2.toString();
	}

}
