import java.util.HashMap;

public class MaxSubArraywithKsum {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;

        int sum = 0;
        int ans = 0;
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            } else {
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        System.out.println("Maximum subarray sum with sum k = " + ans);
    }
}