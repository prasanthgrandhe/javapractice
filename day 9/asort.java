import java.util.Scanner;
import java.util.Arrays;

public class asort
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
		int sum=0,one,two,num;
		for(int i=0;i<n;i++)
		{
			String s = Integer.toString(a[i]);
			one=Character.getNumericValue(s.charAt(1));
			two=Character.getNumericValue(s.charAt(2));
			num=one*10+two;
			sum=sum+num;
		}
		System.out.println("The required sum is : "+sum);
	}
}