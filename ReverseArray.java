import java.util.Arrays;;

public class ReverseArray {
    public static void main(String args[]) {
        int arr[] = { 5, 6, 2, 3, 7, 8, 9 };

        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (first < last) {
                int temp = arr[last];
                arr[last] = arr[first];
                arr[first] = temp;

                first++;
                last--;
            }
        }

        // print an array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
