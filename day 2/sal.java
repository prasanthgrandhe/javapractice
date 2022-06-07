import java.util.Scanner;

public class sal
{
	public static void main(String[] args)
	{
		double sa,gross;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic salary : ");
		sa = sc.nextDouble();
		if(sa<=25000)
		{
			gross = sa+(0.75*sa)+(0.2*sa);
		}
		else if(sa>25000 && sa<=50000)
		{
			gross = sa+(0.8*sa)+(sa*0.25);
		}
		else if(sa<75000)
		{
			gross=sa+(sa*0.85)+(sa*0.35);
		}
		else
		{
			gross=sa+sa*0.85+sa*0.4;
		}
		System.out.println("Gross amount is : "+gross);
	}
}