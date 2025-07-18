package DP;

public class PerfectSum {

    public static int perfectSum(int[] nums, int target) {

        int mod = 1000000007;
        int n = nums.length;

        int dp[][] = new int[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            int v = nums[i - 1];
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];

                if (v <= j) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - v]) % mod;
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String args[]) {

        int nums[] = { 5, 2, 3, 10, 6, 8 };
        int target = 10;

        System.out.print(perfectSum(nums, target));
    }
}
