package Day12;

import java.util.ArrayList;
import java.util.List; 
import java.util.Scanner;

//Create courses and assign capacity
//if the course is filled return CourseFullException
abstract class User {
	int id;
	String name;
}

class Student extends User {
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

class Trainer extends User {
	Trainer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}

class Courses {
	String title;
	int capacity;
	static List<Student> enrolled;
	Trainer trainer;

	Courses(String title, int capacity) {
		this.title = title;
		this.capacity = capacity;
		this.enrolled = new ArrayList<>();
	}

	public void enroll(Student student) {
		try {
			for (int i = 0; i < capacity; i++) {
				if ( enrolled.size()<= i) {
					enrolled.add(student);
					System.out.println(student.name + " enrolled");
				} else
					throw new IllegalArgumentException("CourseFullException");
			}
		} catch (Exception e) {
			System.out.println(student.name+" "+e.getMessage());
		}

	}
	public  void assigntrainer(Trainer t)
	{
		this.trainer.id=t.id;
		this.trainer.name=t.name;
	}

	
		
}

public class Course
{
	public static void main(String[] args) {
		System.out.println("Create course");
		Scanner s =new Scanner(System.in);
		String title=s.nextLine();
		System.out.println("Enter Capacity of the Course" );
		int Capacity=s.nextInt();
		System.out.println("Enter number of Students names you want to enroll in the Course");
		int n =s.nextInt();
		Courses c=new Courses(title,Capacity);
		
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the id of "+i+1+" student");
			int id =s.nextInt();
			
			System.out.println("Enter the id of "+i+1+" student");
			String name=s.nextLine();
			Student a =new Student(id,name);
			c.enroll(a);
		}
}
}




