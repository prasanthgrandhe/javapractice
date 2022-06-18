public class clone
{
	public static void main(String[] args)
	{
		int arr[]={33,3,4,5};
		System.out.println("Printing the original array : ");
		for(int i:arr)
		{
			System.out.println(i);
		}
		int cl[]=arr.clone();
		int cll[]=arr;
		for(int i:cl)
		{
			System.out.println(i);
		}
		System.out.println("are they both same?");
		System.out.println(arr==cl);
		System.out.println(arr==cll);
	}
}