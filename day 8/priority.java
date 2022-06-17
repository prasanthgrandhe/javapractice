
class pri extends Thread
{
	public void run()
	{
		System.out.println("Current Thread : "+Thread.currentThread().getName());
		System.out.println("Current Thread : "+Thread.currentThread().getPriority());
	}
}

public class priority
{
	public static void main(String[] args)
	{
		pri t1 = new pri();
		pri t2 = new pri();
		//pri t3 = new pri();
		//pri t4 = new pri();
		t1.setName("first");
		t2.setName("Second");
		//t3.setName("Third");
		//t4.setName("fourth");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(4);
		//t3.setPriority(7);
		//t4.setPriority(9);
		t1.start();
		t2.start();
		//t3.start();
		//t4.start();
		
	}
}