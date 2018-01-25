package SamplePackage;


public class Counter {

	protected  int count; 
	
	Counter(){
		count = 0;
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	public void incrementCount()
	{
		this.count++;
	}
	public void decrementCount()
	{
		count--;
	}
	
	public static void main(String args[])
	{
		Counter a = new Counter();
		a.incrementCount();
		System.out.println(a.getCount());
	}
}
