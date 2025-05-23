package Day5;

public class Stringerror {
	public static void main(String[]args)
	{
		String s=null;
		System.out.println(s.length()); 
		//run -time error because null cannot call any methods
		System.out.println(s);
//		if s is initialized with null it will return compile time error  if initialized it will return null



	}


}
