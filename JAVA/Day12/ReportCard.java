package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Details implements Comparator<Details> {

    String name;
    List<Subject> subjects;
    int tmarks;
    public Details(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
        this.tmarks=0;
    }

    public int totalmarks() {
        List<Integer> mrks = subjects.stream()
                                     .map(j -> j.marks)
                                     .collect(Collectors.toList());
        for (Integer s : mrks) {
            tmarks += s;
        }
        return tmarks;
    }

    public char GetGrade() {
        if (tmarks >= 500)
            return 'A';
        else if (tmarks >= 400)
            return 'B';
        else if (tmarks >= 300)
            return 'C';
        else if (tmarks >= 200)
            return 'D';
        else
            return 'F';
    }

	@Override
	public int compare(Details o1, Details o2) {
		
		return o2.tmarks-o1.tmarks;
	}
	public String toString() {
		return " name: " + name+"Total marks "+tmarks;
	}


}

class Subject {
    int marks;
    String subject;

    public Subject(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }
}

public class ReportCard {
    public static void main(String[] args) {
        Details user = new Details("surya");
        
        List<Integer> rank=new ArrayList<>();

        user.subjects.add(new Subject("Maths", 90));
        user.subjects.add(new Subject("Physics", 95));
        user.subjects.add(new Subject("Chemistry", 98));
        user.subjects.add(new Subject("Java", 99));
        user.subjects.add(new Subject("Python", 98));
        user.subjects.add(new Subject("Cpp", 98));
        int g=user.totalmarks();
        System.out.println("Total marks : " + g);
        System.out.println("Grade : " + user.GetGrade());
        rank.add(g);

        Details user2 = new Details("Ram");
        
        user2.subjects.add(new Subject("Maths", 67));
        user2.subjects.add(new Subject("Physics", 65));
        user2.subjects.add(new Subject("Chemistry", 68));
        user2.subjects.add(new Subject("Java", 69));
        user2.subjects.add(new Subject("Python", 68));
        user2.subjects.add(new Subject("Cpp", 68));
        
        int f=user2.totalmarks();
        System.out.println("Total marks : " + f);
        System.out.println("Grade : " + user2.GetGrade());
        rank.add(f);
        Collections.sort(rank);
        System.out.println(rank);

    }
}
