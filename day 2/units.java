import java.util.Scanner;

public class units
{
	public static void main(String[] args)
	{
		float units;
		double charge;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of units : ");
		units=sc.nextFloat();
		if(units<50)
		{
			charge=units*3;
		}
		else if(units>50 && units<=100)
		{
			charge=units*4.5;
		}
		else if(units>100 && units<=200)
		{
			charge=units*6;
		}
		else
		{
			charge=units*7.5;
		}
		System.out.println("Charge to be paid is "+charge);
	}
}