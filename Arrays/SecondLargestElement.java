package Arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        int arr[] = { 5, 2, 6, 7, 1, 3, 8, 9, 12, 16, 24, 18 };

        if (arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] < largest) {
                secondlargest = arr[i];
            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            return;
        } else {
            System.out.println("Second largest element = " + secondlargest);
        }
    }
}
