import java.util.Scanner;

public class range
{
	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial and final numbers : ");
		int j=sc.nextInt();
		n=sc.nextInt();
		System.out.println("perfect numbers from 1 to "+n+" are : ");
		while(j<=n)
		{
			int i=1;
			sum=0;
			do
			{
				if(j%i==0)
				{
					sum=sum+i;
				}
				i++;
			}while(i<j);
			if(sum==j)
				System.out.println(j);
			j++;
		}
	}
}