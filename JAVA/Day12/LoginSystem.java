package Day12;

import java.util.Optional;

import java.util.Optional;

class BankAccount {
	private String accountId;

	public BankAccount(String accountId) {
		this.accountId = Optional.ofNullable(accountId)
				.orElseThrow(() -> new IllegalArgumentException("Account ID cannot be null!"));
	}

	public void login() {
		System.out.println("Login successful for " + accountId);
	}
}

public class LoginSystem {
	public static void main(String[] args) {
		try {
            BankAccount acc1 = new BankAccount("A1B2sa");
            acc1.login();  

            BankAccount acc2 = new BankAccount(null);  
            acc2.login();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

	}
}
