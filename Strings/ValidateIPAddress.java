package Strings;

public class ValidateIPAddress {
    public static boolean isValid(String s) {

        int count = 0;
        int index = -1;
        int temp = -1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '.') {

                count++;

                if (temp < 0 || temp > 255) {
                    return false;
                }

                // leading zeros
                if (temp != 0 && s.charAt(index + 1) == '0') {
                    return false;
                }

                // for continuous dot and leading zeros
                temp = -1;
                index = i;
            } else {
                if (temp == -1) {
                    temp = 0;
                }

                temp = temp * 10 + s.charAt(i) - '0';
            }
        }

        // check for last range and total dots
        if (temp < 0 || temp > 255 || count != 3) {
            return false;
        }

        // check leading zeros for last range
        if (temp != 0 && s.charAt(index + 1) == '0') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "192.0168.111.111";
        System.out.println(isValid(str));
    }
}
