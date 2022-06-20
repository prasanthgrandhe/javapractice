import java.util.Scanner;

public class first
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] words=input.split(" ");
		int wrc=1;
		for(int i=0;i<words.length;i++)
		{
			wrc=1;
			for(int j=1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					wrc=wrc+1;
					words[j]="0";
				}
			}
			if(words[i]!="0")
				System.out.println(words[i]+"---"+wrc);
		}
	}
}