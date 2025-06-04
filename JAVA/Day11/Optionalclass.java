package Day11;

import java.util.Optional;

class User {
	private Optional<String> email;

	public User(String email) {
		this.email = Optional.ofNullable(email);
	}

	// Getter
	public Optional<String> getEmail() {
		return email;
	}
}

public class Optionalclass {
	public static void main(String[] args) {
		User userWithEmail = new User("john.doe@example.com");
		User userWithoutEmail = new User(null);

		System.out.println("User 1 Email: " + userWithEmail.getEmail().orElse("No Email Available"));

		System.out.println("User 2 Email: " + userWithoutEmail.getEmail().orElse("No Email Available"));
	}
}
