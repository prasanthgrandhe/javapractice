/*area
si ci
f-c
swap
swap1*/
import java.util.Scanner;
public class carea{
	public static void main(String[] args){
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		radius = sc.nextDouble();
		System.out.println("The area of the circle with given radius is : "+(Math.PI*radius*radius));
	}
}