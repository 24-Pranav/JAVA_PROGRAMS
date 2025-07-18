package Strings;

public class PasswordCheker {

    public static int checkPassword(char[] ch, int n) {

        if (n < 4) {
            return 0;
        }

        if (Character.isDigit(ch[0])) {
            return 0;
        }

        int num = 0;
        int capletter = 0;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == ' ' || ch[i] == '/') {
                return 0;
            }

            else if (ch[i] >= '0' && ch[i] <= '9') {
                num++;
            }

            else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                capletter++;
            }
        }

        if (num > 0 && capletter > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        String str = "Ab2bc_24";
        char ch[] = str.toCharArray();
        int n = str.length();
        System.out.println(checkPassword(ch, n));
    }
}
