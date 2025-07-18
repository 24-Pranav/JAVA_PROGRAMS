package Strings;

public class ReverseStringWord {

    public static String reverseWord(String str) {
        String temp = "";
        String rev = "";

        for (int i = str.length(); i > 0; i++) {
            if (str.charAt(i) == ' ') {
                rev = temp + rev;
            }
            temp += str.charAt(i);
        }

        str = new String(temp);
        return str;
    }

    public static void main(String args[]) {
        String str = "welcome to prmitr";
        System.out.println(reverseWord(str));
    }
}
