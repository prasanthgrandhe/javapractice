import java.util.Scanner;

public class wmovie
{
	String movie_name;
	double budget;
	int no_of_artist;
	void movie_info(String movie_name,double budget,int no_of_artist)
	{
		System.out.println("movie name : "+movie_name);
		System.out.println("Budget : "+budget);
		System.out.println("No of artists : "+no_of_artist);
	}
	public static void main(String[] args)
	{
		wmovie m = new wmovie();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the movie : ");
		String movie_name=sc.next();
		System.out.println("enter the budget of the movie : ");
		double budget=sc.nextDouble();
		System.out.println("Enter the number of artists : ");
		int no_of_artist=sc.nextInt();
		m.movie_info(movie_name,budget,no_of_artist);
	}
}