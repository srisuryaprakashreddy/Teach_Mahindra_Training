package Day14;

import java.io.*;
import java.util.Scanner;

public class BufferWritterscan {
	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		f.createNewFile();

		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the content you want to enter in the file");
		bw.write(sc.nextLine());
		bw.close();

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		if ((line = br.readLine()) != null)
			System.out.println(line);

		br.close();
		f.delete();
		sc.close();
	}

}
