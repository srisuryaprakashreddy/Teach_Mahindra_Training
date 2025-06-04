package Day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class filename {
	public static void main(String[] args) throws IOException {
		LocalDate date;
		String name= LocalDate.now()+".txt";
		File f =new File(name);
		f.createNewFile();
		
		BufferedWriter bw =new BufferedWriter( new FileWriter(f));
		bw.write("Backup Created ");
		bw.close();
		
		BufferedReader br =new BufferedReader(new FileReader(f));
		int ch;
		
		while((ch=br.read())!=-1)
			System.out.print((char)ch);
		
		br.close();
		f.delete();
	}

}
