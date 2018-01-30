package CounterChapter1;

public class CounterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c; 
		c = new Counter();
		c.increment();
		c.increment(3);
		int temp = c.getCount();
		System.out.println(temp);
		c.reset();
		Counter d = new Counter(5);
		d.increment();
		System.out.println(d.getCount());
		Counter e = d;
		temp = e.getCount();
		e.increment();
		System.out.println(e.getCount());
		
	}

}
