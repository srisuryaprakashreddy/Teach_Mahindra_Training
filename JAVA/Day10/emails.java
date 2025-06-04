package Day10;

import java.util.ArrayList;
import java.util.List;

class User {
	String name;
	String email;
	int registrationYear;

	public User(String name, String email, int registrationYear) {
		this.name = name;
		this.email = email;
		this.registrationYear = registrationYear;
	}

	public boolean isRegisteredAfter2020() {
		return registrationYear > 2020;
	}

	@Override
	public String toString() {
		return "User{name='" + name + "', email='" + email + "', registrationYear=" + registrationYear + "}";
	}
}

public class emails {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

		users.add(new User("Alice", "alice@example.com", 2019));
		users.add(new User("Bob", "bob@example.com", 2021));
		users.add(new User("Charlie", "charlie@example.com", 2022));
		users.add(new User("David", "david@example.com", 2020));
		users.add(new User("Eve", "eve@example.com", 2023));

		System.out.println("Emails of users registered after 2020:");
		for (User user : users) {
			if (user.isRegisteredAfter2020()) {
				System.out.println(user.email);
			}
		}
	}
}
