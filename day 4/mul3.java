import java.util.Scanner;

public class mul3
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		for(;n>0;n--)
		{
			if(n%3==0)
				System.out.println(n);
		}
	}
}