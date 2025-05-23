package Day5;

public class FinallyReturn {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    static int testMethod() {
        try {
            return 1;
        } finally {
            System.out.println("Finally executed");
            return 2;
        }
    }
}
