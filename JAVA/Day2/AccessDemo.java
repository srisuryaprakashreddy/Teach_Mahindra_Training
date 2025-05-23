package Day2;
public class AccessDemo {

    // Main method to run the program
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000, "Engineering");

        // Public method accessible from anywhere
        emp.displayInfo();

        // Accessing private field directly (uncomment to see error)
        // System.out.println(emp.salary); // ❌ Cannot access private field

        // Accessing private field using getter (encapsulation)
        System.out.println("Salary: " + emp.getSalary());

        // Modifying private field using setter
        emp.setSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());

        // Creating Manager object (subclass of Employee)
        Manager mgr = new Manager("Alice Smith", 80000, "IT", 5);
        mgr.displayManagerInfo();
    }
}

// =================== CLASS 1 ===================
class Employee {
    private String name;         // private field — encapsulated
    private double salary;       // private field — accessed via getter/setter
    String department;           // default access — package-private
    protected int empId;         // protected field — accessible in subclass

    // Constructor
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.empId = (int)(Math.random() * 1000);
    }

    // Public method to display basic info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + empId);
    }

    // Encapsulated access to private field `salary`
    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Invalid salary amount!");
        }
    }
}

// =================== CLASS 2 ===================
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, String department, int teamSize) {
        super(name, salary, department);
        this.teamSize = teamSize;
    }

    public void displayManagerInfo() {
        // Accessing protected and public methods from superclass
        displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
