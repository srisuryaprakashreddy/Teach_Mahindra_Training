package Day11;

import java.util.Scanner;

public class httpsstart {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Wesite name ");
		String web=s.nextLine();
		String webname=web.toLowerCase();
		if(webname.startsWith("https://"))
		{
			System.out.println("the website name starts with https");
		}
		else
		{
			System.out.println("the wesite name does not start with https ");
		}
		
	}

}
