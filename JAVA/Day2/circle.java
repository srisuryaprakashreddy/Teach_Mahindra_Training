package Day2;

public class circle {
	float radius;
	
	void Area()
	{
		double total=((3.14)*(radius*radius));
		System.out.println("area of the circle is "+total);
	}
	
	public static void main(String[] args)
	{
		circle c=new circle();
		c.radius=10;
		c.Area();
	}

}
