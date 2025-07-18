
import java.util.*;

public class HashFunctions {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        // put() function in HashMap
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 200);

        System.out.println(hm);

        // get() function in HashMap
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Indonesia"));

        // containsKey() function in HashMap
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Japan"));

        // remove() function in HashMap
        hm.remove("China");
        System.out.println(hm);

        // check the size of HashMap
        System.out.println(hm.size());

        // clear function in HashMap
        hm.clear();
        // check the HashMap is empty or not
        System.out.println(hm.isEmpty());

    }
}
