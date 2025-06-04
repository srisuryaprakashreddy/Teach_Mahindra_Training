package Day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class details implements Comparator<details> {
	String name;
	int id;

	details(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return name + "  " + id;
	}

	@Override
	public int compare(details i, details j) {
		return i.name.compareTo(j.name);
	}
}

public class Studentstream {
	public static void main(String[] args) {
		List<details> arr = new ArrayList<>();
		arr.add(new details("surya", 15));
		arr.add(new details("Ram", 4));
		arr.add(new details("Akshay", 1));
		arr.add(new details("Prakash", 20));

		Stream<details> stream = arr.stream();

//		stre.sorted((i, j) -> (i.name.compareTo(j.name))).forEach(n -> System.out.println(n));
//		stre.sorted((i, j) -> i.id-j.id).forEach(n -> System.out.println(n));//id based sorting
		List<details> s = stream.sorted((x, y) -> x.id - y.id).collect(Collectors.toList());// id based
																							// sorting
		System.out.println(s);

	}

}
