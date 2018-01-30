package CounterChapter1;

public class Counter {
	private int count;
	public Counter(){}
	public Counter(int initial) { this.count = initial; }
	public int getCount() { return this.count;}
	public void increment() {this.count++;}
	public void increment(int delta) {this.count=delta; }
	public void reset() { count = 0;}	
}
