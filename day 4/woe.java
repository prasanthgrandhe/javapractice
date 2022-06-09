import java.util.Scanner;

public class woe
{
	public static void main(String[] args)
	{
		int n,rem,f=1,fsum=0,nsum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			if(rem%2==0){
				f=1;
				while(rem>0)
				{
					f=f*rem;
					rem--;
				}
				nsum=nsum+f;
			}
			else
			{
				fsum=fsum+(rem*rem);
			}
		}
		System.out.println("odd square sum is "+fsum);
		System.out.println("factorial square sum is "+nsum);
	}
}