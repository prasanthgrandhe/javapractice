import java.util.Scanner;

public class calc
{
	public static void main(String[] args)
	{
		int a,b;
		String ch;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the operator : ");
		ch=sc.next();
		switch(ch)
		{
			case "addition":
			System.out.println("Addition of two numbers is : "+(a+b));
			break;
			case "subtraction":
			System.out.println("Subtraction of two numbers is : "+(a-b));
			break;
			case "multiplication":
			System.out.println("Multiplication of two numbers is : "+(a*b));
			break;
			case "division":
			System.out.println("Division of two numbers is : "+(a/b));
			break;
			case "modulo":
			System.out.println("Modulo division of two numbers is : "+(a%b));
			break;
			default:
			System.out.println("Invalid operator");
			break;
		}
	}
}