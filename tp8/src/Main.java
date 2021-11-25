import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		System.out.println(Maximum.myMax(42));
//		System.out.println(Maximum.myMax(42, 1664));
//		System.out.println(Maximum.myMax(42, 1664, 8, 191991, 2, -1));
//		System.out.println(Maximum.myMax2(42));
//		System.out.println(Maximum.myMax2("a", "b"));

//		System.out.println(Maximum.myMax2("a", 1)); // Compilation error
		
		
		List<String> list = Arrays.asList("foo", "toto");
		List<Integer> list2 = Arrays.asList(1, 2, 3);
//		Maximum.print(list);
//		Maximum.print(list2);
//		Maximum.printSize(list);
//		System.out.println(Maximum.listLength(l));

		
		List l = Arrays.asList("colonel", "reyel");
		
		List<String> l1 = Arrays.asList("C", "rc");
		List<StringBuilder> l2 = Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		
		List<? extends CharSequence> r1 = (List<? extends CharSequence>) Generics.fusion(l1, l2);
		System.out.println(r1);
		
		List<Integer> l3 = Arrays.asList(1, 2);
		System.out.println(Generics.fusion(l1, l3));
	}

}
