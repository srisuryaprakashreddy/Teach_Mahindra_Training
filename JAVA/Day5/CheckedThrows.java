package Day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedThrows {
    public static void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("example.txt"));
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}
