package Day2;
import java.util.Scanner;
public class personclass {
	//fields
	String name;
	int age;
	Scanner sr = new Scanner(System.in);
	
	void display()
	{
		System.out.println("name: "+name+" age:"+age);
	}
	public static void main(String[] args)
	{
		personclass p1=new personclass();
		p1.name="ram";
		p1.age=21;
		p1.display();
		
	}
	
}
