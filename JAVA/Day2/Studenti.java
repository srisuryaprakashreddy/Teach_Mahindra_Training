package Day2;


public class Studenti {
    private int studentId;
    private String name;
    private String major;

    // Constructor 1: Initialize with studentId and name
    public Studenti(int studentId, String name) {
        System.out.println("Constructor with studentId and name called.");
        this.studentId = studentId;
        this.name = name;
        this.major = "Undecided"; // Default major
    }

    // Constructor 2: Initialize with studentId, name, and major
    public Studenti(int studentId, String name, String major) {
        System.out.println("Constructor with studentId, name, and major called.");
        this.studentId = studentId;
        this.name = name;
        this.major = major;
    }

    // Constructor 3: Initialize only with name (studentId will be default)
    public Studenti(String name) {
        System.out.println("Constructor with only name called.");
        this.studentId = 0; // Default studentId
        this.name = name;
        this.major = "Undecided"; // Default major
    }

    // Getter methods (for demonstration purposes)
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public static void main(String[] args) {
        Studenti student1 = new Studenti(101, "Alice");
        Studenti student2 = new Studenti(102, "Bob", "Computer Science");
        Studenti student3 = new Studenti("Charlie");

        System.out.println("\nStudent 1: ID=" + student1.getStudentId() + ", Name=" + student1.getName() + ", Major=" + student1.getMajor());
        System.out.println("Student 2: ID=" + student2.getStudentId() + ", Name=" + student2.getName() + ", Major=" + student2.getMajor());
        System.out.println("Student 3: ID=" + student3.getStudentId() + ", Name=" + student3.getName() + ", Major=" + student3.getMajor());
    }
}