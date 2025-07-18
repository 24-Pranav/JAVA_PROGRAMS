package Arrays;

public class ReverseElements {
    public static void main(String[] args) {
        int temp = Integer.MIN_VALUE;

        int arr[] = { 0, 4, 0, 3, 0, 2, 5, 0, 1, 2 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
