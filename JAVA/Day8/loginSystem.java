package Day8;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class loginSystem {
	static Map<String, String> UserData = new Hashtable<>();

	static void adduser(String username, String password) {
		UserData.put(username, password);
	}

	static void CheckUser(String username) {
		if (UserData.containsKey(username)) {
			System.out.println("\n -------user exits--------");
		} else {
			System.out.println("\n -------user invalid------");
		}
	}

	static void removeuser(String username) {
		UserData.remove(username);
		System.out.println("\n---------User removed Successfully----------");
	}

	static void isUserlistEmpty() {
		if (UserData.isEmpty() == true) {
			System.out.println("\n-----the list is Empty has no users-----");
		} else {
			System.out.println("\n-----it is not empty has data of users--");
		}
	}

	static void display() {
		for (Map.Entry<String, String> a : UserData.entrySet()) {
			System.out.println(a.getKey() + " -> " + a.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Login System ");
			System.out.println("1.Add a new user");
			System.out.println("2.Check user exists");
			System.out.println("3.Remove user");
			System.out.println("4.Check the list empty");
			System.out.println("5.Print the login data");
			System.out.println("6.Exit");
			System.out.println("Enter your Choice");

			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter username:");
				String name = s.next();
				System.out.println("Enter password:");
				String Password = s.next();
				adduser(name, Password);
				break;
			case 2:
				System.out.println("Enter username to check:");
				String username = s.next();
				CheckUser(username);
				break;
			case 3:
				System.out.println("Enter username to remove:");
				String username1 = s.next();
				removeuser(username1);
				break;
			case 4:
				isUserlistEmpty();
				break;
			case 5:
				display();
				break;
			case 6:
				System.out.println("---------Exiting Program----------");
				return;
			default:
				System.out.println("---------Invalid Input------------");
			}
		}
	}
}
