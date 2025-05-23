package Day3;

class vehicle{
	void start()
	{
		System.out.println("the vehicle is starting");
	}
	
	vehicle()
	{
		System.out.println("vehicle");
	}
}

class car extends vehicle{
	void drive()
	{
		System.out.println("car started driving");
	}
	
	car()
	{
		System.out.println("car");
	}
}

//vehicle to car is single level inheritance
class bike extends car{
	void gear()
	{
		System.out.println("bike gear is changing");
	}
	bike()
	{
		System.out.println("bike");
	}
}
public class car_inheritance {
	public static void main(String[] args)
	{
		bike c=new bike();
		c.start();
		c.drive();
		c.gear();
		
//		bike b =new bike();
//		b.start();
//		b.gear();
	}
	

}
