package Strings;

public class StringOperation {
    public static void main(String[] args) {

        String str = "Hello";

        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            temp += str.charAt(i);
            System.out.println(str.substring(i + 1) + temp);
        }
    }
}
