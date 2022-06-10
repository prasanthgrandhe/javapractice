import java.util.Scanner;

public class movie
{
	String movie_name;
	double budget;
	int no_of_artist;
	void movie_info()
	{
		System.out.println("movie name : "+movie_name);
		System.out.println("Budget : "+budget);
		System.out.println("No of artists : "+no_of_artist);
	}
	public static void main(String[] args)
	{
		movie m = new movie();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the movie : ");
		m.movie_name=sc.next();
		System.out.println("enter the budget of the movie : ");
		m.budget=sc.nextDouble();
		System.out.println("Enter the number of artists : ");
		m.no_of_artist=sc.nextInt();
		m.movie_info();
	}
}