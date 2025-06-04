package Day13;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Sri Surya Prakash\\eclipse-workspace\\Day13\\src\\data.txt");
		
		System.out.println("is File Exists "+f.exists());
		System.out.println("Can file read "+f.canWrite());
		System.out.println("File name "+f.getName());
		System.out.println("Length of file "+f.length());
		
//		f.createNewFile();
		f.delete();
		System.out.println();
		System.out.println("is File Exists "+f.exists());
		System.out.println("Can file read "+f.canWrite());
		System.out.println("File name "+f.getName());
		System.out.println("Length of file "+f.length());
		
	}

}
