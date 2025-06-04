package Day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<String> allguest = new HashSet<>();

		allguest.add("ram");
		allguest.add("akshay");
		allguest.add("surya");
		allguest.add("prakash");
		allguest.add("ram");

		System.out.println(allguest);

		Set<String> newguest = new LinkedHashSet<>();
		newguest.add("abhi");
		newguest.add("SaI");
		newguest.add("vinay");
		newguest.add("dhansh");
		newguest.add("SaI");

		System.out.println(newguest);

		SortedSet<String> Vipguest = new TreeSet<>();
		Vipguest.add("surya");
		Vipguest.add("ram");
		Vipguest.add("vishnu");
		Vipguest.add("surya");
		Vipguest.add("vishnu");

		System.out.println(Vipguest);

		if (allguest.contains("surya")) {
			System.out.println("surya has arrived");
		} else {
			System.out.println("surya has not arrived");
		}

		newguest.remove("abhi");
		System.out.println(newguest);

		Iterator<String> it = newguest.iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
	}

}
