import java.util.Scanner;

public class cons
{
	String name;
	double salary;
	int id;
	cons()
	{
		name="prasanth";
		salary=10000000;
		id=71;
	}
	void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("Salary is : "+salary);
		System.out.println("id is : "+id);
	}
	public static void main(String[] args)
	{
		cons ob = new cons();
		ob.display();
	}
}