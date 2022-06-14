import java.util.Scanner;

interface Human
{
	void learn(String str);
	void work();
}
interface rec
{
	boolean screening(int score);
	boolean interview(boolean selected);
}
class Programmer implements Human,rec
{
	public void learn(String str)
	{
		System.out.println("Learn using"+str);
	}
	public void work()
	{
		System.out.println("Please do the work!!!");
	}
	public boolean screening(int score)
	{
		if(score>100)
			return true;
		else
			return false;
	}
	public boolean interview(boolean selected)
	{
		if(selected)
		{
			System.out.println("Come for interview");
		}
		else
		{
			System.out.println("No interview");
		}
		return true;
	}
}
public class inter1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean selected;
		System.out.println("Eneter the score");
		int score=sc.nextInt();
		Programmer p = new Programmer();
		p.learn("internet");
		p.work();
		if(p.screening(score))
		{
			selected=true;
		}
		else
		{
			selected=false;
		}
		p.interview(selected);
	}
}