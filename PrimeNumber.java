public class PrimeNumber {
    public static void main(String[] args) {
        int n = 361;
        boolean flag = false;

        if (n <= 1) {
            System.out.println("Not Prime");
        }

        if (n == 2 || n == 3) {
            System.out.println("Prime");
        }

        if (n % 2 == 0 || n % 3 == 0) {
            System.out.println("Not Prime");
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}
