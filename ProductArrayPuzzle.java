public class ProductArrayPuzzle {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        prefix[0] = 1;

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        suffix[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {

            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = prefix[i] * suffix[i];
        }

        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 3, 5, 6, 2 };
        int result[] = productExceptSelf(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
