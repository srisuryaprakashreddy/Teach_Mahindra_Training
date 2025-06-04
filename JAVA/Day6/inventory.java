package Project;

import java.util.Scanner;

class items
{
	String itemname;
	int quantity;
	items(String itemname,int quantity)
	{
		this.itemname=itemname;
		this.quantity=quantity;
	}
}
public class inventory {
	static items[] item;//we use static to declare
//	this variable it is outside the main block in the base class
	public static void main(String[] args)
	{	
		String iname = null;
		int qty = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of Items you want to manage");
		int m = s.nextInt();
		for(int i=0;i<m;i++)
		{
			System.out.println("Name of the item "+i+":");
			iname=s.next();
			System.out.println("Quantity of the item "+i+":");
			qty=s.nextInt();
			item[i]=new items(iname,qty);
		}
		while(true)
		{
            System.out.println("\n------ Inventory Management System ------");
            System.out.println("1. Add Stock to Inventory");
            System.out.println("2. Remove Stock from Inventory");
            System.out.println("3. Display Inventory Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = s.nextInt();
			switch(choice)
			{
			case 1:
				for(items i:item)
				{
					System.out.println(i);
				}
			}
		}
	}


}
