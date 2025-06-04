package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRanking implements Comparable<StudentRanking> {
    int rollno;
    String name;
    int totalmarks;

    StudentRanking(int rollno, String name, int totalmarks) {
        this.rollno = rollno;
        this.name = name;
        this.totalmarks = totalmarks;
    }

    @Override
    public int compareTo(StudentRanking i) {
        return i.totalmarks - this.totalmarks; 
    }

    @Override
    public String toString() {
        return rollno + " " + name + " " + totalmarks;
    }

    public static void main(String[] args) {
        List<StudentRanking> r = new ArrayList<>();
        r.add(new StudentRanking(123, "Surya", 1000));
        r.add(new StudentRanking(142, "Ram", 900));
        r.add(new StudentRanking(111, "Akshay", 950));
        r.add(new StudentRanking(133, "Prakash", 800));

        Collections.sort(r);

        for (int i=0;i<r.size();i++) {
            System.out.println("rank: "+(i+1)+" "+r.get(i));
        }
    }
}
