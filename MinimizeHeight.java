import java.util.Arrays;

public class MinimizeHeight {
    public static int height(int arr[], int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        int min = 0, max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(smallest, arr[i + 1] - k);
            max = Math.max(largest, arr[i] + k);

            if (min < 0) {
                continue;
            }

            ans = Math.min(ans, max - min);
        }
        return ans;
    }

    public static void main(String args[]) {

        int arr[] = { 3, 9, 12, 16, 20 };
        int k = 3;

        System.out.println(height(arr, k));
    }
}
