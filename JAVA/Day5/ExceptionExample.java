package Day5;
//throw problem
public class ExceptionExample {
	public static void main(String[] args)
	{
		int balance=2000;
		int withdraw=5000;
		
		try
		{
			if(withdraw<balance)
			{
				System.out.println("withdraw successful");
				System.out.println("your remaining balance :" + (balance-withdraw));
				
			}
			else
				System.out.println("line above throw");
				throw new IllegalArgumentException("insuffient funds in your account*");
//				System.out.println("line below Throw"); program cannot reach this line exception occurs 
				
				
		} 
		catch(IllegalArgumentException |ArithmeticException e)
		{
			System.out.println("the exception occured "+e.getMessage());
		}
	}

}
class insuffientBalanceException extends Exception{
	public insuffientBalanceException(String message)
	{
		super(message);
	}
	
	
}
