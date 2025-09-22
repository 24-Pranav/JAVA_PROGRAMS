package Cognizant;

public class LongestWordEven {

    public static String countLongestWord(String str) {

        String vowels = "aeiouAEIOU";
        String temp[] = str.split("[\\s+]");
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            String word = temp[i];
            if ((vowels.indexOf(word.charAt(0)) != -1) && (word.length() % 2 == 0)
                    && word.length() > result.length()) {

                result = new String(word);
            }
        }

        if (!result.isEmpty()) {
            return result;
        }

        return "00";

    }

    public static void main(String[] args) {
        String str = "I am enjoying online education";
        System.out.println(countLongestWord(str));
    }
}
