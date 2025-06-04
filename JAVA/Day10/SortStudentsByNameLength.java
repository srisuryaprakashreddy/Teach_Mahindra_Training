package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
    String name;
    int rollNumber;

    public Data(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + "}";
    }
}

public class SortStudentsByNameLength {
    public static void main(String[] args) {
        List<Data> students = new ArrayList<>();

        students.add(new Data("Alice", 101));
        students.add(new Data("Bob", 102));
        students.add(new Data("Christopher", 103));
        students.add(new Data("Eve", 104));
        students.add(new Data("David", 105));

        Collections.sort(students, Comparator.comparingInt(s -> s.name.length()));

        System.out.println("Students sorted by name length:");
        for (Data s : students) {
            System.out.println(s);
        }
    }
}
