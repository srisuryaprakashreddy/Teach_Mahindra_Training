package Day14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjects {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("file.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			User u = (User) ois.readObject();
			System.out.println(u);

			fis.close();
			ois.close();

		} catch (IOException e) {
			System.out.println("Exception occured");
			e.getStackTrace();
		}

	}

}
