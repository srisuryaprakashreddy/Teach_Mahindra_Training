package Day3;
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();

    // Non-abstract method (optional)
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
interface FuelConsumable {
    void refuel();
    double fuelEfficiency(); // returns km per liter
}
class Car extends Vehicle implements FuelConsumable {
    private double efficiency; // km/l

    public Car(String brand, double efficiency) {
        super(brand); // calls Vehicle constructor
        this.efficiency = efficiency;
    }

    public void startEngine() {
        System.out.println(brand + " Car engine started.");
    }

    public void stopEngine() {
        System.out.println(brand + " Car engine stopped.");
    }

    public void refuel() {
        System.out.println("Refueling the car...");
    }

    public double fuelEfficiency() {
        return efficiency;
    }
}
class Bike extends Vehicle implements FuelConsumable {
    private double efficiency; // km/l

    public Bike(String brand, double efficiency) {
        super(brand);
        this.efficiency = efficiency;
    }

    public void startEngine() {
        System.out.println(brand + " Bike engine started.");
    }

    public void stopEngine() {
        System.out.println(brand + " Bike engine stopped.");
    }

    public void refuel() {
        System.out.println("Refueling the bike...");
    }

    public double fuelEfficiency() {
        return efficiency;
    }
}


public class abstractionimplementataion {
	    public static void main(String[] args) {
	        Vehicle car = new Car("Toyota", 15.0);
	        car.displayBrand();
	        car.startEngine();
	        ((FuelConsumable)car).refuel();
	        System.out.println("Car fuel efficiency: " + ((FuelConsumable)car).fuelEfficiency() + " km/l");
	        car.stopEngine();

	        System.out.println("---------------");

	        Vehicle bike = new Bike("Yamaha", 40.0);
	        bike.displayBrand();
	        bike.startEngine();
	        ((FuelConsumable)bike).refuel();
	        System.out.println("Bike fuel efficiency: " + ((FuelConsumable)bike).fuelEfficiency() + " km/l");
	        bike.stopEngine();
	    }
	}

