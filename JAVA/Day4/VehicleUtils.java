package Day4;

public class VehicleUtils {
    public static void displayInfo(vehicle v) {
        System.out.println("Brand: " + v.getbrand());
        System.out.println("Max Speed: " + v.getmaxspeed() + " km/h");
        System.out.println("--------");
    }
}