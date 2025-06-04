package Day7;
class ShoppingCartGeneric<T> {
    private Object[] items;
    private int size;
    private final int capacity;

    public ShoppingCartGeneric(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.items = new Object[capacity]; 
    }

    public void addProduct(T product) {
        if (size < capacity) {
            items[size++] = product;
            System.out.println("Added: " + product);
        } else {
            System.out.println("Cart is full!");
        }
    }

    public void removeProduct(T product) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(product)) {
                // Shift elements left
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[--size] = null;
                System.out.println("Removed: " + product);
                return;
            }
        }
        System.out.println("Product not found in cart!");
    }

    public void displayCart() {
        System.out.println("Cart Contents:");
        for (int i = 0; i < size; i++) {
            @SuppressWarnings("unchecked")
            T item = (T) items[i]; 
            System.out.println(item);
        }
        System.out.println("----------------------");
    }
}



class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return "Book: " + title + " | Price:" + price;
    }
}

class Cloth {
    private String brand;
    private String size;

    public Cloth(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public String toString() {
        return "Cloth: " + brand + " | Size: " + size;
    }
}

public class shoppingcart {
    public static void main(String[] args) {
        // Book cart
        ShoppingCartGeneric<Book> bookCart = new ShoppingCartGeneric<>(5);
        Book b1 = new Book("Java Basics", 500);
        Book b2 = new Book("DSA Mastery", 800);

        bookCart.addProduct(b1);
        bookCart.addProduct(b2);
        bookCart.displayCart();
        bookCart.removeProduct(b1);
        bookCart.displayCart();

        // Cloth cart
        ShoppingCartGeneric<Cloth> clothCart = new ShoppingCartGeneric<>(5);
        Cloth c1 = new Cloth("Puma", "M");
        Cloth c2 = new Cloth("One8", "L");

        clothCart.addProduct(c1);
        clothCart.addProduct(c2);
        clothCart.displayCart();
        clothCart.removeProduct(c2);
        clothCart.displayCart();
    }
}


