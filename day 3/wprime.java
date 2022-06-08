import java.util.Scanner;

public class wprime
{
	public static void main(String[] args)
	{
		int n,i=2,j,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		j=2;
		while(j<=n)
		{
			i=2;
			count=0;
			while(i<j)
			{
				if(j%i==0)
				{
					count+=1;
					break;
				}
				i+=1;
			}
			if(count==0)
			{
				System.out.println(j+" is prime");
			}
			else
			{
				System.out.println(j+" is not a prime number");
			}
			j++;
		}
	}
}