import java.util.Scanner;

public class key
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three four digit numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int rem,key,thou,hun,large=c%10;
		thou=a/1000;
		hun=(b/100)%10;
		while(c>0)
		{
			rem=c%10;
			if(large<rem)
			{
				large=rem;
			}
			c=c/10;
		}
		System.out.println("thou = "+thou+" hun = "+hun+" large = "+large);
		key=(thou*hun)-large;
		System.out.println("Key value is : "+key);
	}
}