public class ZeroToEnd {

    public static void main(String[] args) {

        int arr[] = { 2, 0, 0, 3, 5, 1 };

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                arr[j++] = arr[i];
            }
        }

        while (j < arr.length) {

            arr[j++] = 0;
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

}
