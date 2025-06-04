package Day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SchoolAttendenceSystem {
	static HashSet<String> todayattendence = new HashSet<>();
	static LinkedHashSet<String> arrivalOrder = new LinkedHashSet<>();
	static TreeSet<String> monthlyattendence = new TreeSet<>();

	static void markAttendence(String studentname) {
		if (todayattendence.add(studentname)) {
			arrivalOrder.add(studentname);
			monthlyattendence.add(studentname);

		}
	}

	static void displaytodayattendence() {
		System.out.println("today attendence " + todayattendence);
	}

	static void displayArivalorder() {
		System.out.println("arrivalorder " + arrivalOrder);
	}

	static void displaymonthlyreport() {
		System.out.println("monthlyreport: " + monthlyattendence);
	}

	static void resetday() {
		System.out.println("Day is reseted");
		todayattendence.clear();
		arrivalOrder.clear();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Add attendence");
			System.out.println("2.Dispaly today attendence and arrival order");
			System.out.println("3.monthly report");
			System.out.println("4.resetday");
			System.out.println("5.exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter number of attendence you want to enter ");
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.println("enter " + i + " student name");
					String name = sc.next();
					markAttendence(name);
				}
				break;
			case 2:
				displaytodayattendence();

				displayArivalorder();
				break;

			case 3:
				displaymonthlyreport();
				break;

			case 4:

				resetday();
				break;

			case 5:
				System.out.println("exiting program");
				return;

			default:
				System.out.println("invalid input");
				break;
			}
			sc.close();
		}

	}

}
