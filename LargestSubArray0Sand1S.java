import java.util.HashMap;

public class LargestSubArray0Sand1S {
    public static int maxLen(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                sum++;
            } else {
                sum--;
            }

            if (sum == 0) {
                ans = i + 1;
            }

            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 1, 0, 0 };
        System.err.println(maxLen(arr));
    }
}
