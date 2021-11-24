
public class Main {

	public static void main(String[] args) throws ErrConst, ErrS, ErrD, ErrP {
		Number a, b;
		a = new Number(2147483647);
		b = new Number(5);
//		System.out.println(Number.somme(a, b));
//		System.out.println(Number.difference(b, a));
		System.out.println(Number.produit(b, a));
	}

}
