package Day10;
import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public boolean hasSameStartEndLetter() {
        if (name == null || name.length() == 0)
            return false;

        char first = Character.toLowerCase(name.charAt(0));
        char last = Character.toLowerCase(name.charAt(name.length() - 1));
        return first == last;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', designation='" + designation + "'}";
    }
}

public class Employees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Anna", "Developer"));
        employees.add(new Employee(2, "Bob", "Manager"));
        employees.add(new Employee(3, "Alice", "Analyst"));
        employees.add(new Employee(4, "Steve", "Tester"));
        employees.add(new Employee(5, "David", "HR"));
        employees.add(new Employee(6, "Eve", "Designer"));
        employees.add(new Employee(7, "MikeM", "Team Lead"));

        System.out.println("Employees whose names start and end with the same letter:");
        for (Employee emp : employees) {
            if (emp.hasSameStartEndLetter()) {
                System.out.println(emp);
            }
        }
    }
}
