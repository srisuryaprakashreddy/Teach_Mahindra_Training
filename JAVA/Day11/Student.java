package Day11;

import java.util.ArrayList;
import java.util.List;

class data
{
	String name;
	int score;
	data(String name,int score)
	{
		this.name=name;
		this.score=score;
	}
	public String toString()
	{
		return "Name"+name+"Score:"+score;
	}
}


public class Student {
	public static void main(String[] args) {
		List<data> list=new ArrayList<>();
		list.add(new data("surya",500));
		list.add(new data("Ram",495));
		list.add(new data("Vijay",495));
		list.add(new data("Vijaya",495));
		list.add(new data("Akshay",300));
		list.add(new data("Abhi",450));
		list.add(new data("Abhinaya",450));
		list.add(new data("Vikram",430));
		
		list.stream()
		.map(d->d.score)
		.distinct()
		.sorted((a,b)->b-a)
		.limit(5)
		.forEach(n->System.out.println(n));
		
	}

}
