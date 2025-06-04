package Day7;

import java.util.ArrayList;
import java.util.List;

public class billingsystem {


    static void add(List<Double> prices) {
        double s = 0;
        for (Double a : prices) {
            s += a;
        }
        System.out.println("The total bill: " + s);
    }


    static void maxmin(List<Double> prices) {
        if (prices.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        double max = prices.get(0);
        double min = prices.get(0);

        for (Double i:prices) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(150.0);
        prices.add(100.0);
        prices.add(200.0);
        prices.add(300.0);
        prices.add(600.0);

        System.out.println("Prices: " + prices);
        add(prices);
        maxmin(prices); 
    }
}
