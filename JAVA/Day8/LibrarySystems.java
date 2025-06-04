package Day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LibrarySystems {
	static HashSet<String> books = new HashSet<>();
	static LinkedHashSet<String> order = new LinkedHashSet<>();
	static TreeSet<String> Sort = new TreeSet<>();

	static void borrowbook(String name) {
		books.add(name);
		order.add(name);
		Sort.add(name);
	}

	static void hasborrowed(String name) {
		if (Sort.contains(name) == true) {
			System.out.println("the book was borrowed");
		} else {
			System.out.println("book was not borrowed");
		}
	}

	static void printborrowedinorder() {
		System.out.println("borrowed books in order " + order);

	}

	static void printborrowedsorted() {
		System.out.println("borrowed books in sorted order " + Sort);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------Library System Menu------");
			System.out.println("1.Borrow Books");
			System.out.println("2.Check if the Book is Borrowed");
			System.out.println("3.Dispaly Borrowed Books in Order");
			System.out.println("4.Dispaly Borrowed Books Sorted");
			System.out.println("5.EXIT");

			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter Number of Books");
				int s = sc.nextInt();
				for (int i = 0; i < s; i++) {
					System.out.println("Enter " + i + " Book Name");
					String name = sc.next();
					borrowbook(name);
				}
				break;
			case 2:
				System.out.println("Enter Book Name to Check");
				String name = sc.next();
				hasborrowed(name);
				break;
			case 3:
				printborrowedinorder();
				break;
			case 4:
				printborrowedsorted();
				break;
			case 5:
				return;

			}

		}
	}
}
