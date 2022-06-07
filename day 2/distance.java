import java.util.Scanner;

public class distance
{
	public static void main(String[] args)
	{
		double dis,x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 value : ");
		x1=sc.nextDouble();
		System.out.println("Enter y1 value : ");
		y1=sc.nextDouble();
		System.out.println("Enter x2 value : ");
		x2=sc.nextDouble();
		System.out.println("Enter y2 value : ");
		y2=sc.nextDouble();
		dis = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
		System.out.println("Distance between given coordinates : "+dis);
	}
}