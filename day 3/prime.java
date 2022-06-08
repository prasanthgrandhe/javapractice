import java.util.Scanner;

public class prime
{
	public static void main(String[] args)
	{
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		System.out.println("The prime numbers upto "+n+" are : ");
		for(int j=2;j<n;j++)
		{
			count=0;
			for(int i=2;i<j;i++)
			{
				if(j%i==0)
				{
					count+=1;
				}
			}
			if(count==0)
			{
				System.out.println(j);
			}
		}
	}
}