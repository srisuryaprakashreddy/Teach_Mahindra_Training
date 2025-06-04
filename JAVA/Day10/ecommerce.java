package Day10;

import java.util.Scanner;

interface myinterface {
	double applydiscount(double amount);
}

public class ecommerce implements myinterface {
	Scanner s = new Scanner(System.in);
	double percent;

	public double applydiscount(double amount) {
		int choice = 0;
		while (choice != 4) {
			System.out.println("\nMenu for Discount");
			System.out.println("1. First Time Discount");
			System.out.println("2. Festive Offer");
			System.out.println("3. Premium Membership");
			System.out.println("4. EXIT");
			System.out.print("Enter your choice: ");
			choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter percentage discount today: ");
				percent = s.nextDouble();
				myinterface m1 = (x) -> x - (x * (percent / 100.0));
				amount = m1.applydiscount(amount);
				System.out.println("Bill after Discount: " + amount);
				break;

			case 2:
				System.out.print("Enter discount amount for Festive Season: ");
				double festiveDiscount = s.nextDouble();
				myinterface m2 = (x) -> x - festiveDiscount;
				amount = m2.applydiscount(amount);
				System.out.println("Bill after Discount: " + amount);
				break;

			case 3:
				System.out.print("Enter discount percentage for Premium Members: ");
				percent = s.nextDouble();
				myinterface m3 = (x) -> x - (x * percent / 100.0);
				amount = m3.applydiscount(amount);
				System.out.println("Bill after Discount: " + amount);
				break;

			case 4:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid Choice! Try again.");
			}
		}

		return amount;
	}

	public static void main(String[] args) {
		ecommerce e = new ecommerce();
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the total bill amount: ");
		double amount = input.nextDouble();

		double finalAmount = e.applydiscount(amount);
		System.out.println("Final Bill Amount after all discounts: " + finalAmount);

		input.close();
	}
}
