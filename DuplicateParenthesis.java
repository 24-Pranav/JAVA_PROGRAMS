import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean duplicateParenthesis(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;

                while (s.pop() != '(') { // (s.peek() != '(') { s.pop() }
                    count++;
                }

                if (count < 1) {
                    return true;
                }
            }
            // opening
            else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = "(a-b)";

        System.out.println(duplicateParenthesis(str));
    }
}
