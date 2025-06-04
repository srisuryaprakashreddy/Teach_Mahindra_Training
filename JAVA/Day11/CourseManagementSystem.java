package Day11;
import java.util.*;
import java.util.stream.Collectors;

abstract class users {
    int id;
    String name;

    public users(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Students extends users {
    public Students(int id, String name) {
        super(id, name);
    }
}

class Trainer extends users {
    public Trainer(int id, String name) {
        super(id, name);
    }
}

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

interface Enrollable {
    void enroll(Students Students) throws CourseFullException;
}

class Course implements Enrollable {
    String title;
    int capacity;
    List<Students> enrolled;
    Trainer trainer;

    public Course(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.enrolled = new ArrayList<>();
    }

    public void assignTrainer(Trainer t) {
        this.trainer = t;
    }

    @Override
    public void enroll(Students Students) throws CourseFullException {
        if (enrolled.size() >= capacity) {
            throw new CourseFullException(Students.name + ": CourseFullException");
        }
        enrolled.add(Students);
        System.out.println(Students.name + " enrolled");
    }
    	

    public String toString() {
        String enrolledList = enrolled.stream()
                .map(Students::toString)
                .collect(Collectors.joining(", "));
        return "Course: " + title + ", Trainer: " + (trainer != null ? trainer.name : "None") +
               ", Enrolled: [" + enrolledList + "]";
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java", 2);

        Students Surya = new Students(1, "Surya");
        Students Ram = new Students(2, "Ram");
        Students Vijay = new Students(3, "Vijay");

        javaCourse.assignTrainer(new Trainer(1,"Tarun"));
        try {
            javaCourse.enroll(Surya);
            javaCourse.enroll(Ram);
            javaCourse.enroll(Vijay); 
        } catch (CourseFullException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(javaCourse);
    }
}
