package Day5;

public class MultipleCatchBlocks {
	public static void main(String[]args)
	{
		try
		{
			String d =null;
			System.out.println(d.length());			
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer");
		}
		catch(Exception e)
		{
			System.out.println("General exception");
		}
	}

}
