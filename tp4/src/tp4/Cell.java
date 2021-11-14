package tp4;
public class Cell<T> {
	private T obj;
	private Cell<T> next;
	
	public Cell(T obj) {
		this.obj = obj;
		this.next = null;
	}
	
	public Cell<T> next() {
		return this.next;
	}
	
	public T cell() {
		return this.obj;
	}
	
	public void setNext(Cell<T> cell) {
		this.next = cell;
	}
	
	public T object() {
		return this.obj;
	}
	
	@Override
	public String toString() {
		return this.obj.toString();
	}
}
