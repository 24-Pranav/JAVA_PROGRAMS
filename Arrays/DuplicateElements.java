package Arrays;

import java.util.HashMap;

public class DuplicateElements {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 5, 2, 6, 2, 8, 6, 9, 7, 1, 11, 14, 5, 8 };

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map);

        // for (int i = 0; i < arr.length; i++) {
        // if (map.get(arr[i]) > 1) {
        // System.out.print(map.get(arr[i]) + " ");
        // }
        // }
    }
}
