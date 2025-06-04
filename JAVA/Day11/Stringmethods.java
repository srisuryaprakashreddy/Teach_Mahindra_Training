package Day11;

import java.util.Scanner;

public class Stringmethods {
	/*
	 * length() int charAt(index) char subString(Startindex,endindex) equals(string)
	 * equalsignorecase(string) contains(String) indexOf(String) lastIndexOF(String)
	 * toLowercase(String) toUppercase(String) replace("char","char")
	 * Startswith("startstring") isEmpty()
	 */

	public static boolean isValidEmail(String email) {
		if (!email.contains("@")) {
			return false;
		}

		int atIndex = email.indexOf("@");

		if (email.indexOf("@", atIndex + 1) != -1) {
			return false;
		}

		String domain = email.substring(atIndex + 1);
		if (domain.isEmpty()) {
			return false;
		}

		if (!domain.contains(".")) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter an EMAIL to check");
		Scanner s = new Scanner(System.in);
		String testEmail = s.next();

		System.out.println(testEmail + " -> " + isValidEmail(testEmail));

	}
}
