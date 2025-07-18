package DP;

public class FibonacciUsingRec {

    public static int febonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return febonacci(n - 1) + febonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.print(febonacci(n));
    }
}
