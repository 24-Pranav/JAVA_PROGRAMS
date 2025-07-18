import java.util.ArrayList;
import java.util.HashMap;

public class IndexOfSubarraySum {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        int arr[] = { 0, 0, 1, 4 };
        int target = 5;

        int sum = 0;
        map.put(0, 0);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - target)) {
                list.add(map.get(sum - target) + 1);
                list.add(i + 1);
                break;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i + 1);
            }

        }

        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(list);
        }
    }
}
