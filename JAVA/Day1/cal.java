package src;
import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Input: two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num2 != 0 ? num1 / num2 : Double.NaN;  // check for divide by zero

        // Output results
        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        scanner.close();
    }
}
