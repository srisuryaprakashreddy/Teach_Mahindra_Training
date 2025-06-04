package Day14;

import java.io.*;

public class CopyTextFile {
    public static void main(String[] args) {
        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        try {
            // Create source file and write sample text
            FileWriter fw = new FileWriter(sourceFile);
            fw.write("This is Surya.\nLearning file handling in Java.");
            fw.close();

            // Read from source and write to destination
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // Preserve line breaks
            }

            br.close();
            bw.close();

            System.out.println(" Text file copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

