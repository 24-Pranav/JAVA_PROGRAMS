public class Kadanes {

    public static int kadanes(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int ns = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];

            if (ns < cs) {
                ns = cs;
            }

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(ms, cs);

        }
        if (ms == 0) {
            return ns;
        } else {
            return ms;
        }

    }

    public static void main(String args[]) {
        // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int numbers[] = { -1, -2, -3, -4 };

        System.out.println("Maximum sum is : " + kadanes(numbers));
    }
}
