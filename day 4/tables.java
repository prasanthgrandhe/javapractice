import java.util.Scanner;

public class tables
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		int sum=0,temp=n;
		for(;n!=0;)
		{
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==temp)
			System.out.println("armstrong number");
		else
			System.out.println(Not armstrong number);
	}
}