package Day11;

import java.util.Optional;

class data {
    String name;
    Optional<String> rollnumber;

    data(String name, String rollnumber) {
        this.name = name;
        this.rollnumber = Optional.ofNullable(rollnumber); 
    }

    public Optional<String> getStudent() {
        return rollnumber;
    }
}

public class UniversityRegistration {
    public static void main(String[] args) {
        data s1 = new data("Surya", "1");
        data s2 = new data("Ram", "2");
        data s3 = new data("Vijay", null);
        data s4 = new data("Vikram", "5");
        data s5 = new data("Vishal", "6");

        System.out.println(s1.getStudent().orElse("No rollnumber available"));
        System.out.println(s2.getStudent().orElse("No rollnumber available"));
        System.out.println(s3.getStudent().orElse("No rollnumber available"));
        System.out.println(s4.getStudent().orElse("No rollnumber available"));
        System.out.println(s5.getStudent().orElse("No rollnumber available"));
    }
}
