public class StockProfit {

    public static int stockBuySell(int arr[]) {

        int maxprofit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                maxprofit += arr[i] - arr[i - 1];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 1, 3, 6, 9, 2 };

        System.out.println("Maximum Profit = " + stockBuySell(arr));

    }
}
