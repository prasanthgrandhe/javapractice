import java.util.Scanner;

public class obj
{
	String name;
	double salary;
	int id;
	void emp_details()
	{
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("ID : "+id);
	}
	public static void main(String[] args)
	{
		obj ob = new obj();
		ob.name="Prasanth";
		ob.salary=100;
		ob.id=71;
		ob.emp_details();
	}
}