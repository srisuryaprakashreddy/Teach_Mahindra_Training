package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Student implements Comparable<Student> {
//	int id;
//	String name;
//
//	Student(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//
//	public String toString() {
//		return "studentid: " + id + " name: " + name;
//	}
//
//	public int compareTo(Student s) {
////		return this.name.compareTo(s.name); // sorting in alphabetical order
////		return this.id - s.id; //sorting with the id
//		return this.name.length() - s.name.length();//sorting with length of the string
//	}
//
//}
class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "studentid: " + id + " name: " + name;
	}

}

class StudentComparator implements Comparator<Student>

{

	@Override
	public int compare(Student i, Student j) {
		return (i.id % 10) - (j.id % 10);

	}

}

class StudentComparatorbyname implements Comparator<Student> {

	@Override
	public int compare(Student i, Student j) {
		return i.name.compareTo(j.name);
	}

}

public class SortExample {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>(Arrays.asList(33, 41, 88, 32, 19));
		List<Student> students = new ArrayList<>();
		students.add(new Student(35, "Vishal"));
		students.add(new Student(41, "AbhiRam"));
		students.add(new Student(32, "Surya"));

		System.out.println(students);

		Comparator c = new StudentComparator();

		Collections.sort(students, c);
		System.out.println(students);

//		list.add(59);
//		list.add(9);
//		System.out.println(list);
//
//		Collections.sort(list);
//		System.out.println(list);

	}

}
