import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        // ArrayList add() function
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 6); // moving the elements to the right side when we use this function

        // ArrayList get() function
        System.out.println(list.get(2));

        // ArrayList remove() function
        list.remove(2);
        System.err.println(list);

        // ArrayList set() function to set the element at the specific index
        list.set(2, 10);
        System.err.println(list);

        // ArrayList contains() function
        System.out.println(list.contains(10));
        System.out.println(list.contains(3));

        // size() function
        System.err.println(list.size());

        // print the arrayList
        for (int i = 0; i < list.size(); i++) {
            System.err.print(list.get(i) + " ");
        }
    }
}
