package Day11;

import java.util.List;

public class LimitExample {
	public static void main(String[] args) {
		List<Integer> list =List.of(5,3,1,6,8,6,9,6,5,6);

		list.stream().distinct().limit(3).forEach(n->System.out.println(n));//return only first three elements
//		after performing distinct.
	}

}
