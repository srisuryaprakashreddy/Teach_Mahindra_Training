package Day12;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class GymMembership {
	String membername;
	LocalDate joindate;

	public static LocalDate getexpirydate(LocalDate joindate) {

		return joindate.plusMonths(3);

	}

	public static void main(String[] args) {
//		String inputDate = "2025-05-31";
//
//		LocalDate date = LocalDate.parse(inputDate);
//		LocalDate date =LocalDate.of(2023, 5, 23);
		Scanner s=new Scanner(System.in);
		System.out.println("enter year");
		int year=s.nextInt();
		System.out.println("enter Month");
		int Month=s.nextInt();
		System.out.println("enter Day");
		int Day=s.nextInt();
		LocalDate date =LocalDate.of(year, Month, Day);
		
		System.out.println("Entry Date: " + date);
//		System.out.println("Entry Date: " + inputDate);

		System.out.println("expiry date of membership: " + getexpirydate(date));

	}

}
