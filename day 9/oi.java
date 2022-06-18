import java.util.Scanner;

public class oi
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=1;i<n;i=i+2)
		{
				sum=sum+a[i];
		}
		System.out.println("The sum of odd index elements of the given array is : "+sum);
	}
}