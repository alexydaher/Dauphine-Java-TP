package tp4;

public class Main {

	public static void main(String[] args) {
		MyList<String> ml = new MyList<String>();
		ml.addLast("sdfds");
		ml.add("toto");
		ml.add("titi");
		ml.add("tata");
		ml.add("toutout", 1);
		ml.addLast("toutouteefsdf");
		System.out.println(ml);
		System.out.println(ml.size());
		
		MyList<Object> l = new MyList<Object>();
		l.addLast(1);
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast(true);
		l.add("doh");
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
	}
}
