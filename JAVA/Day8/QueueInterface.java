package Day8;

import java.util.LinkedList;
import java.util.Queue;

/*Queue interface child classes 
 * Array
 * LinkedList
 * Priority Queue*/
public class QueueInterface {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		queue.add("Ram");
		queue.add("surya");
		queue.add("prakash");
		
		System.out.println("Queue: "+queue);
		
		System.out.println("Serving: "+queue.poll());
		
		System.out.println("Next: "+queue.peek());
		
		System.out.println("remaining: "+queue);
		
	}

}
