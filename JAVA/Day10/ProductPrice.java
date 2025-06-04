package Day10;

import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    int price;
    String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public boolean isEvenAndContains2() {
        return price % 2 == 0 && String.valueOf(price).contains("2");
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
}

public class ProductPrice {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 1200, "Electronics"));
        products.add(new Product("Phone", 999, "Electronics"));
        products.add(new Product("Table", 224, "Furniture"));
        products.add(new Product("Chair", 143, "Furniture"));
        products.add(new Product("Pen", 22, "Stationery"));
        products.add(new Product("Shoes", 215, "Fashion"));
        products.add(new Product("Bag", 240, "Fashion"));

        System.out.println("Products whose price is even and contains digit 2:");
        for (Product product : products) {
            if (product.isEvenAndContains2()) {
                System.out.println(product.name);
            }
        }
    }
}
