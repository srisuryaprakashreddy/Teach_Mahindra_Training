package Day4;

abstract class transportauthority
{
	public abstract void registervehicle();
}


class vehicle extends transportauthority
{
	private int vehicleid;
	private String brand;
	private int maxspeed;
	public vehicle(int vehicleid, String brand, int maxspeed) {
	this.vehicleid=vehicleid;
	this.brand=brand;
	this.maxspeed=maxspeed;
	}
//getter setter method for encapsulation
	public void setvehicleid(int vehicleid)
	{
		this.vehicleid=vehicleid;
	}
	public void setnbrand(String brand)
	{
		this.brand=brand;
	}
	public void setmaxspeed(int maxspeed)
	{
		this.maxspeed=maxspeed;
	}
	public int getvehicleid()
	{
		return vehicleid;
	}
	public String getbrand()
	{
		return brand;
	}
	public int getmaxspeed()
	{
		return maxspeed;
	}
	
	public void start()
	{
		System.out.println("the vehicle is stared");
	}
	public void start(String brand)
	{
		System.out.println("the vehicel started is "+brand);
	}
	public void registervehicle()
	{
		System.out.println("your vehicel is registered");
	}
}

interface fueltype
{
	public abstract void getfueltype();
}
class car extends vehicle implements fueltype
{

	public car(int vehicleid,String brand,int maxspeed)
	{
		super(vehicleid, brand, maxspeed);
	}

	public void start()
	{
		System.out.println("the car is stared");
	}
	public void getfueltype()
	{
		System.out.println("the fuel type is petrol");
	}
}
class bike extends vehicle
{
	public void start()
	{
		System.out.println("the bike is stared");
	}

	public bike(int vehicleid,String brand,int maxspeed)
	{
		super(vehicleid, brand, maxspeed);
	}
}
class truck extends vehicle implements fueltype
{
	public void start()
	{
		System.out.println("the truck is stared");
	}
	public void getfueltype()
	{
		System.out.println("the fuel type is diesel");
	}

	public truck(int vehicleid,String brand,int maxspeed)
	{
		super(vehicleid, brand, maxspeed);
	}
}
class electriccar extends car
{

	public electriccar(int vehicleid,String brand,int maxspeed)
	{	
		super(vehicleid, brand, maxspeed);
	}
}

public class vehiclem {
    public static void main(String[] args) {
        vehicle[] vehicles = new vehicle[4];

        vehicles[0] = new car(123, "Toyota", 180);
        vehicles[1] = new truck(456, "Volvo", 120);
        vehicles[2] = new bike(789, "Yamaha", 150);
        vehicles[3] = new electriccar(125, "Tesla", 200);

        for (vehicle v : vehicles) {v.start();
        v.registervehicle();
       }
        
        

    }

}
