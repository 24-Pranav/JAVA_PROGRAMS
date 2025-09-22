package Cognizant;

public class LongestSentence {

    public static int findLongestWords(String str) {

        String temp[] = str.split("[.?!]");

        int maxi = 0;

        for (int i = 0; i < temp.length; i++) {

            int count = 0;

            for (int j = 0; j < temp[i].length(); j++) {
                String s = temp[i];
                if (s.charAt(j) == ' ') {
                    count++;
                }
            }
            maxi = Math.max(maxi, count);
        }

        return maxi;
    }

    public static int findLongestLength(String str) {

        String temp[] = str.split("[.?!]");

        int maxi = 0;

        for (int i = 0; i < temp.length; i++) {

            maxi = Math.max(maxi, temp[i].length());
        }

        return maxi;
    }

    public static void main(String[] args) {
        String str = "Hello world! This is Cognizant assessment. How are you today?";
        System.out.println(findLongestLength(str));
        System.out.println(findLongestWords(str));
    }
}
