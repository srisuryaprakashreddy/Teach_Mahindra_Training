package Day14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

class User implements Serializable {
    // We should implement Serializable to convert objects to byte stream
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "User id: " + id + " Name: " + name;
    }
}

public class StoringObjects {
    public static void main(String[] args) {
        try {
            // Step 1: Create FileOutputStream
            FileOutputStream fos = new FileOutputStream("file.txt");

            // Step 2: Wrap with ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Step 3: Create an object to serialize
            User user = new User(234, "surya");

            // Step 4: Write the object to file
            oos.writeObject(user);

            // Step 5: Close streams
            oos.close();
            fos.close();

            System.out.println("Object has been serialized to file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
