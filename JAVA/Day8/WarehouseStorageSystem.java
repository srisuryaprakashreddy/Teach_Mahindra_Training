package Day8;

import java.util.*;

class Box<T> {
	private List<T> storage;
	private int capacity;
	public String name;

	Box(int capacity) {
		this.capacity = capacity;
		this.storage = new ArrayList<>(capacity);
	}

	void storeItem(T item) {
		if (storage.size() < capacity) {
			storage.add(item);
		} else {
			System.out.println("Box is full! Cannot add more items.");
		}
	}

	void displayItems() {
		if (storage.isEmpty()) {
			System.out.println("Box is empty.");
		} else {
			for (T item : storage) {
				System.out.println(item);
			}
		}
	}
}

class Electronics {
	String name;
	int id;

	Electronics(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "Electronics [Name: " + name + ", ID: " + id + "]";
	}
}

class Clothing {
	String brand;
	String size;

	Clothing(String brand, String size) {
		this.brand = brand;
		this.size = size;
	}

	public String toString() {
		return "Clothing [Brand: " + brand + ", Size: " + size + "]";
	}
}

class Furniture {
	String type;
	int price;

	Furniture(String type, int price) {
		this.type = type;
		this.price = price;
	}

	public String toString() {
		return "Furniture [Type: " + type + ", Price: " + price + "]";
	}
}

public class WarehouseStorageSystem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Box<Electronics> electronicsBox = new Box<>(100);
		Box<Clothing> clothingBox = new Box<>(100);
		Box<Furniture> furnitureBox = new Box<>(100);

		while (true) {
			System.out.println("\n--- Warehouse Menu ---");
			System.out.println("1. Enter items in the Warehouse");
			System.out.println("2. Display items in the Warehouse");
			System.out.println("3. Exit");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Choose item type to add:");
				System.out.println("1. Electronics");
				System.out.println("2. Clothing");
				System.out.println("3. Furniture");
				int typeChoice = s.nextInt();

				System.out.print("Enter number of items to add: ");
				int itemCount = s.nextInt();
				s.nextLine(); // Consume newline

				for (int i = 0; i < itemCount; i++) {
					switch (typeChoice) {
					case 1:
						System.out.print("Enter Electronics Name: ");
						String ename = s.nextLine();
						System.out.print("Enter ID: ");
						int eid = s.nextInt();
						s.nextLine(); // Consume newline
						electronicsBox.storeItem(new Electronics(ename, eid));
						break;

					case 2:
						System.out.print("Enter Clothing Brand: ");
						String brand = s.nextLine();
						System.out.print("Enter Size: ");
						String size = s.nextLine();
						clothingBox.storeItem(new Clothing(brand, size));
						break;

					case 3:
						System.out.print("Enter Furniture Type: ");
						String ftype = s.nextLine();
						System.out.print("Enter Price: ");
						int price = s.nextInt();
						s.nextLine(); // Consume newline
						furnitureBox.storeItem(new Furniture(ftype, price));
						break;

					default:
						System.out.println("Invalid item type.");
					}
				}
				break;

			case 2:
				System.out.println("\n--- Stored Items ---");
				System.out.println("Electronics:");
				electronicsBox.displayItems();
				System.out.println("Clothing:");
				clothingBox.displayItems();
				System.out.println("Furniture:");
				furnitureBox.displayItems();
				break;

			case 3:
				System.out.println("Exiting...");
				s.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
