import java.lang.*;

public class box
{
	public static void main(String[] args)
	{
		//Boxing process using Constructors
		Integer ob1 = new Integer(555);
		Integer ob2 = new Integer("666");
		
		//Boxing process using valueOf() method
		Integer ob3 = Integer.valueOf(777);
		Integer ob4 = Integer.valueOf("888");
		
		System.out.println("ob1="+ob1);
		System.out.println("ob2="+ob2);
		System.out.println("ob3="+ob3);
		System.out.println("ob4="+ob4);
		
		//Unboxing process
		
		int a=ob1.intValue();
		String str1=ob2.toString();
		int b = ob3.intValue();
		String str2 = ob4.toString();
		
		System.out.println("a="+a);
		System.out.println("str1="+str1);
		System.out.println("b="+b);
		System.out.println("str2="+str2);
		
		
	}
}