import java.util.Scanner;

public class sici{
	public static void main(String[] args){
		double p,t,r,si,ci;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		p = sc.nextDouble();
		System.out.println("Enter the time period : ");
		t = sc.nextDouble();
		System.out.println("Enter the rate of interest : ");
		r = sc.nextDouble();
		si = ( p * t * r ) / 100;
		ci=(p * Math.pow( ( 1 + ( r / 100 ) ) , t ) ) - p;
		System.out.println("Simple interest is : " + si);
		System.out.println("Compound interest is : " + ci);
		
	}
}