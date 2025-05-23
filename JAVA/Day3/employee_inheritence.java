package Day3;

class employee
{
	String name;
	int eid;

	void work()
	{
		System.out.println(name+" is working");
	}
}

class professor extends employee
{
	String subject;
	void teach()
	{
		System.out.println(name +" teaching "+subject);
	}
}
class admistrate extends employee
{
	String Department;
	void manage()
	{
		System.out.println(name+" is managing "+ Department);
	}
}

public class employee_inheritence {
	public static void main(String[] args)
	{
		professor p = new professor();
		p.name="suyra";
		p.eid=123;
		p.subject="java";
		p.work();
		p.teach();
		
		admistrate a =new admistrate();
		a.Department="CSE_AIT";
		a.name="ram";
		a.eid=234;
		a.work();
		a.manage();
	}

}
