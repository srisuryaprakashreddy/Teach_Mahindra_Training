package homework;

import java.util.ArrayList;
import java.util.Collections;

class StudentManagement {
    private ArrayList<String> students = new ArrayList<>();

    public void manageStudents() {

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

       
        students.remove("Bob");

        // Search if a student is present
        String searchName = "Charlie";
        if (students.contains(searchName)) {
            System.out.println(searchName + " is present.");
        } else {
            System.out.println(searchName + " is not present.");
        }

        // Sort the list alphabetically
        Collections.sort(students);

  
        System.out.println("Student list: " + students);
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.manageStudents();
    }
}
