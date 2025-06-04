package Day7;

import java.util.LinkedList;
import java.util.Scanner;


class Patient {
    int id;
    String name;
    String issue;


    Patient(int id, String name, String issue) {
        this.id = id;
        this.name = name;
        this.issue = issue;
    }


    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Issue: " + issue);
    }
}


public class HospitalQueueManagement {
    static LinkedList<Patient> queue = new LinkedList<>();


    public static void addPatient(int id, String name, String issue) {
        queue.addLast(new Patient(id, name, issue));
        System.out.println("Patient added to the queue.");
    }


    public static void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("No patients in the queue.");
        } else {
            Patient treated = queue.removeFirst();
            System.out.println("Patient treated:");
            treated.display();
        }
    }

 
    public static void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("The waiting list is empty.");
        } else {
            System.out.println("Current Waiting List:");
            for (Patient p : queue) {
                p.display();
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hospital Queue Management ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Treat Patient");
            System.out.println("3. Display Waiting List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Issue: ");
                    String issue = sc.nextLine();
                    addPatient(id, name, issue);
                    break;

                case 2:
                    treatPatient();
                    break;

                case 3:
                    displayQueue();
                    break;

                case 4:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
