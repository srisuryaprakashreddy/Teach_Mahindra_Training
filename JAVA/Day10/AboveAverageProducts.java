package Day10;

import java.util.ArrayList;
import java.util.List;

class product {
    String name;
    double price;
    String category;

    public product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " \t(" + price + ")";
    }
}

public class AboveAverageProducts {
    public static void main(String[] args) {
        List<product> products = new ArrayList<>();

        products.add(new product("Laptop", 60000, "Electronics"));
        products.add(new product("Mouse", 800, "Electronics"));
        products.add(new product("Table", 4500, "Furniture"));
        products.add(new product("Pen", 20, "Stationery"));
        products.add(new product("Phone", 25000, "Electronics"));

        double total = 0;
        for (product p : products) {
            total += p.price;
        }
        double average = total / products.size();

        System.out.println("Average Price: " + average);
        System.out.println("\nProducts with price above average:");

        for (product p : products) {
            if (p.price > average) {
                System.out.println(p);
            }
        }
    }
}
