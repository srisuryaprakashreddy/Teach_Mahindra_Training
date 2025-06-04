package Day13;

import java.io.FileOutputStream;

import java.io.FileInputStream;

public class ByteStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("../byte.txt");
		fout.write("Hello Bytes".getBytes());
		fout.close();

		FileInputStream fin = new FileInputStream("byte.txt");
		int i;
		while ((i = fin.read()) != -1) {
			System.out.print((char) i); 
		}
		fin.close();
	}
}
