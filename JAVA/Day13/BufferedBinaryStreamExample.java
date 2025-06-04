package Day13;

import java.io.*;

public class BufferedBinaryStreamExample {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("binbuffer.dat"));
        out.write("Buffered Binary".getBytes());
        out.close();

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("binbuffer.dat"));
        int ch;
        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
             }
        in.close();
    }
}
