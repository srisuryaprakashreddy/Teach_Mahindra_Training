package Day5;

public class finallyblock {
	public static void main(String[] args)
	{
		try
		{
			int a=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("dividion by Zero is not allowed");
		}
		finally
		{
			System.out.println("Finally bllock is executed");
		}
	}

}
