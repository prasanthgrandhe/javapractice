
public class cpy
{
	public static void main(String[] args)
	{
		char[] cf = {'a','e','i','o','u'};
		
		char[] ct = new char[5];
		
		System.arraycopy(cf,1,ct,0,4);
		
		System.out.println(String.valueOf(ct));
	}
}