package Day3;
public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Override equals() to compare by title and author
    @Override
    //override method is used to override the superclass in the java
    //object data type broadly represent the all objects in the java superclass
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference  this represent the current object used 
        //and obj represent the obj that the main object  is compared to.
        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;
        return this.title.equalsIgnoreCase(other.title) &&
               this.author.equalsIgnoreCase(other.author);
    }

    // Override toString() to print details
    @Override
    public String toString() {
        return "Book{Title='" + title + "', Author='" + author + "', Price=" + price + "}";
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 299.0);
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 320.0); // same title & author, diff price
        Book b3 = new Book("1984", "George Orwell", 250.0);

        // Print all books
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // Equality checks
        System.out.println("b1 equals b2? " + b1.equals(b2)); // true
        System.out.println("b1 equals b3? " + b1.equals(b3)); // false
        System.out.println("B3 equlas b1? "+b3.equals(b1));//false
    }
}
