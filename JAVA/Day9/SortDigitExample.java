package Day9;

//import java.lang.*; 
//import java.util.*;


import java.util.Arrays; 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortDigitExample {
	public static void main(String[] args) {
		List<Integer> arr =Arrays.asList(12,55,22,31,72,29);
		System.out.println(arr+"\n");
		Collections.sort(arr,new SortDigit());
		System.out.println(arr);
	}
	

}
class SortDigit implements Comparator<Integer>
{

	@Override
	public int compare(Integer i, Integer j) {
		return i%10 - j%10;

	}
	
}
