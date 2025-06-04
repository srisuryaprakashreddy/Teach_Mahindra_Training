package Day14;

import java.io.*;
import java.util.Scanner;

class User implements Serializable {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class Append extends ObjectOutputStream {
    public Append(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset(); 
    }
}

public class DataBinManager {
    static final String Path = "orders.bin";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add new user");
            System.out.println("2. View all users");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addUser(sc);
                    break;
                case 2:
                    readUsers();
                    break;
                case 3:
                    System.out.println("Exiting program. ");
                    return;
                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        }
    }

    static void addUser(Scanner sc) {
        try {
            File file = new File(Path);
            FileOutputStream fos = new FileOutputStream(file, true);
            ObjectOutputStream oos;

            if (file.length() == 0) {
                oos = new ObjectOutputStream(fos);
            } else {
                oos = new Append(fos);
            }

            System.out.print("Enter user ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter user Name: ");
            String name = sc.nextLine();

            User user = new User(id, name);
            oos.writeObject(user);
            oos.close();
            fos.close();
            System.out.println(" User added successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readUsers() {
        try {
            File file = new File(Path);
            if (!file.exists() || file.length() == 0) {
                System.out.println(" No users found.");
                return;
            }

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("\n--- All Users ---");
            while (true) {
                try {
                    User user = (User) ois.readObject();
                    System.out.println(user);
                } catch (Exception e) {
                    break;
                }
            }

            ois.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
