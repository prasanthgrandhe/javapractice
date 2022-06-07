import java.util.Scanner;

public class bitwise
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a&b : "+(a&b));
		System.out.println("a|b : "+(a|b));
		System.out.println("a^b : "+(a^b));
		System.out.println("~a : "+(~a));
		System.out.println("a>>b : "+(a>>b));
		System.out.println("a<<b : "+(a<<b));
	}
}