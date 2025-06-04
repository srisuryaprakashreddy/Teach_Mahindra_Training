package Day8;
import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        // 1. HashMap: No order, allows one null key and multiple null values
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(null, "NullKey");
        hashMap.put(3, null);

        // 2. TreeMap: Sorted by keys, does NOT allow null keys
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("C", "Cat");
        treeMap.put("A", "Ant");
        treeMap.put("B", "Bat");
        // treeMap.put(null, "Null"); //  Throws NullPointerException

        // 3. LinkedHashMap: Maintains insertion order, allows null key and null values
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("X", "Xray");
        linkedHashMap.put("Y", "Yak");
        linkedHashMap.put(null, "NullKey");
        linkedHashMap.put("Z", null);

        // 4. Hashtable: Thread-safe, does NOT allow null keys or null values
        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("M", "Monkey");
        hashtable.put("N", "Nest");
        // hashtable.put(null, "Null"); // Throws NullPointerException
        // hashtable.put("P", null);    // Throws NullPointerException

       
        System.out.println("HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\nTreeMap (Sorted by Key):");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\nLinkedHashMap (Insertion Order):");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\nHashtable (Thread-safe):");
        for (Map.Entry<String, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
