package Day10;

interface MyInterFace {
	int sum(int a, int b);
}

public class lamdaexpression {
	public static void main(String[] args) {
		int a = 10;
		int b = 40;

		MyInterFace mi = (x, y) -> x + y;  // lambda returns the sum

		System.out.println("Sum: " + mi.sum(a, b));
	}
}
