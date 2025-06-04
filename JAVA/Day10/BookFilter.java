package Day10;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }

    public boolean titleContains(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase());
    }
}

public class BookFilter {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Java Programming", "James Gosling"));
        books.add(new Book("Python Crash Course", "Eric Matthes"));
        books.add(new Book("Effective Java", "Joshua Bloch"));
        books.add(new Book("Clean Code", "Robert C. Martin"));
        books.add(new Book("Java in Depth", "S. Nageswara Rao"));

        String keyword = "Java";

        System.out.println("Books with title containing '" + keyword + "':");
        for (Book book : books) {
            if (book.titleContains(keyword)) {
                System.out.println(book);
            }
        }
    }
}

