package Day5;

import java.util.Scanner;

public class InvalidUserException {
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String pass = s.nextLine();
					
		try
		{
			if(name==null  || pass==null)
			{
				throw new IllegalArgumentException("invalid credentials");
			}
			else
			{
				System.out.println("valid credentials"+name + pass);
			}
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
