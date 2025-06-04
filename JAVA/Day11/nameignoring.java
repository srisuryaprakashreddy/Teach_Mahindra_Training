package Day11;

import java.util.Scanner;

public class nameignoring {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the first name");
		String name1=s.nextLine();
		System.out.println("Enter Second name ");
		String name2=s.nextLine();
		if(name1.equalsIgnoreCase(name2))
		{
			System.out.println(name1+" and "+name2+" are same");
		}
		else
		{
			System.out.println("the both names are not same");
		}
	}

}
