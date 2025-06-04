package Project;

import java.util.Scanner;

/*Concepts Used*
 * Class & Objects
 * Encapsulation - this
 * Constructors
 * methods with Arguments
 * USER INPUT - Scanner
 * Static methods
 * Exception handling
 * try-catch
 * Arrays
 * Switch
 * Conditional infinite While loop
 * If-else
 * for each
 * for loop*/

class Item {//Item Data structure 
    String itemName;
    int quantity;

    public Item(String itemName, int quantity) {//constructor to initialize the variables
        this.itemName = itemName;// this assigns value to the variable in class
        this.quantity = quantity;
    }
}

public class InventoryManagement
{
    static Item[] items;//creating  array of class item which has a structure of both name and quantity.

    static void threshold(int k) 
    {//we use static keyword because it was inside base-class and outside main method by doing this we can call the methods without objects
       
    	for (Item item : items) 
    	{//for each iteration over items
            
    		if (item.quantity <= k) 
    		{
                System.out.println("ALERT: Item \"" + item.itemName + "\" is running low in inventory.");
            }
        }
    }

    static void display() 
    {
        System.out.println("------- Inventory Report -------");
        for (Item item : items) 
        {
            System.out.println(item.itemName + " -> " + item.quantity);
        }
    }

    static void addQuantity(int index, int qty) 
    {//we use arguments in this method to identify and change the value at that location
       
    	if (index >= 0 && index < items.length) {//we use this if -else  to make sure when and error input comes we can handle it.
            items[index].quantity += qty;
            System.out.println(qty + " units added to " + items[index].itemName);
        } 
    	else
    	{
            System.out.println("Invalid item index.");
        }
    }

    static void removeQuantity(int index, int qty) 
    {
        if (index >= 0 && index < items.length) 
        {//checks for valid input
        	
            try
            {
            	if (items[index].quantity - qty < 0) //negative quantity error using Exception handling
                {
                	System.out.println(items[index].itemName + " has  " + items[index].quantity + " units in stock which is less than Our Requirement");
                    throw new IllegalArgumentException("Negative quantity error: Cannot perform operation.");
                }
                else 
                {
                    items[index].quantity -= qty;
                    System.out.println(qty + " units removed from " + items[index].itemName);
                }
            }
            catch(IllegalArgumentException e)
            {
            	System.out.println(e.getMessage());
            }
        }
        
        else 
        {
            System.out.println("Invalid item index.");
        }
    }

    public static void main(String[] args) 
    {
   
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of items you want to manage in the inventory:");
        int n = s.nextInt(); 

        items = new Item[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter name for item " + (i + 1) + ": ");
            String name = s.next();
            System.out.print("Enter initial quantity: ");
            int qty = s.nextInt();
            items[i] = new Item(name, qty);
        }
        System.out.println("Enter Inventory Thershold ");
        int k=s.nextInt();

        threshold(k); 

        while (true) 
        {
            System.out.println("\n------ Inventory Management System ------");
            System.out.println("1. Add Stock to Inventory");
            System.out.println("2. Remove Stock from Inventory");
            System.out.println("3. Display Inventory Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = s.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Select the item to add stock:");
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(i + ". " + items[i].itemName);
                    }
                    int addIndex = s.nextInt();
                    System.out.print("Enter quantity to add: ");
                    int addQty = s.nextInt();
                    addQuantity(addIndex, addQty);
                    threshold(k);
                    break;

                case 2:
                    System.out.println("Select the item to remove stock:");
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(i + ". " + items[i].itemName);
                    }
                    int removeIndex = s.nextInt();
                    System.out.print("Enter quantity to remove: ");
                    int removeQty = s.nextInt();
                    removeQuantity(removeIndex, removeQty);
                    threshold(k);
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
