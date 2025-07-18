package Arrays;

import java.util.HashMap;

public class MaxSumWith0 {
    public static int maxSum(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                count = i + 1;
            } else {
                if (map.get(sum) != null) {
                    count = Math.max(count, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(maxSum(arr));
    }
}
