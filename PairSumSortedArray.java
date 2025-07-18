public class PairSumSortedArray {
    public static int countPairs(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {// Main Logic Part
                int e1 = arr[start], e2 = arr[end], c1 = 0, c2 = 0;

                while (start <= end && arr[start] == e1) {// always use <= inside the inner loop
                    c1++;
                    start++;
                }

                while (end >= start && arr[end] == e2) {// always use >= inside the inner loop
                    c2++;
                    end--;
                }

                if (e1 == e2) {
                    count += (c1 * (c1 - 1)) / 2;
                } else {
                    count += c1 * c2;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1 };
        System.out.println(countPairs(arr, 2));
    }
}
