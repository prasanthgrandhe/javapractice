import java.util.Scanner;

public class pat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int n = sc.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i+1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}