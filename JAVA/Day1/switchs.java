package src;
import java.util.Scanner;

public class switchs {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the day of the week :");
		
		String day=scanner.next();
		switch(day)
		{
			case "mon":
			{
				System.out.println("java");
				break;
			}
			case "tue":
			{
				System.out.println("python");
				break;
			}
			case "web":
			{
				System.out.println("DBMS");
				break;
			}
			case "thu":
			{
				System.out.println("Ml");
				break;
			}
			case "fri":
			{
				System.out.println("AI");
				break;
			}
			default:
			{
				System.out.println("DSA");
				break;
			}
		}
	}

}
