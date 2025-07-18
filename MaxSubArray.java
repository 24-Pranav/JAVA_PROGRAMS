public class MaxSubArray {

    public static void subArraysSum(int numbers[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum = currentsum + numbers[k];
                }

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
