import java.util.Iterator;
import java.util.List;

public class Panel {
	
	public static Iterator<Integer> panel1(int first, int last) {
		Iterator<Integer> it = new Iterator<Integer>() {

            private int current = first;

            @Override
            public boolean hasNext() {
                return current >= first && current <= last;
            }

            @Override
            public Integer next() {
                return current++;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
	}
	
	public static PanelIterator panel2(int first, int last) {
		PanelIterator it = new PanelIterator() {

			@Override
			public Iterator<Integer> iterator() {
				Iterator<Integer> it = new Iterator<Integer>() {

		            private int current = first;

		            @Override
		            public boolean hasNext() {
		                return current >= first && current <= last;
		            }

		            @Override
		            public Integer next() {
		                return current++;
		            }

		            @Override
		            public void remove() {
		                throw new UnsupportedOperationException();
		            }
		        };
		        return it;
			}			
		};
        return it;
	}
	
	public static List<Integer> panel(int first, int last) {
		MyList list = new MyList(first, last); 
		return list;
	}
}