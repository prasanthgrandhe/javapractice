import java.util.Scanner;

public class terna
{
	public static void main(String[] args)
	{
		int a,b,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		max = (a>b)?a:b;
		System.out.println("greater number from given numbers is "+max);
}
	}