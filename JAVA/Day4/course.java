
//create a class course with overload constructors to initialize name only and name and duration 
package Day4;

public class course {
	String name;
	int duration;
	course(String name)
	{
		this.name=name;
		System.out.println("the name of the user : "+name);
	}
	course(String name,int duration)
	{
		this.name=name;
		this.duration=duration;
		System.out.println("the name of the user is :"+name+" \nduration completes in mintues is :"+duration);
	}
	
	public static void main(String[] args)
	{	//we can also initialize the objects and envoke contructors using this method |new class(arguments)|
		new course("surya");
		new course("ram",15);
	}

}
