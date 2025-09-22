package Arrays;

import java.util.Arrays;

public class CountTriplets {
    int countTriplet(int arr[]) {

        Arrays.sort(arr);
        int count = 0;

        for (int c = arr.length - 1; c >= 2; c--) {

            int a = 0;
            int b = c - 1;

            while (a < b) {

                if (arr[a] + arr[b] == arr[c]) {
                    count++;
                    a++;
                    b--;
                } else if (arr[a] + arr[b] < arr[c]) {
                    a++;
                } else {
                    b--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountTriplets triplet = new CountTriplets();
        int arr[] = { 1, 5, 3, 2 };
        System.out.println(triplet.countTriplet(arr));
    }
}
