package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	List<Integer> marks;

	public Student(String name, List<Integer> marks) {
		this.name = name;
		this.marks = marks;
	}

	public boolean hasPassedAllSubjects() {
		for (int mark : marks) {
			if (mark < 40) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Student{name='" + name + "', marks=" + marks + "}";
	}
}

public class StudentPass {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student("Alice", Arrays.asList(45, 67, 89)));
		students.add(new Student("Bob", Arrays.asList(38, 72, 90)));
		students.add(new Student("Charlie", Arrays.asList(50, 50, 50)));
		students.add(new Student("David", Arrays.asList(70, 80, 39)));
		students.add(new Student("Eve", Arrays.asList(40, 60, 75)));

		System.out.println("Students who passed all subjects:");
		for (Student student : students) {
			if (student.hasPassedAllSubjects()) {
				System.out.println(student.name);
			}
		}
	}
}
