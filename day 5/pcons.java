import java.util.Scanner;

public class pcons
{
	String name;
	double salary;
	int id;
	pcons(String name,double salary,int id)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("Salary is : "+salary);
		System.out.println("id is : "+id);
	}
	public static void main(String[] args)
	{
		pcons ob = new pcons("prasanth",10000,71);
		ob.display();
	}
}