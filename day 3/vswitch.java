import java.util.Scanner;

public class vswitch
{
	public static void main(String[] args)
	{
		String n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the week : ");
		n=sc.next();
		switch(n)
		{
			case "Monday":
			System.out.println("Today is Monday");
			break;
			case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
			case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
			case "Thursday":
			System.out.println("Today is Thursday");
			break;
			case "Friday":
			System.out.println("Today is Friday");
			break;
			case "Saturday":
			System.out.println("Today is Saturday");
			break;
			case "Sunday":
			System.out.println("Today is Sunday");
			break;
			default:
			System.out.println("Not a correct number");
			break;
		}
	}
}