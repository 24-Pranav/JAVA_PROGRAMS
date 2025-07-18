import java.util.HashMap;

public class Itenerary {

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        // for reversing the map values to key and key to values
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // for return the start by check the key in the revMap with the keys in the
        // tickets map
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);

        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
    }
}
