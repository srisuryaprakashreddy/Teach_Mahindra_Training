package Day10;

import java.util.List;
import java.util.stream.Stream;
//import java.util.Collection;

public class Streami {
	public static void main(String[] args) {
		List<Integer> arr = List.of(54, 32, 43, 23, -26, 57);
		Stream<Integer> stre=arr.stream();
//		stre.filter(x->x<=50).forEach(n->System.out.println(n));
//		str.forEach(n->System.out.println(n));
//		arr.stream().filter(x -> x < 40).forEach(n -> System.out.print("\n" + n));
		
		stre.map(j -> j-5)
		.sorted().
		forEach(n->System.out.println(n));//map is used to perform operations on the String
		
	}

}
