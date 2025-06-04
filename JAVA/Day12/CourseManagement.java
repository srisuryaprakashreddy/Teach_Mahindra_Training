package Day12;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class User {
    int id;
    String name;
}

class Student extends User {
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

class Trainer extends User {
    Trainer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class CourseFullException extends Exception {
    CourseFullException(String message) {
        super(message);
    }
}

interface Enrollable {
    void enroll(Student student) throws CourseFullException;
}

class Course implements Enrollable {
    String title;
    int capacity;
    List<Student> enrolled;
    Trainer trainer;

    Course(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.enrolled = new ArrayList<>();
    }

    @Override
    public void enroll(Student student) throws CourseFullException {
        if (enrolled.size() < capacity) {
            enrolled.add(student);
            System.out.println(student.name + " enrolled");
        } else {
            throw new CourseFullException("CourseFullException");
        }
    }

    public void assignTrainer(Trainer t) {
        this.trainer = t;
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Create course:");
        String title = s.nextLine();

        System.out.println("Enter Capacity of the Course:");
        int capacity = s.nextInt();

        Course course = new Course(title, capacity);

        System.out.println("Enter number of Students you want to enroll:");
        int n = s.nextInt();
        s.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID of student " + (i + 1) + ":");
            int id = s.nextInt();
            s.nextLine(); 

            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = s.nextLine();

            Student student = new Student(id, name);
            try {
                course.enroll(student);
            } catch (CourseFullException e) {
                System.out.println(student.name + ": " + e.getMessage());
            }
        }

        s.close();
    }
}
