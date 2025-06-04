package Day13;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String sourceFile = "BufferedSource.java";
        String destinationFile = "BufferedCopy.java";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFile));
            writer.write("public class BufferedSource {\n");
            writer.write("    public static void main(String[] args) {\n");
            writer.write("        System.out.println(\"Hello from Buffered Source!\");\n");
            writer.write("    }\n");
            writer.write("}\n");
            writer.close();
            System.out.println("Source file created: " + sourceFile);

            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter copyWriter = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            while ((line = reader.readLine()) != null) {
                copyWriter.write(line);
                copyWriter.newLine(); 
            }

            reader.close();
            copyWriter.close();
            System.out.println("File copied to: " + destinationFile);

        } catch (IOException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
    }
}

