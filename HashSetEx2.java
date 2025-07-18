import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bengluru");

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for (String city : cities) {
        // System.out.println(city);
        // }
    }
}
