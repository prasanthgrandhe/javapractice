import java.util.Scanner;

public class rev
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		n=sc.nextInt();
		int arr[] = new int[n];
		int rev[] = new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0,j=n-1;i<n&&j>=0;i++,j--)
		{
			rev[i]=arr[j];
		}
		System.out.println("Reverse of the array : ");
		for(i=0;i<n;i++)
		{
			System.out.println(rev[i]);
		}
	}
}