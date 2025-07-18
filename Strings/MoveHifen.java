package Strings;

public class MoveHifen {

    public static String move(String str) {
        char[] ch = str.toCharArray();
        String temp = "";
        String temp2 = "";

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '-') {
                temp += ch[i];
            } else {
                temp2 += ch[i];
            }
        }

        temp += temp2;
        str = new String(temp);
        return str;
    }

    public static void main(String[] args) {
        String str = "Move-Hyphens-to-Front";
        System.out.println(move(str));
    }
}
