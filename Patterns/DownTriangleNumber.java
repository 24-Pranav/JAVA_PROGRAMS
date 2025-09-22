package Patterns;

public class DownTriangleNumber {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            int num = 1;
            for (int j = i; j > 0; j--) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
