package Strings;

import java.util.Arrays;

public class CaseSpecificSorting {

    public static void main(String[] args) {
        String s = "XWMSPQ";

        String str1 = "";
        String str2 = "";
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                str1 += s.charAt(i);
            } else if (Character.isLowerCase(s.charAt(i))) {
                str2 += s.charAt(i);
            }
        }

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        int i = 0;
        int j = 0;

        for (int k = 0; k < s.length(); k++) {
            if (Character.isUpperCase(s.charAt(k))) {
                ans += charArr1[i];
                i++;
            } else if (Character.isLowerCase(s.charAt(k))) {
                ans += charArr2[j];
                j++;
            }
        }

        System.out.println(ans);
    }
}
