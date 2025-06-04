package Day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferreader {
    public static void main(String[] args) throws IOException {
        // Step 1: Create file and write some lines
        File f = new File("read.txt");
        f.createNewFile();

        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("surya\nram\nvijay\nprakash");
        bw.close(); // Close BufferedWriter first, not FileWriter

        // Step 2: Read the file line by line
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String line;
        System.out.println("File content line by line:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();// Close BufferedReader
        f.delete();
        }
}
