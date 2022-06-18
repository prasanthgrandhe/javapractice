import java.util.Scanner;

public class pindi
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
		for(int i=0;i<n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
				sum=sum+a[i];
			}
		}
		System.out.println("The sum of elements at prime indices are : "+sum);
	}
	static boolean isPrime(int n)
	{
		if(n<2)
		return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}			
		return true;
	}
}