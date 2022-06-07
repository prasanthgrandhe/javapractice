import java.util.Scanner;

public class vote
{
	public static void main(String[] args)
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the person : ");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("person is eligible to vote.");
		}
		else
			System.out.println("person is not eligible to vote.");
	}
}