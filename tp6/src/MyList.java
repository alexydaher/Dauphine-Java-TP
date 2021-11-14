import java.util.AbstractList;

public class MyList extends AbstractList<Integer> {
	private int first, last;
	public MyList(int first, int last) {
		if (first > last) {
			throw new IllegalArgumentException("first is bigger than last");
		}
		this.first = first;
		this.last = last;
	}

	@Override
	public Integer get(int index) {
		int current;
		current = index + first;
		if (current > last || index < 0) {
			throw new IndexOutOfBoundsException("");
		}
		return current;
	}

	@Override
	public int size() {
		return last - first + 1;
	}
}
