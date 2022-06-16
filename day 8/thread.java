class t extends Thread
{
	public void run()
	{
		System.out.println("Thread is under Running...");
		for(int i=1;i<10;i++)
		{
			System.out.println("i = "+i+" "+this);
		}
	}
}
public class thread 
{
	public static void main(String[] args)
	{
		t t1 = new t();
		System.out.println("Thread about to start");
		t1.start();
	}
}