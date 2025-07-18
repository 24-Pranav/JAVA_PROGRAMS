public class PrefixMaxSum {
    // calculate sum formula = Prefix[end] + Prefix[start-1]
    // calculate prefix = Prefix[i-1] + arr[i]

    public static void subArraysSum(int numbers[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefixsum[] = new int[numbers.length];

        prefixsum[0] = numbers[0];
        for (int i = 1; i < prefixsum.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + numbers[i];
            System.out.print(prefixsum[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currentsum = i == 0 ? prefixsum[j] : prefixsum[j] - prefixsum[i - 1];
                System.out.println(currentsum);
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("Maximum sum is : " + maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        subArraysSum(numbers);
    }
}
