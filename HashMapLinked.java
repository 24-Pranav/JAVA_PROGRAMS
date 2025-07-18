import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapLinked {
    // Doubly linked list is used in this type of hashmap
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("China", 200);
        lhm.put("US", 50);
        lhm.put("Japan", 5);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("US", 50);
        hm.put("Japan", 5);

        System.out.println(hm); // prints the pairs of HashMap in unordered form.

        System.err.println(lhm); // prints the pairs from LinkedHashMap in ordered form.
    }

}
