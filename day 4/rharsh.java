import java.util.Scanner;

public class rharsh
{
	public static void main(String[] args)
	{
		int start,stop,rem,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start and stop number : ");
		start=sc.nextInt();
		stop=sc.nextInt();
		while(start<=stop)
		{
			temp=start;
			sum=0;
			while(temp>0)
			{
				rem=temp%10;
				temp=temp/10;
				sum=sum+rem;
			}
			if(start%sum==0)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}