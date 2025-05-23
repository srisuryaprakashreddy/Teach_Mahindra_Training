package Day5;
import java.util.Scanner;

public class marksException {
	public static void main(String[]args)
	{
		
		
			try {
				Scanner s=new Scanner(System.in);
				System.out.println("enter the marks");
				int n=s.nextInt();
				if(n>0 || n<100)
				{
					throw new IllegalArgumentException("marks>100 invalid");
				}
				else
				{
					System.out.println("the enterd marks are "+n);
				}
				s.close();
				
			}
			
			catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
			}
//		
			finally
			{
				System.out.println("invalid marks");
			}
	}
	
	
		
	

}
