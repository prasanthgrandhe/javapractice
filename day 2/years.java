import java.util.Scanner;

public class years
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		String s="";
		System.out.println("Enter a number : ");
		a=sc.nextInt();
		s=s+(a/365)+" years ";
		a=a%365;
		s=s+(a/30)+" months ";
		a=a%30;
		s=s+(a/7)+" weeks ";
		a=a%7;
		s=s+a+" days ";
		System.out.println(s);
	}
}