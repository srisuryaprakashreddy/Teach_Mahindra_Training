package Day13;
import java.io.*;

public class Filecretein {
	public static void main(String[] args) throws IOException {
		File file = new File("filename.txt");

		if (!file.exists()) {
		    file.createNewFile(); // create file
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
		bw.write("Some content");
		bw.newLine();
		bw.close();

		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
		    System.out.println(line);
		}
		br.close();

	}

}
