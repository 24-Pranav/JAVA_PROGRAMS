package Greedy;

public class MinimumJumps {

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };

        int mx = 0, ans = 1, jump = arr[0];

        if (arr[0] == 0) {
            System.err.println("-1");
        }
        for (int i = 1; i < arr.length; i++) {
            mx--;
            mx = Math.max(mx, arr[i]);
            jump--;

            if (jump == 0 && i != arr.length - 1) {
                if (mx <= 0) {
                    System.err.println("-1");
                }
                jump = mx;
                mx = 0;
                ans++;
            }
        }

        System.err.println("Maximum number of jumps = " + ans);
    }
}
