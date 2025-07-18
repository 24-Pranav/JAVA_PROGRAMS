import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {

    public static void main(String[] args) {

        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
        int totalAmt = 590;

        // Arrays.sort(coins, Comparator.reverseOrder());
        int coinCount = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {

            if (coins[i] <= totalAmt) {
                while (coins[i] <= totalAmt) {
                    ans.add(coins[i]);
                    totalAmt -= coins[i];
                    coinCount++;
                }
            }
        }

        System.out.println("Minimum Number of Coins required = " + coinCount);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}