package Day5;

public class Stringreferncing {
	public static void main(String[]args)
	{
		{
			String s=new String("xyz");
			String x=("xyz");
			if (x==s)
	//java uses same address for refereeing the both variables s,x without 
	//creating 2 addressing for same data
//				if we use new for creating the string new String("xyz") then it will not be referring to the same address 
//				and it uses String Stream
				//and if we initialize the string with x="xyz" then string uses Heap memory
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			System.out.println(s.length());
	}

}
}
