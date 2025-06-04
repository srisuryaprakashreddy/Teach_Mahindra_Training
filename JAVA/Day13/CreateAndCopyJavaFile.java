package Day13;

import java.io.*;

public class CreateAndCopyJavaFile {
    public static void main(String[] args) {
        String sourceFile = "SourceFile.java";
        String destinationFile = "CopiedFile.java";

        try {
            FileWriter writer = new FileWriter(sourceFile);
            writer.write("public class SourceFile {\n");
            writer.write("    public static void main(String[] args) {\n");
            writer.write("        System.out.println(\"Hello from Source File!\");\n");
            writer.write("    }\n");
            writer.write("}\n");
            writer.close();
            System.out.println("Source file created: " + sourceFile);

            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(destinationFile);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();
            System.out.println("File copied to: " + destinationFile);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
