package src;

import java.util.Scanner;


public class selling_price_cal {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the amount item was bought");
		float baught =scanner.nextInt();
		System.out.println("enter the amount of discount given");
		float discount =scanner.nextInt();
		double bill=(baught - (baught*(discount/100)));
		
		System.out.println("bill before gst"+bill);
		System.out.println("adding gst 18% ");
		double total = (bill*(1.18));
		System.out.println("Bill :"+total);
		
	}
	
}
