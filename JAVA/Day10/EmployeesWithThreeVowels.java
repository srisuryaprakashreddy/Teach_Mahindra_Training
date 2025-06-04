package Day10;

import java.util.ArrayList; 
import java.util.List;

class employee {
    int id;
    String name;
    int age;

    public employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int countVowels() {
        int count = 0;
        String lowerName = name.toLowerCase();
        for (char ch : lowerName.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

public class EmployeesWithThreeVowels {
    public static void main(String[] args) {
        List<employee> employees = new ArrayList<>();

        employees.add(new employee(1, "Rohit", 29));       // vowels: o, i
        employees.add(new employee(2, "Anil", 34));        // vowels: a, i
        employees.add(new employee(3, "Aurelia", 28));     // vowels: a, u, e, i, a (5 vowels)
        employees.add(new employee(4, "Deepak", 40));      // vowels: e, e, a (3 vowels)
        employees.add(new employee(5, "Umair", 23));       // vowels: u, a, i (3 vowels)
        employees.add(new employee(6, "John", 30));        // vowels: o

        System.out.println("Employees whose names have exactly 3 vowels:");
        for (employee e : employees) {
            if (e.countVowels() == 3) {
                System.out.println(e);
            }
        }
    }
}
