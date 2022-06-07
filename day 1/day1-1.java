import java.util.Sacnner;
public class day1-1
{
	public static void main(String[] args)
	{
		String name;
		int age;
		char gender;
		double salary;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter name: ");
		name=console.nextLine();
		System.out.println("Enter your age: ");
		age=console.nextInt();
		System.out.println("Enter your gender: ");
		gender=console.next();
		System.out.println("Enter your salary: ");
		salary=console.nextDouble();
		System.out.println("Given name is : "+name);
		System.out.println("Given age is : "+age);
		System.out.println("Given gender is : "+gender);
		System.out.println("Given salary is : "+salary);
	}
}