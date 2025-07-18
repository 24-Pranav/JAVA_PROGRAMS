import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDSA {
    public static void main(String args[]) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 150);
        tm.put("China", 200);
        tm.put("US", 50);
        tm.put("Japan", 5);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("US", 50);
        hm.put("Japan", 5);

        System.out.println(hm); // prints the pairs of HashMap in unordered form.

        System.err.println(tm); // prints the pairs from TreeMap in sorted form.
    }
}
