package Project;

import java.util.Scanner;

class itemss
{
	String itemname;
	int quantity=0;
	public itemss(String itemname,int quantity)
	{
		this.itemname=itemname;
		this.quantity=quantity;
	}
	
}

public class inventtest {
	String[] items;
	static int[] IQuantity;
	static void threshold(String[] items,int[] IQuantity) {
		for (int i=0;i<items.length;i++)
		{
			if(IQuantity[i]<=4)
			{
				System.out.println("item "+items[i]+" is running low in the inventory");
			}
		}

	}
	static void display(String[] items,int[] IQuantity)
	{
		for(int i =0;i<items.length ; i++)
		{
			System.out.println(items[i]+"->"+IQuantity[i]);
		}
	}
	public static void addquantity(int a,int Quantity)
	{
		 IQuantity[a]=+Quantity;
	}
	public static void removequantity(int a,int Quantity)
	{
		 IQuantity[a]=-Quantity;
	}

	public static void main(String[]args)
	{
		Scanner s =new Scanner(System.in);
		
		String itemname;
		int quantity;
		System.out.println("Enter number of Item you want to manage in the inventory");
		int a = s.nextInt();
		String[] items=new String[a];
		int[] IQuantity=new int[a];
		itemss[] obj = new itemss[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter the name of the item");
			items[i]=s.next();
			System.out.println("Enter Quantity  of that item");
			IQuantity[i]=s.nextInt();
			obj[i]=new itemss(items[i],IQuantity[i]);			
			
		}
		threshold(items,IQuantity);

		while(true)
		{
			System.out.println("------Inventory management System------");
			System.out.println("------1.Add Stock to the inventory-----");
			System.out.println("------2.Remove Stock to the inventory--");
			System.out.println("------3.Print Inventory Report---------");
			System.out.println("----------------4.Exit-----------------");

			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("select the item you want to add quantity");
					for(int i=0;i<items.length;i++)
					{
						System.out.println(i+" ."+items[i]);
					}
					int c =s.nextInt();
					System.out.println("Enter the Quantity you want to add to the Inventory");
					quantity=s.nextInt();
					
					addquantity(c,quantity);
					threshold(items,IQuantity);
					break;
					
									
				}
				case 2:
				{
					System.out.println("select the item you want to remove quantity");
					for(int i=0;i<items.length;i++)
					{
						System.out.println(i+" ."+items[i]);
					}
					int c =s.nextInt();
					System.out.println("Enter the Quantity you want to remove from the Inventory");
					quantity=s.nextInt();
					
					removequantity(c,quantity);
					threshold(items,IQuantity);
					break;
									
				}
				case 3:
				{
					display(items,IQuantity);
					break;
				}
	            case 4:
	            {
	                System.out.println("Exiting program. Goodbye!");
	                return; 
	            }

	            default:
	                System.out.println("Invalid choice. Please try again.");
			}
			

		}
		
		
	}
	
	

}
