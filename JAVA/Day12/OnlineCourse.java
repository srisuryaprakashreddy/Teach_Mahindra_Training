package Day12;
abstract class User
{
	int id;
	String name;
	public User(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "name:"+name+" id:"+id;
	}
}
class student extends User
{
	public student(int id,String name) {
		super(id,name);
		
	}
}
class Trainer extends User
{
	public Trainer(int id,String name) {
		super(id,name);
		
	}
}

public class OnlineCourse {

}
