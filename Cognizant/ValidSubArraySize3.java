package Cognizant;

public class ValidSubArraySize3 {
    public static int countValidSubArray(int arr[]) {

        int n = arr.length;
        int count = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] + arr[i + 1] == arr[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 2, 4, 2 };
        System.out.println(countValidSubArray(arr));
    }
}
