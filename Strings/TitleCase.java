package Strings;

public class TitleCase {

    public static String titleCase(String str) {
        char ch[] = str.toCharArray();
        String temp = "";

        for (int i = 0; i < ch.length; i++) {

            if (i == 0 || ch[i - 1] == ' ') {
                temp += Character.toUpperCase(ch[i]);

            } else {
                temp += ch[i];
            }
        }

        str = new String(temp);
        return str;
    }

    public static void main(String[] args) {
        String str = "welcome to crt session";
        System.out.println(titleCase(str));
    }
}
