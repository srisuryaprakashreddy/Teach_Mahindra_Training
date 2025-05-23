package Day2;

public class arrayc {
    
    void printArray(int[] numbers) {
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }

    public static void main(String[] args) {
        arrayc obj = new arrayc();

        
        int[] myArray = {10, 20, 30, 40, 50};

        
        obj.printArray(myArray);
    }

}
