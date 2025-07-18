import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ClosestSum {

    public static ArrayList<Integer> closestSum(int arr[], int target) {
        Arrays.sort(arr);
        ArrayList<Integer> newlist = new ArrayList<>();
        int start = 0;
        int end = arr.length - 1;

        int mindifference = Integer.MAX_VALUE;

        if (arr.length == 1) {
            return newlist;
        }

        while (start < end) {
            int sum = arr[start] + arr[end];
            int difference = Math.abs(target - sum);

            if (difference < mindifference) {
                mindifference = difference;
                newlist.clear();
                newlist.add(arr[start]);
                newlist.add(arr[end]);
            }

            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return newlist;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 20, 5 };
        int target = 25;
        List<Integer> closespair = closestSum(arr, target);
        System.out.println(closespair);
    }
}
