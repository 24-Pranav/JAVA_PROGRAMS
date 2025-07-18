public class MaxProductSubArray {
    public static int maxProduct(int[] arr) {

        int currmax = arr[0];
        int currmin = arr[0];
        int maxprod = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = currmax;

            currmax = Math.max(arr[i], Math.max(currmax * arr[i], currmin * arr[i]));

            currmin = Math.min(arr[i], Math.min(temp * arr[i], currmin * arr[i]));

            maxprod = Math.max(maxprod, currmax);
        }
        return maxprod;

    }

    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
    }
}
