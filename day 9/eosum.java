import java.util.Scanner;

public class eosum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter a number : ");
			a[i]=sc.nextInt();
		}
		int sum=0;
		if(a[3]%2==0)
		{
			for(int i=0;i<3;i++)
			{
				String s=Integer.toString(a[i]);
				for(int j=0;j<s.length();j++)
				{
					if(j%2!=0)
					{
						sum=sum+Character.getNumericValue(s.charAt(j));
					}
				}
			}
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				String s=Integer.toString(a[i]);
				for(int j=0;j<s.length();j++)
				{
					if(j%2==0)
					{
						sum=sum+Character.getNumericValue(s.charAt(j));
					}
				}
			}		
		}
		System.out.println("the required sum is : "+sum);
	}
}