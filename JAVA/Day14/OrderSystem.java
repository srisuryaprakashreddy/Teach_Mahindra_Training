package Day14;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

class Order implements Serializable {
    String name;
    String fooditem;
    int quantity;
    LocalDate date;
    transient int orderId;

    public Order(String name, String fooditem, int quantity) {
        this.name = name;
        this.fooditem = fooditem;
        this.quantity = quantity;
        this.date = LocalDate.now();
        this.orderId = (int) (Math.random() * 10000);
    }

    public String toString() {
        return "Name: " + name + "\tFooditem: " + fooditem + "	\tQuantity: " + quantity +
               "\tOrderDate: " + date + "\tOrderId: " + orderId;
    }
}

class Appends extends ObjectOutputStream {
    public Appends(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}

public class OrderSystem {
    static final String PATH = "Ordering.bin";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== MENU for ORDER =====");
            System.out.println("1. Order Food");
            System.out.println("2. View All Orders");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addUser(sc);
                    break;
                case 2:
                    readUsers();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void addUser(Scanner sc) {
        try {
            File file = new File(PATH);
            FileOutputStream fos = new FileOutputStream(file, true);
            ObjectOutputStream oos;

            if (file.length() == 0) {
                oos = new ObjectOutputStream(fos);
            } else {
                oos = new Appends(fos);
            }

            System.out.print("Enter Your Name For Order: ");
            String name = sc.nextLine();
            System.out.print("Enter Item name: ");
            String item = sc.nextLine();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); 

            Order order = new Order(name, item, quantity);
            oos.writeObject(order);

            oos.close();
            fos.close();
            System.out.println("Order placed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readUsers() {
        try {
            File file = new File(PATH);
            if (!file.exists() || file.length() == 0) {
                System.out.println("No orders found.");
                return;
            }

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("\n--- All Orders ---");
            while (true) {
                try {
                    Order order = (Order) ois.readObject();
                    System.out.println(order);
                } catch (EOFException eof) {
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
