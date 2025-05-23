package Day5;
//throw problem
public class Throw {
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

			
//				throw new IllegalArgumentException("insufficient funds in your account*");

			
//				System.out.println("line below Throw"); //program cannot reach this line exception occurs
				
			
				throw new insuffientBalanceException("insufficient funds in your account !");//we are creating user defined Exception
				////now we manually entering the message when the exception is thrown by the program then the message is printed in the console
				
//				throw new ArithmeticException();//return null because we are throwing manually so it does not have any message in it 
				//// when java throw throw exception object it will send message to the exception 

				
				
		} 
		catch(IllegalArgumentException |ArithmeticException|insuffientBalanceException e)//multiple catch statement
		//we can also use throwable ,Exception for superclass to catch broad range of Exceptions
		{
			System.out.println(e.getMessage());
		}
	}

}

class insuffientBalanceException extends Exception{
	public insuffientBalanceException(String message)//for the this work we should must catch it while we throw
	{
		super(message);
	}
	
	
}
