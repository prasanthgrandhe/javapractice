import java.util.Scanner;

public class ntax
{
	public static void main(String[] args)
	{
		double salary,tax=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your inocme : ");
		salary=sc.nextInt();
		if(salary <= 150000)
		{
			tax=0;
		}
		else if(salary>150000 && salary<=300000)
		{
			tax=(salary-150000)*0.1;
		}
		else if(salary>300000 && salary<=500000)
		{
			tax=(150000*0.1)+(salary-300000);
		}
		else if(salary>500000)
		{
			tax=150000*0.1+200000*0.2+(salary-500000)*0.3;
		}
		System.out.println(tax);
	}
}