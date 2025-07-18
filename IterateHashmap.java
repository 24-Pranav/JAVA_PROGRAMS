import java.util.HashMap;
import java.util.Set;

public class IterateHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Indonesia", 200);
        hm.put("US", 250);

        System.out.println(hm);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key=" + k + ",Value=" + hm.get(k));
        }

    }
}
