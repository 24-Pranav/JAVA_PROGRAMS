import java.util.HashMap;

public class MaxSumWithK {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                ans = i + 1;
            } else if (map.containsKey(sum - k)) {
                ans = Math.max(ans, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, -10 };
        int k = 15;

        System.out.println(longestSubarray(arr, k));
    }
}
