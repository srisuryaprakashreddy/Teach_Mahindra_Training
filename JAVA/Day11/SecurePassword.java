package Day11;

import java.util.Scanner;

public class SecurePassword {
	public static boolean Password(String pass) {
		return pass.length() >= 8 && pass.contains("@") && Character.isDigit(pass.charAt(pass.length() - 1));

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String pass = s.nextLine();
		System.out.println(pass + "->" + Password(pass));
	}

}
