package Day2;
class main {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
        else
            System.out.println("Invalid age!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class User {
    public static void main(String[] args) {
        main u = new main();
        u.setName("Alice");
        u.setAge(-5);  // ✅ Validation blocks invalid data
        System.out.println(u.getName() + " " + u.getAge());
    }
}
