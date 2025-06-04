package Day7;

import java.util.List;

import java.util.LinkedList;
//void addfirst(object o)
//void addlast(object o)
/* object getlast()
 * object getfirst()
 * object removefirst()
 * object removelast()
 * linkedlist class functions*/

public class LinkedListexample {
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        a.add(10);
        a.add(20);
        a.add(2,79);
        System.out.println(a);
    }
}

