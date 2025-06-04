package Day9;

interface MyInterFace {//function interface because it only has one method anonymous
	void hello();
}

public class LamdaExpressionExample {
	public static void main(String[] args) {
		MyInterFace mi = () -> {
			System.out.println("implementation of hello method");
		};
		mi.hello();
	}

}
