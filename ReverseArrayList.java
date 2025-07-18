import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element in ArrayList using loop
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        System.out.println(list);

        // Reverse print TC = O(n)
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
