package Arrays;

import java.util.ArrayList;

public class MissingNumber {
    public static void main(String[] args) {

        int arr[] = { 2, 6, 3, 5, 7, 9, 4 };
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> miss = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 1; i <= 10; i++) {
            if (list.contains(i)) {
                continue;
            } else {
                miss.add(i);
            }
        }

        for (int i = 0; i < miss.size(); i++) {
            System.out.print(miss.get(i) + " ");
        }
    }
}
