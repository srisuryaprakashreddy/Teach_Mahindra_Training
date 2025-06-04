package Day13;

import java.io.File;

import java.io.File;
import java.io.IOException;

public class FileExtension {

	public static void main(String[] args) {
		try {
			File f = new File("file.txt");

			f.createNewFile();
			if (f.getName().endsWith(".txt")) {
				System.out.println("The file has a .txt extension.");
			} else {
				System.out.println("The file does not have a .txt extension.");
			}

			System.out.println("Is file exists? " + f.exists());
			System.out.println("Can file be written to? " + f.canWrite());
			System.out.println("File name: " + f.getName());
			System.out.println("Length of file: " + f.length() + " bytes");


		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
