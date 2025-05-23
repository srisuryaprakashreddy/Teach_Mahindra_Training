package src;

import java.util.Scanner;
public class ticketprice {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter your age");
		int age =scanner.nextInt();
		if (age<8)
		{
			System.out.println("the cost of the tickett is 80");
			
		}
			
		else if(age>8 && age <=12)
		{
			System.out.println("the cost of the ticket is 120");
			
		}
		else
		{
			System.out.println("the cost of the ticket is 150");
		}
		
		

	}

	
}
