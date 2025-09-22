package Patterns;

public class UpTriangleNumber {
    public static void main(String[] args) {
        // number sequence series pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

        System.out.println();

        // same number sequence
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
