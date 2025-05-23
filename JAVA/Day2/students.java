package Day2;

import java.util.Scanner; 

public class students{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many students do you want to enter? ");
        int n = s.nextInt();
        s.nextLine();


        Student[] students = new Student[n];

        System.out.println("\n--- Enter Student Information ---");


        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student #" + (i + 1) + ":");

            System.out.print("Name: ");
            String name = s.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = s.nextInt();
            s.nextLine();

            System.out.print("Grade ( A, B, C): ");
            String gradeInput = s.nextLine();
            char grade = ' ';
            if (!gradeInput.isEmpty()) {
                grade = Character.toUpperCase(gradeInput.charAt(0)); 
            }


            students[i] = new Student(name, rollNumber, grade);
            System.out.println("Student " + name + " added to array.");
        }

        System.out.println("\n--- Displaying All Student Information ---");


        if (n == 0) {
            System.out.println("\n--- No student details were entered.---");
        } else {
            for (int i = 0; i < students.length; i++) {
                System.out.println("\nDetails for Student #" + (i + 1) + ":");
                students[i].displayInfo();
            }
        }

        s.close(); 
    }
}


class Student {

    private String name;
    private int rollNumber;
    private char grade;


    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }


}
