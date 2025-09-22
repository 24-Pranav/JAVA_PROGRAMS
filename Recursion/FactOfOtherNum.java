package Recursion;

public class FactOfOtherNum {
    public static boolean checkFact(int i, int n) {
        if (n == 1) {
            return true;
        }

        if (n % i != 0) {
            return false;
        }

        return checkFact(i + 1, n / i);
    }

    public static void main(String[] args) {
        System.out.println(checkFact(1, 5));
    }
}
