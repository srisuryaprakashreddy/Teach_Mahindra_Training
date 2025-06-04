package Day9;

import java.util.*;

class Applicant {
	String name;
	int yearsofexp;
	int expectedsal;
	String qualification;

	Applicant(String name, int yearsofexp, int expectedsal, String qualification) {
		this.name = name;
		this.yearsofexp = yearsofexp;
		this.expectedsal = expectedsal;
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "[Name: " + name + ", Experience: " + yearsofexp + " yrs, Salary: $" + expectedsal + ", Qualification: "
				+ qualification + "]";
	}
}

class SortByExp implements Comparator<Applicant> {
	public int compare(Applicant i, Applicant j) {
		return Integer.compare(j.yearsofexp, i.yearsofexp);
	}
}

class SortByQual implements Comparator<Applicant> {
	public int compare(Applicant i, Applicant j) {
		return i.qualification.compareTo(j.qualification);
	}
}

//class SortBySal implements Comparator<Applicant> {
//	public int compare(Applicant i, Applicant j) {
//		return Integer.compare(i.expectedsal, j.expectedsal);
//	}
//}

public class RecruitmentPortal {
	public static void main(String[] args) {
		List<Applicant> applicants = new ArrayList<>();

		applicants.add(new Applicant("Surya", 3, 40000, "Engg"));
		applicants.add(new Applicant("Ram", 2, 20000, "BCom"));
		applicants.add(new Applicant("Vijay", 4, 90000, "BSc"));

		System.out.println("Original List:");
		for (Applicant a : applicants) {
			System.out.println(a);
		}

		Comparator<Applicant> c = new Comparator<Applicant>() {// Anonymous method creation
			public int compare(Applicant i, Applicant j) {
				return Integer.compare(i.expectedsal, j.expectedsal);
			}
		};

		Collections.sort(applicants, c);
		System.out.println("\nSorted by Expected Salary:");
		for (Applicant a : applicants) {
			System.out.println(a);
		}

		Collections.sort(applicants, new SortByQual());
		System.out.println("\nSorted by Qualification:");
		for (Applicant a : applicants) {
			System.out.println(a);
		}

		Collections.sort(applicants, new SortByExp());
		System.out.println("\nSorted by Experience:");
		for (Applicant a : applicants) {
			System.out.println(a);
		}
	}
}
