package Recursion;

public class PalindromeString {
    public static boolean checkPalindrome(int i, String str) {
        if (i >= str.length() / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }

        return checkPalindrome(i + 1, str);
    }

    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(checkPalindrome(0, str));
    }
}
