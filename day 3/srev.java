import java.util.Scanner;

public class srev
{
	public static void main(String[] args)
	{
		String s,rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed : ");
		s=sc.next();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reversed string is : "+rev);
	}
}