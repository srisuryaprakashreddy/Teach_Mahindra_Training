package Day7;

// Define a generic class
class Box<T> {
    private T name;

    // Setter method
    public void setName(T name) {
        this.name = name;
    }

    // Getter method
    public T getName() {
        return name;
    }
}

public class Boxgetset {
    public static void main(String[] args) {
        // Create a box of String type
        Box<String> s = new Box<>();
        s.setName("surya");

        // Print the value using the getter method
        System.out.println(s.getName());
    }
}
