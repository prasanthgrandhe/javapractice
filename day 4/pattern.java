import java.util.Scanner;

public class pattern
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}