package Day5;
import java.util.Scanner;
public class tryCatchExample {
	public static void main(String[] args)
	{	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try 
		{	
			System.out.println("enter two numbers for division ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			float results = a/b;
			System.out.println("solution: "+results);
			System.out.println("this is try block ending");//will not print in the terminal will not execute 
			//when the exception occurs from then the lines will not be executed
			//so only keep the exception occurring codes in the try block
			//if there is no error all statements will run
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero ");
		}
		//if catch block is not written in the code then the jvm produces exception object and throws it in jre
		//so finally executes before the jre will catch the exception
		finally
		{
			System.out.println("finally block");
			System.out.println("final2");
		}
		System.out.println("end of class ");
	}

}
