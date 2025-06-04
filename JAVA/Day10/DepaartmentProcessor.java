package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepaartmentProcessor {
    public static void main(String[] args) {
        List<String> departments = new ArrayList<>(Arrays.asList(
                "sales", "admin", "hr", "legal", "tech", "audit", "media", "cse", "civil"
        ));

        System.out.println("Original Departments:");
        System.out.println(departments);

        for (int i = 0; i < departments.size(); i++) {
            String dept = departments.get(i);
            if (dept.length() == 5) {
                departments.set(i, dept.toUpperCase());
            }
        }

        System.out.println("\nUpdated Departments:");
        System.out.println(departments);
    }
}
