import java.util.Scanner;

public class sub
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
		String s;
		int su,sum=0;
		for(int i=0;i<n;i++)
		{
			s=Integer.toString(a[i]);
			su=Integer.parseInt(s.substring(1,3));
			sum=sum+su;
		}
		System.out.println("The required sum is : "+sum);
	}
}