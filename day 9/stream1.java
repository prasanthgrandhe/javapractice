import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Scanner;

public class stream1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int a[]  = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		IntStream stream=Arrays.stream(a);
		int sum=stream.sum();
		System.out.println("sum of the array is : "+sum);
	}	
}