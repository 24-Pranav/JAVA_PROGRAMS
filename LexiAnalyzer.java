import java.util.Scanner;

public class LexiAnalyzer {
    public static char op;

    public static void main(String arr[]) {
        String temp = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        LexiAnalyzer analyzer = new LexiAnalyzer();

        for (int i = 0; i < str.length(); i++) {
            if ((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) {
                temp = temp + ch[i];
            } else if (ch[i] == 61) {
                System.out.println(temp + "\t it is an identifier");
                temp = "";
                op = '=';
                analyzer.operator();
            } else if (ch[i] == 43) {
                System.out.println(temp + "\t\t it is an identifier");
                temp = "";
                op = '+';
                analyzer.operator();
            } else if (ch[i] == 42) {
                System.out.println(temp + "\t\t it is an identifier");
                temp = "";
                op = '*';
                analyzer.operator();
            } else if (ch[i] == '6' && ch[i + 1] == '0') {
                temp = "60";
                System.out.println(temp + "\t\t it is a constant number");
            }
        }
        sc.close();
    }

    public void operator() {
        System.out.println(op + "\t\t it is an operator");
    }
}