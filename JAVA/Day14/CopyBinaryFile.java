package Day14;

import java.io.*;

public class CopyBinaryFile {
    public static void main(String[] args) {
        File sourceFile = new File("source.txt");         // Use any binary file
        File destFile = new File("Destination.txt");

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024]; // 1 KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            System.out.println("Binary file copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

