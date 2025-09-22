package Recursion;

public class Print1ToN {
    public static void printNum(int i, int n) {
        if (i > 10) {
            return;
        }

        System.out.print(i + " ");
        printNum(i + 1, n);
    }

    public static void main(String[] args) {
        printNum(1, 10);
    }
}
