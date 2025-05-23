package Day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Trywithresourses {
	public static void main(String[] args)
	{
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
		    System.out.println(br.readLine());
		} catch (IOException e) {
		   
		    System.out.println("exception caught");
		    e.printStackTrace();
		}

	}
}
