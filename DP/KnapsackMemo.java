package DP;

public class KnapsackMemo {

    public static int knapsac(int val[], int wt[], int W, int n, int dp[][]) {

        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {

            int ans1 = val[n - 1] + knapsac(val, wt, W - wt[n - 1], n - 1, dp);

            int ans2 = knapsac(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = knapsac(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void main(String[] args) {

        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        int dp[][] = new int[val.length + 1][W + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.print(knapsac(val, wt, W, val.length, dp));
    }
}
