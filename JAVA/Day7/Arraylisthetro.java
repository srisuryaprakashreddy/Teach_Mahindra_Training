package Day7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Arraylisthetro {

	public static void main(String[] args) {
		List<Object> arr=new ArrayList<>();//Object is superclass of all Data-types
		arr.add("hello");
		arr.add(12.9);
		arr.add(12);
		arr.add("world");
		arr.add(new Date());
		System.out.println(arr);
		
		for(Object a:arr)
		{
			System.out.println(a+" - "+a.getClass());
		}
	}
}
