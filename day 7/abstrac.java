import java.util.Scanner;

abstract class Calculation
{
	abstract int sum(int a,int b);
}
abstract class Result extends Calculation
{
	int sum(int a,int b)
	{
		return a+b;
	}
	abstract int product(int a,int b, int c);
}
class Answer extends Result
{
	int product(int a,int b,int c)
	{
		return (a*b*c);
	}	
	
}
public class abstrac
{
	public static void main(String[] args)
	{
		Answer ob = new Answer();
		System.out.println(ob.product(1,2,3));
		System.out.println(ob.sum(10,20));
	}
}