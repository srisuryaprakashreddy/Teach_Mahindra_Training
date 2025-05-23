package Day2;
public class Account {
    // Private fields - hidden from outside access
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account
    public Account(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // No setter for accountNumber to prevent modification after creation

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (with validation)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    // Method to display account info
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    // Main method to test data hiding
    public static void main(String[] args) {
        // Creating account object
        Account acc = new Account("Surya", "ACC123456", 10000.00);

        // Accessing data via methods only
        acc.displayAccountInfo();

        // Try modifying balance directly (Not allowed)
        // acc.balance = -5000;  // ❌ Error: balance has private access

        // Modify using setter
        acc.setBalance(15000.00);
        acc.setAccountHolderName("Velagala Surya");

        System.out.println("\nAfter Updates:");
        acc.displayAccountInfo();
    }
}
