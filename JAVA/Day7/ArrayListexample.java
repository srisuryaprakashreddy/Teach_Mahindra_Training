package Day7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListexample {
	public static void main(String[]args)
	{
		List<Integer> arr = new ArrayList<>();
		List<Integer> arr1 = new ArrayList<>(2);
		int length =arr.size();
//		System.out.println(length);
		arr.add(10);
		arr.add(20);
		arr.add(2,80);
		arr.add(2,45);
		int x=40;
		arr.add(x);
		System.out.println(arr);
		arr1.add(90);
		arr1.add(70);
				
		arr.addAll(arr1);
		
		for (int s:arr)
		{
			System.out.println(s);
		}
	}
	

}
