package Day7;

public class GenericSwap {
	public static <V> void swap(V[] arr, int i, int j) {
        V temp = arr[i];   // Store value at index i
        arr[i] = arr[j];   // Replace i with j's value
        arr[j] = temp;     // Set j to temp (original i)
        
        // Print the array after swap
        for (V a : arr) {
            System.out.print(" "+a);
        }
    }
	public static void main(String[]args)
	{
		Integer[] arr= {1,3,4,5,8};
		swap(arr,2,4);
	}

}
