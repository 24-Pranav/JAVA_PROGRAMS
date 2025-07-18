package CodingQuetions;

import java.util.ArrayList;

public class Uniquepairs {
    public static ArrayList<ArrayList<Integer>> uniquePairs(int arr[]) {

        ArrayList<ArrayList<Integer>> main = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[j]);

                main.add(list);
            }
        }
        return main;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(uniquePairs(arr));
    }
}
