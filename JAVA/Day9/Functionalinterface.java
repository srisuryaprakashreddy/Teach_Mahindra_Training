package Day9;

interface Myinterface {
	void hello();

	void bye();
}

class methods implements Myinterface {
	public void hello() {
		System.out.println("hello method");
	}

	public void bye() {
		System.out.println("bye method ");
	}
}

public class Functionalinterface {
	public static void main(String[] args) {
		Myinterface mi = new methods();
		mi.hello();
		mi.bye();

	}

}
