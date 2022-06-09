import java.util.Scanner;

public class oses
{
	public static void main(String[] args)
	{
		int i=1,esum=0,osum=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		while(i<=n)
		{
			if(i%2==0)
				esum=esum+i;
			else
				osum=osum+i;
			i++;
		}
		System.out.println("Even sum from 1 to "+ n +" is : "+esum);
		System.out.println("Odd sum from 1 to " + n +" is : "+osum);
	}
}