package Day14;

import java.io.*;
import java.time.LocalTime;

class Data implements seriali {
	String username;
	LocalTime logintime;
	transient String pass; // Will not be serialized

	Data(String username, String pass) {
		this.username = username;
		this.logintime = LocalTime.now();
		this.pass = pass;
	}

	public String toString() {
		return "Username: " + username + ", Login Time: " + logintime + ", Password: " + pass;
	}
}

public class LoginSystem {
	public static void main(String[] args) {
		String fileName = "login.txt";

		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Data user = new Data("surya", "surya123");

			oos.writeObject(user);

			oos.close();
			fos.close();

			System.out.println("Object has been serialized to " + fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Data deserializedUser = (Data) ois.readObject();

			ois.close();
			fis.close();

			System.out.println("Object has been deserialized:");
			System.out.println(deserializedUser);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
