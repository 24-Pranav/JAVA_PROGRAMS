import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionArray {

    public static void main(String args[]) {

        ArrayList<Integer> newlist = new ArrayList<>();

        int a[] = { 1, 2, 1, 3, 1 };
        int b[] = { 3, 1, 3, 4, 1 };

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {

                newlist.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }

            while (i > 0 && i < a.length && a[i] == a[i - 1]) {
                i++;
            }

            while (j > 0 && i < b.length && b[j] == b[j - 1]) {
                j++;
            }
        }

        System.out.print(newlist);
    }
}
