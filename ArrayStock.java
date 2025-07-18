public class ArrayStock {

    public static int stockProfit(int prices[]) {
        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;

                maxprofit = Math.max(maxprofit, profit);
            }

            else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println("Maximum profit = " + stockProfit(prices));
    }
}
