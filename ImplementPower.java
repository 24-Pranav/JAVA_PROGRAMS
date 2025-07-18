public class ImplementPower {
    static double power(double b, int e) {
        if (e < 0) {
            return 1 / power(b, -e);
        }

        if (e == 0) {
            return 1;
        }

        if (e == 1) {
            return b;
        }

        double halfPow = power(b, e / 2);

        if (e % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return b * halfPow * halfPow;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(3.00000, 5));
    }
}
