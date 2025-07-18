import java.util.*;

public class Prac3DFA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ending with 'abb': ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int cs = 0;
        int i = 0;

        while (i < str.length()) {
            System.out.print("q" + cs + " ---> ");
            if (cs == 0) {
                if (ch[i] == 'a') {
                    cs = 1;
                } else if (ch[i] == 'b') {
                    cs = 0;
                }
            } else if (cs == 1) {
                if (ch[i] == 'a') {
                    cs = 1;
                } else if (ch[i] == 'b') {
                    cs = 2;
                }
            } else if (cs == 2) {
                if (ch[i] == 'a') {
                    cs = 1;
                } else if (ch[i] == 'b') {
                    cs = 3;
                }
            } else if (cs == 3) {
                if (ch[i] == 'a') {
                    cs = 1;
                } else if (ch[i] == 'b') {
                    cs = 0;
                }
            }
            i++;
        }

        System.out.print("q" + cs);

        if (cs == 3) {
            System.out.println("\nString is accepted");
        } else {
            System.out.println("\nString is rejected");
        }
        sc.close();
    }
}