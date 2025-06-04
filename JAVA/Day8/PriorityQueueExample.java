package Day8;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		queue.add(3);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(1);
		queue.add(3);

		System.out.println(queue);

		System.out.println("order of number");
		while (!queue.isEmpty()) {
			System.out.println("Priority: " + queue.poll());// sets priority by default in ascending
		}

	}

}
