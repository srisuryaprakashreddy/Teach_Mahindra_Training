package Day3;

class parent{
	String name="parent name";
}
class child extends parent
{
	String name="Child name";
	void printname(String name)
	{
		super.name=name;
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}
public class Constructorchaining {
	public static void main(String[] args)
	{
		child c = new child();
		c.name="something";
		System.out.println(c.name);
		c.printname("new name");
	}


}
