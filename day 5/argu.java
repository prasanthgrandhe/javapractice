import java.util.Scanner;

public class argu
{
	void emp_details(double salary,int id,String name)
	{
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("ID : "+id);
	}
	public static void main(String[] args)
	{
		argu ob = new argu();
		ob.emp_details(100.0,71,"Prasanth");
	}
}