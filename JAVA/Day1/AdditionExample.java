package src;
import java.util.Scanner;

public class AdditionExample {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Perform addition
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
	

}
