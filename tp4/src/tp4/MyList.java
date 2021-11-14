package tp4;
public class MyList<T> {
	private Cell<T> first;
	private int size;
	
	public MyList() {
		this.first = null;
		this.size = 0;
	}
	
	public void add(T obj) {
		Cell<T> cell = new Cell<T>(obj);
		
		if (obj == null) {
			throw new NullPointerException("object can't be null");
		}
		cell.setNext(first);
		this.first = cell;
		this.size++;
	}
	
	public int size() {
		return this.size;
	}
	
	public void addLast(T obj) {
		Cell<T> last = new Cell<T>(obj);
		Cell<T> cell = first;
		if (obj == null) {
			throw new NullPointerException("object can't be null");
		}
		this.size++;
		if (this.first == null) {
			this.first = last;
			return;
		}
		
		while (cell.next() != null) {
			cell = cell.next();
		}
		
		cell.setNext(last);
	}
	
	public void add(T obj, int i) {
		if (obj == null) {
			throw new NullPointerException("string can't be null");
		}
		
		Cell<T> last = new Cell<T>(obj);
		Cell<T> cell = first;
		
		this.size++;
		if (this.first == null) {
			this.first = last;
			return;
		}
		
		while (cell.next() != null && i != 0) {
			cell = cell.next();
			i--;
		}
		
		last.setNext(cell.next());
		cell.setNext(last);
	}
	
	public T get(int index) {
		Cell<T> cell = this.first;
		if (index > this.size || cell == null || index < 0) {
			throw new IllegalArgumentException("index out of range");
		}
		int i = 0;
		while (cell.next() != null && i != index) {
			cell = cell.next();
			i += 1;
		}
		return cell.object();	
	}
	
	public int sumLetters() {
		int res = 0;
		Cell<T> cell = first;
		while (cell != null) {
			res += cell.toString().length();
			cell = cell.next();
		}
		return res;
	}	
	
	public boolean contains(T obj) {
		Cell<T> cell = first;
		while (cell != null) {
			if (cell.object().equals(obj)) {
				return true;
			}
			cell = cell.next();
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Cell<T> cell = first;
		if (cell == null) {
			return "";
		}
		
		sb.append(cell.toString());
		cell = cell.next();
		
		while (cell != null) {
			sb.append(", ");
			sb.append(cell.toString());
			cell = cell.next();
		}
		return sb.toString();
	}
	
}
