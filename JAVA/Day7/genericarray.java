package Day7;

public class genericarray {

    // Generic method to print any type of array
    public static <S> void printArray(S[] arr) {
        for (S a : arr) {
            System.out.println(a);
        }
    }
    //generic methods don't work with primitive data-types int ,double instead they use Boxed Data-types

    public static void main(String[] args) {
        String[] str = {"surya", "ram"};
        Integer[] arr = {1, 4, 7, 3};     // Use Integer instead of int
        Double[] db = {12.2, 13.5};       // Use Double instead of double

        printArray(str);
        printArray(arr);
        printArray(db);
    }
}

