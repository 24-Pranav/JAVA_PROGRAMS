package Strings;

public class ImplementAtoi {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;

        while (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        long num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {

            num = num * 10 + (s.charAt(i) - '0');

            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return sign * (int) num;
    }

    public static void main(String[] args) {
        ImplementAtoi obj = new ImplementAtoi();
        String s = "   -42";
        System.out.println(obj.myAtoi(s));
    }
}
