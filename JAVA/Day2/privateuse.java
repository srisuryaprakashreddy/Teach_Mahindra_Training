package Day2;
 

class animal {
    String name;
    int price;

    // Private constructor
    private animal(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("The name of the dog: " + name + ", the price: " + price);
    }

    // Static factory method
    public static animal createAnimal(String name, int price) {
        return new animal(name, price); // Allowed inside the class
    }
}

public class privateuse {
    public static void main(String[] args) {
        // Instantiate using factory method
    	animal.createAnimal("German", 5000);
        arrayc obj = new arrayc();

        
        int[] myArray = {10, 20, 30, 40, 50};

        
        obj.printArray(myArray);
    }
}
