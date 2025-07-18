public class CountTriplets {

    public static int countTriplets(int arr[], int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                } else {
                    int e1 = arr[j], e2 = arr[k], c1 = 0, c2 = 0;

                    while (j <= k && arr[j] == e1) {
                        c1++;
                        j++;
                    }

                    while (k >= j && arr[k] == e2) {
                        c2++;
                        k--;
                    }

                    if (e1 == e2) {
                        count += (c1 * (c1 - 1)) / 2;
                    } else {
                        count += c1 * c2;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {

        int arr[] = { -3, -1, -1, 0, 1, 2 };
        int target = -2;

        int count = countTriplets(arr, target);

        System.out.println("Total number of count = " + count);

    }
}
