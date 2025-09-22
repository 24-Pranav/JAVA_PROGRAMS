package Cognizant;

import java.util.Arrays;

public class ConvertPermutation {

    public static int convertToPermutation(int arr[]) {

        Arrays.sort(arr);
        int n = arr.length;

        int operations = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                operations ++;
                arr[i] = i + 1;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 3, 4 };

        System.out.println(convertToPermutation(arr));
    }
}
