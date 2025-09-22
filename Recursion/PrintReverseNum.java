package Recursion;

public class PrintReverseNum {
    public static void printRev(int i, int n) {
        if (i < 1) {
            return;
        }

        System.out.println(i);

        printRev(i - 1, n);
    }

    public static void main(String[] args) {
        int n = 3;
        printRev(n, n);
    }
}
