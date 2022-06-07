import java.util.Scanner;

public class vswap
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		a = sc.nextInt();
		System.out.println("Enter value of b : ");
		b = sc.nextInt();
		c = b;
		b = a;
		a = c;
		System.out.println("Values after swapping");
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
	}
}