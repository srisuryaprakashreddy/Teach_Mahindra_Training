package src;

public class password {
	public static void main(String[] args)
	{
		String pass="123@surya";
		
		if (pass.length()>6 && pass.contains("@"))
		{
			System.out.println("the password is valid");
		}
		else
		{
			System.out.println("password is invalid");
		}
	}

}
