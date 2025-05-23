package Day5;

public class ThrowExample {

    // Method that validates age and throws an exception if age is less than 18
    static void validate(int age) {
        if (age < 18) {
            // Throwing an unchecked exception (IllegalArgumentException is a RuntimeException subclass)
            throw new IllegalArgumentException("Not eligible to vote. Age provided: " + age);
        } else {
            System.out.println("Eligible to vote. Age provided: " + age);
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Attempting validation for age 15 ---");
        try {
            // Code that might throw an exception is placed inside the 'try' block
            validate(15);
            System.out.println("Validation completed successfully for 15 (this won't print if exception occurs)");
        } catch (IllegalArgumentException e) {
            // If an IllegalArgumentException is thrown in the 'try' block,
            // the code inside this 'catch' block will be executed.
            System.err.println("Caught an error: " + e.getMessage()); // Print the exception message to error stream
            // You can also print the stack trace for debugging:
            // e.printStackTrace();
        } finally {
            // The 'finally' block is optional, but it always executes,
            // whether an exception occurred or not, or if it was caught or not.
            // It's often used for cleanup code (e.g., closing resources).
            System.out.println("Validation attempt for 15 finished.");
        }

        System.out.println("\n--- Attempting validation for age 20 ---");
        try {
            validate(20); // This call will not throw an exception
            System.out.println("Validation completed successfully for 20.");
        } catch (IllegalArgumentException e) {
            System.err.println("Caught an error: " + e.getMessage());
        } finally {
            System.out.println("Validation attempt for 20 finished.");
        }

        System.out.println("\nProgram continues after handling exceptions.");
    }
}