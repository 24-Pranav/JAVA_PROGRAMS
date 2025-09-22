package Arrays;

import java.util.*;

public class MaxOfSubarray {
    public static ArrayList<Integer> maxOfSubarray(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        System.out.print(maxOfSubarray(arr, k));
    }
}
