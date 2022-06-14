import java.util.Scanner;

abstract class abc
{
	abstract int factorial(int n);
}
abstract class pqr extends abc
{
	int factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		else
			return factorial(n-1)*n;
	}
	abstract int reverse(int n);
}
class mno extends pqr
{
	int reverse(int n)
	{
		int temp=n,res=0;
		while(temp>0)
		{
			res=res*10+(temp%10);
			temp=temp/10;
		}
		return res;
	}
	void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}
public class ta extends mno
{
	public static void main(String[] args)
	{
		mno ob = new mno();
		ob.table(10);
		System.out.println(ob.reverse(123));
		System.out.println(ob.factorial(4));
	}
}