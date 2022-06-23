import java.io.*;
class hello
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a name: ");
		String name = br.readLine();
		
		System.out.println(name);
	}
}