import java.util.ArrayList;
import java.util.Collections;

public class SortEleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // sort the elements in the ArrayList
        System.out.println(list);

        // Note : Collections is a class and Collection is an interface
        // Use class Collections not interface Collection
        // sort ArrayList in ascending order
        Collections.sort(list);
        System.err.println(list);

        // sort ArrayList in descending order
        Collections.sort(list, Collections.reverseOrder()); // comparator function
        System.out.println(list);
    }
}
