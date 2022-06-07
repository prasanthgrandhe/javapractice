import java.util.Scanner;

public class divi
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		a=sc.nextInt();
		if(a%5==0 && a%11==0)
		{
			System.out.println("Entered number "+a+" is divisible by 5 and 11");
		}
		else
			System.out.println("Entered number "+a+" is not divisible by 5 and 11");
	}
}