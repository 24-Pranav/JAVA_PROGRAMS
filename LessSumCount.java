import java.util.Arrays;

public class LessSumCount {

    public static int countSum(int arr[], int target) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);

        while (left < right) {
            if ((arr[left] + arr[right]) < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 7, 2, 5, 3 };
        int target = 8;

        int result = countSum(arr, target);
        System.err.println(result);
    }
}
