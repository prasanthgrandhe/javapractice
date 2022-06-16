import java.util.Scanner;

class th extends Thread
{
	public void run()
	{
		split_digits(1234);
		reverse_number(1234);
		digits_factorial(1234);
	}
	public void split_digits(int n)
	{
		System.out.println("The digits of the given number are : ");
		String s = Integer.toString(n);
		for(int i=0;i<4;i++)
		{
			System.out.println("---"+s.charAt(i));
		}
		int rem;
		while(n>0)
		{
			System.out.println(n%10);
			n=n/10;
		}
		System.out.println("----------");
	}
	public void reverse_number(int n)
	{
		System.out.println("The reverseof the given number is : ");
		int rem,rev=0;
		while(n>0)
		{
			rev=rev*10+(n%10);
			n=n/10;
		}
		System.out.println(rev);
		System.out.println("----------");
	}
	public void digits_factorial(int n)
	{
		System.out.println("The facotrial of the given digits are : ");
		while(n>0)
		{
			System.out.println("facotrial of "+n%10+" is "+facotrial(n%10));
			n=n/10;
		}
		System.out.println("----------");
	}
	int facotrial(int n)
	{
		if(n==1 || n==0)
			return 1;
		else
			return n*facotrial(n-1);
	}
	
}
public class mthread
{
	public static void main(String[] args)
	{
		th t1 = new th();
		t1.start();
	}
}