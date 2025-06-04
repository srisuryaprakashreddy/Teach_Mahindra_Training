package Day11;

import java.util.Scanner;

public class UsernameSanitizer {

	public static String sanitizeUsername(String username) {
		String noSpaces = username.replace(" ", "_");

		return noSpaces.toLowerCase();
	}

	public static void main(String[] args) {
		System.out.println("Enter the UserName: ");

		Scanner s = new Scanner(System.in);

		String name = s.nextLine();

		System.out.println(name + " -> " + sanitizeUsername(name));

	}
}
