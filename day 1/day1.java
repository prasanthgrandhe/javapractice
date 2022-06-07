import java.io.*;
public class day1
{
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a single character: ");
		char ch = br.read();
		System.out.println("\nWelcome "+ch);
	}
}