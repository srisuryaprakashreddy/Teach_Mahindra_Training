package Day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckExcpections {
    public static void main(String[] args) {
        try {
            // FileReader and BufferedReader can throw IOException
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println("Line: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
