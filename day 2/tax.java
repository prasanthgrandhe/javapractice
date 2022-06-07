import java.util.Scanner;

public class tax
{
	public static void main(String[] args)
	{
		double income,tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income : ");
		income=sc.nextInt();
		if(income<150000)
		{
			System.out.println("No tax");
			System.out.println("Amount to be paid"+income);
		}
		else if(income>=150000 && income<300000)
		{
			tax=0.1*income;
			System.out.println("Tax to be paid is : "+tax);
			System.out.println("Toatl amount to be paid : " +(income+tax));
		}
		else if(income>=300000 && income<500000)
		{
			tax=0.2*income;
			System.out.println("Tax to be paid is : "+tax);
			System.out.println("Total amount to be paid : "+(income+tax));
		}
		else if(income>=500000)
		{
				tax=0.3*income;
				System.out.println("Tax to be paid is : "+tax);
				System.out.println("Total amount to be paid : "+(income+tax));
		}
	}
}