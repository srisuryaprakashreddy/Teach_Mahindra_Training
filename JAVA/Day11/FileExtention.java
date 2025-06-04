package Day11;

import java.util.Scanner;

public class FileExtention {

	public static String getExtension(String fileName) {
		int lastDot = fileName.lastIndexOf('.');

		if (lastDot == -1 || lastDot == fileName.length() - 1) {
			return "";
		}

		return fileName.substring(lastDot + 1);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter file name");
		String file = s.next();
		System.out.println(file + " -> " + getExtension(file));

	}
}
