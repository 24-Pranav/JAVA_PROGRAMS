import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 3, 2, 5, 1 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println("Unique elements = " + set.size());
    }
}
