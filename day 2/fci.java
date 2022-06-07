import java.util.Scanner;

public class fci
{
	public static void main(String[] args)
	{
		float cel,f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius : ");
		cel = sc.nextFloat();
		f = ( 9 * cel / 5) + 32;
		System.out.println("The temperature in fahrinheit : " + f);
	}
}