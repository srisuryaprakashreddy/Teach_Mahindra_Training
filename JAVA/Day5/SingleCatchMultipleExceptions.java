package Day5;

public class SingleCatchMultipleExceptions {
	public static void main(String[] args)
	{
		try {
		    int[] arr = new int[2];
		    arr[20] = 30/0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		    System.out.println("Caught Exception: " + e.getClass().getSimpleName());
		}

	}

}
