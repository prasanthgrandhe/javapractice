
class thread extends Thread
{
	public void run()
	{
		System.out.println("Thread name = "+Thread.currentThread().getName());
		System.out.println("Thread ID = "+Thread.currentThread().getId());
		System.out.println("Thread State = "+Thread.currentThread().isAlive());
		System.out.println("Thread status = "+Thread.currentThread().getState());
		System.out.println("Thread Group = "+Thread.currentThread().getThreadGroup());
	}
}
public class tinfo
{
	public static void main(String[] args)
	{
		thread t1 = new thread();
		System.out.println("First thread details : ");
		t1.start();
		System.out.println("====================================================");
		thread t2 = new thread();
		System.out.println("Second thread details : ");
		t2.start();
		System.out.println("====================================================");
		thread t3 = new thread();
		System.out.println("third thread details : ");
		t3.start();
		System.out.println("====================================================");
	}
}