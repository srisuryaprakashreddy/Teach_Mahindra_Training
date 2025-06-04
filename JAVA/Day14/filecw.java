package Day14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecw {
	public static void main(String[] args) throws IOException {
		File f = new File("report.txt");

		f.createNewFile();

		FileWriter fw = new FileWriter(f);
		fw.write("Written in File");
		fw.close();

		FileReader fr = new FileReader(f);
		int ch;
		System.out.print("File content: ");
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}
		fr.close();

		f.delete();

	}

}
