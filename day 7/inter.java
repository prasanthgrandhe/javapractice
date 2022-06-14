interface Human
{
	void learn(String str);
	void work();
	int duration = 10;
}
class Programmer implements Human
{
	public void learn(String str)
	{
		System.out.println("Learn using"+str);
	}
	public void work()
	{
		System.out.println("Please do the work!!! for "+duration+" hours");
	}
}
public class inter
{
	public static void main(String[] args)
	{
		Programmer p = new Programmer();
		p.learn("internet");
		p.work();
	}
}