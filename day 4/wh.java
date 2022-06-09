import java.util.Scanner;

public class wh
{
	public static void main(String[] args)
	{
		int n,rem,f=1,fsum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			f=1;
			while(rem>0)
			{
				f=f*rem;
				rem--;
			}
			System.out.println("Factorial of the digit : "+f);
		}
	}
}