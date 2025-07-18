package Strings;

public class CeaserCipher {
    public static String encrypt(String str, int key) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += (char) ((ch + key - 65) % 26 + 65);
            } else if (Character.isLowerCase(ch)) {
                result += (char) ((ch + key - 97) % 26 + 97);
            } else if (Character.isDigit(ch)) {
                result += (char) (ch + key);
            } else if (ch == ' ') {
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ab26P";
        System.out.println(encrypt(str, 4));
    }
}
