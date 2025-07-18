package Strings;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (ch1.length != ch2.length) {
            System.out.println("Strings are not anagram");
        }
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                System.out.println("Strings are not anagram");
                break;
            }
        }

        System.out.println("Strings are anagram");
    }
}
