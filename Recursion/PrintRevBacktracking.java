package Recursion;

public class PrintRevBacktracking {
    public static void printRevBacktrack(int i, int n) {
        if (i < 1) {
            return;
        }

        printRevBacktrack(i - 1, n);

        System.out.println(n - i + 1);
    }

    public static void main(String[] args) {
        int n = 3;
        printRevBacktrack(n, n);
    }
}
