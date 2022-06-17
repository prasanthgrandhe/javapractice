
class n extends Thread
{
	public void run()
	{
		System.out.println("Before changing : "+getName());
		setName("hello");
		System.out.println("After chainging : "+getName());
	}
}
public class sname
{
	public static void main(String[] args)
	{
		n n1 = new n();
		n1.start();
		n n2 = new n();
		n2.start();
		System.out.println("Again changed : ");
		n2.setName("not hello");
		System.out.println("New name is : "+n2.getName());
		n2.start();
		
	}
}