import java.util.Scanner;

public class wvswap
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		b = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Values after swapping -----");
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
	}
}