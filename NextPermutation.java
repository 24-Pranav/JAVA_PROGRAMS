
public class NextPermutation {

    public static void nextPermutation(int arr[]) {
        int ind = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            reverseArray(arr, 0, arr.length - 1);
            return;
        }

        for (int i = arr.length - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }

        reverseArray(arr, ind + 1, arr.length - 1);
    }

    public static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printNextPermutation(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 1, 7, 5, 0 };
        nextPermutation(arr);
        printNextPermutation(arr);
    }
}
