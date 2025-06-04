package Day8;

import java.util.ArrayDeque;

public class Arraydeque {
	public static void main(String[] args) {

		ArrayDeque<String> queue = new ArrayDeque<>();

		queue.addFirst("Type A");
		queue.addFirst("Type B");
		queue.addFirst("Delete Line");
		queue.addFirst("Paste Line");

		System.out.println("undo :" + queue.removeFirst());
		System.out.println("undo :" + queue.removeFirst());

		System.out.println("remaining action: " + queue);

	}

}
