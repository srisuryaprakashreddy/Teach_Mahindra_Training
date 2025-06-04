package Day12;

import java.util.Optional;

class Product {
    private double price;
    private Optional<Double> discount;

    public Product(double price, Double discount) {
        this.price = price;
        this.discount = Optional.ofNullable(discount); 
    }

    public void showFinalPrice() {
        double finalPrice = price - discount.orElse(0.0);
        System.out.println("Final price: Rs." + finalPrice);
    }
}


public class Shoppingapp {
	public static void main(String[] args) {
	    Product product1 = new Product(1000.0, 100.0); 
        Product product2 = new Product(1000.0, null);  

        product1.showFinalPrice(); 
        product2.showFinalPrice();
	}

}
