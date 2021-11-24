
public class Number {
	private int entier;
	
	public Number(int entier) throws ErrConst {
		if (entier < 0) {
			throw new ErrConst("entier doit etre positif");
		}
		this.entier = entier;
	}
	
	public int getN() {
		return this.entier;
	}
	
	public static Number somme(Number a, Number b) throws ErrD, ErrConst {
		long res = (long) a.entier + (long) b.entier;
		if (res > 2147483647 || res < 0) {
			throw new ErrD("erreur de somme");
		}
		return new Number(a.entier + b.entier);	
	}
	
	public static Number difference(Number a, Number b) throws ErrD, ErrConst {
		int res = a.entier - b.entier;
		if (res > 2147483647 || res < 0) {
			throw new ErrD("erreur de difference");
		}
		return new Number(res);	
	}
	
	public static Number produit(Number a, Number b) throws ErrP, ErrConst {
		long res = (long) a.entier * (long) b.entier;
		if (res > 2147483647 || res < 0) {
			throw new ErrP("erreur de produit");
		}
		return new Number(a.entier * b.entier);	
	}
	
	@Override
	public String toString() {
		return this.entier + "";
	}

}
