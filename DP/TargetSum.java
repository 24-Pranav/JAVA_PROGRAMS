package DP;

public class TargetSum {

    public static boolean targetSum(int num[], int sum) {

        int n = num.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        // i = items and j = target sum
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = num[i - 1];
                // include condition
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                }
                // exclude condition
                else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[n][sum];

    }

    public static void main(String[] args) {

        int num[] = { 4, 2, 7, 1, 3 };
        int sum = 10;

        System.out.println(targetSum(num, sum));
    }
}
