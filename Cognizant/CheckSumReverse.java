package Cognizant;

public class CheckSumReverse {

    public static int[] checkSumHalfReverse(int arr[]) {

        int n = arr.length;

        int halfSum1 = 0;
        for (int i = 0; i < n / 2; i++) {
            halfSum1 += arr[i];
        }

        int halfSum2 = 0;
        for (int i = n / 2; i < n; i++) {
            halfSum2 += arr[i];
        }

        if (halfSum1 < halfSum2) {
            int low = 0;
            int high = n - 1;

            while (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 10, 20, 30 };

        int result[] = checkSumHalfReverse(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
