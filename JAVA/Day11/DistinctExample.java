package Day11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctExample {
	public static void main(String[] args) {
		List<Integer> list =List.of(5,3,1,6,8,6,9,6,5,6);
		System.out.println("list"+list);
		Stream<Integer> strm=list.stream();
		
		Stream<Integer> newstrm=strm.distinct();
		
		List<Integer> newlist =newstrm.collect(Collectors.toList());
		System.out.println("distinct list"+newlist);
		
		
	}

}
