import java.util.Scanner;

public class stab
{
	static int frequency(int n,int i)
	{
		int count=0,rem;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			if(rem==i)
			{
				count++;
			}
		}
		return count;
	}
	static int fun(int[] a)
	{
		int scount=0,ucount=0;
		for(int i=0;i<5;i++)
		{
			int temp=a[i],flag=1;
			int f=frequency(temp,temp%10);
			while(temp>0)
			{
				int rem=temp%10;
				if(f!=frequency(a[i],rem))
				{
					flag=0;
					break;
				}
				temp=temp/10;
			}
			if(flag==0)
			{
				ucount++;
			}
			else
			{
				scount++;
			}
			
		}
		System.out.println("ucount="+ucount+" scount="+scount);
		return (ucount*10)+scount;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter five number : ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(fun(a));
	}
}