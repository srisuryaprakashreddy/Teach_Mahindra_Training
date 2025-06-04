package Day7;

import java.util.ArrayList;
import java.util.Scanner;


class Student {
    int id;
    String name;
    double marks;


    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

 
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}


public class StudentRecordSystem {
    static ArrayList<Student> students = new ArrayList<>();

  
    public static void addStudent(int id, String name, double marks) {
        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully.");
    }

    
    public static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("Student List:");
        for (Student s : students) {
            s.display();
        }
    }

    public static void findTopper() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topper = students.get(0);
        for (Student s : students) {
            if (s.marks > topper.marks) {
                topper = s;
            }
        }

        System.out.println("Topper:");
        topper.display();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Topper");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    addStudent(id, name, marks);
                    break;

                case 2:
                    displayAllStudents();
                    break;

                case 3:
                    findTopper();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
