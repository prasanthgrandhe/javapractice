import java.util.Scanner;

public class harshad
{
	public static void main(String[] args)
	{
		int n,rem,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		if(temp%sum==0)
		{
			System.out.println("Given number "+temp+" is a harshad number");
		}
		else
		{
			System.out.println("Given number "+temp+" is not a harshad number");
		}
	}
}