import java.util.ArrayList;
import java.util.List;

public class Maximum {
	
	public static int myMax(int... numbers) {
		if (numbers.length == 0) {
			throw new IllegalArgumentException("");
		}
		int max = numbers[0];
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}
	
	public static <T extends Comparable<T>> T myMax2(T... objects) {
		if (objects.length == 0) {
			throw new IllegalArgumentException("");
		}
		T max = objects[0];
		for (T object : objects) {
			if (object.compareTo(max) > 0) {
				max = object;
			}
		}
		return max;
	}
	
	public static <T> void print(List<T> list) {
		for (T o:list)
			System.out.println(o);
	}
	
	public static <T extends CharSequence> void printSize(List<T> list) {
		for (T o:list)
			System.out.println(o + " : " + o.length());
	}
	
	public static <T extends CharSequence> List<Integer> listLength(List<T> list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			CharSequence seq = (CharSequence) list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	public static List<Integer> listLength2(List<? extends CharSequence> list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			CharSequence seq = (CharSequence) list.get(i);
			length.add(seq.length());
		}
		return length;
	}

}
