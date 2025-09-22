package Cognizant;

public class LuckyNumber {
    public static int calculateLucky(int n, String str) {

        int luckyNumber = 0;

        for (int i = 0; i < n; i++) {
            int ascii = (int) str.charAt(i);

            if (i + 1 % 2 == 1 || ascii % 2 == 1) {
                luckyNumber += ((i + 1) * ascii);
            }
        }

        return luckyNumber;
    }

    public static void main(String[] args) {
        String str = "JACKY";
        int n = 5;

        System.out.println(calculateLucky(n, str));
    }
}
