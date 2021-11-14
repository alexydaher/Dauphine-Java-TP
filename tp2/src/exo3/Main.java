package exo3;

/**
 * 
 * @author alexy
 *
 */
public class Main {
	
	/**
	 *
	 * @param args for Main
	 */
	public static void main(String[] args) {
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); //affiche 1337.0
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); //affiche 1664.0
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); //affiche 2014.0
		
		Expr sqrt = new Sqrt(new Add(new Value(5.0), new Value(20.0)));
		System.out.println(sqrt.eval()); //affiche 5.0
		
		Expr mult = new Multiplication(sqrt, add);
		System.out.println(mult.eval());
		
		System.out.println("val = " + val);
		System.out.println("add = " + add);
		System.out.println("e = " + e);
		System.out.println("sqrt = " + sqrt);
		System.out.println("mult = " + mult);
	}
}
